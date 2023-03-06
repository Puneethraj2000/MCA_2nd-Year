/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MsgBean;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.Resource;
import javax.inject.Inject;
import javax.jms.Connection;
import javax.jms.JMSConnectionFactory;
import javax.jms.JMSContext;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageProducer;
import javax.jms.Queue;
import javax.jms.Session;
import javax.jms.TextMessage;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author mcacnj
 */
public class MsgServlet extends HttpServlet {

    @Resource(mappedName = "jms/tQueue")
    private Queue tQueue;

    @Inject
    @JMSConnectionFactory("jms/tConnectionFactory")
    private JMSContext context;
    
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     * @throws javax.naming.NamingException
     * @throws javax.jms.JMSException
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, NamingException, JMSException {
        response.setContentType("text/html;charset=UTF-8");
        
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            Context ctx = new InitialContext();
            String msg = requestgetParameter("message");
            sendJMSMessageToTQueue(msg);
            out.println("<h2><center>Servlet send this message</center></h2><h3><p>"+request.getParameter("message")+":to this Queue:"+tQueue.getQueueName()+"</p></h3>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (NamingException | JMSException ex) {
            Logger.getLogger(MsgServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (NamingException | JMSException ex) {
            Logger.getLogger(MsgServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
    private Message createJMSMessageForjmsTQueue(Session session, Object messageData)throws JMSException{
        TextMessage tm = session.createTextMessage();
        tm.setText(messageData.toString());
        return tm;
        
    }
    private void sendJMSMessageToTQueue(String messageData)throws JMSException {
        Connection connection = null;
        Session session = null;
        try{
            context.createProducer().send(tQueue, messageData);
            session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
            MessageProducer messageProducer = session.createProducer(tQueue);
            messageProducer.send(createJMSMessageForjmsTQueue(session, messageData));
        }
        finally{
            if(session != null){
                try{
                    session.close();
                }
                catch(JMSException e){
                    Logger.getLogger(this.getClass().getName()).log(Level.WARNING, "Cannot close session",e);
                }
            }
            if(connection != null){
                connection.close();
            }
        }
    }

    private String requestgetParameter(String message) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}

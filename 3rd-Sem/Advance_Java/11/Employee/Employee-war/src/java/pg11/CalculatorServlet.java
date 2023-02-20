/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pg11;

import java.io.IOException;
import java.io.PrintWriter;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author mcacnj
 */
public class CalculatorServlet extends HttpServlet {

    @EJB
    private CalculatorBeanLocal calculatorBean;
    
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
//    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
//        response.setContentType("text/html;charset=UTF-8");
//        try (PrintWriter out = response.getWriter()) {
//            /* TODO output your page here. You may use following sample code. */
//            out.println("<!DOCTYPE html>");
//            out.println("<html>");
//            out.println("<head>");
//            out.println("<title>Servlet CalculatorServlet</title>");            
//            out.println("</head>");
//            out.println("<body>");
//            out.println("<h1>Servlet CalculatorServlet at " + request.getContextPath() + "</h1>");
//            out.println("</body>");
//            out.println("</html>");
//        }
//    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
//    @Override
//    protected void doGet(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
//        processRequest(request, response);
//    }

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
//        processRequest(request, response);
    response.setContentType("text/html;charset=UTF-8");
        PrintWriter out=response.getWriter();
        float result=0;
        System.out.println("loaded calculator Bean");
        String s1=request.getParameter("num1");
        String s2=request.getParameter("num2");
        String s3=request.getParameter("group");
        System.out.println(s3);
        CalculatorBean cb = new CalculatorBean();
        if(s1!=null && s2!=null){
            Float num1=new Float(s1);
            Float num2=new Float(s2);
            switch(s3){
                case"add":result=cb.add(num1.floatValue(),num2.floatValue());
                           break;
                case"sub":result=cb.substract(num1.floatValue(),num2.floatValue());
                          break;
                case"mul":result=cb.multiply(num1.floatValue(),num2.floatValue());
                          break;          
                case"div":result=cb.division(num1.floatValue(),num2.floatValue());
                          break;          
                default :break;
            }
        }
        try{
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Calculator</title>");
             out.println("<head>");
              out.println("<body text=red><center><h2><u>Calcultor program by using Servlet Bean</u></h2>");
               out.println("<h1>Servlet Calculator - Result: "+result+"</h1>");
                out.println("</center></body");
                 out.println("/html");
        }
        finally{
            out.close();
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

}

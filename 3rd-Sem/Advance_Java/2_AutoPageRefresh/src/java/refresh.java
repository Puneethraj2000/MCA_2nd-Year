/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author mcacnj
 */
@WebServlet(urlPatterns = {"/refresh"})
public class refresh extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.println("<center>TestServlet say Hi at "+new Date()+"</center>");
        try{
            /* TODO output your page here. You may use following sample code. */
            String AccName = request.getParameter("AccName");
            String AccNum = request.getParameter("AccNum");
            String Branch = request.getParameter("Branch");
            String Place = request.getParameter("Place");
            String Date = request.getParameter("Date");
            out.println("<center><!DOCTYPE html></center>");
            out.println("<center><html></center>");
            out.println("<center><head></center>");
            out.println("<center><title>Servlet refresh</title></center>");            
            out.println("<center></head></center>");
            out.println("<center><body></center>");
            out.println("<center><h2>Customer Account Details</h2></center>");
            out.println("<center><b><font face = 6>Dear User<br>Your Account Information</b></center>");
            out.println("<center>Account Name:"+AccName+"<br></center>");
            out.println("<center>Account Number:"+AccNum+"<br></center>");
            out.println("<center>Branch:"+Branch+"<br></center>");
            out.println("<center>Place:"+Place+"<br></center>");
            out.println("<center>Date:"+Date+"<br></font></center>");
            out.println("<center></body></center>");
            out.println("<center></html></center>");
        }
        finally
        {
            out.close();
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
        processRequest(request, response);
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
        processRequest(request, response);
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

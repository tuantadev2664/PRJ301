package controller;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */


import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.text.DecimalFormat;

/**
 *
 * @author FPTSHOP
 */
@WebServlet(urlPatterns={"/calcc3"})
public class CalcServletC3 extends HttpServlet {
   
    /** 
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet CalcServletC3</title>");  
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Bai 1 C2: form + back end by servlet(CalcServletC3.java)</h1>\n" +
"        <form action=\"calc\">\n" +
"            enter radius:<input type=\"text\" name=\"radius\"><br/>\n" +
"            <input type = \"submit\" value=\"SUBMIT\">\n" +
"        </form>");
            if(request.getAttribute("dt") != null){
                String s = (String)request.getAttribute("dt");
                out.println("<h2>Dien tich la:<%= s%> </h2>");
            }
            out.println("</body>");
            out.println("</html>");
        }
    } 

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /** 
     * Handles the HTTP <code>GET</code> method.
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
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        String radius_raw = request.getParameter("radius");
        double radius;
        try {
            radius = Double.parseDouble(radius_raw);
            double s = radius * radius * Math.PI;
            DecimalFormat f = new DecimalFormat("##.##");
            String ss = f.format(s);
            request.setAttribute("dt", ss);
            request.getRequestDispatcher("calcc3").forward(request, response);
            
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    /** 
     * Returns a short description of the servlet.
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}

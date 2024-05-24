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
import static java.lang.String.format;
import static java.text.MessageFormat.format;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Student;

/**
 *
 * @author FPTSHOP
 */
@WebServlet(urlPatterns={"/student"})

public class StudentServlet extends HttpServlet {
   List<Student> list;
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
            out.println("<title>Servlet StudentServlet</title>");  
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet StudentServlet at " + request.getContextPath () + "</h1>");
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
        
        
        if( request.getParameter("id")!= null){
            Random r = new Random();
            int id = Integer.parseInt(request.getParameter("id"));
            for(Student student : list){
                if(student.getId() == id){
                    try {
                        student.setName(nameRandom());
                        student.setGender(r.nextBoolean());
                        student.setDob(generateRandomDate());
                    } catch (ParseException ex) {
                        Logger.getLogger(StudentServlet.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    break;
                }
            }
            request.setAttribute("data", list);     
        }
        request.getRequestDispatcher("student.jsp").forward(request, response);
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
        list = new ArrayList<>();
        String num_raw = request.getParameter("num");
        
        int num;
        
        try {
            num = Integer.parseInt(num_raw);
            int id;
            String name;
            Date dob;
            boolean gender;
            Random r = new Random();
            for(int i = 0; i < num; i++){
                id = i + 1;
                name = nameRandom();
                gender = r.nextBoolean();
                dob = generateRandomDate();
                Student s = new Student(id, name, gender,dob);
                list.add(s);
            }
            request.setAttribute("data", list);
            request.getRequestDispatcher("student.jsp").forward(request, response);
        } catch (NumberFormatException numberFormatException) {
            System.out.println(numberFormatException);
        } catch (ParseException ex) {
            Logger.getLogger(StudentServlet.class.getName()).log(Level.SEVERE, null, ex);
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

    public static String generateRandomString(int length) {
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        StringBuilder sb = new StringBuilder(length);
        Random random = new Random();

        for (int i = 0; i < length; i++) {
            int index = random.nextInt(characters.length());
            char randomChar = characters.charAt(index);
            sb.append(randomChar);
        }

        return sb.toString();
    }

    public static String nameRandom(){
        Random r = new Random();
        int length = r.nextInt(10-1+1)+1;
        String randomString = generateRandomString(length);
        return randomString;
    }
    public static Date generateRandomDate() throws ParseException {
        Random random = new Random();
        int year = random.nextInt(50) + 1970; // Năm từ 1970 đến 2019
        int month = random.nextInt(12) + 1; // Tháng từ 1 đến 12
        int day = random.nextInt(28) + 1; // Ngày từ 1 đến 28
        String dateString = "" + year + "-" + month + "-" + day;
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        return dateFormat.parse(dateString);
    }
}

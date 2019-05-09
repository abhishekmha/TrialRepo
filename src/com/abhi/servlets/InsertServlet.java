package com.abhi.servlets;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class InsertServlet extends HttpServlet{

    private static final long serialVersionUID = 1L;

    public void doPost(HttpServletRequest request, HttpServletResponse response)  
            throws ServletException, IOException {  

        response.setContentType("text/html");  
        String n=request.getParameter("username");  
        String p=request.getParameter("userpass"); 
        
        Connection conn = null;
        PreparedStatement pst = null;
        String url = "jdbc:mysql://localhost:3306/";
        String dbName = "abhi";
        String driver = "com.mysql.jdbc.Driver";
        String userName = "root";
        String password = "root";
        try {
            Class.forName(driver).newInstance();
            conn = DriverManager
                    .getConnection(url + dbName, userName, password);

            pst = conn
                    .prepareStatement("insert into user(user,password)values(?,?)");
            pst.setString(1, n);
            pst.setString(2, p);

             pst.executeUpdate();
           

        } catch (Exception e) {
            System.out.println(e);
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                RequestDispatcher rd=request.getRequestDispatcher("Success.jsp");  
                rd.forward(request,response);  

    }  
}}}
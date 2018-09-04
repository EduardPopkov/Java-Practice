import classes.Person;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.net.InetAddress;

@WebServlet("/GetServlet")
public class GetServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter printWriter = response.getWriter();
        Connection connection = null;
        Statement statement = null;


        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mybase?useSSL=false&autoReconnect=true&serverTimezone=UTC", "root", "root");
            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM users");

            String login = request.getParameter("txbLogin");
            String password = request.getParameter("txbPassword");

            printWriter.println("<html>");
            while (resultSet.next()){
                if(login.equals(resultSet.getString("login")) && password.equals(resultSet.getString("password"))){
                    printWriter.println("Hello: " + login + " " + password);
                    printWriter.println("<hr>");
                    printWriter.println(InetAddress.getLocalHost());
                    printWriter.println("<hr>");
                    printWriter.println(new Date());
                }
            }
            printWriter.println("<html>");

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if(statement != null){
                try {
                    statement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if(connection != null){
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

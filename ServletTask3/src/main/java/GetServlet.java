import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

@WebServlet("/GetServlet")
public class GetServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Connection connection = null;
        Statement statement = null;

        PrintWriter printWriter = response.getWriter();
        //printWriter.println("1");
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            //драйвер не может найти бд
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mybase?useSSL=false&autoReconnect=true&serverTimezone=UTC", "root", "root");

            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM users");

            //printWriter.println("2");

            while (resultSet.next()){
                int id = resultSet.getInt(1);
                String login = resultSet.getString(2);
                String password = resultSet.getString(3);
                printWriter.println(id + " " + login + " " + password);
            }
            //printWriter.println("3");
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
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

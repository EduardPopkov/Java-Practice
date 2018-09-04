import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import java.util.Set;

@WebServlet("/SetServlet")
public class SetServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String Setlogin = request.getParameter("txbLogin");
        String Setpassword1 = request.getParameter("txbPassword1");
        String Setpassword2 = request.getParameter("txbPassword2");

        PrintWriter printWriter = response.getWriter();

        Connection connection = null;
        Statement statement = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mybase?useSSL=false&autoReconnect=true&serverTimezone=UTC", "root", "root");
            PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO users (login, password) VALUES (?, ?)");

            if(Setlogin != null && (Setpassword1.equals(Setpassword2))){
                preparedStatement.setString(1, Setlogin);
                preparedStatement.setString(2, Setpassword1);
                preparedStatement.executeUpdate();

                printWriter.println("Yes");
            } else{
                printWriter.println("Error");
            }


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

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/TestServlet")
public class TestServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String title = request.getParameter("title");
        int rows = Integer.parseInt(request.getParameter("row"));
        int columns = Integer.parseInt(request.getParameter("column"));
        String bgcolor = request.getParameter("bgcolor");

        PrintWriter printWriter = response.getWriter();

        printWriter.println("<html>");
        printWriter.write("<table bgcolor=" + bgcolor + " border='2'>");
        for(int i = 0; i < rows; i++){
            printWriter.println("<tr>");
            for(int j = 0; j < columns; j++){
                printWriter.println("<td>" + j + "</td>");
            }
            printWriter.println("</tr>");
        }
        printWriter.write("</table>");
        printWriter.println("</html>");
    }
}

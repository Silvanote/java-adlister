import javax.servlet.http.HttpServlet;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.rmi.ServerException;


@WebServlet(name = "Hello World", urlPatterns = "/hello")
public class TestServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServerException, IOException {
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();

        String firstName = req.getParameter("name");

        if (firstName != null) {
            out.println("<h1> Hello " + firstName + "! </h1>");
        } else {
            out.println("<h1> Hello  World! </h1>");
        }
    }
}

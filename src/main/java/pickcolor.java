import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class pickcolor {

    @WebServlet(name = "HelloWorldServlet", urlPatterns = "/color_example")

    public class HelloWorldServlet extends HttpServlet {

        protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
            ServletException IOException ("<h1>Hello, World!</h1>");

            String sortBy = request.getParameter("sort");
        }
    }
}

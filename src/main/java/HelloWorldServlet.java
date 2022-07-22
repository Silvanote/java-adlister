import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class HelloWorldServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String name = request.getParameter("name");
        if (name == null) {
            name = "World";
        } else if (name.equalsIgnoreCase("jeff-bezos")) {
            response.sendRedirect("https://amazon.com");
            return;
        }
        request.setAttribute("name", name);
        request.getRequestDispatcher("/WEB-INF/hello-world.jsp").forward(request, response);
    }
}
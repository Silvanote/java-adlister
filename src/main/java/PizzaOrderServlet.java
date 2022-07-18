import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "PizzaOrderServlet", urlPatterns = "/pizza-order")
public class PizzaOrderServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException,
            IOException{
        req.getRequestDispatcher("/partials/pizza-order.jsp").forward(req, resp);
    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException,
            IOException{
        String size = req.getParameter("size");
        String crust = req.getParameter("crust");
        String sauce = req.getParameter("sauce");

        PrintWriter display = resp.getWriter();
        display.println(size);
        display.println(crust);
        display.println(sauce);
    }
}

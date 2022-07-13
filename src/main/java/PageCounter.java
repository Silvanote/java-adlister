import javax.servlet.http.HttpServlet;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.rmi.ServerException;


@WebServlet(name = "PageCounter", urlPatterns = "/count")
public class PageCounter extends HttpServlet{

private int count;

        protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServerException,IOException{
        count++;

        res.setContentType("text/html");
        PrintWriter out=res.getWriter();
        out.println("<h1>The page count is: "+count);
        }
        }
//
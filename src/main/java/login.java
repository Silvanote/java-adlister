import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class login {
    @WebServlet("/Login")
    public class Login extends HttpServlet {
        private static final long serialVersionUID = 1L;

        /**
         * @see HttpServlet#HttpServlet()
         */
        public Login() {
            super();
            // TODO Auto-generated constructor stub
        }

        /**
         * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
         */
        protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
        {
            String username = request.getParameter("username");
            String password = request.getParameter("password");

            //user credentials are verified
            //if credentials are correct,it creates session object
            //and takes to welcome.jsp
            if(username.equals("admin") && password.equals("1234"))
            {
                //setting userdata into a session object
                HttpSession session = request.getSession();
                session.setAttribute("username",username);
                response.sendRedirect("welcome.jsp");
            }
            //otherwise it will takes to login.jsp
            else
            {
                response.sendRedirect("login.jsp");
            }
        }

        /**
         * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
         */
        protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            // TODO Auto-generated method stub
            doGet(request, response);
        }

    }
}

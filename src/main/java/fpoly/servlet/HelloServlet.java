package fpoly.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/welcome")
public class HelloServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        // Thiết lập tiếng Việt cho phản hồi
        resp.setContentType("text/html;charset=UTF-8");

        resp.getWriter().println("<h1>FPT Polytechnic</h1>");
        resp.getWriter().println("<h2>Chào mừng bạn đến với Java web</h2>");
    }
}

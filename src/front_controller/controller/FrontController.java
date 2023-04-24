package front_controller.controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("*.do")
public class FrontController extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String httpMethod = req.getMethod();
        if (httpMethod.equals("POST")) {
            resp.setContentType("text/html; charset=utf-8");
            PrintWriter pw = resp.getWriter();
            pw.println("잘못된 요청입니다");
            return;
        }

        // localhost:8080/board.do
        // localhost:8080/user.do
        String action = req.getRequestURI();  // /board.do 아니면 /user.do
        System.out.println("uri : " + action);

        if (action.equals("/board.do")) {
            resp.sendRedirect("board.jsp");
        } else if (action.equals("/user.do")) {
            // resp.setHeader("Status Code", "302");
            // resp.setHeader("location", "user.jsp");
            // resp.getWriter().println();
            HttpSession session = req.getSession();
            session.setAttribute("num", 2);
            req.setAttribute("num", 1);
            resp.sendRedirect("user.jsp");
        } else {
            resp.setContentType("text/html; charset=utf-8");
            PrintWriter pw = resp.getWriter();
            pw.println("잘못된 요청입니다");
        }
    }

}

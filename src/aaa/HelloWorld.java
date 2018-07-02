package aaa;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
/**
 * Created by Danny on 2018/7/2.
 */
public class HelloWorld extends HttpServlet {

    private String message;

    public void init() throws ServletException {
        // 执行必需的初始化
        message = "Hello JJJJJSSSS";
    }

    public void doGet(HttpServletRequest request,
                      HttpServletResponse response)
            throws ServletException, IOException {
        // 设置响应内容类型
        response.setContentType("text/html");
        String name = request.getParameter("name");
        // 实际的逻辑是在这里
        PrintWriter out = response.getWriter();
        out.println("<h1>" + name + "</h1>");
    }

    public void destroy() {
        // 什么也不做
    }
}
package dev.a2;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

// Extend HttpServlet class
public class HelloServlet extends HttpServlet {

    private String message;

    public void init() throws ServletException {
        message = "Hello World tet";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        request.getRequestDispatcher("/WEB-INF/views/index.jsp")
                .forward(request, response);
    }

    public void destroy() {
        // do nothing.
    }
}

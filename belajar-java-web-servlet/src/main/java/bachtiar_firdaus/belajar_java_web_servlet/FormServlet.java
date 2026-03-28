package bachtiar_firdaus.belajar_java_web_servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

@WebServlet(urlPatterns = "/form")
public class FormServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // Baca file dari resources menggunakan getResourceAsStream
        try (var inputStream = FormServlet.class.getResourceAsStream("/html/form.html")) {
            if (inputStream == null) {
                resp.getWriter().println("File form.html tidak ditemukan!");
                return;
            }
            String html = new String(inputStream.readAllBytes(), StandardCharsets.UTF_8);
            resp.getWriter().println(html);
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String firstName = req.getParameter("firstName");
        String lastName = req.getParameter("lastName");
        String fullName = firstName + " " + lastName;
        String response = "Hello " + fullName;
        resp.getWriter().println(response);
    }
}
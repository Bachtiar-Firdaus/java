package bachtiar_firdaus.belajar_java_web_servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

@WebServlet(urlPatterns = "/download")
public class DownloadServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String file = req.getParameter("file");

        // Validasi parameter
        if (file == null || file.isBlank()) {
            resp.setStatus(HttpServletResponse.SC_BAD_REQUEST);
            resp.getWriter().println("Parameter 'file' wajib diisi!");
            return;
        }

        Path path = Path.of("upload").resolve(file);

        // Cek apakah file ada
        if (!Files.exists(path)) {
            resp.setStatus(HttpServletResponse.SC_NOT_FOUND);
            resp.getWriter().println("File tidak ditemukan: " + file);
            return;
        }

        byte[] bytes = Files.readAllBytes(path);

        String force = req.getParameter("force");
        if ("true".equals(force)) {
            resp.setHeader("Content-Disposition", "attachment; filename=\"" + path.getFileName() + "\"");
        }

        // Set content type agar browser tahu ini gambar
        String mimeType = Files.probeContentType(path);
        if (mimeType != null) {
            resp.setContentType(mimeType);
        }

        resp.getOutputStream().write(bytes);
    }
}
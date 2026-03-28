package bachtiar_firdaus.belajar_java_web_servlet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.server.servlet.context.ServletComponentScan;

@ServletComponentScan
@SpringBootApplication
public class BelajarServletApp {

    public static void main(String[] args) {
        SpringApplication.run(BelajarServletApp.class);
    }
}
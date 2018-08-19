package com.eone.bytom.apidoc.controller;



import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;



@Controller
class HomeController {

    @GetMapping("/")
    public void home(Model model, HttpServletRequest request, HttpServletResponse response) throws IOException {

        response.sendRedirect("/swagger-ui.html");

    }

}

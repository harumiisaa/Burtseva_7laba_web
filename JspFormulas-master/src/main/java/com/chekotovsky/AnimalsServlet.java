package com.chekotovsky;

import com.chekotovsky.Models.Animal;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

@WebServlet(urlPatterns = {"/animal"})
public class AnimalsServlet extends HttpServlet {
    private List<Animal> animals = Arrays.asList(
            new Animal("Ivan Zaytsev", "Raccoon", "Canser", 13),
            new Animal("Katerina Kazarovets", "Cat", "Kurt", 2),
            new Animal("Egor Korotuk", "White Bear", "Yasha", 10));
    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
    }
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.service(req, resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("animals", animals);
        RequestDispatcher dispatcher = req.getRequestDispatcher("static/Animals.jsp");
        dispatcher.forward(req, resp);
    }

    @Override
    public void destroy() {
    }
}

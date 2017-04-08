package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Autenticacion;

public class ServletAutenticar extends HttpServlet {
    //do get sirve para que por http pueda comunicarse
    //siempre y cuando tengas la ip de la maquina

    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //los pedimos del formulario web
        String login = request.getParameter("login");
        String password = request.getParameter("password");
        boolean autenticado = Autenticacion.autenticar(login, password);
        if (autenticado) {
            RequestDispatcher despachador = request.getRequestDispatcher("/bienvenido.html");
            despachador.forward(request, response);
        } else {
            RequestDispatcher despachador = request.getRequestDispatcher("/error.html");
            despachador.forward(request, response);
        }

    }
}

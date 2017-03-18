
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class ServletAutenticar extends HttpServlet {
      //do get sirve para que por http pueda comunicarse
    //siempre y cuando tengas la ip de la maquina
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("application/vnd.ms-excel");
       PrintWriter salida=  response.getWriter();
       salida.println("alejandro ");
    }
}
    
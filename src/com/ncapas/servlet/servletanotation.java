package com.ncapas.servlet;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servletanotation")
public class servletanotation extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public servletanotation() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
		String usuario="carlos";
		String contrasena="123456";
		String usuarioparametro= request.getParameter("usuario");
		String contrasenaparametro = request.getParameter("contrasena");
		
		PrintWriter salida = response.getWriter();
		
		if(usuario.equals(usuarioparametro) && contrasena.equals(contrasenaparametro)) {
			salida.println("<html>");
			salida.println("<body>");
			salida.println("<h3>"+"Usted ha iniciado sesion "+"</h3>");
			salida.println("</body>");
			salida.println("</html>");
			
		}else {
			salida.println("<html>");
			salida.println("<body>");
			salida.println("<h3>"+"Ha ingresado mal algun parametro"+"</h3>");
			salida.println("</body>");
			salida.println("</html>");
				
		}
		
	}

}

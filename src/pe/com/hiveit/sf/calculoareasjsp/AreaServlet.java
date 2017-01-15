package pe.com.hiveit.sf.calculoareasjsp;

import java.io.IOException;

import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import pe.com.hiveit.sf.ejb.calculoareas.*;
/**
 * Servlet implementation class AreaServlet
 */

@WebServlet("/AreaServlet")
public class AreaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	@EJB
	private CalculoAreasRemote calculoAreasRemote;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AreaServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		  String tipoArea = request.getParameter("area");
	      double area = 0.0;
	      if ("circulo".equals(tipoArea)) {
	          double radio = Double.parseDouble(request.getParameter("radio"));	          
	          area = calculoAreasRemote.circulo(radio);

	      }else if ("triangulo".equals(tipoArea)) {
	          double altura = Double.parseDouble(request.getParameter("altura"));
	          double base = Double.parseDouble(request.getParameter("base"));
	          area = calculoAreasRemote.triangulo(altura, base);
	      } 
	      request.setAttribute("area", area);
	      request.setAttribute("formula", tipoArea);
	      RequestDispatcher rd = request.getRequestDispatcher("respuesta.jsp");
	      rd.forward(request, response);
	}

}

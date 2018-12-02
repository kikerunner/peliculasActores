package es.salesianos.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import es.salesianos.service.ListService;
import es.salesianos.service.PetService;
import es.salesianos.model.Owner;
import es.salesianos.model.Pet;
import es.salesianos.repository.Repository;

public class ListadoServletByPerson extends HttpServlet {
	
	private ListService servicio = new  ListService();
	private Repository repository = new  Repository();
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		////System.out.println(req.getParameter("nombreAbuscar"));
		List<Owner> listAllOwnersByName = servicio.listAllOwnersByPerson((String)req.getParameter("nombreAbuscar"));
		req.setAttribute("listAllOwnersByName", listAllOwnersByName);
		redirect(req,resp);
	}
	
	
	protected void redirect(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/listOwnerByPerson.jsp");
		dispatcher.forward(req,resp);
	}
}

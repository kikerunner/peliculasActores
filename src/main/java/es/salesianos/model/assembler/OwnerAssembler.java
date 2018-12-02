package es.salesianos.model.assembler;

import javax.servlet.http.HttpServletRequest;

import es.salesianos.model.Actor;
import es.salesianos.model.Pelicula;
import es.salesianos.model.PeliculasActores;

public class OwnerAssembler {

	public static Actor assembleOwnerFrom(HttpServletRequest req) {
		Actor actor = new Actor();
		String lugarNacimiento=req.getParameter("lugarNacimiento");
		String nomActor=req.getParameter("nomActor");
		String apellidos=req.getParameter("apellidos");
		actor.setLugarNacimiento(lugarNacimiento);
		actor.setNomActor(nomActor);
		actor.setApellidos(apellidos);
		return actor;
	}
	
	public static Pelicula assemblePeliculaFrom(HttpServletRequest req) {
		Pelicula pelicula = new Pelicula();
		String titulo=req.getParameter("titulo");
		String ano=req.getParameter("ano");
		String comentario=req.getParameter("comentario");
		String trailer=req.getParameter("trailer");

		pelicula.setTitulo(titulo);
		pelicula.setAno(ano);
		pelicula.setComentario(comentario);
		pelicula.setTrailer(trailer);
		
		
		return pelicula;
	}
	
	public static PeliculasActores assemblePeliculasActoresFrom(HttpServletRequest req) {
		PeliculasActores peliculasActores = new PeliculasActores();
		
		/*private int codPelicula;
		private int codActor;
		private int cache;
		private String nomPersonaje;
		private String foto;*/
		int codPelicula=(Integer.parseInt(req.getParameter("codPelicula")));
		int codActor=(Integer.parseInt(req.getParameter("codActor")));
		int cache=(Integer.parseInt(req.getParameter("cache")));
		String nomPersonaje=req.getParameter("nomPersonaje");
		String foto=req.getParameter("foto");

		peliculasActores.setCodPelicula(codPelicula);;
		peliculasActores.setCodActor(codActor);;
		peliculasActores.setCache(cache);;
		peliculasActores.setNomPersonaje(nomPersonaje);
		peliculasActores.setFoto(foto);;
		
		
		return peliculasActores;
	}
}
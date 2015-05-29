package edu.upc.eetac.dsa.jordieetac.libro.api.modelos;

import java.util.List;

import javax.ws.rs.core.Link;

import org.glassfish.jersey.linking.Binding;
import org.glassfish.jersey.linking.InjectLink;
import org.glassfish.jersey.linking.InjectLinks;
import org.glassfish.jersey.linking.InjectLink.Style;

import edu.upc.eetac.dsa.AlfVarRom.libro.api.LibrosResource;
import edu.upc.eetac.dsa.AlfVarRom.libro.api.MediaType;

public class Libros {
	
	@InjectLinks({
		@InjectLink(resource = LibrosResource.class, style = Style.ABSOLUTE, rel = "libros", title = "Latest libros", type = MediaType.LIBRO_API_LIBROS_COLLECTION),
		@InjectLink(resource = LibrosResource.class, style = Style.ABSOLUTE, rel = "self edit", title = "Libro", type = MediaType.LIBRO_API_LIBROS, method = "getlibro", bindings = @Binding(name = "idlibros", value = "${instance.idlibros}")) })
	
	private List<Link> links;
	
	public List<Link> getLinks() {
		return links;
	}
	public void setLinks(List<Link> links) {
		this.links = links;
	}
	private int idlibros;
	private String titulo;
	private String autor;
	private String lengua;
	private String edicion;
	private String fechaedicion;
	private String fechaimpresion;
	private String editorial;
	private long lastmodified;
	
	public long getLastmodified() {
		return lastmodified;
	}
	public void setLastmodified(long lastmodified) {
		this.lastmodified = lastmodified;
	}
	public int getIdlibros() {
		return idlibros;
	}
	public void setIdlibros(int idlibros) {
		this.idlibros = idlibros;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getLengua() {
		return lengua;
	}
	public void setLengua(String lengua) {
		this.lengua = lengua;
	}
	public String getEdicion() {
		return edicion;
	}
	public void setEdicion(String edicion) {
		this.edicion = edicion;
	}
	public String getFechaedicion() {
		return fechaedicion;
	}
	public void setFechaedicion(String fechaedicion) {
		this.fechaedicion = fechaedicion;
	}
	public String getFechaimpresion() {
		return fechaimpresion;
	}
	public void setFechaimpresion(String fechaimpresion) {
		this.fechaimpresion = fechaimpresion;
	}
	public String getEditorial() {
		return editorial;
	}
	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}
	
	
	
}

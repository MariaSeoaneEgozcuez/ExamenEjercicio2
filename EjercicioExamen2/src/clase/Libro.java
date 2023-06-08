package clase;

import java.io.Serializable;

//Clase Libro
public class Libro implements Serializable {
 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
private String titulo;
 private String[] autores;
 private String identificador;
 private String categoria;
 private int edadRecomendada;
 private boolean prestado;

 public Libro(String titulo, String[] autores, String identificador, String categoria, int edadRecomendada) {
     this.titulo = titulo;
     this.autores = autores;
     this.identificador = identificador;
     this.categoria = categoria;
     this.edadRecomendada = edadRecomendada;
     this.prestado = false;
 }

 // Getters y Setters

 public String getTitulo() {
     return titulo;
 }

 public void setTitulo(String titulo) {
     this.titulo = titulo;
 }

 public String[] getAutores() {
     return autores;
 }

 public void setAutores(String[] autores) {
     this.autores = autores;
 }

 public String getIdentificador() {
     return identificador;
 }

 public void setIdentificador(String identificador) {
     this.identificador = identificador;
 }

 public String getCategoria() {
     return categoria;
 }

 public void setCategoria(String categoria) {
     this.categoria = categoria;
 }

 public int getEdadRecomendada() {
     return edadRecomendada;
 }

 public void setEdadRecomendada(int edadRecomendada) {
     this.edadRecomendada = edadRecomendada;
 }

 public boolean isPrestado() {
     return prestado;
 }

 public void setPrestado(boolean prestado) {
     this.prestado = prestado;
 }
}


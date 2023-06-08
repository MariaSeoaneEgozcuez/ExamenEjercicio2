package clase;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

//Clase Biblioteca
public class Biblioteca {
 private List<Libro> libros;
 private List<Usuario> usuarios;

 public Biblioteca() {
     libros = new ArrayList<>();
     usuarios = new ArrayList<>();
 }

 // Métodos para dar de alta y baja un libro
 public void agregarLibro(Libro libro) {
     libros.add(libro);
 }

 public void eliminarLibro(Libro libro) {
     libros.remove(libro);
 }

 // Métodos para dar de alta y baja un usuario
 public void agregarUsuario(Usuario usuario) {
     usuarios.add(usuario);
 }

 public void eliminarUsuario(Usuario usuario) {
     usuarios.remove(usuario);
 }

 // Método para prestar un libro
 public void prestarLibro(Libro libro, Usuario usuario) {
     if (libro.isPrestado()) {
         throw new RuntimeException("El libro ya está prestado.");
     }

     if (!usuarios.contains(usuario)) {
         throw new RuntimeException("El usuario no está registrado en la biblioteca.");
     }

     if (usuario.getEdadRecomendada() < libro.getEdadRecomendada()) {
         throw new RuntimeException("El usuario no cumple con la edad recomendada para el libro.");
     }

     libro.setPrestado(true);
 }

 // Método para devolver un libro
 public void devolverLibro(Libro libro) {
     if (!libro.isPrestado()) {
         throw new RuntimeException("El libro no está prestado.");
     }

     libro.setPrestado(false);
 }

 // Método para listar libros
 public List<Libro> listarLibros() {
     return libros;
 }

//Método para almacenar el estado de la biblioteca en un archivo
 public void guardarEstadoBiblioteca(String nombreArchivo) {
     try (FileOutputStream fileOut = new FileOutputStream(nombreArchivo);
          ObjectOutputStream objectOut = new ObjectOutputStream(fileOut)) {

         objectOut.writeObject(libros);
         objectOut.writeObject(usuarios);

         System.out.println("El estado de la biblioteca se ha guardado en el archivo " + nombreArchivo);
     } catch (IOException e) {
         System.out.println("Error al guardar el estado de la biblioteca: " + e.getMessage());
     }
 }
}
 


package clase;

import java.util.List;

//Clase Principal
public class Principal {
 public static void main(String[] args) {
     Biblioteca biblioteca = new Biblioteca();

     // Agregar libros
     Libro libro1 = new Libro("El señor de los anillos", new String[]{"J.R.R. Tolkien"}, "123456", "Aventuras", 12);
     Libro libro2 = new Libro("1984", new String[]{"George Orwell"}, "654321", "Ciencia Ficción", 16);

     biblioteca.agregarLibro(libro1);
     biblioteca.agregarLibro(libro2);

     // Agregar usuarios
     Usuario usuario1 = new Usuario("Juan", "Pérez", "1990-01-01", "12345678A");
     Usuario usuario2 = new Usuario("María", "Gómez", "2005-06-08", "87654321B");

     biblioteca.agregarUsuario(usuario1);
     biblioteca.agregarUsuario(usuario2);

     // Prestar un libro
     try {
         biblioteca.prestarLibro(libro1, usuario1);
     } catch (RuntimeException e) {
         System.out.println("Error: " + e.getMessage());
     }

     // Devolver un libro
     try {
         biblioteca.devolverLibro(libro1);
     } catch (RuntimeException e) {
         System.out.println("Error: " + e.getMessage());
     }

     // Listar libros
     List<Libro> libros = biblioteca.listarLibros();
     for (Libro libro : libros) {
         System.out.println("Título: " + libro.getTitulo());
         System.out.println("Autores: " + String.join(", ", libro.getAutores()));
         System.out.println("Identificador: " + libro.getIdentificador());
         System.out.println("Categoría: " + libro.getCategoria());
         System.out.println("Edad recomendada: " + libro.getEdadRecomendada());
         System.out.println("Prestado: " + (libro.isPrestado() ? "Sí" : "No"));
         System.out.println("-------------------");
     }

     // Guardar el estado de la biblioteca
     biblioteca.guardarEstadoBiblioteca("estado_biblioteca.txt");
 }
}

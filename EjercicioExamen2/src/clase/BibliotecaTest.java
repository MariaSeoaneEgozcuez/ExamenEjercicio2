package clase;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.List;

public class BibliotecaTest {
    private Biblioteca biblioteca;
    private Libro libro1;
    private Libro libro2;
    private Usuario usuario1;
    private Usuario usuario2;

    @Before
    public void setUp() {
        biblioteca = new Biblioteca();

        libro1 = new Libro("El señor de los anillos", new String[]{"J.R.R. Tolkien"}, "123456", "Aventuras", 12);
        libro2 = new Libro("1984", new String[]{"George Orwell"}, "654321", "Ciencia Ficción", 16);

        usuario1 = new Usuario("Juan", "Pérez", "1990-01-01", "12345678A");
        usuario2 = new Usuario("María", "Gómez", "2005-06-08", "87654321B");

        biblioteca.agregarLibro(libro1);
        biblioteca.agregarLibro(libro2);

        biblioteca.agregarUsuario(usuario1);
        biblioteca.agregarUsuario(usuario2);
    }

    @Test
    public void testPrestarLibro() {
        // Prueba prestar un libro a un usuario
        biblioteca.prestarLibro(libro1, usuario1);
        assertTrue(libro1.isPrestado());
    }

    @Test
    public void testDevolverLibro() {
        // Prueba devolver un libro que ha sido prestado
        biblioteca.prestarLibro(libro1, usuario1);
        biblioteca.devolverLibro(libro1);
        assertFalse(libro1.isPrestado());
    }

    @Test
    public void testListarLibros() {
        // Prueba listar los libros de la biblioteca
        List<Libro> libros = biblioteca.listarLibros();
        assertEquals(2, libros.size());
        assertTrue(libros.contains(libro1));
        assertTrue(libros.contains(libro2));
    }
}

package clase;
import java.io.Serializable;

//Clase Usuario
public class Usuario implements Serializable {
 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
private String nombre;
 private String apellidos;
 private String fechaNacimiento;
 private String dni;
 private int edadRecomendada;

 public Usuario(String nombre, String apellidos, String fechaNacimiento, String dni) {
     this.nombre = nombre;
     this.apellidos = apellidos;
     this.fechaNacimiento = fechaNacimiento;
     this.dni = dni;
     this.edadRecomendada = edadRecomendada;
 }

 // Getters y Setters

 public String getNombre() {
     return nombre;
 }

 public void setNombre(String nombre) {
     this.nombre = nombre;
 }

 public String getApellidos() {
     return apellidos;
 }

 public void setApellidos(String apellidos) {
     this.apellidos = apellidos;
 }

 public String getFechaNacimiento() {
     return fechaNacimiento;
 }

 public void setFechaNacimiento(String fechaNacimiento) {
     this.fechaNacimiento = fechaNacimiento;
 }

 public String getDni() {
     return dni;
 }

 public void setDni(String dni) {
     this.dni = dni;
 }
 public int getEdadRecomendada() {
     return edadRecomendada;
 }
}


package Headers;

public class Empleado {
	
//atributos
private String nombre;
private double salario;

//contructor por defecto
public Empleado() {}  

//contructor con parametros
public Empleado(String nombre, double salario) {
	this.nombre = nombre;
	this.salario = salario;
}  

//get and set
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public double getSalario() {
	return salario;
}
public void setSalario(double d) {
	this.salario = d;
}



}

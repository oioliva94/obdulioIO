package Headers;

import java.util.LinkedList;

public class Empresa {
//atributos
private String nombre;

private LinkedList<Empleado> listEmpleado=new LinkedList<Empleado>();
private LinkedList<Cliente> listCliente=new LinkedList<Cliente>();

//metodo por defecto
public Empresa() {}
//metodo con atributos
public Empresa(String nombre,LinkedList<Cliente> listCliente) {
	this.nombre = nombre;
	this.listCliente = listCliente;
}


// set and get
public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}


public LinkedList<Cliente> getListCliente() {
	return listCliente;
}

public void setListCliente(LinkedList<Cliente> listCliente) {
	this.listCliente = listCliente;
}

//Metodos

public void contratarEmpleado(Empleado empleado) {
	this.listEmpleado.add(empleado);
	System.out.print("empleado agregado"+"\n");
}

public void despedirEmpleado(int indice) {
	this.listEmpleado.remove(indice);
	System.out.print("empleado eliminado");
}

public void mostrarListaEmpleados() {
	int tam=this.listEmpleado.size();
	
	for(int i=0;i<tam;i++) {
		System.out.println(this.listEmpleado.get(i).getNombre()+" "+this.listEmpleado.get(i).getSalario()+"\n");
	}
	
}

public void mostratCliente() {
	int tam=this.listCliente.size();
	
	for(int i=0;i<tam;i++) {
		System.out.println(this.listCliente.get(i).getNombre()+"\n");
	}
}

}

package Headers;

import java.util.LinkedList;

public class Cliente {
	
//atributos
private String nombre;
private LinkedList<Cliente> listCliente=new LinkedList<Cliente>();
//contructor por defecto
public Cliente() {}

//contructor con parametros
public Cliente (String nombre) {
	this.nombre=nombre;
}

//get and set
public void setNombre(String nombre) {
	this.nombre=nombre;
}

public String getNombre() {
	return this.nombre;
}

public LinkedList<Cliente> getListCliente() {
	return listCliente;
}

public void setListCliente(LinkedList<Cliente> listCliente) {
	this.listCliente = listCliente;
}

//Metodos
public void agregarCliente(Cliente cliente) {
	this.listCliente.add(cliente);
	System.out.println("Cliente agregado");
}

public void removerCliente(int indice) {
	this.listCliente.remove(indice);
	System.out.println("cliente removido");
}

public void mostrarListaCliente() {
	int tam=this.listCliente.size();
	
	for(int i=0; i<tam;i++) {
		System.out.println(this.listCliente.get(i).nombre+"\n");
	}
			
}


}

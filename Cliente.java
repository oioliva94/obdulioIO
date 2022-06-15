package Headers;

import java.util.LinkedList;

public class Cliente {
	
//atributos
private String nombre;
private int idCliente;
private String telefonoCliente;
private String emailCliente;
private LinkedList<Cliente> listCliente=new LinkedList<Cliente>();
//contructor por defecto
public Cliente() {}

//contructor con parametros
public Cliente (String nombre, int idCliente, String telefonoCliente,String emailCliente) {
	this.nombre=nombre;
	this.idCliente=idCliente;
	this.telefonoCliente=telefonoCliente;
	this.emailCliente=emailCliente;
}

//get and set
public void setNombre(String nombre) {
	this.nombre=nombre;
}

public String getNombre() {
	return this.nombre;
}

public void setIdCliente(int idCliente){
	this.idCliente=idCliente;
}

public int getIdCliente(){
	return this.idCliente;
}

public void setTelefonoCliente(String telefonoCliente){
	this.telefonoCliente=telefonoCliente;
}

public String getTelefonoCliente(){
	return this.telefonoCliente;
}

public void setEmailCliente(String emailCliente){
	this.emailCliente=emailCliente;
}

public String getEmailCliente(){
	return this.emailCliente;
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

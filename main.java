package Headers;

public class main {

	public static void main(String[] args) {
		
		// agregando clientes a lista de clientes
		Cliente cliente1 = new Cliente("Agusto",985644,"77889944","agusto_taco@ejemplo.hn");
		Cliente cliente2 = new Cliente("Muriel",975678,"33669988","mmuriel@ehem.es");
		Cliente cliente3 = new Cliente("Tanaka",564824,"95881264","yoshida_tana@ejem.jp");
		Cliente cliente4=new Cliente("Michael",123456,"88445566","michael55@ejem.hn");

		Cliente clienteAdmin = new Cliente();
		clienteAdmin.agregarCliente(cliente1);
		clienteAdmin.agregarCliente(cliente2);
		clienteAdmin.agregarCliente(cliente3);
		clienteAdmin.mostrarListaCliente();

		// eliminando objetos cliente creados con new
		cliente1 = null;
		cliente2 = null;
		cliente3 = null;

		// Creando objetos Empleado para agragar a lista
		Empleado emp1 = new Empleado();
		emp1.setNombre("Ramon");
		emp1.setSalario(12054.96);

		Empleado emp2 = new Empleado();
		emp2.setNombre("Teodoro");
		emp2.setSalario(18256.00);

		Empleado emp3 = new Empleado();
		emp3.setNombre("Rafael");
		emp3.setSalario(9350.59);

		// Mostrando empleados para corroborar
		System.out.println("*******************************************\n" + "vericando objetos");
		System.out.println(emp1.getNombre() + ", salario: " + emp1.getSalario() + "\n");
		System.out.println(emp2.getNombre() + ", salario: " + emp2.getSalario() + "\n");
		System.out.println(emp3.getNombre() + ", salario: " + emp3.getSalario() + "\n");
		System.out.println("*******************************************\n");
		// Creando empresa
		Empresa empresa = new Empresa();
		empresa.setNombre("Garmachas el dragon feliz");

		// agragando empleados a la lista enlazada y agragando lista de clientes
		empresa.setListCliente(clienteAdmin.getListCliente());
		empresa.contratarEmpleado(emp1);
		empresa.contratarEmpleado(emp2);
		empresa.contratarEmpleado(emp3);

		System.out.println("*******************************************\n");
		System.out.println("lista de clientes" + "\n");
		empresa.mostratCliente();
		System.out.println("*******************************************\n");
		System.out.println("lista de empleados" + "\n");
		empresa.mostrarListaEmpleados();
		System.out.println("*******************************************\n");

		// eliminando objetos Empleado
		emp1 = null;
		emp2 = null;
		emp3 = null;

		empresa = null;

		System.out.println(
				"Lista de clientes impresa desde objeto tipo Cliente \n despues de eliminar objeto tipo Empresa\n");
		clienteAdmin.mostrarListaCliente();
		System.out.println("*******************************************\n");

	}

}

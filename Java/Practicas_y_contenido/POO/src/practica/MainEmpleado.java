package practica;

public class MainEmpleado {

	public static void main(String[] args) {
		
		Empleado emp1 = new Empleado(12,4,"Pepe","Diaz","pepediaz@gmail.com",1700,500,'h');
		Empleado emp2 = new Empleado();
		
		emp2.setIdEmpleado(5);
		emp2.setIdDepartamento(13);
		emp2.setSalario(2000);
		emp2.setComplemento(500);
		emp2.setEmail("Diegosanz@gmail.com");
		emp2.setNombre("Diego");
		emp2.setApellido("Sanz");
		emp2.setSexo('h');
		
		
		System.out.println("Su id es: "+ emp1.getIdEmpleado());
		System.out.println("Su id de departamento es: "+emp1.getIdDepartamento());
		System.out.println("Su salario bruto es: "+ emp1.salarioBruto());
		System.out.println("Su salario mensual es: "+ emp1.salarioMensual(1));
		System.out.println("Su sexo es: "+ emp1.literalSexo());
		System.out.println("Email personal: "+ emp1.getEmail());
		System.out.println("Email empresa: "+emp1.obtenerEmail());
		System.out.println("Nombre completo: "+ emp1.nombreCompleto());
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println("Su id es: "+ emp2.getIdEmpleado());
		System.out.println("Su id de departamento es: "+emp2.getIdDepartamento());
		System.out.println("Su salario bruto es: "+ emp2.salarioBruto());
		System.out.println("Su salario mensual es: "+ emp2.salarioMensual(1));
		System.out.println("Su sexo es: "+ emp2.literalSexo());
		System.out.println("Email personal: "+ emp2.getEmail());
		System.out.println("Email empresa: "+emp2.obtenerEmail());
		System.out.println("Nombre completo: "+ emp2.nombreCompleto());
	}

}

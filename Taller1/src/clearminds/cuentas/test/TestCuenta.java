package clearminds.cuentas.test;

import clearminds.cuentas.Cuenta;

public class TestCuenta {

	public static void main(String[] args) {
		//Creo el objeto Cuenta y lo referencio con cuenta1 
		Cuenta cuenta1=new Cuenta("03476");
		//Coloco un valor de saldo en la cuenta1 
		cuenta1.setSaldo(675);
		//Creo el objeto Cuenta y lo referencio con cuenta2
		Cuenta cuenta2=new Cuenta( "03476","C",98);
		//Creo el objeto Cuenta y lo referencio con cuenta3 
		Cuenta cuenta3=new Cuenta( "034762"); 
		//Modifico el tipo de cuenta 
		cuenta3.setTipo("C");
		//Imprimo cuenta1, cuenta2 y cuenta3 
		System.out.println("--------Valores Iniciales---------");
		cuenta1.Imprimir(); 
		cuenta2.Imprimir(); 
		cuenta3.Imprimir();
		
		//Modificar el saldo de la cuenta1 a 444
		cuenta1.setSaldo(444);
		//Modificar el saldo de la cuenta3 a 567
		cuenta3.setSaldo(567);
		//Modificar el tipo de la cuenta2 a D
		cuenta2.setTipo("D");
		System.out.println("--------Valores Modificados---------");
		cuenta1.Imprimir(); 
		cuenta2.Imprimir(); 
		cuenta3.Imprimir();
		
		
	//Crear una cuenta4 utilizando el constructor que recibe el Id de cuenta y modificar los atributos de ser necesario.
		Cuenta cuenta4=new Cuenta("0987");
		cuenta4.setTipo("A");
		cuenta4.setSaldo(10.0);
	
	//Crear una cuenta5 utilizando el constructor que recibe los tres parámetros y modificar los atributos de ser necesario.
		Cuenta cuenta5=new Cuenta("0557","C",10);
	
	//Crear una cuenta6 utilizando cualquier constructor y modificar los atributos de ser necesario.
		Cuenta cuenta6=new Cuenta("0666","A",0);
		
		cuenta4.imprimirConMiEstilo(); 
		cuenta5.imprimirConMiEstilo(); 
		cuenta6.imprimirConMiEstilo();
	
	}

}

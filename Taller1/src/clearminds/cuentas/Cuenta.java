package clearminds.cuentas;

public class Cuenta {
	private String id;
	private String tipo;
	private double saldo;
	
	//Crear un constructor que reciba el id de cuenta y
	public Cuenta(String id) {
		this.id=id;
	}
	//Crear un constructor que reciba los tres atributos de cuenta y setee sus valores.
	public Cuenta(String id, String tipo, double saldo) {
		this.id=id;
		this.tipo=tipo;
		this.saldo=saldo;	
	}
	//Crear un método imprimir que despliegue los datos de la cuenta en consola
	public void Imprimir() {
		System.out.println("*****************");
		System.out.println("CUENTA");
		System.out.println("*****************");
		System.out.println("Numero de Cuenta: " + id);
		System.out.println("Tipo: " + tipo);
		System.out.println("Saldo: USD " + saldo);
		System.out.println("*****************");
	}
	//Un método imprimirConMiEstilo que no reciba parámetros y que imprima en consola los datos 
	//de la cuenta en un formato a su elección.
	public void imprimirConMiEstilo() {
	System.out.println("********CUENTA*********");
	System.out.println("Cuenta " + id);
	System.out.println("Tipo: " + tipo);
	System.out.println("Saldo: USD " + saldo);
	System.out.println("_____________________-");
}
	
	public String getId() {
		return id;
	}
	
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	

}

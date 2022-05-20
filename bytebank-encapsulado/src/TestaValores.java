
public class TestaValores {
	public static void main(String[]args) {
		Conta conta = new Conta(1337, 2454);
		
		System.out.println(conta.getAgencia());
		conta.setAgencia(0545454);
		
		System.out.println(Conta.getTotal());
	}
}

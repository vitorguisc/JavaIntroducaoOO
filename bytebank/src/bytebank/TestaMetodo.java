package bytebank;

public class TestaMetodo {
	public static void main(String[] args) {
		Conta contaPaulo = new Conta();
		contaPaulo.saldo = 100;
		contaPaulo.deposita(50);
		System.out.println(contaPaulo.saldo);
		boolean conseguiuRetirar = contaPaulo.saca(20);
		System.out.println(contaPaulo.saldo);
		System.out.println(conseguiuRetirar);
		
		Conta contaMarcela = new Conta();
		contaMarcela.deposita(1000);
		boolean sucessoTranferencia = contaMarcela.transfere(3000, contaPaulo);
		if(sucessoTranferencia) {
			System.out.println("tranferencia com sucesso");
		}else {
			System.out.println("falta dinheiro");
		}
		
		System.out.println(contaMarcela.saldo);
		System.out.println(contaPaulo.saldo);
	}
}


public class TestaBanco {

	public static void main(String[] args) {
		Cliente paulo = new Cliente();
		paulo.nome = "paulo o paulinho";
		paulo.cpf = "000.000.000-00";
		paulo.profissao = "programador";
		
		Conta contaPaulo = new Conta();
		contaPaulo.deposita(100);
		
		contaPaulo.titular = paulo;
		System.out.println(contaPaulo.titular.nome);
	}
	
}

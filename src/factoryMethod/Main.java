package factoryMethod;

public class Main {

	public static void main(String[] args) {
		Mensagem msg = MensagemFactory.getMensagem(2);
		msg.enviar("Mensagem para aquela pessoa");
		
	}

}

package factoryMethod;

public class MensagemSMS implements Mensagem{

	@Override
	public void enviar(String mensagem) {
		System.out.println("SMS: " + mensagem);
		
	}

}

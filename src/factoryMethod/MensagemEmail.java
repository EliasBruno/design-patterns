package factoryMethod;

public class MensagemEmail implements Mensagem{

	@Override
	public void enviar(String mensagem) {
		System.out.println("Email: " + mensagem);
		
	}
	
}

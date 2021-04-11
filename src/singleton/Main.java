package singleton;

public class Main {

	public static void main(String[] args) {
		Singleton sg = Singleton.getInstance();
		Singleton sg2 = Singleton.getInstance();
		if(sg.equals(sg2)) {
			System.out.println("Objetos íguais");
		}
	}

}

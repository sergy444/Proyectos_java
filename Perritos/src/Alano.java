
public class Alano extends Perro implements Dogo, Lebrel{

	
	public Alano(){
		super();
	}
	
	@Override
	public void ladrar() {
		System.out.println("Ladra alto");
		
	}

	@Override
	public void correr() {
		System.out.println("Este perro corre");
		
	}

	@Override
	public void comer() {
		System.out.println("Este perro come");		
	}

}

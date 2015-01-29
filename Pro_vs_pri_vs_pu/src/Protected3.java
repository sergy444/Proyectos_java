
public class Protected3 extends Protected2{

	
	public Protected3(){
		super();
	}
	
	@Override
	protected void frase(){
		System.out.println("esta frase heredada se ha sobreescrito.");
	}
	
	public void hijo(){
		System.out.println("Esta frase es pública.");
	}
}

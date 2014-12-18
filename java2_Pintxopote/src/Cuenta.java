import java.util.ArrayList;

public class Cuenta {

	private ArrayList<Pintxopote> pintxopote;

	public Cuenta(ArrayList<Pintxopote> pintxopote){
		this.pintxopote=pintxopote;
	}

	public ArrayList<Pintxopote> getPintxopote(){
		 
		 return this.pintxopote;
	}

	public void setPintxopote(ArrayList<Pintxopote> pintxopote){

		this.pintxopote = pintxopote;
	}

	
}
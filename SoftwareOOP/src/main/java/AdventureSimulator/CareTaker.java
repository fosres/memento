package AdventureSimulator;
import java.util.ArrayList;



public class CareTaker	{

	private ArrayList<Memento> mementos = new ArrayList<>();

	public void setMemento(Memento m)	{

		mementos.add(0,m);
	}	

	public void addMemento(Memento m)	{

		mementos.set(0,m);

	}
	
	public Memento getMemento()	{
	
		return mementos.get(0);

	}
}

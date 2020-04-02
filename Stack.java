//Kari Lampi


package collectionStack;
import java.util.*;
public class Stack {
	
	
	private LinkedList<String> list = new LinkedList<String>();
	private int size;
	private int ripper;
	
	public Stack() {
		size = 0;
		ripper=0;
	}
	
	// tehtävänä on muodostaa uusi lista-alkio 
	//ja viedä se pinon huipulle
	public void push(String aData) {
		System.out.println("push " + aData);
		list.addFirst(aData);
		size++;
	}
	
	// tehtävänä on palauttaa alkio pinon huipulta, 
	//jos pino on tyhjä palauta null
	
	public String pop() {
		String removeItem;
		if(list.isEmpty()) {
			System.out.println("Virhe: ei alkioita!");
			return null;
		} else {
			removeItem =list.remove(); //Osoitetaan pinon päällimmäiseen alkioon
			System.out.println("pop "+ removeItem);
			size--;
			
			return removeItem;
			
		}
			
	}
	
	// tulosta pinon sisältö muuttamatta pinoa
	public void printItems() {
		Iterator <String> roller= list.iterator();
		if(roller.hasNext() == false) {
			System.out.println("Pino on tyhjä!");
		} else {
			 //Osoitetaan pinon päällimmäiseen alkioon
			while(roller.hasNext()) {
				System.out.print(roller.next() + ","); //tulostetaan päällimmäisen sisältö
				 //siirrytään seuraavaan olioon
			}
			
		}
	}
	
	//palauta pinon koko
	public int getSize() {
		return size;
	}

}

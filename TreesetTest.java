

import java.util.Iterator;
import java.util.TreeSet;

public class TreesetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Integer> numberSet=new TreeSet<Integer>();
		
		numberSet.add(50);
		numberSet.add(40);
		numberSet.add(30);
		numberSet.add(70);
		numberSet.add(65);
		
		TreeSet chemicalSet=new TreeSet<>();
		TreeSet charSet=new TreeSet<>();
		chemicalSet.add("Oxygen");
		chemicalSet.add("Hydrogen");
		chemicalSet.add("Lithium");
		chemicalSet.add("Silver");
		chemicalSet.add("Helium");
		chemicalSet.add("Aluminium");
		chemicalSet.add("Helium");
		
		
		charSet.add('a');
		charSet.add('d');
		charSet.add('e');
		charSet.add('9');
		
		Iterator numIter =numberSet.iterator();
		
		for(Object object:numberSet) {
			System.out.println(object);
		}
		System.out.println("printing elements");
		for(Object object:chemicalSet) {
			System.out.println(object);
		}
		System.out.println("Printing characters");
		for(Object object:charSet) {
			System.out.println(object);
		}
	}

}

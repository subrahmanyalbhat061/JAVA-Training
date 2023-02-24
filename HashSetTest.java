package player.cricket;

import java.util.Iterator;
import java.util.HashSet;

public class HashSetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer> numberSet=new HashSet<Integer>();
		
		numberSet.add(50);
		numberSet.add(40);
		numberSet.add(30);
		numberSet.add(70);
		numberSet.add(65);
		
		HashSet chemicalSet=new HashSet<>();
		
		HashSet charSet=new HashSet<>();
		
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

package core;

import core.LinearStructureArray;

public class TestLinearStructureArray {
	public static void main(String[] args){
		LinearStructureArray array = new LinearStructureArray();
		System.out.println("Array has size "+array.size());
		array.add(25);
		array.add("ikke");
		array.add(34);
		array.remove("ikke");
		array.remove(34);
		System.out.println("Array has size "+array.size());
		if(array.isEmpty())
			System.out.println("Array is empty");
		else
			System.out.println("Array is not empty");
		if(array.contains(25))
			System.out.println("Array contains value "+25);
		System.out.println("toString output: "+array.toString());
	}
}

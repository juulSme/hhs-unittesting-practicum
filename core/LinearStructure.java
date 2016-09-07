package core;

public interface LinearStructure{
	public int size();
	//post: returns number of elements of structure
	
	public boolean isEmpty();
	//post: returns true iff structure is empty
	
	public void clear();
	//post: structure is empty
	
	public void add(Object value);
	//pre:  value is non null
	//post: value has been added to the end of the 
	//	  structure
	
	public Object remove(Object value);
	//pre:  value is non null
	//post: value has been removed and returned from 
	//	  structure, if it was there
	
	public boolean contains(Object value);
	//pre:  value is non null
	//post: returns true if value equals some value in 
	//	  structure
	
	public String toString();
	//post: returns a String representation of a Linear 
	//	  Structure
}

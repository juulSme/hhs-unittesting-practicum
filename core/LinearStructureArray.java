package core;

public class LinearStructureArray implements LinearStructure{
	public LinearStructureArray(){
		data = new Object[0];
	}
	
	public int size(){
		return size;
	}
	
	public boolean isEmpty(){
		return size()==0;
	}
	
	public void clear(){
		data = new Object[data.length];
	}
	
	public void add(Object input){
		if (!(size() == data.length))
			data[size()] = input;
		else{
			resizeArray(size()+10);
			data[size()] = input;
		}
		size++;
	}
	
	public Object remove(Object value){
		int index = indexOf(value);		
		if(index != -1){			
			data[index] = null;
			size--;
		}
		resizeArray(data.length);
		return value;
	}
	
	public boolean contains(Object value){
		boolean answer = false;
		if (indexOf(value) != -1){
			answer = true;
		}
		return answer;
	}
	
	public String toString(){
		String answer1 = "LinearStructureArray containing "+size()+" item(s), item list:";
		String answer2 = "";
		for(int i=0;i<size();i++){
			answer2 = answer2+"\n"+data[i];
		}
		return answer1+answer2;
	}
	
	private int indexOf(Object value){
		int answer = -1;
		for (int i=0;i<data.length;i++){
			if (data[i] != null && data[i].equals(value))
				answer = i;
		}
		return answer;
	}	
	
	private void resizeArray(int size){
		Object[] tempdata = new Object[size];
		for(int i=0,tempi=0;i<data.length;i++,tempi++){
			if(data[i] != null){				
				tempdata[tempi]=data[i];				
			}
			else tempi--;
		}
		data = tempdata;		
	}
	
	private Object[] data;
	private int size;
}

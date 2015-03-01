
public class IngHeapDecorator extends HeapDecorator{
	 
	IngHeapDecorator(Heap heap ){
		
		super(heap);
	}
	
	public void add(String newData){

		heap.add(newData);

	}
	
	/**
	   * This method used to make string containing preorder traversal
	   * of all elements ending with ing.  
	   * @return The value as a String.
	   */
	
	public String toString(){
		
		String printString = heap.toString();
		String[] split = printString.split(",");
		String resultString = "";
		
		for(String element : split){
			
			if(element.contains("ing")){
				
				resultString = resultString.concat(element+",");
			}
		}
		
		resultString = resultString.substring(0, resultString.length() - 1);
		return resultString;
		
	}
	
	/**
	   * This method used to put preorder traversal of elements  
	   * ending with ing into object of passed argument.
	   * @return The object as a String.
	   */
	
	public Object toArray(Object array){
		
		String printString =(String) heap.toArray(array);
		String[] split = printString.split(",");
		String resultString = "";
		
		for(String element : split){
			if(element.contains("ing")){
				resultString = resultString.concat(element+",");
			}
		}
		resultString = resultString.substring(0, resultString.length() - 1);
		
		return resultString;
		
	}
	/**
	   * This method used to make iterator to iterate through heap 
	   * in inorder traversal returning only elements ending with ing .  
	   * @return The object of a iterator.
	   */
	public Iterator getIterator(){
		
		return new IngFilter(heap.getIterator());
		
	}
	
}
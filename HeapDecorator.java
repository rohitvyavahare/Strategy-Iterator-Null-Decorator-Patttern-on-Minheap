
public abstract class HeapDecorator {
	
	protected Heap heap;
	
	HeapDecorator(Heap heap){
		
		this.heap = heap;
	}
	
	public void add(String newData){
		
		heap.add(newData);
	}
	public String toString(){
		
		return heap.toString();
	}
	
	public Object toArray(Object array){
		
		return heap.toArray(array);
	}
	
	public Iterator getIterator(){
		
		return heap.getIterator();
	}

}

import java.util.AbstractSet;

@SuppressWarnings({ "rawtypes" })
public class PHeap  extends AbstractSet   {
	private Heap heap;
	
	PHeap(){
		
		this.heap = new Heap();
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
	
	public void setHeapStrategy(HeapStrategy strategy){
		
		heap.setHeapStrategy(strategy);
	}
	
	public Iterator getIterator(){
		
		return heap.getIterator();
	}

	@Override
	public java.util.Iterator iterator() {
		
		return (java.util.Iterator)  this.heap.getIterator();
	}

	@Override
	public int size() {
		
		return 0;
	}

}

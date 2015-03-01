
public class Main {
	

	public static void main(String args[])  {
    String printString = new String();
    
    // Heap heap =new Heap();
	/*MinHeap minHeap = new MinHeap("a");
	minHeap.insert("b");
	minHeap.insert("c");
	minHeap.insert("d");
	minHeap.insert("e");
	minHeap.insert("f");
	printString=minHeap.toString();
	System.out.println("String:"+printString);*/
    
    
    
    /*heap.setHeapStrategy(new MinHeap("a"));
    
    heap.add("bing");
    heap.add("cing");
    heap.add("d");
    heap.add("eing");
    heap.add("f");
    printString =heap.toString();
    System.out.println("String:"+printString);*/
 
    /*String test = new String();
    Heap tester =new Heap();

	tester.setHeapStrategy(new MinHeap("a"));
    
    tester.add("bing");
    tester.add("cing");
    tester.add("d");
    tester.add("eing");
    tester.add("f");
    
    
    IngHeapDecorator ingHeap = new IngHeapDecorator(tester);
    
    printString=ingHeap.toString();
    System.out.println("String:"+printString);
    /*test = (String) tester.toArray((String)test);
    System.out.println("String:"+test);*/
    
    /*heap.setHeapStrategy(new MaxHeap("f"));
    
    heap.add("e");
    heap.add("d");
    heap.add("c");
    heap.add("b");
    heap.add("a");
    
    
    
    
    
    Iterator iter = heap.getIterator();
	while(iter.hasNext()){
		
		printString = printString.concat((String)iter.next()+",");

	}
	printString = printString.substring(0, printString.length() - 1);
	System.out.println("String:"+printString);*/
    
    
   /* Iterator iter = tester.getIterator();
	String print = new String();

	while(iter.hasNext()){
		print = print.concat((String)iter.next()+",");

	}
	print = print.substring(0, print.length() - 1);
	System.out.println("String:"+print);*/
    
    

   // String test = new String();
PHeap tester =new PHeap();
	
	
	
	
	tester.setHeapStrategy(new MinHeap("a"));
    
    tester.add("bing");
    tester.add("cing");
    tester.add("d");
    tester.add("eing");
    tester.add("f");
    Iterator iter = tester.getIterator();
	while(iter.hasNext()){
		
		printString = printString.concat((String)iter.next()+",");

	}
	printString = printString.substring(0, printString.length() - 1);
    
    
    
    
    
	}
}

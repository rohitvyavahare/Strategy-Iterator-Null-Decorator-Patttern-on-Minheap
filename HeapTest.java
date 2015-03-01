import static org.junit.Assert.*;

import org.junit.Test;


public class HeapTest {

	@Test
	public void testPrint1() {
		
		String printString ="a,bing,d,f,cing,eing";
	    Heap tester =new Heap();

		tester.setHeapStrategy(new MinHeap("a"));
	    
	    tester.add("bing");
	    tester.add("cing");
	    tester.add("d");
	    tester.add("eing");
	    tester.add("f");
	    
	    String test = tester.toString();
	    
	    assertEquals("Answer for input a,bing,cing,d,eing,f is a,bing,d,f,cing,eing",printString, test);
	}

	@Test
	public void testPrint2() {
		
		String printString ="f,eing,cing,a,d,bing";
	    Heap tester =new Heap();

		tester.setHeapStrategy(new MaxHeap("f"));
	    
	    tester.add("eing");
	    tester.add("d");
	    tester.add("cing");
	    tester.add("bing");
	    tester.add("a");
	    
	    String test = tester.toString();
	    
	    assertEquals("Answer for input f,eing,d,cing,bing,a is f,eing,cing,a,d,bing",printString, test);
	}
	
	@Test
	public void testPrint3() {
		
		String printString ="a,bing,d,f,cing,eing";
		String test = new String();
	    Heap tester =new Heap();

		tester.setHeapStrategy(new MinHeap("a"));
	    
	    tester.add("bing");
	    tester.add("cing");
	    tester.add("d");
	    tester.add("eing");
	    tester.add("f");
	    
	    test = (String) tester.toArray((String)test);
	    
	    assertEquals("Answer for input a,bing,cing,d,eing,f is a,bing,d,f,cing,eing",test, printString);
	}
	
	@Test
	public void testPrint4() {
		
		String printString ="f,eing,cing,a,d,bing";
		String test = new String();
	    Heap tester =new Heap();

		tester.setHeapStrategy(new MaxHeap("f"));
	    
	    tester.add("eing");
	    tester.add("d");
	    tester.add("cing");
	    tester.add("bing");
	    tester.add("a");
	    
	    test = (String) tester.toArray((String)test);
	    
	    assertEquals("Answer for input f,eing,d,cing,bing,a is f,eing,cing,a,d,bing",printString, test);
	}
	
	@Test
	public void testPrint5() {
		
		Heap tester =new Heap();
	
		String printString = new String();
		String test ="d,bing,f,a,eing,cing";
	
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
		
		assertEquals("Answer for input a,bing,cing,d,eing,f is d,bing,f,a,eing,cing",printString, test);
	}
	@Test
	public void testPrint6() {
		
		String printString = new String();
	    Heap tester =new Heap();
        String test ="cing,eing,a,f,bing,d";
		
        tester.setHeapStrategy(new MaxHeap("f"));
	    
	    tester.add("eing");
	    tester.add("d");
	    tester.add("cing");
	    tester.add("bing");
	    tester.add("a");
	    
	    Iterator iter = tester.getIterator();
		while(iter.hasNext()){
			
			printString = printString.concat((String)iter.next()+",");

		}
		
		printString = printString.substring(0, printString.length() - 1);
		
		assertEquals("Answer for input f,eing,d,cing,bing,a is cing,eing,a,f,bing,d",printString, test);
	}

	@Test
	public void testPrint7() {
		
		Heap tester =new Heap();
		String test ="bing,cing,eing";
		
		tester.setHeapStrategy(new MinHeap("a"));
    
		tester.add("bing");
		tester.add("cing");
		tester.add("d");
		tester.add("eing");
		tester.add("f");
    
		IngHeapDecorator ingHeap = new IngHeapDecorator(tester);
		
		assertEquals("Answer for input a,bing,cing,d,eing,f is bing,cing,eing",test, ingHeap.toString());

	}
	
	@Test
	public void testPrint8() {
	
		Heap tester =new Heap();
		String test ="eing,cing,bing";
		tester.setHeapStrategy(new MaxHeap("f"));
    
		tester.add("eing");
		tester.add("d");
		tester.add("cing");
		tester.add("bing");
		tester.add("a");
		
		IngHeapDecorator ingHeap = new IngHeapDecorator(tester);
		
		assertEquals("Answer for input f,eing,d,cing,bing,a is eing,cing,bing",test, ingHeap.toString());
	}
	
	@Test
	public void testPrint9() {
		
		String printString ="bing,cing,eing";
		String test = new String();
	    Heap tester =new Heap();

		tester.setHeapStrategy(new MinHeap("a"));
	    
	    tester.add("bing");
	    tester.add("cing");
	    tester.add("d");
	    tester.add("eing");
	    tester.add("f");
	    
	    IngHeapDecorator ingHeap = new IngHeapDecorator(tester);
	    test= (String)ingHeap.toArray(test);
	    
	    assertEquals("Answer for input a,bing,cing,d,eing,f is bing,cing,eing",printString, test);
	}
	
	@Test
	public void testPrint10() {
		
		String printString ="eing,cing,bing";
		String test = new String();
	    Heap tester =new Heap();

		tester.setHeapStrategy(new MaxHeap("f"));
	    
	    tester.add("eing");
	    tester.add("d");
	    tester.add("cing");
	    tester.add("bing");
	    tester.add("a");
	    
	    IngHeapDecorator ingHeap = new IngHeapDecorator(tester);
	    test= (String)ingHeap.toArray(test);
	    
	    assertEquals("Answer for input f,eing,d,cing,bing,a is eing,cing,bing",printString, test);
	}
	
	@Test
	public void testPrint11() {
		
		Heap tester =new Heap();
		String printString = new String();
		String test ="bing,eing,cing";
	
		tester.setHeapStrategy(new MinHeap("a"));
    
		tester.add("bing");
		tester.add("cing");
		tester.add("d");
		tester.add("eing");
		tester.add("f");
	
		IngHeapDecorator ingHeap = new IngHeapDecorator(tester);
		Iterator iter = ingHeap.getIterator();
		
		while(iter.hasNext()){
		
		printString = printString.concat((String)iter.next()+",");

		}
		
		printString = printString.substring(0, printString.length() - 1);
		
		assertEquals("Answer for input a,bing,cing,d,eing,f is bing,eing,cing",printString, test);
	}
	
	@Test
	public void testPrint12() {
		
		String printString = new String();
	    Heap tester =new Heap();
        String test ="cing,eing,bing";
		tester.setHeapStrategy(new MaxHeap("f"));
	    
	    tester.add("eing");
	    tester.add("d");
	    tester.add("cing");
	    tester.add("bing");
	    tester.add("a");
	    
	    IngHeapDecorator ingHeap = new IngHeapDecorator(tester);
	    Iterator iter = ingHeap.getIterator();
		
	    while(iter.hasNext()){
			
			printString = printString.concat((String)iter.next()+",");

		}
		
	    printString = printString.substring(0, printString.length() - 1);
		
	    assertEquals("Answer for input f,eing,d,cing,bing,a is cing,eing,bing",printString, test);
	}
	
}

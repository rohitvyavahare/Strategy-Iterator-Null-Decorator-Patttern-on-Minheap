import java.util.AbstractSet;


@SuppressWarnings({ "rawtypes" })
public class Heap  extends AbstractSet implements Container{

	private RealNode root;
	private HeapStrategy strategy;
	
	
	public void setHeapStrategy(HeapStrategy strategy){
	
		this.strategy = strategy; 
	
	}
	
	public void add(String newData){
		
		this.strategy.add(newData);
	}
	
	
	/**
	   * This method used to make iterator to iterate through heap 
	   * in in-order traversal.  
	   * @return The object of a iterator.
	   */
	
	@Override
	   public Iterator getIterator() {
		
	      return new MinHeapIterator();
	      
	   }
	
	private class MinHeapIterator implements Iterator {
  
		private RealNode root = strategy.getRoot(), backUpNode;
		private RealNode headNode = root;
		private String inorderSuccessor;
		private boolean left= false, right= false, parent = false;
		private boolean head = false, end=false;
      
		MinHeapIterator(){
			
		while(root.getLeft().height() != 0){
			
			backUpNode = root;
			root = (RealNode) root.getLeft();
		}
		
		inorderSuccessor =root.getData();
		}
		
	    @Override
	    public boolean hasNext() {
	         if(!end){
	        	 
	        	 if(left){
	        		 
		    		 while(headNode.getLeft().height() !=0){
		    			 
		    			 backUpNode =headNode;
		    			 headNode = (RealNode) headNode.getLeft();
		    		 }
		    		 
		    		 inorderSuccessor =headNode.getData() ;
		    	 }
	        	 if(parent){
	        		 
		    		if(backUpNode.getRight().height() == 0 && head){
		    			
		    			end = true;
		    			inorderSuccessor = backUpNode.getData();
		    		}
	        	 }
	        	 if(right) {
	        		 
		    		 if(head && headNode.isLeaf()){
		    			 
		    			 end = true;
		    			 inorderSuccessor =headNode.getData();
		    		 }
	        	 }
	        	   
	            return true;
	         }
	         return false;
	     }

	     @Override
	     public Object next() {
	    	  
	    	 if(right) {
	    		 
	    		 right = false;
	    		 
	    		 if(! head && headNode.isLeaf() ){
	    			 
	    			    right= true;
	    			    parent = true;
	    		 }
	    		 
	    		 else{
	    			 
	    			 left= true;
	    			 return inorderSuccessor =backUpNode.getData();
	    		 }	    			 
	    	 }
	    	  
	    	 if(left){
	    		 
	    		 left = false;
	    		 parent = true;
	    		 return inorderSuccessor ;
	    	 }
	    	 
	    	 if(end){
	    		 
	    		 return inorderSuccessor;
	    	 }
	    	 
	    	 if(parent){
	    		 
	    		 parent = false;
	    		 inorderSuccessor =backUpNode.getData();
	    		 
	    		 if( (backUpNode.getRight().height() == 0 && !head) || right){
	    			
	    			 if(right)
	    				inorderSuccessor =headNode.getData();
	    			 
	    			while(root.getData()!= backUpNode.getData()){
	    				
	    				headNode =root;
	    				root = (RealNode)root.getLeft();
	    			}
	    			
	    			root = strategy.getRoot();;
	    			
	    			if(headNode == root){
	    				
	    				head = true;
	    			}
	    			
	    			backUpNode =headNode;    			
	    		 }
	    		 
	    	headNode = (RealNode)backUpNode.getRight();
 			right = true;
         	return inorderSuccessor;
         	
	    	}
	    	 
	    	root = strategy.getRoot();;
	    	parent= true;
	    	return inorderSuccessor; 
	    }
	     
		@Override
		public void remove() {
			// TODO Auto-generated method stub
			
		}
	}   
	
	
	/**
	   * This method used to make string containing pre-order traversal
	   * of all elements.  
	   * @return The value as a String.
	   */
	
	public String toString() {
		
		String printString = new String();
		root = strategy.getRoot();
		printString=toString(root, printString);
		printString = printString.substring(0, printString.length() - 1);
	    return printString;
	}
	
	private String toString(RealNode root,String printString) {

	  if(root.isLeaf()){
		  
		  return printString = printString.concat(root.getData()+",");
	  }
	  
	  printString = printString.concat(root.getData()+",");
	  
      if(root.getLeft().height() != 0 ){
    	  
    	  printString = toString( (RealNode) root.getLeft(),printString);
      }
      
	  if(root.getRight().height() != 0 ){
		  
		  printString = toString( (RealNode) root.getRight(),printString);
	  }
	  
	  return printString;
	}
	
	/**
	   * This method used to put pre-order traversal into object 
	   * of passed argument.
	   * @return The object as a String.
	   */
	
	public Object toArray(Object array){
		
		String printString = new String();
		root = strategy.getRoot();
		printString=toString(root, (String) array );
		printString = printString.substring(0, printString.length() - 1);
	    return printString;
		
	}

	@Override
	public java.util.Iterator iterator() {
		// TODO Auto-generated method stub
		return (java.util.Iterator)  this.getIterator();
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
}

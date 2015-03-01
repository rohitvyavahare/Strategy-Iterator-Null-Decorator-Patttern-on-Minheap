
public class RealNode extends Node {
	
	private Node left = new NullNode(), right = new NullNode();
    private String data;
    
    RealNode (String newData){
    	
    	left = new NullNode();
    	right = new NullNode();
    	setData(newData);
    }
    
    
	public Node getLeft() {
		
		return left;
	}

	public void setLeft(RealNode left) {
		
		this.left = left;
	}

	public Node getRight() {
		
		return right;
	}

	public void setRight(RealNode right) {
		
		this.right = right;
	}
	
	public boolean isLeaf(){
		
		if(left.height() == 0 && right.height() == 0)
			return true;
		
		return false;	
	}
	
	
	public int height() {
		
		int leftHeight = left.height();
		int rightHeight = right.height();
		return 1 + Math.max(leftHeight, rightHeight);
	}
	
   
	public String getData() {
		
		return data;
	}

	public void setData(String data) {
		
		this.data = data;
	}
	
}

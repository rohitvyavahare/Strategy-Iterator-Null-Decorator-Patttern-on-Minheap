
public class MaxHeap implements HeapStrategy {
	
	private RealNode root;
	
	
	MaxHeap(String newData){
		
		this.root = new RealNode(newData);
	}
	
	public RealNode getRoot() {
		
		return root;
	}
	
	private String swap(RealNode node, String data)
	{
		
		String newData = node.getData();;
		node.setData(data);
		return newData;

	} 
	
	public void add(String newData){
		
		add(root,newData);
			
	}
	
	
		
	private void add(Node currentNode, String newData){
		
		int  currentLeftHeight, currentRightHeight;
		
		RealNode node,backupNode;
		node = (RealNode) currentNode;
		backupNode = node;
		
		if(node.getRight().height() !=0)
			backupNode =(RealNode) node.getRight();
		
		if(node.getData().compareTo(newData) <= 0)
			newData = swap(node, newData);
		
		if(node.getLeft().height() == 0){
			
			node.setLeft(new RealNode(newData));	
			return ;
		}
		
		else if ( node.getRight().height() == 0){
			
			node.setRight(new RealNode(newData));
			return ;
		}
		
		else if( backupNode.getRight().height() == 0 ){
			
			currentRightHeight = node.getRight().height() ;
			currentLeftHeight = node.getLeft().height() ;
				
			if(currentLeftHeight <= currentRightHeight )
			   add(node.getLeft(), newData);
			
			else
				add(node.getRight(), newData);
		}
	}
	
}

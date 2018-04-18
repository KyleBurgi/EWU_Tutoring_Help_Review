package tutoring_Help.node;

public class BinaryNode {
	
	public BinaryNode left;
	public BinaryNode right;
	private Object data;
	
	public BinaryNode(Object piData){
		this.left = null;
		this.right = null;
		this.data = piData;
	}
	
	public BinaryNode() {
		this.left = null;
		this.right = null;
		this.data = null;
	}
	
	public BinaryNode getLeft() {
		if(this.left == null)
			return null;
		
		return this.left;
	}
	
	public BinaryNode getRight() {
		if(this.right == null)
			return null;
		
		return this.right;
	}
	
	
	public void setLeft(BinaryNode piNode) {
		this.left = piNode;
	}
	
	public void setRight(BinaryNode piNode) {
		this.right = piNode;
	}
	
	public Object getData() {
		return this.data;
	}
	
}//end Node

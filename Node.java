package tutoring_Help.node;


public class Node{
	
	public Node next;
	private Object data;
	
	public Node(Object o){
		this.next = null;
		this.data = o;
	}
	
	public Node() {
		this.next = null;
		this.data = null;
	}
	
	public Node getNext() {
		return this.next;
	}
	
	public void setNext(Node piNode) {
		this.next = piNode;
	}
	
	public Object getData() {
		return this.data;
	}
	
}//end Node

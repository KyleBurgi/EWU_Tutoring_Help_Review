package tutoring_Help.linkedLists;

import tutoring_Help.node.*;

public class Single_LinkedList {
	
	private int size;
	private Node head;
	
	public Single_LinkedList() {
		this.size = 0;
		this.head = null;
	}
	
	public int getSize() {
		return this.size;
	}
	
	public Node getHead() {
		if(this.getSize() == 0)
			return null;
		
		return this.head;
	}
	
	public void setHead(Node newHead) {
		this.head = newHead;
	}
	
	private void increaseSizeByOne() { this.size++; }
	private void decreaseSizeByOne() { this.size--; }
	
	public Object getFirst() {
		
		if(this.getSize() == 0)
			return null;
		
		return this.getHead().getData();
	}
	
	public void deleteFullList() {
		this.size = 0;
		this.head.next = null;
		setHead(null);
	}
	
	public void addFirst(Object o) {
		Node nn = new Node(o);
		
		if(getSize() == 0) {
			 setHead(nn);
		}
		
		else {
			nn.next = this.head;
			setHead(nn);
		}
		
		
		increaseSizeByOne();
	}
	
	public void addLast(Object o) {
		Node nn = new Node (o);
		Node cur = getHead();
		
		
		if(this.getSize() == 0){
			addFirst(o);
		}
		
		else {
			while(cur.getNext() != null)
			{
				cur = cur.next;
			}
			cur.next = nn;
			increaseSizeByOne();
		}
		
	}
	
	public Node removeFirst() {
		if(getSize() == 0)
			return null;
		
		else {
			Node removedNode = this.getHead();
			setHead(this.getHead().next);
			decreaseSizeByOne();
			return removedNode;
		}
	}
	
	public Node removeIndex(int index) {
		Node removedNode = null;
		
		if(index >= this.getSize())
			return removedNode;
		
		if(index == 0)
			return removeFirst();
		
		if(index == this.getSize()-1)
			return removeLast();
		
		else {
			Node cur = this.getHead();
			Node prev = cur;
			
			for(int i = -1; i<index-1; i++) {
				prev = cur;
				cur = cur.next;
				
			}
			
			prev.next = cur.next;
			decreaseSizeByOne();
			removedNode = cur;
		
		}//end else

		return removedNode;
	}
	
	public Node removeLast() {
		Node removedNode = null;
		
		if(getSize() == 0)
			return null;
		
		else if(getSize() == 1) {
			removedNode = this.getHead();
			this.deleteFullList();
			return removedNode;
		}
		
		else {
			Node cur = this.getHead();
			
			while(cur.next.next!=null) cur = cur.next;
			
			removedNode = cur.next;
			cur.next = null;
		}
		decreaseSizeByOne();
		return removedNode;
	}
	
	public Node removeEquals(Object o) {
		Node removedNode = null;
		if(getSize() == 0)
			return null;
		
		if(this.getHead().getData().equals(o)) {
			removedNode = this.getHead();
			setHead(this.getHead().next);
			decreaseSizeByOne();
			return removedNode;
		}
		
		Node cur = this.getHead();
		Node prev = cur;
		while(cur != null) {
			
			if(cur.getData().equals(o)) {
				removedNode = cur;
				prev.next = cur.next;
				decreaseSizeByOne();
				return removedNode;
			}
			prev = cur;
			cur = cur.next;
		}
		System.out.println("Node " + o.toString() + " Not Found.");
		return removedNode;
	}
	
	@Override
	public String toString() {
		
		if(this.getSize() == 0)
			return "{ Empty List }";
		
		Node cur = this.getHead();
		
		String retStr = "{";
		while(cur!=null) {
			
			retStr += cur.getData();
			if(cur.next != null) {
				retStr +=", ";
			}
			
			cur = cur.next;
			
		}
		
		return retStr +"}";
	}
}//end LinkedList



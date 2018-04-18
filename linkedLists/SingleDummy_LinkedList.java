package tutoring_Help.linkedLists;

import tutoring_Help.node.*;

public class SingleDummy_LinkedList {
	
	private int size;
	private Node head;
	
	public SingleDummy_LinkedList() {
		this.size = 0;
		this.head = new Node();
	}
	
	public int getSize() {
		return this.size;
	}
	
	public Node getHead() {
		return this.head;
	}
	
	private void increaseSizeByOne() { this.size++; }
	private void decreaseSizeByOne() { this.size--; }
	
	public Object getFirst() {
		
		if(this.getSize() == 0)
			return null;
		
		return this.getHead().getNext().getData();
	}
	
	public void deleteFullList() {
		this.size = 0;
		this.head.setNext(null);
	}
	
	public void addFirst(Object o) {
		Node nn = new Node(o);
		
		if(getSize() == 0) {
			 this.getHead().next = nn;
		}
		
		else {
			nn.setNext(getHead().getNext());
			getHead().next = nn;
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
		
		Node removedNode = null;
		
		if(getSize() == 0)
			return null;
		
		else {
			removedNode = this.getHead().next;
			this.head.next = removedNode.next;
		}
		
		decreaseSizeByOne();
		return removedNode;
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
			Node cur = this.getHead().next;
			Node prev = this.getHead();
			
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
		
		else {
			Node cur = this.getHead();
			
			while(cur.next.next!=null) cur = cur.next;
			
			removedNode = cur.next;
			cur.next = null;
		}
		decreaseSizeByOne();
		return removedNode;
	}
	
	@Override
	public String toString() {
		
		if(this.getSize() == 0)
			return "{ Empty List }";
		
		Node cur = this.getHead();
		
		String retStr = "{";
		cur = cur.next;
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


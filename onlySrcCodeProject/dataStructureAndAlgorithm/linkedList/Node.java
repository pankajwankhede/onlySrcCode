package linkedList;

public class Node {
	private int data;
	private Node nextNode;
	
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public Node getNextNode() {
		return nextNode;
	}
	public void setNextNode(Node nextNode) {
		this.nextNode = nextNode;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		
		return String.valueOf(this.data);
	}
}

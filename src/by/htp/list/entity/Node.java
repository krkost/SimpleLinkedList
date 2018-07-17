package by.htp.list.entity;

public class Node {

	private int iData;
	private Node next;

	public Node() {

	}

	public Node(int iData, Node next) {
		super();
		this.iData = iData;
		this.next = next;
	}

	public Node(int iData) {
		this.iData = iData;
	}

	public int getiData() {
		return iData;
	}

	public void setiData(int iData) {
		this.iData = iData;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

	public void displayNode() {
		System.out.print("{" + iData + "} ");
	}

}

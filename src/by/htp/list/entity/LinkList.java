package by.htp.list.entity;

public class LinkList {

	private Node first;

	public LinkList() {
		first = null;
	}

	public LinkList(Node first) {
		super();
		this.first = first;
	}

	public Node getFirst() {
		return first;
	}

	public void setFirst(Node first) {
		this.first = first;
	}

	public boolean isEmpty() {
		return (first == null);
	}

	public void insertFirst(int id) {
		Node temp = new Node(id);
		temp.setNext(first);
		first = temp;
	}

	public void displayNodes() {
		System.out.print("List (first-->last): ");
		Node current = first;
		while (current != null) {
			current.displayNode();
			current = current.getNext();
		}
		System.out.println("");
	}

}

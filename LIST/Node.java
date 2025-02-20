package Pertemuan3;
public class Node {
	private int data;
	private Node next;

    /*inisiasi atribut node*/

	Node(int data) {
		this.data = data;
	
	}
	//setter & getter

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}
	
}

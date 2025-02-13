package Pertemuan2;
public class Node {
	private int nilai;
	public int getNilai() {
		return nilai;
	}

	public void setNilai(int nilai) {
		this.nilai = nilai;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

	private Node next;
	//inisiasi Node
	public Node (int nilai) {
		this.nilai = nilai;
	}
	//setter & getter
}

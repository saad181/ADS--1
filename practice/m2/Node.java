public class Node {
	int num;
	Node next;

	Node(int num) {
		this.num = num;
		this.next = null;
	}
	public int getNum() {
        return this.num;
	}
	public void setNum(int num) {
        this.num =  num;
	}
	public Node getNext() {
		return next;
	}
	public void setNext(Node next) {
        this.next = next;
	}
}
 
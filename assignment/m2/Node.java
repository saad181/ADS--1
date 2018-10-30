/**.
 * Class for node.
 */
class Node {
	/**
	 * data in Node
	 */
	private int data;
	/**
	 * link of the NOde
	 */
	private Node link;
	/**
	 * Constructs the object.for node
	 *
	 * @param      data  The data
	 */
	Node(int data) {
		this.data = data;
		this.link = null;
	}
	/**
	 * Gets the data.
	 *
	 * @return     The data.
	 */
	public int getData() {
		return this.data;
	}
	/**
	 * Gets the link.
	 *
	 * @return     The link.
	 */
	public Node getLink() {
		return  this.link;
	}
	/**
	 * Sets the data.
	 *
	 * @param      item  The item
	 */
	public void setData(int item) {
		this.data = item;
	}
	/**
	 * Sets the link.
	 *
	 * @param      x     { Node}
	 */
	public void setLink(Node x) {
		this.link = x;
	}
}
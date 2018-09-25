class Linkedlist {
	Node start ;
	int size ;
	
	Linkedlist() {
		this.start = null;
		this.size = 0;
	}
	void pushRight(int size) {
      if (start == null) {
         start = new Node(size);
      } else {
      	Node temp = start;
      	Node a = new Node(size);
      	while (temp.getNext() != null) {
      		temp = temp.getNext();
      	}
      	temp.setNext(a);
      }
      size++;
        
      }
      
	
	void pushLeft(int num ) {
       Node n = new Node(num);
       n.setNext(start);
       start = n;
       size++;

	}
	void removeLeft() {
		 if (start != null) {
		 	start = start.getNext();
		 	size--;
             
		} else {
			System.out.println("Empty linked list");
		 }
		}
	void removeRight() {
		if (start == null) {
			System.out.println("No nodes to remove");

		} else if(size < 2) {
			start = null;
			size--;
		} else {
			Node temp = start;
			while (temp.getNext().getNext() != null) {
				temp = temp.getNext();

			}
			temp.setNext(null);
			size--;
		}
	}
	public int size() {
		return size;
	}
	public String toString() {
		String s = "";
		Node temp = start;
		if (temp == null) {
			return "Empty linked list";
		}
		while (temp.getNext() != null) {
			s += temp.getNum() + ", ";
			temp = temp.getNext();
		}
		s = s+temp.getNum();
		return s;
	}	
	}

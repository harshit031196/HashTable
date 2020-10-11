package hashtable;



public class LinkedList<K> {

	static MyMapNode head=null;
	
	public static <K> void insertNode(K key) {
		MyMapNode<K> n = new MyMapNode<K>(key);
		if(head==null) {
			head=n;
		}else {
			MyMapNode prev=head;
			while(prev.getNext()!=null) {
				prev=prev.getNext();
			}
			prev.setNext(n);
		}
	}

	public static <K> void printLinkedList(LinkedList l) {
		MyMapNode temp = l.head;
		while(temp!=null) {
			System.out.println(temp.getKey()+ " :"+ temp.getValue());
			temp=temp.getNext();		
		}
	}
	public static <K> boolean search(K key) {
		MyMapNode temp = head;
		int count=0;
		boolean flag=false;
		if(temp==null) {
			return false;
		}
		while(temp!=null) {
			count++;
			if(temp.getKey().equals(key)) {return true;}
			temp=temp.getNext();
		}
		return flag;
	}
}

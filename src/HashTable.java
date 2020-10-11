package hashtable;

public class HashTable<K> {
	static LinkedList l = new LinkedList();
	public HashTable(LinkedList l) {
		this.l=l;
	}
	public <K> void insertMapNode(K key) {
		MyMapNode temp = l.head;
		MyMapNode n = new MyMapNode(key);
		if(l.search(key)) {
			while(temp.getNext().getKey()!=n.getKey()) {
				temp=temp.getNext();
			}
			int val = temp.getValue();
			val++;
			temp.setKey(val);
		}else {
			l.insertNode(key);
		}
	}
	public static<K> void printHashMap() {
		LinkedList.printLinkedList(l);
	}
	public static<K> void delete(K key) {
		MyMapNode temp = l.head;
		MyMapNode n = new MyMapNode(key);
		if(l.search(key)) {
			MyMapNode prev = null;
			while(temp.getNext().getKey()!=n.getKey()) {
				prev=temp;
				temp=temp.getNext();
			}
			prev.setNext(temp.getNext());
			
		}else {
			System.out.println("This is not present in the hash map");
		}
	}
}

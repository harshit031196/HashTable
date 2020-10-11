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
			while(temp!=null) {
				if(temp.getKey().equals(key)) {
					int val = temp.getValue();
					val++;
					temp.setValue(val);
					return;
				}
				temp=temp.getNext();
			}
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
			MyMapNode prev = temp;
			if(temp.getKey().equals(key)) {
				l.head=temp.getNext();
				return;
			}
			temp=temp.getNext();
			while(temp!=null) {
				if(temp.getKey().equals(key)) {
					prev.setNext(temp.getNext());
					return;
				}
				temp=temp.getNext();
			}
		}else {
			System.out.println("This is not present in the hash map");
		}
	}
}

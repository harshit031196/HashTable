package hashtable;

public class MyMapNode<K> {
	private K key;
	private int value;
	MyMapNode next;
	public MyMapNode(K key) {
		this.key=key;
		this.value=1;
		next=null;
	}
	public K getKey() {
		return key;
	}
	public void setKey(K key) {
		this.key = key;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	public MyMapNode getNext() {
		return next;
	}
	public void setNext(MyMapNode next) {
		this.next = next;
	}
}

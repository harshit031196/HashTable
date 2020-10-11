package hashtable;

public class HashTableMain {
	static LinkedList l =new LinkedList();
	static HashTable ht = new HashTable(l);
	public static void main(String[] args) {
		String test = "To be or not to be";
		String temp="";
		for(int i=0;i<test.length();i++) {
			if(test.charAt(i)!=' ') {
				temp+=test.charAt(i);
			}else {
				ht.insertMapNode(temp.toLowerCase());
				temp="";
			}
		}
		ht.insertMapNode(temp);
		ht.printHashMap();
		ht.delete("be");
		ht.printHashMap();
	}

}

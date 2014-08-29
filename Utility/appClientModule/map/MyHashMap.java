package map;

import java.util.HashMap;

public class MyHashMap <K, V>{
	public  MyHashMap() {}
	
	Entry<K,V>[] tables;
	
	public static class Entry<K,V> {
		int hash;
		K key;
		V value;
		Entry<K,V> next;
		
		public Entry(int h, K k, V v, Entry<K,V> e) {
			this.hash = h;
			this.key = k;
			this.value = v;
			this.next = e;						
		}
	}
}

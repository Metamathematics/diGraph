package diGraph;

import diGraph.ListItem;

public class List {

	//Neue abgeänderte variante von List. Head ist jetzt
	//das erste Element von der Liste und nicht einfach 
	//ein Zeiger auf das erste Element
	
	private ListItem head;
	
	public List (DiGraphNode key){	
		head = new ListItem();
		head.key = key;
	}
	
	public ListItem insert(DiGraphNode k) {
		ListItem item = new ListItem(); 
		
		item.key = k;
		item.next = head;

		head.prev = item;
		head = item;
		
		return item; 
	}
	
	public ListItem getHead(){
		return head;
	}
	 
}
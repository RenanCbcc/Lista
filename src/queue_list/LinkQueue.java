package queue_list;

import double_ended_lists.FirstLastList;

public class LinkQueue<O> {
	
	private FirstLastList<O> list;
	
	// -------------------------------------------------------------------
	public LinkQueue(){
		list = new FirstLastList<O>();
	}
	
	// -------------------------------------------------------------------
	public boolean isEmpty(){
		return list.isEmpty();
	}
	
	// -------------------------------------------------------------------
	public void insert(O object){
		list.insertLast(object); //Insert, rear of queue.
	}
	
	// -------------------------------------------------------------------
	public O remove(){
		return list.deleteFirst();
	}
	
	// -------------------------------------------------------------------
	public void displayQueue(){
		System.out.println("");
		System.out.println("Queue (front --> rear): ");
		list.displayList();
	}
}

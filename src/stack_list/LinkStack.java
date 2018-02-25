package stack_list;

import simple_list.LinkList;

public class LinkStack<O> {
	private LinkList<O> list;

	public LinkStack() {
		list = new LinkList<O>();
	}

	// -------------------------------------------------------------------
	public void push(O object) {
		list.insertFirst(object); // Put item on top of stack.
	}

	// -------------------------------------------------------------------
	public O pop() {
		return list.deleteFirst();
	}

	// -------------------------------------------------------------------
	public boolean isEmpty() {
		return list.isEmpty();
	}

	// -------------------------------------------------------------------
	public void displayStack() {
		System.out.println("Stack (top --> bottom): ");
		list.displayList();
	}

	// -------------------------------------------------------------------

}

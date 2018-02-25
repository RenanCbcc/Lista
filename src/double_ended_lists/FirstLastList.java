package double_ended_lists;

import simple_list.Link;

public class FirstLastList<O> {
	private Link<O> first;
	private Link<O> last;

	// -------------------------------------------------------------------
	public FirstLastList() {
		first = null;
		last = null;
	}

	// -------------------------------------------------------------------
	public boolean isEmpty() {
		return (first == null);
	}

	// -------------------------------------------------------------------
	public void insertFirst(O object) {
		Link<O> newlink = new Link<O>(object);
		if (isEmpty()) {
			last = newlink; // newlink <-- last.
		} else {
			newlink.setNext(first); // newlink --> old first.
		}

		first = newlink;
	}

	// -------------------------------------------------------------------
	public void insertLast(O object) {
		Link<O> newlink = new Link<O>(object);
		if (isEmpty()) {
			first = newlink;
		} else {
			last.setNext(newlink);
		}
		last = newlink;
	}

	// -------------------------------------------------------------------
	public O deleteFirst() {
		if (isEmpty()) {
			System.out.println("The list is currently empty.");
		} else if (first.getNext() == null) {// If only one item
			last = null; // Last <-- null.
		}
		O temp = first.getData();
		first = first.getNext();
		return temp;
	}

	// -------------------------------------------------------------------
	public void displayList() {
		if (isEmpty()) {
			System.out.println("The list is currently empty.");
		}
		System.out.println("List [first --> last]: ");
		Link<O> current = first; // Start at beginning.
		while (current!=null) {
			current.display(); // Print data.
			current = current.getNext(); // Move to nest link.
		}
		System.out.println("");
	}
	
	// -------------------------------------------------------------------
}

package double_list;


public class DoublyLinkedList<O> {
	private Link<O> first;
	private Link<O> last;

	// -------------------------------------------------------------------
	public O getFristData() {
		return first.getData();
	}
	
	// -------------------------------------------------------------------
	public O getLastData() {
		return last.getData();
	}

	// -------------------------------------------------------------------
	public void insertLast(O object) {
		Link<O> newlink = new Link<O>(object);
		if (isEmpty())
			first = last = newlink;
		else {
			last.setNext(newlink);
			newlink.setPrevious(last);
			last = newlink;
		}
	}

	// -------------------------------------------------------------------
	public void insertFirst(O object) {
		Link<O> newlink = new Link<O>(object);
		if (isEmpty())
			first = last = newlink;
		else {
			newlink.setNext(first);
			first.setPrevious(newlink);
			first = newlink;
		}
	}

	// -------------------------------------------------------------------
	public O deleteFirst() {
		if (isEmpty()) {
			System.out.println("The list is currently empty.");
		}
		O temp = first.getData();
		if (first == last) {
			first = last = null;
		} else {
			first = first.getNext();
		}
		return temp;
	}

	// -------------------------------------------------------------------
	public O deleteLast() {
		if (isEmpty()) {
			System.out.println("The list is currently empty.");
		}
		O temp = last.getData();
		if (first == last) {
			first = last = null;
		} else {
			last = last.getPrevious();
		}
		return temp;
	}

	// -------------------------------------------------------------------
	public boolean isEmpty() {
		return first == null;
	}
	
	
	// -------------------------------------------------------------------
	public void displayForward(){
		if (isEmpty()) {
			System.out.println("The list is currently empty.");
		}
		System.out.println("List [first --> last]: ");
		Link<O> current = first; // start at the beginning of the list.
		while (current != null) {
			current.display(); // Print data.
			current = current.getNext(); // Move to nest link.
		}

		System.out.println("");
	}
	
	// -------------------------------------------------------------------
	public void displayBackward(){
		
	}
	
	// -------------------------------------------------------------------
}

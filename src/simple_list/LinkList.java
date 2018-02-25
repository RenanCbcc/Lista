package simple_list;

/**
 * 
 * @author Renan
 * @see {@link https://www.youtube.com/watch?v=vcQIFT79_50}}
 * @param <O>
 */
public class LinkList<O> {

	private Link<O> first; // Reference to first link on list.

	// -------------------------------------------------------------------
	public LinkList() {
		first = null; // No items on list yet.
	}

	// -------------------------------------------------------------------
	public boolean isEmpty() {
		return (first == null); // True if list is empty.
	}

	// -------------------------------------------------------------------
	public void insertFirst(O object) { // Inserts at start of list.
		Link<O> newlink = new Link<O>(object); // Make a new link.
		if (!isEmpty()) { // Verify if the list is empty
			newlink.setNext(first); // newLink --> old first
		}
		first = newlink; // First --> newLink
	}

	// -------------------------------------------------------------------
	public O deleteFirst() { // Delete the first item
		if (isEmpty()) {
			System.out.println("The list is currently empty.");
		}
		O temp = first.getData(); // Save reference to link.
		first = first.getNext(); // Delete it; first --> old nest.
		return temp; // Return delete link.
	}

	// -------------------------------------------------------------------
	public void displayList() {
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
	public Link<O> find(O object) { // Find a link with a given key.
		if (isEmpty()) {
			System.out.println("The list is currently empty.");
			return null;
		} else {
			Link<O> current = first; // Start at first.
			while (!current.equals(object)) { // While no match
				if (current.getNext() == null) { // If end of list.
					System.out.println("The list currently has no such key.");
					return null;
				} else { // Not end of list.
					current = current.getNext();
				}
			}
			return current; // Found it.
		}

	}

	// -------------------------------------------------------------------
	public Link<O> delete(O object) { // Delete a link with a given key.
		if (isEmpty()) {
			System.out.println("The list is currently empty.");
			return null;
		} else {
			Link<O> current = first; // Start at first.
			Link<O> previous = first; // Start at first.
			while (!current.equals(object)) { // While no match
				if (current.getNext() == null) { // If end of list.
					System.out.println("The list currently has no such key.");
					return null;
				} else { // Not end of list.
					previous = current;
					current = current.getNext();
				}
			}
			if (current == first) { // Found it.
				first = first.getNext(); // If first link, change first.
			} else { // Otherwise.
				previous.setNext(current.getNext()); // Bypass it.
			}
			return current;
		}
	}

}

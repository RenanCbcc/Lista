package double_list;

public class Link<O> {

	private O object;
	private Link<O> next;
	private Link<O> previous;

	public Link(O object) {
		if (object != null) {
			setData(object);
		}

	}

	public O getData() {
		return object;
	}

	public void setData(O data) {
		this.object = data;
	}

	public Link<O> getNext() {
		return next;
	}

	public void setPrevious(Link<O> link) {
		this.previous = link;
	}

	public Link<O> getPrevious() {
		return previous;
	}

	public void setNext(Link<O> link) {
		this.next = link;
	}

	public void display() {
		System.out.println("Link [data=" + object + "]");
	}

}

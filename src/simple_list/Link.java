package simple_list;

public class Link<O> {

	private O object;
	private Link<O> next;

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

	public void setNext(Link<O> link) {
		this.next = link;
	}

	public void display() {
		System.out.println("Link [data=" + object + "]");
	}

}


public class Node<E> {
	private E objeto;
	private Node<E> anterior;
	private Node<E> proximo;
	
	public Node ( E objeto){
		this.objeto = objeto;
	}
	
	public E getObjeto(){
		return this.objeto;
	}
	
	public Node<E> getAnterior(){
		return this.anterior;
	}
	
	public Node<E> getProximo(){
		return this.proximo;
	} 
	
	public void setAnterior( Node<E> anterior){
		this.anterior = anterior;
	}
	
	public void setProximo( Node<E> proximo){
		this.proximo = proximo;
	}
	
	
}

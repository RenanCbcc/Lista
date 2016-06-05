
public class Lista<E> {
	private Node<E> primeiro;
	private Node<E> ultimo;
	
	public E getPrimeiro(){
		return this.primeiro.getObjeto();
	}
	
	public E getUltimo(){
		return this.ultimo.getObjeto();
	}
	
	public void incluir_no_fim( E objeto){
		Node<E> novo_no = new Node<E>( objeto);
		if ( vazia() ) {this.primeiro = this.ultimo = novo_no;}
		else{ ultimo.setProximo(novo_no);
		novo_no.setAnterior(ultimo);
		ultimo = novo_no;}
	}
	
	public void incluir_no_inicio( E objeto){
		Node <E> novo_no = new Node<E>(objeto);
		if ( vazia() ) { this.primeiro = this.ultimo = novo_no;}
		else{
			novo_no.setProximo(primeiro);
			primeiro.setAnterior(novo_no);
			primeiro = novo_no;}
	}
	
	public E excluir_do_inicio(){
			if ( vazia() ) { System.out.println("Lista Vazia!"); }
				E obejeto_excluido = primeiro.getObjeto();
				if ( primeiro == ultimo ) primeiro = ultimo = null;
				else primeiro = primeiro.getProximo();
				return obejeto_excluido;
	}
		
	public E excluir_do_fim(){
		if ( vazia() ) { System.out.println("Lista Vazia!"); }
		E obejeto_excluido = ultimo.getObjeto();
		if ( primeiro == ultimo ) primeiro = ultimo = null;
		else ultimo = ultimo.getAnterior();
		return obejeto_excluido;
	}
	
	public boolean vazia(){
		return ( this.primeiro == null);}
}

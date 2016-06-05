import static javax.swing.JOptionPane.*;
public class Main {
	private static Lista<String> lista;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		lista = new Lista<String>();
		
		while ( true ){
			String str = showInputDialog("Informe um texto");
			if ( str == null ) break;
			lista.incluir_no_inicio(str);
		}
		
		
		String str = "Itens da lista";
		while( !lista.vazia() ){
			str+= "\n" + lista.excluir_do_inicio();
			showMessageDialog(null, str);
		}
	}

}

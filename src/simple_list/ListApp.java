package simple_list;

import simple_list.LinkList;
import static javax.swing.JOptionPane.showInputDialog;

public class ListApp {

	public static void main(String[] args) {
		LinkList<String> list = new LinkList<String>(); 
		
		while(true){
			String str = showInputDialog("Type down a string");
			if (str == null) break;
			list.insertFirst(str);
		}
		
		list.displayList();
		
		
	}

}

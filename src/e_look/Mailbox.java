package e_look;

import java.util.ArrayList;
import java.util.List;

public class Mailbox {
	private static sortStrategy strategy;
	public List<Email> email = new ArrayList<Email>();
	private void sort() {
		 //for ( int i = 2; i <= email.size(), i++ )
		 //for ( int j = email.size(); j >= i; j-- )
		 //if ( before(email.at(j),email.at(j-1)) )
		 // intercambiar los mensajes j y j-1
		 //...
		 }
	
	public void show() {
		
		
	}
	private boolean before(Email e1, Email e2) {
		return strategy.gbefore(e1, e2);
	}
	

}

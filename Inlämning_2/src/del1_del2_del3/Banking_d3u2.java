package del1_del2_del3;

import java.util.Iterator;

public class Banking_d3u2 {

	public static void main(String[] arg){
		
		MyArrayList<Account> database = new MyArrayList<Account>();
		database.add(new Account("1", 0));
		database.add(new Account("2", 0));
		database.add(new Account("3", 0));
		
		
		Iterator iter = database.iterator();
		while(iter.hasNext()){
			double random = (1 + Math.random()*5) * 1000;
			Account temp = (Account) iter.next();
			temp.deposit(Math.round(random));
		}
		
		for(int i = 0 ; i < database.size(); i++){
		System.out.println(database.get(i));
		}
	}
	
	
	
	
	
}

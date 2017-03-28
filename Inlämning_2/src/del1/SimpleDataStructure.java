package del1;
import java.util.*;

public class SimpleDataStructure {
	private String[] friends;
	private int counter;

	public SimpleDataStructure() {
			friends = new String[5];
			counter = 0;
	}

	/*
	 * Appends the other friend name to the end of this list.
	 */
	public boolean add(String other) {
		if(counter == friends.length){
			String[] temp = new String[counter*2];
			for(int i = 0; i<friends.length; i++){
				temp[i] = friends[i];
			}
			
			friends = temp;
		}
		
		friends[counter] = other;
		counter++;
		return true;
	}

	/** returns the name at the specified index */
	public String get(int index) {
		if(index <= friends.length)
			return friends[index];
		else
			return "The list is not that long.";
	}

	/**
	 * removes the first occurrence of the specified element in this list if the
	 * list contains the name
	 */
	public boolean remove(String name) {
		for (int i = 0; i < counter; i++) {
			if (friends[i].equals(name)) {
				friends[i] = null;
				for( int j = i; j < friends.length; j++)
					if(j < friends.length-1)friends[j] = friends[j+1];
				friends[friends.length-1] = null;
				return true;
			}
		}
		return false;
	}

	/** prints all names in the array friends */
	public void printFriends() {
		for (int i = 0; i < friends.length; i++)
			if(friends[i] != null)
				System.out.print(friends[i] + "\n");
		
		System.out.println();
	}
	
	public void addSort(String namn){
		add(namn);
		ArrayList<String> temp = new ArrayList<String>();
		for(int i = 0; i < friends.length; i++){
			if(friends[i]!=null){
				temp.add(friends[i]);
			}
		}
		Collections.sort(temp);
		for(int i =0; i < temp.size(); i++){friends[i] = temp.get(i);}
		
	}

	public static void main(String[] arg) {
		SimpleDataStructure myfriends = new SimpleDataStructure();
		myfriends.add("Kalle");
		myfriends.add("Jonas");
		myfriends.add("Sten");
		myfriends.add("Calle");
		myfriends.add("Torkel");
		myfriends.addSort("Arne");
		myfriends.remove("Kalle");
		myfriends.printFriends();
		System.out.println(myfriends.get(3));
	}
}
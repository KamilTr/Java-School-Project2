package del1;

import java.util.Arrays;
import java.util.Iterator;

public class MyArrayList<AnyType> implements Iterable<AnyType> {

	private AnyType[] list;
	private int count;

	public static void main(String[] args){
		
		MyArrayList<String> test = new MyArrayList<String>();
		test.add("KAmil");
		test.add("TJa");
		test.add("HEj");
		test.add("Sleep");
		test.add("Dator");
		test.remove("HEj");
		test.add("toa");
		test.add("johanna");
		test.add("usb");
		System.out.println(test.isEmpty());
		System.out.println(Arrays.toString(test.toArray()));
		System.out.println(test.size());
		Iterator<String> crymore = test.iterator();
		while(crymore.hasNext())
			System.out.println(crymore.next());
		
		
	}
	
	public MyArrayList() {
		list = (AnyType[]) new Object[10]; //0 ist för 10
		count = 0;
	}

	public MyArrayList(int initialCapacity) {
		list = (AnyType[]) new Object[initialCapacity];
		count = 0;
	}

	/* Appends the specified element to the end of this list. */

	public boolean add(AnyType o) {
		AnyType[] temp = (AnyType[]) new Object[list.length +1];
		for(int i  = 0; i < list.length; i++){
			temp[i] = list[i];
		}
		temp[count] = o;
		list = temp;
		count++;
		return true;
	}

	/** tests if the specified element is a component of this list */
	public boolean contains(AnyType o) {
		boolean anwser = false;
		for(int i = 0; i < list.length; i++){
			if( o == list[i]){
				anwser = true;
				break;
			}				
		}
		
		return anwser;

	}

	/** returns the component at the specified index */
	public AnyType get(int index) {
		if(index <= list.length){
			return list[index];
		}
		return null;
	}

	/**
	 * Search for the first occurrence of the given argument testing for the
	 * equality using equals method
	 */
	public int indexOf(AnyType o) {
		int counter = 0;
		for(int i = 0; i<list.length; i++){
			if(list[i] == o){
				counter++;
				return counter;
			}
			else counter++;
		
		}
		return -1;
	}

	/** tests if this list has no components */
	public boolean isEmpty() {
		boolean anwser = false;
		int counter = 0;
		for(AnyType s : list){
			if(s == null)
				counter++;
		}
		if(counter == list.length)
			anwser = true;
		if((list==null) || (list.length==0)){
			anwser = true;
		}
		return anwser;
	}

	/**
	 * removes the first occurrence of the specified element in this list if the
	 * list contains the
	 */
	public boolean remove(AnyType o) {
		for(int i = 0; i < list.length; i++){
			AnyType[] temp = (AnyType[]) new Object[list.length +1];
			if(list[i] == o){
				for(int j = i; j < list.length; j++){
					if(j < list.length-1)list[j] = list[j+1];
				}
				list[list.length - 1] = null;
				break;
			}
			
		}
		
		count--;
		return true;
	}

	/** returns the number of components in this list */
	public int size() {
		return count;
	}

	/**
	 * returns an array containing all elements in this list in the correct
	 * order
	 */
	public Object[] toArray() {
		int counter = 0;
		for(int i = 0; i<list.length; i++){
			if(list[i] != null) counter++;
		}
		Object[] temp = new Object[counter];
		for(int i = 0; i < list.length; i++){
			if(list[i] != null){
				temp[i] = list[i]; 
			}
		}
		
		return temp;
	}

	public Iterator<AnyType> iterator() {
		// return object ArrayListIterator
		
		Iterator<AnyType> iter = new ArrayListIterator(list, count);
		return iter;
	}

}
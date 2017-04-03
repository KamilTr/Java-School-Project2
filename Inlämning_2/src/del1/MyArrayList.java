package del1;

import java.util.*;

public class MyArrayList<AnyType> implements Iterable<AnyType> {

	private AnyType[] list;
	private int count;

	public static void main(String[] args){
		
		MyArrayList<String> test = new MyArrayList<String>();
		test.add("haha");
		System.out.println(test(1));
		
	}
	
	public MyArrayList() {
		list = (AnyType[]) new Object[10];
		count = 0;
	}

	public MyArrayList(int initialCapacity) {
		list = (AnyType[]) new Object[initialCapacity];
	}

	/* Appends the specified element to the end of this list. */

	public boolean add(AnyType o) {
		AnyType[] temp = (AnyType[]) new Object[list.length +1];
		for(int i  = 0; i < list.length; i++){
			temp[i] = list[i];
		}
		temp[temp.length -1 ] = o;
		list = temp;
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
		if(counter == list.length -1)
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
		return true;
	}

	/** returns the number of components in this list */
	public int size() {
		return -1;
	}

	/**
	 * returns an array containing all elements in this list in the correct
	 * order
	 */
	public Object[] toArray() {
		return null;
	}

	public Iterator<AnyType> iterator() {
		// return object ArrayListIterator
		return null;
	}

}
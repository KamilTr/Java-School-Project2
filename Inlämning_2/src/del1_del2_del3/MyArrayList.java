package del1_del2_del3;

import java.util.Arrays;
import java.util.Iterator;

public class MyArrayList<AnyType> implements Iterable<AnyType> {

	private AnyType[] list;
	private int count;

	public static void main(String[] args){
		
		MyArrayList<String> test = new MyArrayList<String>();
		test.add("Stol");
		test.add("Dator");
		test.add("Bok");
		test.add("Laddare");
		test.add("Nål");
		test.add("Hus");
		test.add("Bibliotek");
		test.add("Filmjölk");
		test.add("Bil");
		test.remove("Nål");
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
		if(o != null){	
			AnyType[] temp = (AnyType[]) new Object[list.length +1];
			for(int i  = 0; i < list.length; i++){
				temp[i] = list[i];
			}
			temp[count] = o;
			list = temp;
			count++;
			return true;
		}
		return false;
	}

	/** tests if the specified element is a component of this list */
	public boolean contains(AnyType o) {
		boolean anwser = false;
		if(o != null){
			for(int i = 0; i < list.length; i++){
				if( o == list[i]){
					anwser = true;
					break;
				}				
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
		for(int i = 0; i<list.length; i++){
			if(list[i] == o){
				
				return i;
			}
			
		
		}
		return -1;
	}

	/** tests if this list has no components */
	public boolean isEmpty() {
		if(count == 0)return true;
		return false;
	}

	/**
	 * removes the first occurrence of the specified element in this list if the
	 * list contains the
	 */
	public boolean remove(AnyType o) {
		boolean anwser = false;
		int counter = 0;
		for(int i = 0; i < list.length; i++){
			if(list[i] == o){
				break;
			}
			counter++;
			System.out.println(counter);
		}
		for(int i = counter; i < list.length; i++){
			if(i < count){
				list[i] = list[i+1];
			}
		}
		count--;
		return anwser;
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
		Object[] temp = new Object[count];
		if(count == 0)temp = null;
			else{for(int i = 0; i<count; i++){
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
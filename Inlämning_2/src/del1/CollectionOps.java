package del1;

import java.util.*;

public class CollectionOps {

	public static void main(String[] args){
		
		ArrayList<String> things = new ArrayList<String>();
		things.add("table");
		things.add("chair");
		things.add("tv");
		things.add("sholaces");
		things.add("traincart");
		things.add("emptycanofsoda");
		print(things);
		
		List<Integer> heltal  =  Arrays.asList(1,2,3,4,5,6);
		List<Double> flyttal =  Arrays.asList(1.23, 3.14, 9.7);
		List<String> campusLindholmen =  Arrays.asList("Saga", "Svea", "Jupiter");
		
		System.out.println("\nReverse:");
		print(reverse(things));
		print(reverse(heltal));
		print(reverse(flyttal));
		print(reverse(campusLindholmen));
		
		
		
	}
	
	public static <T> void print(Collection<T> l){
		
		Iterator<T> Iter = l.iterator();
		System.out.print("[");
		while(Iter.hasNext()){
			System.out.print(Iter.next() );
			if((Iter.hasNext())){
				System.out.print(", ");
			}
		}
		if(!(Iter.hasNext()))
			System.out.print("]\n");
		
		
	}
	
	public static <T> Collection<T> reverse(List<T> l){
		
		T temp;
		T temp2;
		for(int i = 0; i < l.size(); i++){
			temp = l.get(i);
			temp2 = l.get(l.size()-1 - i);
			
			if(i < l.size()/2){
			l.set(i, temp2);
			l.set((l.size()-1) -i, temp);
			}
			
		}
		
		return l;
		
	}
}

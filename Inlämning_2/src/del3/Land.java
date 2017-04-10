package del3;

import java.util.*;

public class Land{

	private String Name;
	private String CapitalName;
	private int Citizens;
	private int Area;
	
	
	public Land(String Country, String Capital, int Citizen, int size){
		this.Name = Country;
		this.CapitalName = Capital;
		this.Citizens = Citizen;
		this.Area = size;
		
		System.out.printf("",this);
		
	}
	
	public String toString(){
		return String.format("%-20s%-20s%-15s%-20s", Name, Citizens, Area, CapitalName);
		
	}
	
	public static class nameCompare implements Comparator<Land>{
		@Override
		public int compare(Land a, Land b){
			return a.Name.compareTo(b.Name);
		}
	}
	
	public static class citizensCompare implements Comparator<Land>{
		@Override
		public int compare(Land a, Land b){
			if(a.Citizens < b.Citizens){return 1;}
			else if(a.Citizens > b.Citizens){return -1;}
			return 0;
		}
	}
	public static class areaCompare implements Comparator<Land>{
		@Override
		public int compare(Land a, Land b){
			if(a.Area < b.Area){return 1;}
			else if(a.Area > b.Area){return -1;}
			return 0;
		}
	}
	
}

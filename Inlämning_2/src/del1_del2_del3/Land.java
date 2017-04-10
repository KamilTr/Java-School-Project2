package del1_del2_del3;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Land {

	private String Name;
	private String CapitalName;
	private int Citizens;
	private int Area;
	
	
	public Land(String Country, String Capital, int Citizen, int size){
		Name = Country;
		CapitalName = Capital;
		Citizens = Citizen;
		Area = size;
		
	}
	
	public String toString(Land country){
		String result = Name + " " + CapitalName + " Citizens: " + Citizens + " Area: " + Area;
		return result;
	}
	
	public boolean compareName(Land a, Land b){
		
		if(a.Name.compareTo(b.Name) < 0){
			return true;
		}
		return false;
	}
	
	public boolean compareCapital(Land a, Land b){
		if(a.CapitalName.compareTo(b.CapitalName) < 0){
			return true;
		}
		return false;
	}
	
	public boolean compareCitizen(Land a, Land b){
		if(a.Citizens < b.Citizens){
			return true;
		}
		return false;
	}
	
	public boolean compareSize(Land a, Land b){
		if(a.Area < b.Area){
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) throws FileNotFoundException{
		File file = new File("europa.txt");
		Scanner scFile = new Scanner(file);
		ArrayList<Land> list = new ArrayList<Land>();
		while(scFile.hasNextLine()){
			String name = scFile.next();
			String capName = scFile.nextLine();
			int amount = scFile.nextInt();
			int area = scFile.nextInt();
			list.add(new Land(name, capName, amount, area));	
		}
		
		printmenu();
		
		
	}
	
	public static void printmenu(){
		System.out.println("How would you like to sort yout file?");
		System.out.println("0 : Sort after country.");
		System.out.println("1 : Sort after capital.");
		System.out.println("2 : Sort after amount of citizens.");
		System.out.println("3 : Sort after area.");
		System.out.println("Input: ");
	}
	
	
}

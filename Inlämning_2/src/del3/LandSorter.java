package del3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class LandSorter {
	
	static PrintStream PSF;

	public static void main(String[] args) throws FileNotFoundException{
		File file = new File("europa.txt");
		Scanner scFile = new Scanner(file);
		scFile.nextLine();
		ArrayList<Land> list = new ArrayList<Land>();
		while(scFile.hasNextLine()){
			String name = scFile.next();
			int amount = Integer.parseInt(scFile.next());
			int area = Integer.parseInt(scFile.next());
			String capName = scFile.nextLine();
			list.add(new Land(name, capName, amount, area));	
		}
		scFile.close();
		Scanner sc = new Scanner(System.in);
		int choise = -1;
			
		printmenu();
		choise = sc.nextInt();
		sc.close();
			
		switch (choise){
		case 0:
			file = new File("NameSorted.txt");
			PSF = new PrintStream(file);
			System.setOut(PSF);
			Collections.sort(list, new Land.nameCompare());
			System.out.println("Country\t\t\t\tCitizens\t\t\tArea\t\t\tCapital\n");
			
			for(Land s: list){
				System.out.println(s.toString());
			}
			break;
		case 1:
			file = new File("CitizenSorted.txt");
			PSF = new PrintStream(file);
			System.setOut(PSF);
			Collections.sort(list, new Land.citizensCompare());
			System.out.println("Country\t\t\t\tCitizens\t\t\tArea\t\t\tCapital\n");
			
			for(Land s: list){
				System.out.println(s.toString());
			}
			break;
		case 2:
			file = new File("AreaSorted.txt");
			PSF = new PrintStream(file);
			System.setOut(PSF);
			Collections.sort(list, new Land.areaCompare());
			System.out.println("Country\t\t\t\tCitizens\t\t\tArea\t\t\tCapital\n");
			
			for(Land s: list){
				System.out.println(s.toString());
			}
			break;
		case 3:
			System.exit(1);
		}
		
		
	}
	
	public static void printmenu(){
		System.out.println("How would you like to sort yout file?");
		System.out.println("0 : Sort after country.");
		System.out.println("1 : Sort after amount of citizens.");
		System.out.println("2 : Sort after area.");
		System.out.println("3 : Exit.");
		System.out.println("Input: ");
	}
	
	
}

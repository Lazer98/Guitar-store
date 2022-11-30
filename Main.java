package guitars;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String [] args) {
Scanner myObj = new Scanner(System.in);
int i=0;
String end = "yes";
ArrayList<instrument> IList= new ArrayList<instrument>(100);
//Guitar []GList =new Guitar[100];
Store instrumentStore=new Store();
	//add instruments
	while(!end.toLowerCase().equals("no")) {
		instrumentStore.addInstrument(IList);
		System.out.println("Do you want to continue? (no for ending)");
		end=myObj.next();
		}	 
	  System.out.println(IList);
	  
	  //show a specific type of guitar
	  instrumentStore.showSpecificGuitar(IList);
	
	  //sell instruments
	  	instrumentStore.buyInstrument(IList);
		
			
			System.out.println(IList);
	}	
}

package guitars;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Store {
	Scanner myObj = new Scanner(System.in);
	int i;
	ArrayList<instrument> IList= new ArrayList<instrument>(100);
	public Store() {			}
	
public void addInstrument(ArrayList<instrument> IList ) {
		System.out.println("Which instrument do you want to add?");
		  String myChoice=myObj.next();
		  if(myChoice.toLowerCase().equals("guitar")) {
			  	  int price=myObj.nextInt(); 
				  String company=myObj.next(); 
				  String type=myObj.next();
				  Guitar g=new Guitar(price ,company,type); 
				  IList.add( g);
		  }
		  else if (myChoice.toLowerCase().equals("drums")){
			  int price=myObj.nextInt(); 
			  String company=myObj.next();
			  int toolSet=myObj.nextInt();
			  drums d=new drums(price,company,toolSet);
			  IList.add(d);
		  }
		  else if (myChoice.toLowerCase().equals("piano")){
			  int price=myObj.nextInt(); 
			  String company=myObj.next();
			  int octave=myObj.nextInt();
			  piano p=new piano(price,company,octave);
			  IList.add(p);
		  } else {
			  System.out.println("invalid input! instrument doesn't exist");
		  }
	}

public void buyInstrument(ArrayList<instrument> IList) {
	int count=0;
	System.out.println("Which instrument do you wanna buy?");
	String choice=myObj.next();
	System.out.println("How many do you want to buy?");
	int quantity=myObj.nextInt();   //1
	for(i=0;i<IList.size();i++) {
		if(IList.get(i).getClass().getTypeName().toLowerCase().equals(choice))
			count++;
	}
	if(count>=5) {
		for(i=0;i<IList.size();i++) {
			if(IList.get(i).getClass().getTypeName().toLowerCase().equals(choice))
				IList.remove(i);
		}
	}
	else 
		System.out.println("There aren't enough instruments of this type in the store");

}

public void showSpecificGuitar(ArrayList<instrument> IList) {
	System.out.println("which type of guitar do you wanna see?");
	String type=myObj.next();  //i.e. electric
	for(i=0;i<IList.size();i++) {
		if(IList.get(i).getClass().getTypeName().toLowerCase().equals("guitar")) {
			Guitar temp=(Guitar)IList.get(i);
			if(temp.getType().toLowerCase().equals(type.toLowerCase())) {
				System.out.println(IList.get(i));
				}
			}
		}
}
}

package test;

import java.util.Scanner;

public class Pizzahut {
	
		public static void main(String[] args){
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Choose option from given below");
			System.out.println("press 1 for Simple pizza");
			System.out.println("press 2 for Chicken pizza");
			System.out.println("press 3 for Mutton pizza");
			int option = sc.nextInt();
			
			if(option==1)
			{
				pizza pz = new pizza("simple",230);
				pz.display();
			}
			else if(option==2)
			{

				pizza pz1 = new ChickenPizza("Chicken",240);
				pz1.display();
				
			}
			else if(option==3)
			{
				MuttonPizza pz2 = new MuttonPizza("Mutton",250);
				pz2.display();
			}
			else
			{
				System.out.println("Wrong input");
			}
			
		
		}

	}





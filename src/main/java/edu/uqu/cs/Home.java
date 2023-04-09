package edu.uqu.cs;
/*
 * Lab 2 
 * CS 1312
 */

/*
* Make sure to complete and submit your lab
*/
//import java.util.Scanner;

public class Home{
	public static void main(String [] args){

		// Create an object of type Garage 
                //HERE
Garage Garage1 = new Garage();

	        // Add "Toyota Corolla Cross" in the garage. Hint: use method addCar () of class Garage
//addCar () of class Garage 
                //HERE
      Garage1.addCar("Toyota Corolla Cross");
                //List all the cars in the garage. Hint: use method listCars () of class Garage
//() of class Garage
                //HERE
  System.out.println("All cars in the garage are:");
        Garage1.listCars();
                // Place "Ford Fusion" in the garage. Hint: use method addCar () of class Garage
//() of class Garage
                //HERE
  Garage1.addCar("Ford Fusion");
 	        // List all the cars in the garage once again. Hint: use method listCars () of class Garage/method listCars () of class Garage
                //HERE
  System.out.println("All cars in the garage are:");
        Garage1.listCars();

               // Move out "Ford Fusion" from the garage. Hint: use method moveOut () of class Garage
//moveOut () of class Garage
               //HERE
   Garage1.moveOut("Ford Fusion");

               // List all the cars in the garage. Hint: use method listCars () of class Garage
//() of class Garage
               //HERE
   System.out.println("\nAll cars in the garage are:");
        Garage1.listCars();
        }


        
        
}
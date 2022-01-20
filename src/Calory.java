/*
* File: Calory.java
* Author: Katona Valentin
* Copyright: 2022, Katona Valentin
* Group: Szoft II/N
* Date: 2022-01-20
* Github: https://github.com/djvalee/
* Licenc: GNU GPL
*/

public class Calory {
    
    public double calcWoman(double weight, double height, Integer age){
        
     if (weight <= 30 ) {
            throw new IllegalArgumentException("Weight must be 30 OR!"); 
     } if (height <= 50) {
            throw new IllegalArgumentException("Height must be 50 OR more!");
     } if (age <= 10){
            throw new IllegalArgumentException("Age must be 10 OR more!");
     } else {
          return 9.247*weight+3.098*height-4.330*age+447.593;
          } 
    }

    public double calcMan(double weight, double height, Integer age){
     if (weight < 30 ) {
          throw new IllegalArgumentException("Weight must be more than 30!"); 
   } if (height < 50) {
          throw new IllegalArgumentException("Height must be more than 50!");
   } if (age < 10){
          throw new IllegalArgumentException("Age must be more than 10!");
   } else {
     return 13.397*weight+4.799*height-5.667*age+88.362;
        } 
  }
        
}

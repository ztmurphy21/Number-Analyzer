/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package number.analyzer;

import java.util.Arrays;
import java.util.Collection;
import java.util.Scanner;

/**
 *
 * @author Zachary Murphy
 * @param <T>
 */
public class NumberAnalyzer< T extends Number>{
   Scanner keyboard = new Scanner(System.in);
    private final  T[] array;
    private boolean order = false;
    private Double sumOfNumbers;
    
    /*
    constructor for Number 
    */
    public NumberAnalyzer(T[] array){
        this.array = array;
    }
    
/*
    will calculate the sume in the array
    */
    
  public Double sumOfNumbers(){
      this.calcSum();
      return this.sumOfNumbers;
  }
  

  /*
   will calculate the sum in array
   */
  private void calcSum(){
      if (sumOfNumbers == null){
              Collection<? extends Number> numsCollection = Arrays.asList(this.array);
              this.sumOfNumbers = numsCollection
                                 .stream()
            .mapToDouble(Number::doubleValue)
            .reduce(0.0, (a,b) -> a + b);
             
      }
  }
  
  /*
  will get average number in array
  */
  public Double Avg(){
    this.calcSum();
    double avg = this.sumOfNumbers/this.array.length;
    return avg;
}
  /*
  will get highest number in array
  */
  
  public T getHighest(){
          // Assume the first element contains the highest
      // value in the array.
      T highest = array[0];
      
      // Step through the rest of the array looking
      // for higher values, using a for loop
      for (int index = 1; index < array.length; index++)
      {
         if (array[index].doubleValue() > highest.doubleValue())
            highest = array[index];
  }
        return highest;
  }
  /*
  will get lowest number in array
  */
  public T getLowest(){
      T lowest = array[0];
        // Step through the rest of the array looking
      // for lower values, using a for loop
      for (int index = 1; index < array.length; index++)
      {
         if (array[index].doubleValue() < lowest.doubleValue())
            lowest = array[index];
  }
        return lowest;
      
  }
  // get total number of elements in array
  private Double elements(Double x, Double y){
      return x+y;
  }
      

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double [] numberLists = {1,2,3};
         NumberAnalyzer<double> n1 = new  NumberAnalyzer<double>(numberLists);
         System.out.println();
    }
    
}


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
    //setting T array as final
    private final  T[] array;
    //seting global variable, since pulling from private method
    private Double sumOfNumbers;
    
    /*
    constructor for Number 
    */
    public NumberAnalyzer(T[] array){
        this.array = array;
        
    }
    
/*
    will return the sum from calcSum method
    */
    
  public Double getSum(){
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
  public Double getAvg(){
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
  private Double getElements(){
      double length = array.length;
      return length;
  }
  
   

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //declaring array
        Double [] numberLists = {44.0, 77.0, 11.0, 99.0, 55.0, 22.0};
        //pulling arrayOne into NumberAnalyzer 
         NumberAnalyzer<Double> arrayOne = new  NumberAnalyzer<Double>(numberLists);
         //prinint out everything, like magic!
         System.out.println("Number Analyzer Results: ");
         System.out.println("Average is: " + arrayOne.getAvg());
         System.out.println("The lowest number is: " + arrayOne.getLowest());
         System.out.println("The highest  number is: " + arrayOne.getHighest());
         System.out.println("The sum of the array is: " + arrayOne.getSum());
         System.out.println("The number of elements in the array are: " + arrayOne.getElements());
    }
    
}

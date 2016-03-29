/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package number.analyzer;

/**
 *
 * @author Zachary Murphy
 * @param <T>
 */
public class NumberAnalyzer< T extends Number>{
    private T[] array;
    public NumberAnalyzer(T[] arr){
        array = arr;
    }
    
    public T getLow(){
        T low = array[0];
        for (int x =1; x < array.length; x++){
            if(array[x].intValue()<0){
                low = array[x];
            } else {
            }
        }
                    return low;

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}

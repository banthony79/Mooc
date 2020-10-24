import java.util.Arrays; 
 
 
public class MainProgram {
    
    
    public static int smallest(int[] array){
    int min = array[0];
    for (int i = 0; i < array.length; i++) {
        if (array[i] < min) {
            min = array[i]; 
        }
    }
return min; }
    
  public static int indexOfSmallest(int[] array){
    int min = array[0];
    int index = 0; 
    for (int i = 0; i < array.length; i++) {
        if (array[i] < min) {
            min = array[i];
               index = i;
        }
    }
return index; }
   
public static int indexOfSmallestFrom(int [] table, int index) {
    
    int indexFrom = 0; 
    for (int i = index; i < table.length; i++) {
        if (table[i] < min) {
            min = table[i]; 
            i = indexFrom; 
        }
    }
return indexFrom; }
       
    public static void swap(int[] array, int index1, int index2) {
        int numberOne = array[index1];
        int numberTwo = array[index2];
        int temp = numberOne; 
        numberOne = numberTwo; 
        array[index1] = numberOne; 
        numberTwo = temp; 
        array[index2] = numberTwo; 
    }
   
 
  public static void sort(int[] array) {
    System.out.println(Arrays.toString(array)); 
    int firstIndex = 0;  
    int secondIndex = 0;
    for (int i = 0; i < 5; i++) {
      firstIndex = i;
      secondIndex = indexOfSmallestFrom(array, i); 
      swap(array, firstIndex, secondIndex); 
      System.out.println(Arrays.toString(array)); 
    }
    
 
}
 
 

 
    public static void main(String[] args) {
         
        int [] numbers = {8, 3, 7, 9, 1, 2, 4}; 
        
        sort(numbers); 
 
        System.out.println(Arrays.toString(numbers)); 
        
        
        
        
        
    }
 
}
 
import java.util.Scanner;  
public class array 
{  
   public int max(int aux[]) {  
      int max = 0;  
  
      for(int i=0; i<aux.length; i++ ) {  
         if(aux[i]>max) {  
            max = aux[i];  
         }  
      }  
      return max;  
   }  
    
   public static void main(String args[]) 
   {  
      Scanner input = new Scanner(System.in);  
      System.out.println("Enter the array range");  
      int size = input.nextInt();  
      int arr[] = new int[size];  

      System.out.println("Enter the elements of the array ::");  
      for(int i=0; i<size; i++) {  
         arr[i] = input.nextInt();  
      }  

      array m = new array();  
      System.out.println("Maximum value in the array is::"+m.max(arr));  
   }  
}  


package projecteuler2;

public class ProjectEuler2 {

    public static void main(String[] args) {
      int fibonacci = 1;
      int sequence = 1;
      int oldFibonacci = 1;
      int sum = 0;
      while(fibonacci <= 4000000){
         
          oldFibonacci = fibonacci;
          fibonacci = fibonacci + sequence;
          sequence = oldFibonacci;
          
         if(fibonacci % 2 == 0){
             System.out.println(fibonacci);
             sum = sum + fibonacci;
             
         }
         
          
      }
      System.out.println("This is the sum bro: " + sum);
    }
}

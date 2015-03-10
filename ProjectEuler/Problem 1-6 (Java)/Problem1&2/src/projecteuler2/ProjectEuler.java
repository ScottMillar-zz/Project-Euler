
package projecteuler;

public class ProjectEuler {

    
    public static void main(String[] args) {
        int number = 1;
        int sum = 0;
        while(number < 1000){
            
            if(number % 3 == 0){
            System.out.println(number);
            sum = number + sum;
            number++;
            
                
            }else if(number % 5 == 0){
                System.out.println(number);
                sum = number + sum;
                number++;
                
            }else{
                number++;
            }
           
            }
        
            int totalSum = sum;    
            System.out.println("Sum total is: " + totalSum);
        }
        
        
    
    }

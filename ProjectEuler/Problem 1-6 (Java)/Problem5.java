
package projecteuler;
import static projecteuler.Formulae.*;

//2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.

//What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
public class Problem5 {
    
    public Problem5(){
        for(int x=2520;;x++){
            for(int y=1; y<=20;y++){
                if(x%y != 0){
                    break;
                }if(y==20){
                    System.out.println(x);
                }
            }
        }
    }
    
}


package projecteuler;
import static projecteuler.Formulae.*;
//The prime factors of 13195 are 5, 7, 13 and 29.
//What is the largest prime factor of the number 600851475143 ?
public class Problem3 {
    
   public Problem3(){
    long n = 1;
    long i;
    while(600851475143l > n){
        if(600851475143l % n == 0){
            if(isPrime(n)){
                   System.out.println(n);
                   n++;
               }
                   n++;
           }else{
               n++;
           }
       }
}
}
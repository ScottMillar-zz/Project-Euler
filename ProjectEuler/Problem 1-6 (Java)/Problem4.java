package projecteuler;
import static projecteuler.Formulae.*;
//A palindromic number reads the same both ways. 
//The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
//Find the largest palindrome made from the product of two 3-digit numbers.
public class Problem4 {
    
public Problem4(){
    int palindrome = 0;
    for(int x = 100; x<1000; x++){
        for(int y=100; y<1000; y++){
            int z = x*y;
            if(isPalindrome(z)){
                if(palindrome < z){
                   palindrome = z;
                   System.out.println(palindrome);
                }
                
            }
        }
    }
   
}
}
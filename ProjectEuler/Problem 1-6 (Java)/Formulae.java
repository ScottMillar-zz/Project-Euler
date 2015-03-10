
package projecteuler;

public class Formulae{
     public static boolean isPrime(long n){
         if (n % 2 == 0){
             return false;        
       }
        for(long i=3l; i*i<=n; i+=2l){
            if(n % i == 0){
            return false;
       }
       }     
        return true; 
     }
     
     public static boolean isPalindrome(int x){
         String reverse = "";
         String s = "" + x;
         int length = s.length();
         for(int i = length - 1; i>=0 ;i--){
             reverse = reverse + s.charAt(i);
         }
         if(s.equals(reverse)){
             return true;
         }else{
             return false;
         }
     }
}

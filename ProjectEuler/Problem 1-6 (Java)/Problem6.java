
package projecteuler;
import static projecteuler.Formulae.*;
//This problem is a bit longer so go to http://projecteuler.net/problem=6

public class Problem6 {
    public Problem6(){
        
        int sumSquare = 0;
        int sum=0;
        int square = 0;
    for(int x=1; x<=100;x++){
        int y = x;
        square = x*x;
        sum += square;
        sumSquare = sumSquare + y;
    }
    
    sumSquare = sumSquare*sumSquare;
    int answer = sumSquare - sum;
    System.out.println(answer);
    
    }
    
}

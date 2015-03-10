using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Problem_8
{
    class Program
    {
        static void Main(string[] args)
        {
            string number = "7316717653133062491922511967442657474235534919493496983520312774506326239578318016984801869478851843858615607891129494954595017379583319528532088055111254069874715852386305071569329096329522744304355766896648950445244523161731856403098711121722383113622298934233803081353362766142828064444866452387493035890729629049156044077239071381051585930796086670172427121883998797908792274921901699720888093776657273330010533678812202354218097512545405947522435258490771167055601360483958644670632441572215539753697817977846174064955149290862569321978468622482839722413756570560574902614079729686524145351004748216637048440319989000889524345065854122758866688116427171479924442928230863465674813919123162824586178664583591245665294765456828489128831426076900422421902267105562632111110937054421750694165896040807198403850962455444362981230987879927244284909188845801561660979191338754992005240636899125607176060588611646710940507754100225698315520005593572972571636269561882670428252483600823257530420752963450";
            int[] array = new int[1000];
            int index = 0;
            int temp = 0;
            int low = 0;
            int high = 12;
            double highProduct = 0;
            
            foreach(char n in number)//Take each digit in the string and put it into the array
            {
                int num = n - '0';
                array[index] = num;    
                index++;
            }

            for (double product = 0; high <= 1000;low++, high++)//go through each set of 13 numbers and multilpy them then compare to the previous highest product
            {
                product = 0;
                temp = low;
                while(temp <= high)
                {
                    if (temp == low)
                    {
                        product = array[temp];
                        temp++;
                    }
                    else
                    {
                        product *= array[temp];
                        temp++;
                    }
                }
                
                if(product > highProduct)
                {
                    highProduct = product;
                    Console.WriteLine(highProduct);
                }
            }

            Console.Read();

        }
    }
}

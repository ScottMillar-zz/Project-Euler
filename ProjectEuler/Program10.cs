using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

/* The Sum of the primes below 10 is 2 + 3 + 5 + 7 = 17
   Find the sum of all the primes below two million */

namespace Problem_10
{
    class Program
    {
        static void Main(string[] args)
        {
            double total = 0;

            for (int i = 0; i <= 2000000; i++)
            {
                if(isPrime(i))
                {
                    total += i;
                    Console.WriteLine(total + " " + i);
                }
            }

            Console.WriteLine(total);
            Console.Read();
        }

        public static bool isPrime(int n)
        {
            if (n % 2 == 0)
            {
                return false;
            }
            for (int i = 3; i * i <= n; i += 2)
            {
                if (n % i == 0)
                {
                    return false;
                }
            }
            return true;
        }

    }
}

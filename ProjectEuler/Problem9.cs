using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Problem_9
{
    class Program
    {
        static void Main(string[] args)
        {
            int sum = 0;

            for (int a=3; a <= 1000; a++)
            {
                for(int b=4;b <= 1000; b++)
                {
                    for(int c=5;c <= 1000; c++)
                    {
                        if((a*a) + (b*b) == c*c)
                        {
                            if (a + b + c == 1000)
                            {
                                int product = a * b * c;
                                Console.WriteLine(a + " " + b + " " + c + " " + product);
                            }
                        } 
                    }
                }
            }
            Console.Read();
        }
    }
}

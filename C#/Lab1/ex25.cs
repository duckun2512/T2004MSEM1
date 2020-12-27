using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Lab1
{
    class ex25
    {
        static void Main(string[] args)
        {
            int numOne = 5;
            int numTwo = 25;
            int numThree = 15;
            int result = 0;
            if (numOne > numTwo)
            {
                result = (numOne > numThree) ? result = numOne : result = numThree;
            }
            else
            {
                result = (numTwo > numThree) ? result = numTwo : result = numThree;
            }
            if (result == 0)
            {
                Console.WriteLine("{0} is the largerst number", result);
            }
        }
    }
}

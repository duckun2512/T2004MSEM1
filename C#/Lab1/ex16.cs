using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Lab1
{
    class ex16
    {
        static void Main16(string[] args)
        {
            byte numOne = 255;
            byte numTwo = 1;
            byte result = 0;
            try
            {
                //This code throws an overflow exception
                unchecked
                {
                    result = (byte)(numOne + numTwo);
                }
                Console.WriteLine("Result: " + result);
            }
            catch (OverflowException ex)
            {
                Console.WriteLine(ex);
            }
        }
    }
}

using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Lab1
{
    class ex17
    {
        static void Main17(string[] args)
        {
            int valueOne = 10;
            int valueTwo = 2;
            int add = valueOne + valueTwo;
            int sub = valueOne - valueTwo;
            int mult = valueOne * valueTwo;
            int div = valueOne / valueTwo;
            int modu = valueOne % valueTwo;

            Console.WriteLine("Add: " + add);
            Console.WriteLine("Sub: " + sub);
            Console.WriteLine("Mult: " + mult);
            Console.WriteLine("Div: " + div);
            Console.WriteLine("Modu: " + modu);
        }
    }
}

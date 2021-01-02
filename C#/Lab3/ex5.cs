using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Lab3
{
    class ex5
    {
        void printMessage(string message="Hello user!")
        {
            Console.WriteLine("{0}", message);
        }

        static void Main5(string[] args)
        {
            ex5 opExample = new ex5();
            opExample.printMessage("Welcome User!");
            opExample.printMessage();
        }
    }
}

using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Lab3
{
    class ex4
    {
        void Count(int boys, int girls)
        {
            Console.WriteLine(boys + girls);
        }

        static void Main4(string[] args)
        {
            ex4 objTest = new ex4();
            objTest.Count(boys: 16, girls: 24);
        }
    }
}

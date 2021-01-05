using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Homework
{
    class Sales
    {
        string code;
        int qtySold, planned, actual;
        string region;

        public void Accept()
        {
            Console.WriteLine("Medicine Code: ");
            code = Convert.ToString(Console.ReadLine());
            Console.WriteLine("Quantity Sold: ");
            qtySold = Convert.ToInt32(Console.ReadLine());
            Console.WriteLine("Planned Sales: ");
            planned = Convert.ToInt32(Console.ReadLine());
            Console.WriteLine("Actual Sales: ");
            actual = Convert.ToInt32(Console.ReadLine());
            Console.WriteLine("Region: ");
            region = Convert.ToString(Console.ReadLine());
        }

        public void Display()
        {
            Console.WriteLine("Medicine Code: " + code);
            Console.WriteLine("Quantity Sold: " + qtySold);
            Console.WriteLine("Sales: " + actual);
            Console.WriteLine("Region: " + region);
        }

        public void Display(ref string code1)
        {
            code = code1;
            Console.WriteLine("Planned Sales: " + planned);
            Console.WriteLine("Actual Sales: " + actual);
        }
    }
}

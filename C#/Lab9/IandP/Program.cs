using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace IandP
{
    class Program
    {
        static void Main(string[] args)
        {
            Animal Lion = new Lion();
            Animal Tiger = new Tiger();

            Tiger.SetMe("tiger", 100);
            Tiger.Show();
            Console.WriteLine();
            Lion.SetMe("lion", 200);
            Lion.Show();
            Console.ReadKey();
        }
    }
}

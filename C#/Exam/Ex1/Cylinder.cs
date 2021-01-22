using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace GeometryExample
{
    class Cylinder
    {
        double radius, height;
        double BaseArea, LateralArea, TotalArea, Volume;

        public void Process()
        {
            Console.WriteLine("Enter the dimensions of the cylinder");
            Console.Write("Radius: ");
            radius = Convert.ToDouble(Console.ReadLine());
            Console.Write("Height: ");
            height = Convert.ToDouble(Console.ReadLine());
            BaseArea = radius * radius * Math.PI;
            LateralArea = 2 * Math.PI * radius * height;
            TotalArea = 2 * Math.PI * radius * (height + radius);
            Volume = Math.PI * radius * radius * height;
        }

        public void Result()
        {
            Console.WriteLine("Cylinder Characteristics");
            Console.WriteLine("Radius: {0}, Height: {1}", radius, height);
            Console.WriteLine("Base: {0:0.00} | Lateral: {1:0.00} | Total: {2:0.00} | Volume: {3:0.00}", BaseArea,LateralArea,TotalArea,Volume);
        }

        static void Main(string[] args)
        {
            Cylinder c1 = new Cylinder();
            c1.Process();
            Console.WriteLine();
            c1.Result();
            Console.ReadKey();
        }
    }
}

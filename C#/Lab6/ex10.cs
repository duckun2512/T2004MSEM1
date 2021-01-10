using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Lab6
{
    class ex10
    {
        interface Calculate
        {
            double Area();
        }
        class Rectangle : Calculate
        {
            float _length;
            float _breadth;
            public Rectangle(float valOne, float valTwo)
            {
                _length = valOne;
                _breadth = valTwo;
            }
            public double Area()
            {
                return _length * _breadth;
            }
            static void Main10(string[] args)
            {
                Rectangle objRectangle = new Rectangle(10.2F, 20.3F);
                if (objRectangle is Calculate)
                {
                    Console.WriteLine("Area of rectangle: {0:F2}", objRectangle.Area());
                }
                else
                {
                    Console.WriteLine("Interface method not implemented");
                }
            }
        }
    }
}

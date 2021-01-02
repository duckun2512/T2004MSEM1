using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Lab3
{
    static class ex6
    {
        static int _productId;
        static double _price;
        static Product()
        {
            _productId = 10;
            _price = 156.32;
        }

        public static void Display()
        {
            Console.WriteLine("ProductID:" + _productId);
            Console.WriteLine("Product price:" + _price);
        }
    }
    class Medicine
    {
        static void Main6(string[] args)
        {
            Product.Display();
        }
    }
}

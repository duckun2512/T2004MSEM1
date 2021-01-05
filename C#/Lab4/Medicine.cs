using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Homework
{
    class Medicine
    {
        string code;
        string medName, manufactName;
        float price;
        int quantity;
        DateTime manufactDate, expiryDate;
        int batchNum;

        public void Accept()
        {
            Console.WriteLine("Enter the Medicine Code: ");
            code = Convert.ToString(Console.ReadLine());
            Console.WriteLine("Enter the Medicine Name: ");
            medName = Convert.ToString(Console.ReadLine());
            Console.WriteLine("Enter the manufacturer Name: ");
            manufactName = Convert.ToString(Console.ReadLine());
            Console.WriteLine("Enter the price per unit: ");
            price = float.Parse(Console.ReadLine());
            Console.WriteLine("Enter quantity on hand: ");
            quantity = Convert.ToInt32(Console.ReadLine());
            Console.WriteLine("Enter Manufactured Date: ");
            manufactDate = Convert.ToDateTime(Console.ReadLine());
            Console.WriteLine("Enter Expiry Date: ");
            expiryDate = Convert.ToDateTime(Console.ReadLine());
            Console.WriteLine("Enter Batch Number: ");
            batchNum = Convert.ToInt32(Console.ReadLine());
        }

        public void Print()
        {
            Console.WriteLine("Medicine Code: " + code);
            Console.WriteLine("Medicine Name: " + medName);
            Console.WriteLine("Manufacturer Name: " + manufactName);
            Console.WriteLine("Medicine Price per unit: " + price);
        }

        public void Print(ref string code1)
        {
            code = code1;
            Console.WriteLine("Quantity on Hand: " + quantity);
        }

        public void Print(ref string code1, ref string name)
        {
            code = code1;
            medName = name;
            Console.WriteLine("Manufactured Date: " + manufactDate);
            Console.WriteLine("Expiry Date: " + expiryDate);
        }

        public void Addition()
        {
            if (quantity < 0)
            {
                Console.WriteLine("Error! Please try again!..");
            }
            else if (quantity == 0)
            {
                Console.WriteLine("Looks like we ran out of medicine..");
                quantity += 50;
            }
        }
    }
}

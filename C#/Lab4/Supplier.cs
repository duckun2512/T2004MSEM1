using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Homework
{
    class Supplier
    {
        private int _supplierID;
        private string _city;
        private string _supplierName;
        private string _phoneNo;
        private string _email;

        public void AcceptDetails()
        {
            Console.Write("Enter ID of supplier : ");
            _supplierID = Convert.ToInt32(Console.ReadLine());
            Console.Write("Enter name of supplier : ");
            _supplierName = Console.ReadLine();
            Console.Write("Enter name city of supplier : ");
            _city = Console.ReadLine();
            Console.Write("Enter phone No. of supplier : ");
            _phoneNo = Console.ReadLine();
            Console.Write("Enter Email of supplier : ");
            _email = Console.ReadLine();
        }

        public void DisplayDetails()
        {
            Console.WriteLine("\nSupplier Details : ");
            Console.WriteLine("Supplier ID : " + _supplierID);
            Console.WriteLine("Supplier Name : " + _supplierName);
            Console.WriteLine("Supplier City : " + _city);
            Console.WriteLine("Supplier Email : " + _email);
            Console.WriteLine("Supplier Phone No. : " + _phoneNo);

        }
    }
}

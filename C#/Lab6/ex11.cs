using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Lab6
{
    class ex11
    {
        interface Set
        {
            void AcceptDetails(int valOne, string valTwo);
        }
        interface Get
        {
            void Display();
        }
        class Employee : Set
        {
            int _empID;
            string _empName;
            public void AcceptDetails(int valOne, string valTwo)
            {
                _empID = valOne;
                _empName = valTwo;
            }
            static void Main11(string[] args)
            {
                Employee objEmployee = new Employee();
                objEmployee.AcceptDetails(10, "Jack");
                Get objGet = objEmployee as Get;
                if (objGet != null)
                {
                    objGet.Display();
                } 
                else
                {
                    Console.WriteLine("Invalid casting occured");
                }
            }
        }
    }
}

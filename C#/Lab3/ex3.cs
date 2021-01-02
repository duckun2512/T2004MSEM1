using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Lab3
{
    class ex3
    {
        void printName(string firstName, string lastName)
        {
            Console.WriteLine("First Name = {0}, Last Name = {1}", firstName, lastName);
        }

        static void Main3(string[] args)
        {
            ex3 student = new ex3();
            /*Passing argument by position*/
            student.printName("Henry", "Parker");
            /*Passing named argument*/
            student.printName(firstName: "Henry", lastName: "Parker");
            student.printName(lastName: "Parker", firstName: "Henry");
            /*Passing named argument after positional argument*/
            student.printName("Henry", lastName: "Parker");
        }
    }
}

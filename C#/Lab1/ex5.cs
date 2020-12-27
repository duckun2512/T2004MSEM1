using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Lab1
{
    class ex5
    {
        static void Main5(string[] args)
        {
            string path = "C:\\Windowns\\MyFile.txt";
            bool found = true;
            if (found)
            {
                Console.WriteLine("Filepath: \'" + path + "\'");
            }
            else
            {
                Console.WriteLine("File Not Found! \a");
            }
        }
    }
}

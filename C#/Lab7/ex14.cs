using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

public delegate void Maths(int valOne, int valTwo);

class MathsDemo
{
    static void Addition(int valOne, int valTwo)
    {
        int result = valOne + valTwo;
        Console.WriteLine("Addition: " + valOne + "+" + valTwo + "=" + result);
    }
    static void Subtraction(int valOne, int valTwo)
    {
        int result = valOne - valTwo;
        Console.WriteLine("Subtraction: " + valOne + "-" + valTwo + "=" + result);
    }
    static void Multiplication(int valOne, int valTwo)
    {
        int result = valOne * valTwo;
        Console.WriteLine("Multiplication: " + valOne + "*" + valTwo + "=" + result);
    }
    static void Division(int valOne, int valTwo)
    {
        int result = valOne / valTwo;
        Console.WriteLine("Division: " + valOne + "/" + valTwo + "=" + result);
    }
    static void Main(string[] args)
    {
        Maths objMaths = new Maths(Addition);
        objMaths += new Maths(Subtraction);
        objMaths += new Maths(Multiplication);
        objMaths += new Maths(Division);
        if (objMaths != null)
        {
            objMaths(20, 10);
        }
    }
}
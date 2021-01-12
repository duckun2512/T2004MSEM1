using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

public delegate void Display(string msg);
public class Parent
{
    event Display Print;
    protected void InvokeMethod()
    {
        Print += new Display(PrintMessage);
        Check();
    }
    void Check()
    {
        if (Print != null)
        {
            PrintMessage("Welcome to C#");
        }
       
    }
    void PrintMessage(string msg)
    {
        Console.WriteLine(msg);
    }
}
class Child : Parent
{
    static void Main17(string[] args)
    {
        Child objChild = new Child();
        objChild.InvokeMethod();
    }
}

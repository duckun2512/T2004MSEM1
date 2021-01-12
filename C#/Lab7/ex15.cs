using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

public delegate void Messenger(int value);
class CompositeDelegates
{
    static void EvenNumbers(int value)
    {
        Console.Write("Even Numbers:");
        for (int i = 2; i <= value; i += 2)
        {
            Console.Write(i + " ");
        }
    }
    void OddNumbers(int value)
    {
        Console.WriteLine();
        Console.Write("Odd Numbers: ");
        for (int i = 1; i <= value; i += 2)
        {
            Console.Write(i + " ");
        }
    }
    static void Start(int number)
    {
        CompositeDelegates objComposite = new CompositeDelegates();
        Messenger objDisplayOne = new Messenger(EvenNumbers);
        Messenger objDisplayTwo = new Messenger(objComposite.OddNumbers);
        Messenger objDisplayComposite = (Messenger)Delegate.Combine(objDisplayOne, objDisplayTwo);
        objDisplayComposite(number);
        Console.WriteLine();
        Object obj = objDisplayComposite.Method.ToString();
        if ( obj != null)
        {
            Console.WriteLine("The delegate invokes an instance method: " + obj);
        }
        else
        {
            Console.WriteLine("The delegate invokes only static methods");
        }
    }
    static void Main15(string[] args)
    {
        int value = 0;
        Console.WriteLine("Enter the values till which you want to display even and odd numbers");
        try
        {
            value = Convert.ToInt32(Console.ReadLine());
        }
        catch(FormatException objFormat)
        {
            Console.WriteLine("Error: " + objFormat);
        }
        Start(value);
    }
}
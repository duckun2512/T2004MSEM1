using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

public delegate double CalculateArea(double val);
public delegate double CalculateVolume(double val);
class Cube
{
    static double Area(double val)
    {
        return 6 * (val * val);
    }
    static double Volume(double val)
    {
        return (val * val);
    }
    static void Main13(string[] args)
    {
        CalculateArea objCalculateArea = new CalculateArea(Area);
        CalculateVolume objCalculateVolume = new CalculateVolume(Volume);
        Console.WriteLine("Surface Area of Cube: " + objCalculateArea(200.32));
        Console.WriteLine("Volume of Cube: " + objCalculateVolume(20.56));
    }
}

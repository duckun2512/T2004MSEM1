﻿using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Lab1
{
    class ex6
    {
        static void Main6(string[] args)
        {
            int number, result;
            number = 5;
            result = 100 * number;
            Console.WriteLine("Result is {0} when 100 is multipliedby {1} ", result, number);
            result = 150 / number;
            Console.WriteLine("Result is {0} when 150 is dividedby {1} ", +result, number);
        }
    }
}

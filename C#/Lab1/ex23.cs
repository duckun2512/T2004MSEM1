﻿using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Lab1
{
    class ex23
    {
        static void Main23(string[] args)
        {
            int num = 100;
            int result = num << 1;
            Console.WriteLine("Value before left shift: " + num);
            Console.WriteLine("Value after left shift: " + result);
            num = 80;
            result = num >> 1;
            Console.WriteLine("Value before right shift: " + num);
            Console.WriteLine("Value after right shift: " + result);
        }
    }
}

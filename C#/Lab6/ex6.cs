using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Lab6
{
    class ex6
    {
        interface TerrestrialAnimal
        {
            void Eat();
        }
        interface MarineAnimal
        {
            void Swim();
        }
        class Crocodile : TerrestrialAnimal, MarineAnimal
        {
            public void Eat()
            {
                Console.WriteLine("The Crocodile eats flesh");
            }
            public void Swim()
            {
                Console.WriteLine("The Crocodile can swim four times faster than an Olympic swimmer");
            }
            static void Main6(string[] args)
            {
                Crocodile objCrocodile = new Crocodile();
                objCrocodile.Eat();
                objCrocodile.Swim();
            }
        }
    }
}

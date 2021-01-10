using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Lab6
{
    class ex8
    {
        interface Animal
        {
            void Drink();
        }
        interface Carnivorous
        {
            void Eat();
        }
        interface Reptile : Animal, Carnivorous
        {
            void Habitat();
        }
        class Crocodile : Reptile
        {
            public void Drink()
            {
                Console.WriteLine("Drinks fresh water");
            }
            public void Habitat()
            {
                Console.WriteLine("Can stay in Water and Land");
            }
            public void Eat()
            {
                Console.WriteLine("Eats Flesh");
            }
            static void Main8(string[] args)
            {
                Crocodile objCrocodile = new Crocodile();
                Console.WriteLine(objCrocodile.GetType().Name);
                objCrocodile.Habitat();
                objCrocodile.Eat();
                objCrocodile.Drink();
            }
        }
    }
}

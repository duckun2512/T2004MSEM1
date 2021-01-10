using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Lab6
{
    class ex2
    {
        abstract class Animal
        {
            public void Eat()
            {
                Console.WriteLine("Every animal eats food in order to survive");
            }
            public abstract void AnimalSound();
        }
        class Lion : Animal
        {
            public override void AnimalSound()
            {
                Console.WriteLine("Lion roars");
            }
            static void Main2(string[] args)
            {
                Lion objLion = new Lion();
                objLion.AnimalSound();
                objLion.Eat();
            }
        }
    }
}

using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Lab6
{
    class ex5
    {
        interface Animal
        {
            void Habitat();
        }
        class Dog : Animal
        {
            public void Habitat()
            {
                Console.WriteLine("Can be housed with human beings");
            }
            static void Main5(string[] args)
            {
                Dog objDog = new Dog();
                Console.WriteLine(objDog.GetType().Name);
                objDog.Habitat();
            }
        }
    }
}

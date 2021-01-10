using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Lab6
{
    class ex1
    {
        public abstract class Animal
        {
            //Non-abstract ethod implementation 
            public void Eat()
            {
                Console.WriteLine("Every animal eats food in order to survive");
            }
            // Abstract method declaration
            public abstract void AnimalSound();
            public abstract void Habitat();
        }
       
    }
}

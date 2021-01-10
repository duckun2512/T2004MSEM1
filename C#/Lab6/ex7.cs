using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Lab6
{
    class ex7
    {
        interface TerrestrialAnimal
        {
            string Eat();
        }
        interface MarineAnimal
        {
            string Eat();
        }
        class Crocodile : TerrestrialAnimal, MarineAnimal
        {
            string TerrestrialAnimal.Eat()
            {
                string terCroc = "Crocodile eats fish and marine animals";
                return terCroc;
            }
            public string EatTerrestrial()
            {
                TerrestrialAnimal objTerAnimal;
                objTerAnimal = this;
                return objTerAnimal.Eat();
            }
            public string EatMarine()
            {
                MarineAnimal objMarAnimal;
                objMarAnimal = this;
                return objMarAnimal.Eat();
            }
            public static void Main7(string[] args)
            {
                Crocodile objCrocodile = new Crocodile();
                string terCroc = objCrocodile.EatTerrestrial();
                Console.WriteLine(terCroc);
                string marCroc = objCrocodile.EatMarine();
                Console.WriteLine(marCroc);
            }
        }
    }
}

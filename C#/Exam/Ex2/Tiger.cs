using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace IandP
{
    class Tiger : Animal
    {
        public override void SetMe(string name, int weight)
        {
            base.SetMe(name, weight);
        }

        public override void Show()
        {
            base.Show();
            Console.WriteLine("Name: {0}, Weight {1}", name, weight);
        }
    }
}

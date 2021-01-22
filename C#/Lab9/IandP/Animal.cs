using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace IandP
{
    class Animal
    {
        public int weight;
        public string name;

        public virtual void Show()
        {
        }

        public virtual void SetMe(string name, int weight)
        {
            this.weight = weight;
            this.name = name;
        }
    }
}

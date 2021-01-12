using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Automotive
{
    class Toyota
    {
        static void Main8(string[] args)
        {
            Category objCategory = new Category();
            SpareParts objSpare = new SpareParts();
            objCategory.Display();
            objSpare.Display();
        }
    }
}

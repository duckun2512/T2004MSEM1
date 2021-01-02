using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Lab3
{
    class ex2
    {
        string _bookName;
        public string Print()
        {
            return _bookName;
        }

        public void Input(string bkName)
        {
            _bookName = bkName;
        }
        static void Main2(string[] args)
        {
            ex2 objBook = new ex2();
            objBook.Input("C#-The Complete Reference");
            Console.WriteLine(objBook.Print());
        }
    }
}

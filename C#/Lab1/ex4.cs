using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Lab1
{
    class ex4
    {
        /// <summary>
        /// Interger field to Store employee ID.
        /// </summary>
        private int _id;
        /// <summary>
        /// String field to Store emplpoyee name.
        /// </summary>
        private string _name;
        /// <summary>
        /// This constructor initializes the id and name to -1 and null
        /// </summary>
        /// <remarks>
        /// <seealsocref = "Employee(int , string ) " > Employee(int, string)</seealsocref>
        /// </remarks>
        public ex4()
        {
            _id = -1;
            _name = null;
        }

        public ex4(int id, string name)
        {
            this._id = id;
            this._name = name;
        }
        static void Main4(string[] args)
        {
            ex4 obj = new ex4(101, "DavidSmith");
            Console.WriteLine("EmployeeID : {0} \nEmployyeName : {1} ", obj._id, obj._name);
        }
    }
}

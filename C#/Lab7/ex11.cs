using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using IO = System.Console;
using Emp = Bank.Accounts.EmployeeDetails;

class AliasExample
{
    static void Main11(string[] args)
    {
        Emp.Employee objEmp = new Emp.Employee();
        objEmp.EmpName = "Peter";
        IO.WriteLine("Employee Name: " + objEmp.EmpName);
    }
}
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Students
{
    class StudentDetails
    {
        string _studName = "Alexander";
        int _studId = 30;
        public StudentDetails()
        {
            Console.WriteLine("Student Name:" + _studName);
            Console.WriteLine("Student ID:" + _studId);
        }
    }
}
namespace Examination
{
    class ScoreReport
    {
        public string Subject = "Science";
        public int Marks = 60;
        static void Main9(string[] args)
        {
            Students.StudentDetails objStudents = new Students.StudentDetails();
            ScoreReport objReport = new ScoreReport();
            Console.WriteLine("Subject:" + objReport.Subject);
            Console.WriteLine("Marks:" + objReport.Marks);
        }
    }
}

using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Lab_s2.Models
{
    class Emails
    {
        private string header;
        private string email;
        private string content;

        public Emails(string header, string email, string content)
        {
            Header = header;
            Email = email;
            Content = content;
        }

        public string Email // properties
        {
            get => email;
            set => email = value;
        }
        public string Header
        {
            get => header;
            set => header = value;
        }

        public string Content
        {
            get => content;
            set => content = value;
        }
    }
}

using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
using System.Runtime.InteropServices.WindowsRuntime;
using Windows.Foundation;
using Windows.Foundation.Collections;
using Windows.UI.Xaml;
using Windows.UI.Xaml.Controls;
using Windows.UI.Xaml.Controls.Primitives;
using Windows.UI.Xaml.Data;
using Windows.UI.Xaml.Input;
using Windows.UI.Xaml.Media;
using Windows.UI.Xaml.Navigation;
using Practical.Services;
using Practical.Models;
using Newtonsoft.Json;
using Windows.Storage;
using Windows.ApplicationModel;

// The Blank Page item template is documented at https://go.microsoft.com/fwlink/?LinkId=234238

namespace Practical.Models
{
    /// <summary>
    /// An empty page that can be used on its own or navigated to within a Frame.
    /// </summary>
    public sealed partial class Question1 : Page
    {
        public Question1()
        {
            this.InitializeComponent();
            LoadJson();
        }

        public void LoadData()
        {
            Employee load = JsonConvert.DeserializeObject<Employee>(File.ReadAllText("employee.json"));
            employeeList.ItemsSource = load.employeeLists;
        }

        public void LoadJson()
        {
            string FilePath = Path.Combine(Package.Current.InstalledLocation.Path, "employee.json");
            using (StreamReader file = File.OpenText(FilePath))
            {
                var json = file.ReadToEnd();
                Dictionary<string, object> result = JsonConvert.DeserializeObject<Dictionary<string, object>>(json);
                string employee = result["employee"].ToString();
                List<Employee> objResponse = JsonConvert.DeserializeObject<List<Employee>>(employee);
                employeeList.ItemsSource = objResponse;
            }
        }
    }
}

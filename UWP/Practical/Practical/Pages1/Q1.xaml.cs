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
using Windows.ApplicationModel;
using Newtonsoft.Json;
using Practical.Models;

// The Blank Page item template is documented at https://go.microsoft.com/fwlink/?LinkId=234238

namespace Practical.Pages1
{
    /// <summary>
    /// An empty page that can be used on its own or navigated to within a Frame.
    /// </summary>
    public sealed partial class BlankPage1 : Page
    {
        public BlankPage1()
        {
            this.InitializeComponent();
            employeeList = new ListView();
            this.LoadJson();
        }

        public void LoadJson()
        {
            string FilePath = Path.Combine(Package.Current.InstalledLocation.Path, "employee.json");
            using (StreamReader file = File.OpenText(FilePath))
            {
                var json = file.ReadToEnd();
                Dictionary<string, object> result = JsonConvert.DeserializeObject<Dictionary<string, object>>(json);
                string employee1 = result["employee"].ToString();
                List<Employee> objResponse = JsonConvert.DeserializeObject<List<Employee>>(employee1);
                employeeList.ItemsSource = objResponse;
                System.Diagnostics.Debug.WriteLine(Package.Current.InstalledLocation.Path);
            }
        }
    }
}

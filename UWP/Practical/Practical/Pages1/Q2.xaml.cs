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
using SQLitePCL;
using Practical.Adapters;
using Windows.UI;

// The Blank Page item template is documented at https://go.microsoft.com/fwlink/?LinkId=234238

namespace Practical.Pages1
{
    /// <summary>
    /// An empty page that can be used on its own or navigated to within a Frame.
    /// </summary>
    public sealed partial class Q2 : Page
    {
        public Q2()
        {
            this.InitializeComponent();
            AddToDatabase(1, "aaaaaaa111");
            AddToDatabase(2, "bbbbbbb222");
            AddToDatabase(3, "ccccccc333");
        }

        public void AddToDatabase(int id, string password)
        {
            SQLiteHelper qLiteHelper = SQLiteHelper.GetInstance();
            SQLiteConnection sQLiteConnection = qLiteHelper.sQLiteConnection;
            string sql_txt = "insert into User (id,password) values(?,?)";
            var statement = sQLiteConnection.Prepare(sql_txt);
            statement.Bind(1, id);
            statement.Bind(2, password);
            var rs = statement.Step();
        }

        private void loginbtn_Click(object sender, RoutedEventArgs e)
        {
            SQLiteHelper qLiteHelper = SQLiteHelper.GetInstance();
            SQLiteConnection sQLiteConnection = qLiteHelper.sQLiteConnection;
            string sql_txt = "select * from User where (id = ? and password = ?)";
            var statement = sQLiteConnection.Prepare(sql_txt);
            statement.Bind(1, userBox.Text);
            statement.Bind(2, passwordBox.Password.ToString());
            if (SQLiteResult.ROW == statement.Step())
            {
                Validate.Text = "Login successfully";
                Validate.Foreground = new SolidColorBrush(Colors.Green);
            }
            else
            {
                Validate.Text = "Login failed!";
                Validate.Foreground = new SolidColorBrush(Colors.Red);
            }

        }
    }
}

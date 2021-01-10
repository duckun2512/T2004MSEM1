using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Lab6
{
    class ex3
    {
        class IntelliSenseDemo : TimeZone
        {
            public override string DayLightName
            {
                get
                {
                    throw new Exception("The method or operation is not implemented.");
                }
            }
            public override System.Globalization.DaylightTime GetDaylightChanges(int year)
            {
                throw new Exception("The method or operation is not implemented.");
            }
            public override TimeSpanGetUtcOffet(DateTime time)
            {
                throw new Exception("The method or operation is not implemented.");
            }
            public override string StandardName => throw new NotImplementedException();
        }
    }
}

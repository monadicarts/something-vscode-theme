// C# Sample for Something Theme
using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace Something.Sample
{
    [AttributeUsage(AttributeTargets.Class)]
    public class MySampleAttribute : Attribute { }

    [MySample]
    public class Program
    {
        private const double Pi = 3.14159;

        public static async Task Main(string[] args)
        {
            Console.WriteLine("Hello, C# World!");
            var numbers = new List<int> { 1, 2, 3, 4, 5 };
            var evenNumbers = numbers.Where(n => n % 2 == 0);

            await Task.Delay(100); // Simulate async work
            Console.WriteLine($"The sum of even numbers is {evenNumbers.Sum()}. PI is {Pi}.");
        }
    }
}
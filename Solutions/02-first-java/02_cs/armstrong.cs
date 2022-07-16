using System;
using System.Linq;
using System.Collections.Generic;
public class armstrong
{
    public static void Main(string[] args){
        var a = ArmstrongBetweenTwoNumbers(1,100000);
        foreach (var item in a)
        {
            Console.Write(item);
            Console.Write(" ");
        }
    }

    public static List<int> ArmstrongBetweenTwoNumbers(int start, int end){
        List<int> armStrongNumbers = new List<int>();
        for (int current = start; current <= end; current++)
        {
            var copy = current;
            var digitCount = 0;
            while(copy!=0){
                copy = copy/10;
                ++digitCount;
            }

            int sum,rem;
            sum = rem = 0;
            copy = current;

            while (copy != 0)
            {
                rem = copy % 10;
                sum+=(int)Math.Pow(rem, digitCount);
                copy = copy/10;
            }

            if(sum == current){
                armStrongNumbers.Add(current);
            }
        }
        return armStrongNumbers;
    }
}
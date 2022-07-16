using System;
using System.Linq;
public class MaximumWealth
{
    public static void Main(string[] args)
    {
        // jagged array
        int[][] accounts = new int[][] {
            new int[]{1,5},
            new int[]{7,3},
            new int[]{3,5}
        };
        Console.WriteLine("Maximum wealth is {0}", MaximumWealth(accounts));
    }
    public static int MaximumWealth(int[][] accounts)
    {
        int max = Int32.MinValue;
        for (int i = 0; i < accounts.Length; i++)
        {
            int sum = 0;
            for (int j = 0; j < accounts[i].Length; j++)
            {
                sum += accounts[i][j];
            }
            max = Math.Max(sum, max);
        }
        return max;
    }

    public static int MaximumWealth1(int[][] accounts)
    {
        int max = Int32.MinValue;
        for (int i = 0; i < accounts.Length; i++)
        {
            int sum = accounts[i].Sum();
            max = Math.Max(sum, max);
        }
        return max;
    }

}
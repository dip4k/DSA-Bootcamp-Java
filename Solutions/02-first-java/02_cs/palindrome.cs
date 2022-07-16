using System;
using System.Linq;
using System.Collections.Generic;
public class Palindrome
{
    public static void Main(string[] args){
        var input = "RaceCar";
        Console.WriteLine($"{input} is a palindrome :: {IsPalindrome(input)}");
    }

    public static bool IsPalindrome(string str1){
        var str = str1.ToLower();
        int leftPtr = 0;
        int rightPtr = str.Length-1;
        while(leftPtr < rightPtr){
            if(str[leftPtr] != str[rightPtr]){
                return false;
            }
            leftPtr++;
            rightPtr--;
        }
        return true;
    }
}
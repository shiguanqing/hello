package leetcode;

import java.util.Stack;

public class Palindrome
{
    public static void main(String[] args)
    {
        Stack<Character> stack = new Stack<>();
        stack.push('c');
        System.out.println(stack.pop());

        System.out.println(isValid("[]{}"));
    }

    public static void longPalindrome(String s)
    {

    }

    public static int reverse(int x) {
        int res = 0;
        while (x != 0) {
            if (Math.abs(res) > Integer.MAX_VALUE / 10) return 0;
            res = res * 10 + x % 10;
            x /= 10;
        }
        return res;
    }

    public static boolean isValid(String s)
    {
        if (s.isEmpty())
        {
            return true;
        }

        Stack<Character> stack = new Stack<>();
        for (char c: s.toCharArray())
        {
            if (c == '(' )
            {
                stack.push(')');
            }
            else if (c=='[')
            {
                stack.push(']');
            }
            else if (c=='{')
            {
                stack.push('}');
            }
            else if (stack.isEmpty() || stack.pop()!= c)
            {
                return false;
            }
        }

        return stack.isEmpty();
    }

}

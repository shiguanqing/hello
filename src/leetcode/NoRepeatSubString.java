package leetcode;

public class NoRepeatSubString
{
    public static void main(String[] args)
    {
        String testString = "abcabcbb";
        int maxLenth = lengthOfLongestSubstring(testString);
        System.out.println(maxLenth);
    }

    public static void fun()
    {
        char[] freq = new char[256];
        System.out.println(freq);
    }


    public static int lengthOfLongestSubstring(String s) {
        char[] freq = new char[256];
        // 设定s的[left,right]子串无重复字符
        int l = 0, r = -1;
        int max = 0;
        while (l < s.length()){
            if (r == s.length() - 1){
                break;
            }
            if (freq[s.charAt(r + 1)] == 0){
                freq[s.charAt(r + 1)]++;
                r++;
                max = Math.max(max, r - l + 1);
            } else {
                freq[s.charAt(l)]--;
                l++;
            }
        }

        return max;
    }
}

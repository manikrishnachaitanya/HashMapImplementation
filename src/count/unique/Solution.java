package count.unique;

import java.util.HashMap;
import java.util.Map;

class Solution {
    // String s = "ABCDEF";
    /*public int uniqueLetterString(String s) {

        rec("ABCDEF", n, t) = 1 * 6 + rec("ABCDEF", n-1);
        rec("ABCDEF", n-1) = t * 5 + rec("ABCDEF" , 4);
        rec("ABCDEF", 4) =  3* 4 + rec(ABCDEF, 3)
        "ABCD" , "BCDE", "CDEF"
    }*/

    public static void main(String[] args)
    {
        Solution s = new Solution();
        String input = "LEETCODE"; // ABCA AABC
        int res = s.sumUniqueChars(input);
        System.out.println("res "+ res);
    }

    public int countUniqueChars(String s)
    {
        Map<Character, Integer> map = new HashMap<>();
        int num = 0;
        for(char c : s.toCharArray())
        {
           int occurrence = map.getOrDefault(c,0);
           map.put(c, ++occurrence);
        }
        num = (int)map.values().stream().filter(val -> val == 1).count();
        return num;
    }



    public int sumUniqueChars(String s)
    {
        int count = 0;
        int stringLength = s.length();
        // t --> number of letters
        for (int numCharsInSubStr =1; numCharsInSubStr <= stringLength ; numCharsInSubStr++ )
        {
            int maxIndex = stringLength - numCharsInSubStr;
            for (int index =0; index <= maxIndex; index++)
            {
                count = count + countUniqueChars(s.substring(index, index+numCharsInSubStr));
            }
        }
        return count;
    }
}

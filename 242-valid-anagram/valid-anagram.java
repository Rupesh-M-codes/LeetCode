class Solution {
    public boolean isAnagram(String s, String t) {
        boolean ans = true;
        if(s.length() != t.length())
        {
            ans = false;
        }
        else{
            char[] c1 = s.toCharArray();
            char[] c2 = t.toCharArray();

            Arrays.sort(c1);
            Arrays.sort(c2);

            return Arrays.equals(c1,c2);
        }
        return ans;
    }
}
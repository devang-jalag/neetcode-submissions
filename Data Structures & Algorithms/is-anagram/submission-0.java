class Solution {
    public boolean isAnagram(String s, String t) {
        char[] temp1 = s.toCharArray();
        Arrays.sort(temp1);
        char[] temp2 = t.toCharArray();
        Arrays.sort(temp2);
        s = new String(temp1);
        t = new String(temp2);

        if(s.equals(t)){
            return true;
        }
        return false;
    }
}

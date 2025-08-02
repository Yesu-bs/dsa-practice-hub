class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.length()==0) return true;

        if(s.length()>t.length()) return false;

        int i=0;int j=0;

        for(j=j;j<t.length();j++){
            if(s.charAt(i)==t.charAt(j)) i++;
            if(i>=s.length()) return true;
        }
        return false;


    }
}
class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();

        StringBuilder plainstr=new StringBuilder();

        for(int i=0;i<s.length();i++){
            if(s.charAt(i)>='a'&&s.charAt(i)<='z'||s.charAt(i)>='0'&&s.charAt(i)<='9'){
                plainstr.append(s.charAt(i));
            }
        }

        for(int i=0;i<plainstr.length()/2;i++){
            if(plainstr.charAt(i)!=plainstr.charAt(plainstr.length()-1-i)){
                return false;
            }
        }
        return true;
    }
}
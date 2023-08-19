class Solution {
    public boolean isPalindrome(String s) {
       int l = s.length();
       String ss ="";
       String rs ="";
       s = s.toLowerCase();
       for(int i = 0;i<l;i++){
           if(Character.isLetter(s.charAt(i)) || Character.isDigit(s.charAt(i))){
               ss+=s.charAt(i);
               rs = s.charAt(i)+rs;
           }
       }
       if(ss.equals(rs)){
           return true;
       }
       else{
           return false;
       }
    }
}
class Solution {
    public boolean isPalindrome(String s){
        String s1 = s.toLowerCase();
        String s2=s1.replaceAll(" ","");
        String s3 = s2.replaceAll("[^a-z0-9]","");
        
        int i =0;
        int j = s3.length()-1;
        while(i<=j){
            if(s3.charAt(i)!=s3.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true ;

    }
}
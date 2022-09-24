package LeetCode;

public class IsSubsequence {

    public boolean isSubsequence(String s, String t) {

        int i = 0;
        int j = 0;

        while(i<s.length() && j<s.length()){
            if(s.charAt(i)==t.charAt(j))
                i++;
            j++;
            if(i==s.length())
                return true;
            System.out.println(i+" "+s.length());

        }
        return false;
        
    }
    
}

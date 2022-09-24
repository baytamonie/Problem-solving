package LeetCode;

import java.util.HashMap;

public class IsIsomorphic {

    public boolean isIsomorphic(String s, String t){

            if(s.length()>t.length())
                return false;
            HashMap <Character,Boolean> hashMap = new HashMap<>();    
            HashMap <Character,Character> cHashMap = new HashMap<>();
                        for(int i =0;i<s.length();i++){
                            char key = s.charAt(i);
                            if(cHashMap.containsKey(key))
                            {
                                if(cHashMap.get(key).equals(t.charAt(i)))
                                    continue;
                                else 
                                    return false;    
                            }
                            else{

                                if(hashMap.containsKey(t.charAt(i)))
                                    return false;
                                hashMap.put(t.charAt(i), true);
                                cHashMap.put(key, t.charAt(i));

                            }

           }

        return true;



    }
    
}

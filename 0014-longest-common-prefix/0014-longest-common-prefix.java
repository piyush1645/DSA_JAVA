import java.util.*;
import java.lang.*;

class Solution {
    public String longestCommonPrefix(String[] strs) {
            String same="";
            String first=strs[0];
            int count=first.length();
            int com=0;
            for(int i=1;i<strs.length;i++){
                com=0;
                int len=Math.min(first.length(),strs[i].length());
                for(int j=0;j<len;j++){
                    if(first.charAt(j)==strs[i].charAt(j)){
                        com++;
                    }else{
                        break;
                    }
                }
                count=Math.min(count,com);

            }
            return first.substring(0,count);
    }
}
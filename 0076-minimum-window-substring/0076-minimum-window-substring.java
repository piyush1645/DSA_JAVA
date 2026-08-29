class Solution {
    public String minWindow(String s, String t) {
        if(t.length()>s.length()){
            return "";
        }

        int count1[]=new int[128];
        int count2[]=new int[128];

        //t freq
        for(int i=0;i<t.length();i++){
            count1[t.charAt(i)]++;
        }

        int left=0;
        int minLength=Integer.MAX_VALUE;
        int start=0;

        for(int right=0;right<s.length();right++){
            //right character add
            count2[s.charAt(right)]++;

            //window valid hoy tya sudhi aagal vadhvanu
            while(contains(count1,count2)){
                int currentLength=right-left+1;

                if(currentLength<minLength){
                    minLength=currentLength;
                    start=left;
                }

                count2[s.charAt(left)]--;
                left++;
            }
        }
        return minLength==Integer.MAX_VALUE?"":s.substring(start,start+minLength);
    }
    public static boolean contains(int[] required,int[] window){
        for(int i=0;i<128;i++){
            if(window[i]<required[i]){
                return false;
            }

        }
        return true;
    }
}
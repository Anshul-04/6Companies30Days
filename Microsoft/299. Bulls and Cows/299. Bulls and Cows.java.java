class Solution {
    public String getHint(String secret, String guess) {
        int bulls =0;
        int cows =0;

        int data[] = new int[10];

        for(int i=0;i<secret.length();i++){
            int s = secret.charAt(i)-'0';
            int g = guess.charAt(i)-'0';
            if(s==g){
                bulls++;
            }
            else{
                if(data[s]< 0){ cows++;}
               if(data[g]> 0){ cows++;}
                data[s]++;
                data[g]--;
            }
        }
        return bulls +"A" +cows +"B" ;
    }
}

//ques link : https://leetcode.com/problems/bulls-and-cows/
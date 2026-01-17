class Solution {
    public int maxConsecutiveAnswers(String answerKey, int k) {
        return Math.max(
            maxLen(answerKey,k,'T'),
            maxLen(answerKey,k,'F')
        );
        
    }
    private int maxLen(String s, int k , char ch){
        int left=0,maxLen=0,changes=0;

        for(int right=0;right<s.length();right++){
        if(s.charAt(right)!=ch){
            changes++;
        }
        while(changes>k){
            if(s.charAt(left)!=ch){
                changes--;
            }
            left++;
        }
        maxLen=Math.max(maxLen,right-left+1);
        }
        return maxLen;
    }
}
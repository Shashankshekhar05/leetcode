class Solution {
    public int hIndex(int[] citations) {
        Arrays.sort(citations);
        int h=0;
        int n = citations.length;
        for(int i=0;i<n;i++){
            int a = citations[n-1-i];
            if(a>=i+1){
                h=i+1;

            }else{
                break;
            }

        }
        return h;
    }
}
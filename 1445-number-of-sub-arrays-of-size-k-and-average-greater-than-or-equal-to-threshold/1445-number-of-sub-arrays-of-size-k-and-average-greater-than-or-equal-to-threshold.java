public class Solution{
    public int numOfSubarrays(int[] arr, int k, int t) {
        int n = arr.length;
        int count =0;
        int i=0,j=k-1,sum=0;
        for(int a=0;a<k;a++){
            sum+= arr[a];
        }
        if(sum/k>=t) count ++;
        i++;j++;
        while(j<n){
            sum = sum- arr[i-1] + arr[j];
            if(sum/k>=t) count ++;
            i++;j++;
        }
        return count;
    }
}

class Solution {
    public class pair implements Comparable<pair>{
         int ele;
         int freq;

        public pair(int ele, int freq) {
            this.ele = ele;
            this.freq = freq;
        }
        public int compareTo(pair p){
            if(this.freq == p.freq) return this.ele - p.ele;
            return this.freq - p.freq;
        }
         
    }
    public int[] topKFrequent(int[] arr, int k) {
        int [] ans = new int[k];
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int ele:arr){
            if(map.containsKey(ele)){
                int freq = map.get(ele);
                map.put(ele, freq+1);
            }
            else map.put(ele, 1);
        }
        PriorityQueue<pair> pq = new PriorityQueue<>();
        for(int ele:map.keySet()){
            int freq = map.get(ele);
            pq.add(new pair(ele, freq));
            if(pq.size()>k) pq.remove();
        }
        for(int i=0;i<k;i++){
            pair p = pq.remove();
            ans[i] = p.ele;
        }
        return ans;
    }
}
class Solution {
    public int lastStoneWeight(int[] stones) {
        List<Integer> ans = new ArrayList<>();
        for(int ele:stones){
            ans.add(ele);
        }
        while(ans.size()>1){
            Collections.sort(ans);
            int y = ans.remove(ans.size()-1);
            int x = ans.remove(ans.size()-1);
            if(y!=x) ans.add(y-x);
        }
        if(ans.size()==0) return 0;
        else return ans.get(0);
    }
}
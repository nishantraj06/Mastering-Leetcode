class Solution {
    public int totalFruit(int[] fruits) {
        int ans = -1;
        HashMap<Integer, Integer> freq = new HashMap<>();

        for(int high = 0 , low = 0 ; high < fruits.length ; high++){
            int cur = fruits[high];
            freq.put(cur , freq.getOrDefault(cur,0)+1);

            if(freq.size() <= 2){
                ans = Math.max(ans , high-low+1);
            }
            while(freq.size() > 2){
                int left = fruits[low++];
                freq.put(left,freq.get(left)-1);
                if(freq.get(left) == 0)
                    freq.remove(left);
            }
        }
        return ans;
    }
}
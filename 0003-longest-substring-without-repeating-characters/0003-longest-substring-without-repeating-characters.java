//3. Longest Substring Without Repeating Characters
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int ans = 0;
        HashMap<Character, Integer> hashmap = new HashMap<>();

        for(int high = 0 , low = 0 ; high<s.length();high++){
            char ch = s.charAt(high);
            if(hashmap.containsKey(ch) ==  true)
                hashmap.put(ch , hashmap.get(ch)+1);
            else
                hashmap.put(ch,1);
            if(hashmap.size() == (high-low+1)){
                ans = Math.max(ans,hashmap.size());
            }

            while(hashmap.size() < (high-low+1)){
                    char c= s.charAt(low);
                    low++;
                    hashmap.put(c,hashmap.get(c)-1);
                    if(hashmap.get(c) == 0){
                        hashmap.remove(c);
                    }
            }
        }
        return ans;
    }
}
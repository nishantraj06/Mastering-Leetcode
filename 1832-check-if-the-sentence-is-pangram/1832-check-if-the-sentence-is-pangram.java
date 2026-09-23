class Solution {
    public boolean checkIfPangram(String sentence) {
        boolean flag[] = new boolean[26];
        for(int i = 0 ; i<sentence.length() ; i++){
            char ch = sentence.charAt(i);
            flag[ch-'a'] = true;
        }
        
        for(int i = 0 ; i<26;i++)
            if(!flag[i]) return false;
        return true;
    }
}
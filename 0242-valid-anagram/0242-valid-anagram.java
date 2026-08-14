class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length() != t.length()){
            return false;
        }

        int[] count = new int[26];

        // HashMap<Character,Integer>count = new HashMap<>();

        for(char c : s.toCharArray()){
            count[c-'a']++;
        }
        for(char c : t.toCharArray()){
            count[c-'a']--;
        }

        for(int values : count){
            if(values != 0){
                return false;
            }
            
        }

return true;
        
    }
}
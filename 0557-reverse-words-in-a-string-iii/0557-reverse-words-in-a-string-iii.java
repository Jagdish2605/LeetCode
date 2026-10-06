class Solution {
    public String reverseWords(String s) {
        String[] words = s.split(" ");
        String result = "";
        for(String word : words){
            String reversed = "";
            for(int i = word.length() -1;i>=0;i--){
                reversed = reversed+ word.charAt(i);
            }
            result=result + reversed + " ";
        }
        return result.trim();
    }
}
class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        Set<Character> set=new HashSet<>();
        int ans=words.length;
        for(char ch:allowed.toCharArray()) set.add(ch);
        for(int i=0;i<words.length;i++){
            String s=words[i];
            int j=0;
            while(j<s.length()){
                if(!set.contains(s.charAt(j++))){
                    ans--;
                    break;
                }
            }
        }
        return ans;
    }
}
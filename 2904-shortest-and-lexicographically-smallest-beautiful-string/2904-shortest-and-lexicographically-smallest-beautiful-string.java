class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        int l = 0, cnt = 0;
        String ans = "";
        for (int r = 0; r < s.length(); r++) {
            if (s.charAt(r) == '1') cnt++;
            while (cnt > k) {
                if (s.charAt(l++) == '1') cnt--;
            }
            while (cnt == k && s.charAt(l) == '0') l++;
            if (cnt == k) {
                String cur = s.substring(l, r + 1);
                if (ans.isEmpty() || cur.length() < ans.length() ||
                   (cur.length() == ans.length() && cur.compareTo(ans) < 0)) {
                    ans = cur;
                }
            }
        }
        return ans;
    }
}
class Solution {
    public boolean isSubsequence(String s, String t) {
        int i = 0; // s의 인덱스
        int j = 0; // t의 인덱스

        // t를 끝까지 탐색
        while (i < s.length() && j < t.length()) {
            if (s.charAt(i) == t.charAt(j)) {
                i++; // 문자가 일치하면 s 인덱스 증가
            }
            j++; // t는 항상 증가
        }

        // s의 모든 문자를 찾았으면 i == s.length()
        return i == s.length();
    }
}
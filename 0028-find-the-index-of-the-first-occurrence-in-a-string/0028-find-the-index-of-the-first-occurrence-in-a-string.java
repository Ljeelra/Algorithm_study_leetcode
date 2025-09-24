class Solution {
    public int strStr(String haystack, String needle) {
        if (needle.length() == 0) return 0;

        // haystack을 처음부터 끝까지 탐색
        for (int i = 0; i <= haystack.length() - needle.length(); i++) {
            if (haystack.substring(i, i + needle.length()).equals(needle)) {
                return i; // 처음 발견된 위치 반환
            }
        }

        return -1;
    }
}
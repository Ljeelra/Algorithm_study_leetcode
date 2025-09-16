class Solution {
    public int lengthOfLastWord(String s) {
       s = s.trim(); // 앞뒤 공백 제거
        int lastSpace = s.lastIndexOf(" "); // 마지막 공백 위치 찾기
        return s.length() - lastSpace - 1; 
    }
}
class Solution {
    public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            char l = s.charAt(left);
            char r = s.charAt(right);

            // 알파벳/숫자가 아니면 건너뜀
            if (!Character.isLetterOrDigit(l)) {
                left++;
                continue;
            }
            if (!Character.isLetterOrDigit(r)) {
                right--;
                continue;
            }

            // 대소문자 무시하고 비교
            if (Character.toLowerCase(l) != Character.toLowerCase(r)) {
                return false; // 하나라도 다르면 팰린드롬 아님
            }

            left++;
            right--;
        }

        return true;
    }
}
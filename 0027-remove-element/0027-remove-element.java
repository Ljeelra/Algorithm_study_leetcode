class Solution {
    public int removeElement(int[] nums, int val) {
        // val과 일치하지 않는 원소 개수
        int k = 0; 

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i]; // 앞쪽에 덮어쓰기
                k++;
            }
        }

        return k; 
    }
}
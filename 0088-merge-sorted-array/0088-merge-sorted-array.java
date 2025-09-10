class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        //원래는 그냥 Arrays.sort()로 진행했는데, gpt가 이 문제에서 바라는건 직접 정렬하는걸    보여주는거라고 하더라..
        int i = m-1;
        int j = n-1;
        int k = m+n-1; //num1 마지막 위치
        while(i >= 0 && j >= 0){
            if (nums1[i] > nums2[j]) {
                nums1[k--] = nums1[i--];
            } else {
                nums1[k--] = nums2[j--];
            }
        }

        while(j >= 0){
            nums1[k--] = nums2[j--];
        }
    }
}
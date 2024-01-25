// Adobe
/*Given an integer array nums of length n, you want to create an array ans of length 2n where ans[i] == nums[i] and ans[i + n] == nums[i] for 0 <= i < n (0-indexed).

Specifically, ans is the concatenation of two nums arrays.Return the array ans. */
class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] arr = new int[2 * n];
        int i = 0;
        while (i < 2 * n) {
            if (i < n) {
                arr[i] = nums[i];
            } else {
                arr[i] = nums[i - n];
            }
            i++;
        }
        return arr;
    }
}

// class Solution_1929 {
// public static void main(String[] args) {
// int nums[] = { 1, 2, 3 };
// Solution s = new Solution();
// s.getConcatenation(nums);
// // System.out.println(nums.length);
// }
// }

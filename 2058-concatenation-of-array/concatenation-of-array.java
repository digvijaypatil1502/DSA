class Solution {
    public int[] getConcatenation(int[] nums) {
        int len = nums.length;
        int[] list = new int[2 * len];

        for (int i = 0; i < len; i++) {
            list[i] = nums[i];         // first copy
            list[i + len] = nums[i];  // second copy
        }

        return list;
    }
}
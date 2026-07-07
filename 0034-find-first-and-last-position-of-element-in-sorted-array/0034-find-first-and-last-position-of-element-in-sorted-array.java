class Solution {
    public int[] searchRange(int[] nums, int target) {

        int[] arr = {-1, -1};

        int start = 0;
        int end = nums.length - 1;

        boolean startB = false;
        boolean endB = false;

        while (start <= end) {

            if (!startB && nums[start] == target) {
                arr[0] = start;
                startB = true;
            }

            if (!endB && nums[end] == target) {
                arr[1] = end;
                endB = true;
            }

            if (!startB) {
                start++;
            }

            if (!endB) {
                end--;
            }

            if (startB && endB) {
                break;
            }
        }

        return arr;
    }
}
class Solution {
    public long countOperationsToEmptyArray(int[] nums) {
        int count = 0, index = 0;
        boolean isSmallest = true;

        while (index < nums.length) {
            // check if first element is smallest
            for (int i = index + 1; i < nums.length; i++) {
                if (nums[index] > nums[i]) {
                    isSmallest = false;
                    i = nums.length;
                }
            }

            // if yes go to next index
            if (isSmallest) {
                index++;
            } else { // if no, rotate
                int temp = nums[index];
                for (int i = index; i < nums.length - 1; i++) {
                    nums[i] = nums[i + 1];
                }
                nums[nums.length - 1] = temp;
                isSmallest = true;
            }

            // count operation
            count++;
        }
        return count;
    }
}


import java.util.List;

class Solution {
    public int minimumRightShifts(List<Integer> nums) {
        int count = 0;
    
        while(nums.get(0) > nums.get(nums.size() - 1)) {
            int temp = nums.get(nums.size() - 1);

            // shift right
            for (int i = nums.size() - 1; i > 0; i--) {
                nums.set(i, nums.get(i - 1));
            }

            nums.set(0, temp);
            
            count++;
        }

        // check if it is possible to sort
        for (int i = 0; i < nums.size() - 1; i++) {
            if (nums.get(i) > nums.get(i + 1)) {
                return -1;
            }
        }

        return count;
    }
}


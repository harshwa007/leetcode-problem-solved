class Solution {
    public void sortColors(int[] nums) {
        // use bubble sort
        int n = nums.length;
        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false;
            for (int j = 0; j < n - i - 1; j++) {

                swapped = true;
                if (nums[j] > nums[j + 1]) {
                    swap(nums, j, j + 1);
                }
            }
            if (!swapped) {
                break;
            }
        }

    }

    void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
class Solution {
    public int search(int[] nums, int target) {
    for (int i =0; i <nums.length; i++) {
        if (nums[i] == target) {
            return i;
        }
    }
    // Arrays.sort(nums);
    // int left = 0;
    // int right = nums.length - 1;

    // while (left <= right) {
    //   int mid = left + (right - left) / 2;

    //   // Check if target is present at mid
    //   if (nums[mid] == target) {
    //     return mid;
    //   }

    //   // If target greater, ignore left half
    //   if (nums[mid] < target) {
    //     left = mid + 1;
    //   } else {
    //     // If target is smaller, ignore right half
    //     right = mid - 1;
    //   }
    // }

    // // Target not present in array
    return -1;
  }
}
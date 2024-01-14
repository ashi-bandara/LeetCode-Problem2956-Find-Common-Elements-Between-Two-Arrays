class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        int[] result = new int [2];

        for (int i : nums1) {
            for (int j : nums2) {
                if (j == i) {
                    result[0]++;
                    break;
                }
            }
        }

        for (int k : nums2) {
            for (int l : nums1) {
                if (k == l) {
                    result[1]++;
                    break;
                }
            }
        }

        return result;
    }
}
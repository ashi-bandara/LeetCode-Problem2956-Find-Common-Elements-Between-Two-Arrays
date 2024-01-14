
# LeetCode Challenge D31
## Achievements
[![image.png](https://i.postimg.cc/nLbZ1C55/image.png)](https://postimg.cc/nXk6FcnY)

This solution outperformed 81.80% of Java users on LeetCode according to runtime metrics.


## Overview

Welcome to my LeetCode solution repository! This project addresses the coding challenge presented by [2956. Find Common Elements Between Two Arrays](https://leetcode.com/problems/find-common-elements-between-two-arrays/). Below, you'll find details about the problem, my approach to solving it, and the implemented solution.

## Problem Statement
You are given two  **0-indexed**  integer arrays  `nums1`  and  `nums2`  of sizes  `n`  and  `m`, respectively.
Consider calculating the following values:

-   The number of indices  `i`  such that  `0 <= i < n`  and  `nums1[i]`  occurs  **at least**  once in  `nums2`.
-   The number of indices  `i`  such that  `0 <= i < m`  and  `nums2[i]`  occurs  **at least**  once in  `nums1`.

Return  _an integer array_ `answer` _of size_ `2` _containing the two values  **in the above order**_.

**Example**

> **Input:** nums1 = [4,3,2,3,1], nums2 = [2,2,5,2,3,6]
> **Output:** [3,4]
> **Explanation:**
> 
> We calculate the values as follows:
>- The elements at indices 1, 2, and 3 in nums1 occur at least once in nums2. So the first value is 3.
>- The elements at indices 0, 1, 3, and 4 in nums2 occur at least once in nums1. So the second value is 4.

**Language Used**
> Java

**Difficulty**
> Easy

## Solution Overview
The solution initializes an array `result` of size 2 to store the counts of common elements. The first loop iterates through each element (`i`) in `nums1` and compares it with every element (`j`) in `nums2`. If a match is found, it increments the count in `result[0]`. The second loop does the reverse; it iterates through each element (`k`) in `nums2` and compares it with every element (`l`) in `nums1`. If a match is found, it increments the count in `result[1]`. The use of the `break` statement ensures that a match is only counted once per element in the outer loop.

The result array, `result`, contains the counts of common elements from `nums1` in the 0th index and common elements from `nums2` in the 1st index. The code utilizes nested loops to compare elements between the two arrays and count the intersections.

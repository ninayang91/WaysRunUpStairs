# WaysRunUpStairs
Count possible ways to run up n steps stairs by run 1,2,3 steps each time

A child is running up a staircase with n steps, and can hop either 1 step, 2 steps, or 3 steps at a time. Implement a method to count how many possible ways the child can run up the stairs.

n<0 -> 0

n==1 -> 1

n==2 -> 2 (1+1,2)

count(n-1)+count(n-2)+count(n-3) since we alreay count (1+1) in last 2 steps in count(n-1), so we don't count it again in count(n-2), same story, we only count n-3 when 3 steps are left

Time O(3^n), we could use dynamic programming to reduce time complexity by saving previous results in temp[]

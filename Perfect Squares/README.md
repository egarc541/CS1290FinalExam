# 9. Perfect Squares

# Part 1 - Recursive Solution

dp[n] = dp[n+1]<br>
dp[0] = 0<br>
mindp = dp[i+j * j]<br>
mindp = Math.min(dp[i+j * j], dp[i] +1)
dp[n]

# Part 2 - Explanation
For this problem my approach to solve it in DP was using a single array to store the least number of perfect square numbers that 
will sum to i. Getting the number in n and checking for the minimal number of n in that can use the perfect square numbers. The
variable j will be use for the perfect square numbers and i as the index in order to sum the value and find an index main value.

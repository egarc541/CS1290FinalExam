# 9. Perfect Squares

# Part 1 - Recursive Solution

dp[n] = dp[n+1]<br>
dp[0] = 0<br>
dp[i+j* j] = Math.min(dp[i+j * j], dp[i] +1)


# Part 2 - Explanation

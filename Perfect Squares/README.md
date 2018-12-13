# 9. Perfect Squares

# Part 1 - Recursive Solution

dp[n] = dp[n+1]<br>
dp[0] = 0<br>
mindp = dp[i+j * j]<br>
mindp = Math.min(dp[i+j * j], dp[i] +1)


# Part 2 - Explanation

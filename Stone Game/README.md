# 1. Stone Game

# Part 1 - DP (Recursive Solution)
dp = Arrays.copyOf(piles, piles.length) <br>
dp[i] = Math.max(piles[i] - dp[i+1], piles[i+d] - dp[i] <br>
dp[0] >0 // return True

# Part 2 - Explanation
For this problem, my DP approach was using a single array in order to store the maximum amount of stones use by a player in the
variable dp. I used the Arrays.copyOf method in order to get the length of the piles array assigned to dp. While checking the 
'i' for index and also using 'v' as the interval length inside the for loop condition in order to keep track of the length. At the 
dp was given the maximum value of stones per player in order to return true at the end. This means that Alex will win because 
he/she always picks even number of stones and Lee picks the odd number of stones.


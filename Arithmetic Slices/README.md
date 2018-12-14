# 4. Arithmetic Slices

# Part 1 - Recursive Solution
sumdp =0 <br>
size= A.length <br>
dp = dp[size]
sumdp = if(A[i]-A[i-1] == A[i-1] - A[i-2]) sum+= 1 + dp[i-1]) <br>
sum

# Part 2- Explanation
My dp approach for this problem was using a single array of dp that would hold the size of the parameter array. I would initialize
a sum variable to make sure it add up every number inside the array if the condition is true. The condition place before the update
is to check if after moving through the numbers it has the same value in between the numbers. 

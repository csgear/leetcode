
//leetcode.com 303. Range Sum Query - Immutable

#include <vector>

class NumArray
{
  public:
    NumArray(vector<int> nums)
    {
        if (nums.empty())
            return;

        dp.resize(nums.size() + 1, 0);

        for (int i = 1; i <= nums.size(); i++)
        {
            dp[i] = dp[i - 1] + nums[i - 1];
        }
    }

    int sumRange(int i, int j)
    {
        return dp[j + 1] - dp[i];
    }

  private:
    vector<int> dp;
};
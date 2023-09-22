class Solution
{
public:
    void nextPermutation(vector<int> &nums)
    {
        next_permutation(nums.begin(), nums.end());
        // return nums;
    }
};
/// https://leetcode.com/problems/next-permutation/solutions/
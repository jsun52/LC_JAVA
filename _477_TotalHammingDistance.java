package leetcode_301To600;

/**
 * 本代码来自 Cspiration，由 @Cspiration 提供
 * 题目来源：http://leetcode.com
 * - Cspiration 致力于在 CS 领域内帮助中国人找到工作，让更多海外国人受益
 * - 现有课程：Leetcode Java 版本视频讲解（1-900题）（上）（中）（下）三部
 * - 算法基础知识（上）（下）两部；题型技巧讲解（上）（下）两部
 * - 节省刷题时间，效率提高2-3倍，初学者轻松一天10题，入门者轻松一天20题
 * - 讲师：Edward Shi
 * - 官方网站：https://cspiration.com
 * - 版权所有，转发请注明出处
 */
public class _477_TotalHammingDistance {

    /**
     * The Hamming distance between two integers is the number of positions at
     * which the corresponding bits are different.

     Now your job is to find the total Hamming distance between all pairs of the given numbers.

     Example:

     Input: 4, 14, 2

     Output: 6

     Explanation: In binary representation, the 4 is 0100, 14 is 1110, and 2 is 0010 (just
     showing the four bits relevant in this case). So the answer will be:
     HammingDistance(4, 14) + HammingDistance(4, 2) + HammingDistance(14, 2) = 2 + 2 + 2 = 6.

     time : O(n)
     space : O(1)

     * @param nums
     * @return
     */
    public int totalHammingDistance(int[] nums) {
        int res = 0;
        int len = nums.length;
        for (int i = 0; i < 32; i++) {
            int count = 0;
            for (int j = 0; j < len; j++) {
                count += (nums[j] >> i) & 1;
            }
            res += count * (len - count);
        }
        return res;
    }
}

package solution;

import util.NotImplementException;

import java.util.HashSet;
import java.util.Set;

/**
 * https://leetcode-cn.com/problems/insert-delete-getrandom-o1/
 * 实现RandomizedSet 类：
 * <p>
 * RandomizedSet() 初始化 RandomizedSet 对象
 * bool insert(int val) 当元素 val 不存在时，向集合中插入该项，并返回 true ；否则，返回 false 。
 * bool remove(int val) 当元素 val 存在时，从集合中移除该项，并返回 true ；否则，返回 false 。
 * int getRandom() 随机返回现有集合中的一项（测试用例保证调用此方法时集合中至少存在一个元素）。每个元素应该有 相同的概率 被返回。
 * 你必须实现类的所有函数，并满足每个函数的 平均 时间复杂度为 O(1) 。
 * <p>
 * 思路：
 * 使用hash表作为数据结构
 * TODO 如何实现底层的hash机制？
 */
public class RandomizedSet {
    private Set<Integer> set = new HashSet<Integer>();
    public RandomizedSet() {
    }

    public boolean insert(int val) {
        return set.add(val);
    }

    public boolean remove(int val) {
        return set.remove(val);
    }

    public int getRandom() {
        throw new NotImplementException();
    }
}

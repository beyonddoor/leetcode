# 

'''
https://github.com/azl397985856/leetcode/blob/master/problems/1.two-sum.md
https://leetcode-cn.com/problems/two-sum

给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
你可以假设每种输入只会对应一个答案。但是，你不能重复利用这个数组中同样的元素。

示例:

给定 nums = [2, 7, 11, 15], target = 9

因为 nums[0] + nums[1] = 2 + 7 = 9
所以返回 [0, 1]
'''

def two_sum(numbers, sum_value):
    '''
    使用list.index来查找
    优化：numbers进行排序
    '''
    for i in range(len(numbers)):
        cur_value, numbers[i] = numbers[i], None
        found = None
        try:
            seond_index = numbers.index(sum_value - cur_value)
            found = (i, seond_index)
        except ValueError:
            pass

        cur_value, numbers[i] = numbers[i], None
        if found:
            return found


res = two_sum([1,1,2, 7, 11, 15], 9)
print(res)

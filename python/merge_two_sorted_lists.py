import unittest

'''
https://github.com/azl397985856/leetcode/blob/master/problems/21.merge-two-sorted-lists.md

将两个升序链表合并为一个新的升序链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。 
示例：
输入：1->2->4, 1->3->4
输出：1->1->2->3->4->4

'''

def merge_lists_recursive(list1, start1, list2, start2, result_list):
    if start1>=len(list1):
        result_list.extend(list2[start2:])
        return
    
    if start2>=len(list2):
        result_list.extend(list1[start1:])
        return

    if list1[start1] > list2[start2]:
        result_list.append(list2[start2])
        merge_lists_recursive(list1, start1, list2, start2+1, result_list)
    else:
        result_list.append(list1[start1])
        merge_lists_recursive(list1, start1+1, list2, start2, result_list)

def merge_lists():
    # TODO 实现一个非递归版本
    raise NotImplementedError

class Test(unittest.TestCase):
    def test(self):
        result = []
        merge_lists_recursive([1,2,4], 0, [1,3,4], 0, result)
        self.assertListEqual(result, [1,1,2,3,4,4])

    def test2(self):
        result = []
        merge_lists_recursive(list(range(5)), 0, list(range(6)), 0, result)
        self.assertListEqual(result, [0,0,1,1,2,2,3,3,4,4,5,])

# unittest.main()



    
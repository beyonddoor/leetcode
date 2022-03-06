import unittest
import sys

'''
https://leetcode-cn.com/problems/valid-parentheses/description

给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。

有效字符串需满足：

左括号必须用相同类型的右括号闭合。
左括号必须以正确的顺序闭合。
注意空字符串可被认为是有效字符串。

示例 1:

输入: "()"
输出: true
示例 2:

输入: "()[]{}"
输出: true
示例 3:

输入: "(]"
输出: false
示例 4:

输入: "([)]"
输出: false
示例 5:

输入: "{[]}"
输出: true
'''

def valid(string):
    '''解题思路：这个很简单，利用stack
    '''
    lefts = '{(['
    rights = '})]'
    stack = []
    try:
        for ch in string:
            if ch in lefts:
                stack.append(ch)
            else:
                left = stack.pop()
                if lefts.index(left) != rights.index(ch):
                    return False
        return len(stack) == 0
    except:
        return False


class Test(unittest.TestCase):
    def test(self):
        self.assertTrue(valid(''))
        self.assertTrue(valid('{}'))
        self.assertTrue(valid('()[]{}'))

        self.assertFalse(valid("(]"))
        self.assertFalse(valid("([)]"))
        self.assertTrue(valid("{[]}"))

# result = unittest.TestResult(sys.stdout, descriptions=True, verbosity=1)
# unittest.TestLoader().loadTestsFromTestCase(Test).run(result=result)
# print(result)

if __name__ == '__main__':
    unittest.main()
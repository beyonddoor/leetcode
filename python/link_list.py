import unittest

'''
实现自己的linklist
TODO iterator如何检测container已经发生变化，自身失效的问题
1. 使用version机制

'''

class Node:
    def __init__(self, value):
        self._value = value
        self._next = None
        self._prev = None

class LinkList:
    def __init__(self):
        self.clear()

    def add(self, value):
        self._count += 1
        node = Node(value)
        node._next = self._tail
        node._prev = self._tail._prev

        self._tail._prev._next = node
        self._tail._prev = node

    def add_all(self, list):
        for value in list:
            self.add(value)

    def clear(self):
        self._head = Node(None)
        self._tail = Node(None)
        self._head._next = self._tail
        self._tail._prev = self._head
        self._count = 0

    def remove(self, value):
        raise NotImplementedError("")
    
    def count(self):
        return self._count

    def __iter__(self):
        class ListIterator:
            def __init__(self, link_list):
                self._cur_node = link_list._head
                self._list = link_list

            def __next__(self):
                self._cur_node = self._cur_node._next
                if self._cur_node == self._list._tail:
                    raise StopIteration

                return self._cur_node._value

        return ListIterator(self)

    
class Test(unittest.TestCase):
    def test(self):
        lst = LinkList()
        lst.add_all(range(10))
        self.assertEqual(10, lst.count())

    def test_iterator(self):
        lst = LinkList()
        lst.add_all(range(10))
        for value in lst:
            print(value)
            lst.clear()

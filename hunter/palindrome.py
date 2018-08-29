class Node:
	def __init__(self, data):
		self.data = data
		self.next = None
class LinkedList:
	def __init__(self):
		self.head = None
	def isPalindromeUtil(self, string):
		return (string == string[::-1])
	def isPalindrome(self):
		node = self.head
		a = []
		while (node is not None):
			a.append(node.data)
			node = node.next
		string = "".join(a)
		return self.isPalindromeUtil(string)
	def printList(self):
		a = self.head
		while (a):
			print a.data,
			a = a.next
llist = LinkedList()
llist.head = Node('r')
llist.head.next = Node('a')
llist.head.next.next = Node("d")
llist.head.next.next.next = Node("a")
llist.head.next.next.next.next = Node("r")
print "true" if llist.isPalindrome() else "false"

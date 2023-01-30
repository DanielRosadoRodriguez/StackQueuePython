from exceptions import EmptyStackException

class Stack:
    def __init__(self):
        self.stack = []
    
    def push(self, element):
        self.stack.append(element)
    
    def pop(self):
        if not self.is_empty():
            return self.stack.pop()
        else:
            raise EmptyStackException("Stack is empty")

    def is_empty(self):
        return len(self.stack) == 0
    
    def peek(self):
        if not self.is_empty():
            return self.stack[-1]
        else:
            raise EmptyStackException("Stack is empty")

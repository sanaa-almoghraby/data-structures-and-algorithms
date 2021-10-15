# Stacks and Queues
#### A stack is a data structure that consists of Nodes. Each Node references the next Node in the stack, but does not reference its previous.
LIFO


#### Queues:
FIFO
First In First Out

This means that the first item in the queue will be the first item out of the queue.

LILO
Last In Last Out

This means that the last item in the queue will be the last item out of the queue.

## Challenge
### Using a Linked List as the underlying data storage mechanism, implement both a Stack and a Queue


## Approach & Efficiency
### bigO 
space:o(1)
time :o(1)

## API
### 1. Stack
Create a Stack class that has a top property. It creates an empty Stack when instantiated.
This object should be aware of a default empty value assigned to top when the stack is created.
The class should contain the following methods:
1. push
Arguments: value
adds a new node with that value to the top of the stack with an O(1) Time performance.
2. pop
Arguments: none
Returns: the value from node from the top of the stack
Removes the node from the top of the stack
Should raise exception when called on empty stack
3. peek


### 2. Queue
1. enqueue
2. dequeue
3.peek

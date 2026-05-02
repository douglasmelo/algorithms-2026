# Class 5 - May 1: Recursion

## Introduction to Recursion
Recursion is a programming technique where a function calls itself to solve smaller instances of the same problem. 

According to *Grokking Algorithms* (Chapter 3), every recursive function consists of two essential parts:
1. **Base Case:** The condition under which the function stops calling itself. This prevents infinite loops.
2. **Recursive Case:** The part where the function calls itself to tackle a smaller piece of the problem.

### Example from Grokking Algorithms
Imagine you are looking for a key in a set of nested boxes.
- **Iterative Approach:** You create a pile of boxes to look through. You grab a box and open it. If you find a smaller box, you add it to the pile to check later. If you find a key, you are done! You repeat this until the pile is empty.
- **Recursive Approach:** You open a box. If you find a box inside, you recursively call your "look for key" function on that new box. If you find a key, you are done! 

Recursion is often used when it makes the solution clearer and easier to understand, even though it doesn't necessarily provide a performance benefit over iteration. As the book notes: *"Loops may achieve a performance gain for your program. Recursion may achieve a performance gain for your programmer. Choose which is more important in your situation!"*

---

## The Call Stack
The stack (specifically the call stack) is a crucial data structure to understand when working with recursion. 

When your program calls a function, that function call is added to the top of the call stack, along with all the variables and memory for that function. If that function calls another function, the new function is added on top of the first one. When a function finishes executing, it is "popped" off the stack. The stack uses the **LIFO (Last In, First Out)** principle.

In recursion, every recursive call adds a new frame/layer to the stack:
- The stack saves the state of each partially completed function call.
- If the recursion goes too deep without hitting the base case, the stack keeps growing until the computer runs out of memory, resulting in a **Stack Overflow** error.

---

## Tail Recursion
Tail recursion is a special kind of recursion where the recursive call is the **very last operation** performed in the function. 

Why is this important?
In regular recursion, after the recursive call returns, the function might still need to do some work (like multiplying a number by the result of the recursive call). Therefore, the computer must keep the current state in the call stack.

In **tail recursion**, since there's no more work to do after the recursive call, the compiler or interpreter can optimize the execution. It doesn't need to keep adding new frames to the call stack; it can simply reuse the current frame for the next step. This optimization is called **Tail Call Optimization (TCO)**, and it prevents stack overflow errors even in deep recursive processes. 

*Note: Not all programming languages support tail call optimization. For example, standard Java and Python do not natively support it, whereas languages like C++ and functional languages like Scala or Haskell often do.*

---

## Useful Links
- [GeeksforGeeks: Tail Recursion](https://www.geeksforgeeks.org/dsa/tail-recursion/)
- [Wikipedia: Tail call](https://en.wikipedia.org/wiki/Tail_call)
- [YouTube: Tail Recursion Explained](https://www.youtube.com/watch?v=mfkOjhZmkRk)
- [LeetCode: N-th Tribonacci Number - Tail Recursive Solution in Python](https://leetcode.com/problems/n-th-tribonacci-number/solutions/3225721/tail-recursive-solution-in-python/)

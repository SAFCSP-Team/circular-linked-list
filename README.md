# Circular linked list

### Objective

In this project, our main goal will be to understand the fundamentals of a circular linked list, and their operations.

### Concepts

Use the provided resources for a better understanding.

|Concept|	Resources|
|-------|----------|
|What is a circular linked list|[Introduction to Circular Linked List](https://www.youtube.com/watch?v=HMkdlu5sP4A&t=185s)|
|Inserting node at the end|[Insert node of a circular singly linked list](https://www.youtube.com/watch?v=kErHUGvFrNg)|
|Circular linked list implementation|[Creation and Display](https://www.youtube.com/watch?v=fmfx1C4TTxw)|

### Problem
Create an `add()` method to add to the `CircularLinkedList` class and a `display()` method to print the data values.

### Implementation

In the `add()` method follow the provided steps:
* It first checks if the head is null. If it is, the new node becomes both the head and tail of the list and its next reference is set to itself.
* If the head is not null, the new node is added at the end of the list by updating the tail's next reference to the new node, and the new node becomes the new 
  tail.
* The circularity of the list is maintained by making the tail's next reference point back to the head.
  
In the `display()` method follow the provided steps:
* It checks if the head is null. If it is, it prints a message indicating that the list is empty.
* If the head is not null, it creates a new node called current and initializes it to the head.
* It then loops through the list, printing the data of each node pointed to by the current node, until the current node points back to the head.

```java
public class CreateList {
   public Node head = null;  
   public Node tail = null;   
 /* your code here */
}

```

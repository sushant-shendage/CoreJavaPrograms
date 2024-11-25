// package javapgms.collection.collectionHirarchy;

import java.util.ArrayList;
import java.util.List;

public class Driver1 {
    public static void main(String[] args) {

        // non-generic array list
        List firstList = new ArrayList();
        firstList.add('c');
        firstList.add("demoString");
        firstList.add(132434534);
        firstList.add(132434534l);
        firstList.add(132434.534f);
        firstList.add(new String("string using string class"));
        firstList.add(new int[5]);

        System.out.println(firstList);

        // generic array list
        List<Integer> genericArrList = new ArrayList<>();
        genericArrList.add(45);
        genericArrList.add(45);
        genericArrList.add(45);
        genericArrList.add(45);
        genericArrList.add(45);

        System.out.println(genericArrList);
        // ------------------------------------------------------------------------------------------
        ArrayList fruits = new ArrayList();

        fruits.add("fruit1");
        fruits.add("fruit2");
        fruits.add("fruit3");
        fruits.add("fruit4");
        System.out.println(fruits);
        fruits.add(0,"fruit22");
        System.out.println(fruits);

        // ------------------------------------------------------------------------------------------
        ArrayList fruits2 = new ArrayList();
        fruits2.add("fruit98");
        fruits2.add("fruit76");
        System.out.println(fruits2);
        fruits2.addAll(fruits);
        System.out.println(fruits2);
        //collection framework consist of collection interface,map interface and iterator interface
        //list:when i want to store data in contigious manner,i am allowed to have multiple null values and duplicate values
        //set:i will use this datastructure ehen i want to store only unique data
        //queue:when i want to fetch element prioritywise,i can able to assign pririty then i will prefer queue data structure




        /* 
        - **List**  
  - Interface: `List`  
    - Implementing Classes:  
      - `ArrayList`  
        - **Methods Present**:  
          - `add(E e)` – Adds an element to the list.  
          - `get(int index)` – Retrieves an element at a specified index.  
          - `set(int index, E element)` – Replaces an element at a specified index.  
          - `remove(int index)` – Removes an element at the specified index.  
          - `size()` – Returns the number of elements in the list.  
          - `clear()` – Removes all elements from the list.  
        - **Constructors Present**:  
          - `ArrayList()` – Creates an empty list with the default initial capacity.  
          - `ArrayList(int initialCapacity)` – Creates a list with the specified initial capacity.  
          - `ArrayList(Collection<? extends E> c)` – Creates a list containing the elements of the specified collection.  

      - `LinkedList`  
        - **Methods Present**:  
          - `add(E e)` – Adds an element to the list.  
          - `get(int index)` – Retrieves an element at a specified index.  
          - `remove(int index)` – Removes an element at the specified index.  
          - `addFirst(E e)` – Adds an element at the beginning of the list.  
          - `addLast(E e)` – Adds an element at the end of the list.  
          - `peek()` – Retrieves, but does not remove, the first element.  
        - **Constructors Present**:  
          - `LinkedList()` – Creates an empty list.  
          - `LinkedList(Collection<? extends E> c)` – Creates a list containing the elements of the specified collection.  

      - `Vector`  
        - **Methods Present**:  
          - `add(E e)` – Adds an element to the vector.  
          - `get(int index)` – Retrieves an element at a specified index.  
          - `set(int index, E element)` – Replaces an element at a specified index.  
          - `remove(int index)` – Removes an element at the specified index.  
          - `capacity()` – Returns the current capacity of the vector.  
        - **Constructors Present**:  
          - `Vector()` – Creates an empty vector with the default initial capacity.  
          - `Vector(int initialCapacity)` – Creates a vector with the specified initial capacity.  
          - `Vector(int initialCapacity, int capacityIncrement)` – Creates a vector with the specified initial capacity and capacity increment.  

      - `Stack`  
        - **Methods Present**:  
          - `push(E item)` – Pushes an element onto the stack.  
          - `pop()` – Pops the top element from the stack.  
          - `peek()` – Retrieves, but does not remove, the top element.  
          - `empty()` – Checks if the stack is empty.  
        - **Constructors Present**:  
          - `Stack()` – Creates an empty stack.  

- **Set**  
  - Interface: `Set`  
    - Implementing Classes:  
      - `HashSet`  
        - **Methods Present**:  
          - `add(E e)` – Adds an element to the set.  
          - `remove(Object o)` – Removes the specified element.  
          - `contains(Object o)` – Checks if an element is in the set.  
          - `size()` – Returns the number of elements in the set.  
        - **Constructors Present**:  
          - `HashSet()` – Creates an empty set.  
          - `HashSet(int initialCapacity)` – Creates a set with a specified initial capacity.  
          - `HashSet(int initialCapacity, float loadFactor)` – Creates a set with a specified initial capacity and load factor.  
          - `HashSet(Collection<? extends E> c)` – Creates a set containing the elements of the specified collection.  

      - `LinkedHashSet`  
        - **Methods Present**:  
          - `add(E e)` – Adds an element to the set.  
          - `remove(Object o)` – Removes the specified element.  
          - `contains(Object o)` – Checks if an element is in the set.  
          - `size()` – Returns the number of elements in the set.  
        - **Constructors Present**:  
          - `LinkedHashSet()` – Creates an empty set that maintains insertion order.  
          - `LinkedHashSet(int initialCapacity)` – Creates a set with a specified initial capacity.  
          - `LinkedHashSet(int initialCapacity, float loadFactor)` – Creates a set with a specified initial capacity and load factor.  
          - `LinkedHashSet(Collection<? extends E> c)` – Creates a set containing the elements of the specified collection.  

      - `TreeSet`  
        - **Methods Present**:  
          - `add(E e)` – Adds an element to the set.  
          - `remove(Object o)` – Removes the specified element.  
          - `contains(Object o)` – Checks if an element is in the set.  
          - `size()` – Returns the number of elements in the set.  
          - `first()` – Returns the first (smallest) element.  
          - `last()` – Returns the last (largest) element.  
        - **Constructors Present**:  
          - `TreeSet()` – Creates an empty set with elements sorted by their natural order.  
          - `TreeSet(Comparator<? super E> comparator)` – Creates a set with elements sorted by a specified comparator.  
          - `TreeSet(Collection<? extends E> c)` – Creates a set containing the elements of the specified collection.  

  - Interface: `NavigableSet`  
    - Implementing Classes:  
      - `TreeSet`  
        - **Methods Present**:  
          - `lower(E e)` – Returns the greatest element less than the specified element.  
          - `floor(E e)` – Returns the greatest element less than or equal to the specified element.  
          - `ceiling(E e)` – Returns the least element greater than or equal to the specified element.  
          - `higher(E e)` – Returns the least element greater than the specified element.  
        - **Constructors Present**:  
          - `TreeSet()` – Creates an empty sorted set.  
          - `TreeSet(Comparator<? super E> comparator)` – Creates a sorted set with elements ordered by the specified comparator.  

- **Queue**  
  - Interface: `Queue`  
    - Implementing Classes:  
      - `LinkedList`  
        - **Methods Present**:  
          - `add(E e)` – Adds an element to the queue.  
          - `offer(E e)` – Adds an element to the queue (returns false if the queue is full).  
          - `remove()` – Removes and returns the first element in the queue.  
          - `poll()` – Removes and returns the first element (returns null if the queue is empty).  
          - `peek()` – Retrieves, but does not remove, the first element.  
        - **Constructors Present**:  
          - `LinkedList()` – Creates an empty queue.  
          - `LinkedList(Collection<? extends E> c)` – Creates a queue containing the elements of the specified collection.  

      - `PriorityQueue`  
        - **Methods Present**:  
          - `add(E e)` – Adds an element to the queue.  
          - `offer(E e)` – Adds an element to the queue.  
          - `poll()` – Retrieves and removes the highest-priority element.  
          - `peek()` – Retrieves, but does not remove, the highest-priority element.  
        - **Constructors Present**:  
          - `PriorityQueue()` – Creates an empty priority queue.  
          - `PriorityQueue(int initialCapacity)` – Creates a priority queue with a specified initial capacity.  
          - `PriorityQueue(Collection<? extends E> c)` – Creates a priority queue containing the elements of the specified collection.  
          - `PriorityQueue(int initialCapacity, Comparator<? super E> comparator)` – Creates a priority queue with a specified initial capacity and comparator.  

      - `ArrayDeque`  
        - **Methods Present**:  
          - `add(E e)` – Adds an element to the deque.  
          - `offer(E e)` – Adds an element to the deque (returns false if the deque is full).  
          - `remove()` – Removes and returns the first element in the deque.  
          - `poll()` – Removes and returns the first element (returns null if the deque is empty).  
          - `peek()` – Retrieves, but does not remove, the first element.  
        - **Constructors Present**:  
          - `ArrayDeque()` – Creates an empty deque.  
          - `ArrayDeque(int initialCapacity)` – Creates a deque with a specified initial capacity.  

- **Deque**  
  - Interface: `Deque`  
    - Implementing Classes:  
      - `LinkedList`  
        - **Methods Present**:  
          - `addFirst(E e)` – Adds an element at the beginning of the deque.  
          - `addLast(E e)` – Adds an element at the end of the deque.  
          - `removeFirst()` – Removes the first element of the deque.  
          - `removeLast()` – Removes the last element of the deque.  
          - `peekFirst()` – Retrieves the first element.  
          - `peekLast()` – Retrieves the last element.  
        - **Constructors Present**:  
          - `LinkedList()` – Creates an empty deque
          ------------------------------------------------------------------------------------------------- 

Here's the updated nested list with added details for `Comparable`, `Comparator` interfaces, `Collections`, `Arrays` classes, and classes related to strings:  

---

- **Comparable Interface**  
  - **Features**:  
    - Provides a single method `compareTo` for natural ordering of objects.  
    - Can be implemented by a class to define the natural ordering of its instances.  
  - **Methods Present**:  
    - `compareTo(T o)` – Compares the current object with the specified object for order.  
      - **When to use**: Use it when the natural order of objects is required (e.g., sorting objects in a list).  

---

- **Comparator Interface**  
  - **Features**:  
    - Provides a way to define custom orderings for objects.  
    - Supports multiple criteria for comparison.  
  - **Methods Present**:  
    - `compare(T o1, T o2)` – Compares two objects for order.  
    - `reversed()` – Returns a comparator that imposes the reverse order.  
    - `thenComparing(Comparator<? super T> other)` – Combines this comparator with another.  
      - **When to use**: Use it for custom orderings or when sorting needs to be dynamic and based on runtime conditions.  

---

- **Collections Class**  
  - **Features**:  
    - A utility class with static methods to operate on collections.  
    - Provides algorithms like sorting, searching, and shuffling.  
  - **Methods Present**:  
    - `sort(List<T> list)` – Sorts the list in natural order.  
    - `binarySearch(List<? extends Comparable<? super T>> list, T key)` – Searches for the key in the sorted list.  
    - `reverse(List<?> list)` – Reverses the order of elements in the list.  
    - `shuffle(List<?> list)` – Randomly permutes the elements of the list.  
    - `unmodifiableList(List<? extends T> list)` – Returns an unmodifiable view of the list.  
      - **When to use**: Use it to manipulate or query collections efficiently.  

---

- **Arrays Class**  
  - **Features**:  
    - A utility class for array manipulation (e.g., sorting, searching).  
    - Provides methods to work with arrays of primitive and object types.  
  - **Methods Present**:  
    - `sort(int[] a)` – Sorts the array of integers in ascending order.  
    - `binarySearch(int[] a, int key)` – Searches for the key in the sorted array.  
    - `copyOf(int[] original, int newLength)` – Copies the array to a new array of specified length.  
    - `equals(int[] a, int[] b)` – Checks if two arrays are equal.  
    - `fill(int[] a, int val)` – Fills the array with the specified value.  
      - **When to use**: Use it for efficient operations on arrays, especially when working with large data sets.  

---

- **Classes Related to Strings**  
  - **String**  
    - **Features**:  
      - Immutable sequence of characters.  
      - Supports string manipulation with a rich set of methods.  
    - **Methods Present**:  
      - `charAt(int index)` – Returns the character at the specified index.  
      - `length()` – Returns the length of the string.  
      - `substring(int beginIndex, int endIndex)` – Extracts a substring.  
      - `toLowerCase()` – Converts the string to lowercase.  
      - `toUpperCase()` – Converts the string to uppercase.  
      - **When to use**: Use it for immutable string operations like parsing, formatting, and searching.  
    - **Constructors Present**:  
      - `String()` – Creates an empty string.  
      - `String(char[] value)` – Creates a string from a character array.  
      - `String(String original)` – Creates a new string that is a copy of the original.  

  - **StringBuilder**  
    - **Features**:  
      - Mutable sequence of characters.  
      - Suitable for string manipulation where performance is critical.  
    - **Methods Present**:  
      - `append(String str)` – Appends a string to the sequence.  
      - `insert(int offset, String str)` – Inserts a string at the specified position.  
      - `delete(int start, int end)` – Removes characters between start and end.  
      - `reverse()` – Reverses the sequence of characters.  
      - **When to use**: Use it for efficient string modification, especially in loops.  
    - **Constructors Present**:  
      - `StringBuilder()` – Creates an empty string builder with an initial capacity of 16.  
      - `StringBuilder(String str)` – Creates a string builder initialized with the specified string.  

  - **StringBuffer**  
    - **Features**:  
      - Thread-safe mutable sequence of characters.  
      - Similar to `StringBuilder`, but synchronized for multi-threaded environments.  
    - **Methods Present**:  
      - `append(String str)` – Appends a string to the sequence.  
      - `insert(int offset, String str)` – Inserts a string at the specified position.  
      - `delete(int start, int end)` – Removes characters between start and end.  
      - `reverse()` – Reverses the sequence of characters.  
      - **When to use**: Use it for string manipulation in a multi-threaded context.  
    - **Constructors Present**:  
      - `StringBuffer()` – Creates an empty string buffer with an initial capacity of 16.  
      - `StringBuffer(String str)` – Creates a string buffer initialized with the specified string.  

--------------------------------------------------------------------------------------------------------------
- **List**  
  - Interface: `List`  
    - Implementing Classes:  
      - `ArrayList`  
        - **Features**:  
          - Dynamic resizing  
          - Fast random access by index  
          - Not thread-safe  
      - `LinkedList`  
        - **Features**:  
          - Doubly linked list implementation  
          - Fast insertions and deletions at both ends  
          - Slower random access compared to `ArrayList`  
      - `Vector`  
        - **Features**:  
          - Synchronized (thread-safe)  
          - Dynamic resizing  
          - Slower compared to `ArrayList` due to synchronization  
      - `Stack`  
        - **Features**:  
          - Extends `Vector`  
          - Implements Last In First Out (LIFO) principle  
          - Methods like `push()`, `pop()`, and `peek()` for stack operations  

- **Set**  
  - Interface: `Set`  
    - Implementing Classes:  
      - `HashSet`  
        - **Features**:  
          - No duplicates allowed  
          - Does not guarantee any specific order of elements  
          - Fast operations (constant-time performance) for add, remove, contains  
      - `LinkedHashSet`  
        - **Features**:  
          - No duplicates allowed  
          - Maintains the order of insertion  
          - Slightly slower than `HashSet` due to maintaining order  
  - Interface: `SortedSet`  
    - Implementing Classes:  
      - `TreeSet`  
        - **Features**:  
          - Elements are ordered by their natural order or by a comparator  
          - No duplicates allowed  
          - Slower than `HashSet` for add, remove, and contains due to sorting  
  - Interface: `NavigableSet`  
    - Implementing Classes:  
      - `TreeSet`  
        - **Features**:  
          - Supports navigation methods like `lower()`, `floor()`, `ceiling()`, `higher()`  
          - Provides sorted elements with additional navigation functionality  

- **Queue**  
  - Interface: `Queue`  
    - Implementing Classes:  
      - `LinkedList`  
        - **Features**:  
          - Supports both queue and deque operations  
          - Efficient insertion and deletion at both ends  
          - Not thread-safe  
      - `PriorityQueue`  
        - **Features**:  
          - Elements are ordered by their natural order or by a comparator  
          - Does not guarantee FIFO order; based on priority  
          - Not thread-safe  
      - `ArrayDeque`  
        - **Features**:  
          - Resizable array-based queue  
          - Fast insertion and removal from both ends  
          - Not thread-safe  

- **Deque**  
  - Interface: `Deque`  
    - Implementing Classes:  
      - `LinkedList`  
        - **Features**:  
          - Supports both queue and deque operations  
          - Allows fast insertion and deletion at both ends  
          - Not thread-safe  
      - `ArrayDeque`  
        - **Features**:  
          - Array-based implementation  
          - Fast insertion and removal from both ends  
          - Does not have a capacity limitation like `ArrayList`  

- **Map**  
  - Interface: `Map`  
    - Implementing Classes:  
      - `HashMap`  
        - **Features**:  
          - Key-value pairs (unique keys)  
          - No order is guaranteed for the elements  
          - Fast operations for insert, delete, and lookup  
      - `LinkedHashMap`  
        - **Features**:  
          - Key-value pairs (unique keys)  
          - Maintains insertion order  
          - Slightly slower than `HashMap` due to maintaining order  
      - `IdentityHashMap`  
        - **Features**:  
          - Compares keys using reference equality (not object equality)  
          - Suitable for comparing objects based on memory references  
      - `WeakHashMap`  
        - **Features**:  
          - Keys are weakly referenced, meaning they are automatically removed when no longer in use  
          - Suitable for caching and situations where keys are no longer needed  
      - `Hashtable`  
        - **Features**:  
          - Synchronized (thread-safe)  
          - Slower than `HashMap` due to synchronization  
  - Interface: `SortedMap`  
    - Implementing Classes:  
      - `TreeMap`  
        - **Features**:  
          - Elements are sorted by their natural order or by a comparator  
          - Provides methods like `firstKey()`, `lastKey()` for range-based queries  
  - Interface: `NavigableMap`  
    - Implementing Classes:  
      - `TreeMap`  
        - **Features**:  
          - Provides additional navigation methods like `lowerKey()`, `floorKey()`, `ceilingKey()`, `higherKey()`  
          - Sorted and supports key-based navigation 

---------------------------------------------------------------------------------------------------------------------
Here’s the hierarchical structure of the Java Collection Framework with interfaces, sub-interfaces, and their implementing classes, excluding the constructor and method details:

---

- **Collection Interface**  
  - The root interface in the collection framework.
  - **Sub-Interfaces**:  
    - **Set Interface**  
      - Represents a collection of unique elements.  
      - **Implementing Classes**:  
        - `HashSet`  
        - `LinkedHashSet`  
        - `TreeSet`  
    - **List Interface**  
      - An ordered collection that allows duplicate elements.  
      - **Implementing Classes**:  
        - `ArrayList`  
        - `LinkedList`  
        - `Vector`  
    - **Queue Interface**  
      - A collection used to hold elements prior to processing.  
      - **Sub-Interfaces**:  
        - **Deque Interface**  
          - A double-ended queue that allows elements to be added or removed from both ends.  
          - **Implementing Classes**:  
            - `ArrayDeque`  
        - **Implementing Classes**:  
          - `PriorityQueue`  
    - **Map Interface**  
      - Represents a collection of key-value pairs.  
      - **Sub-Interfaces**:  
        - **SortedMap Interface**  
          - A map that maintains the keys in a sorted order.  
          - **Implementing Classes**:  
            - `TreeMap`  
        - **Implementing Classes**:  
          - `HashMap`  
          - `LinkedHashMap`  

---

### Utility Classes:

- **Collections Class**  
  - Provides static methods to operate on or return collections.  

- **Arrays Class**  
  - Provides static methods to manipulate arrays.  

---

### Specialized Collections:

- **NavigableMap Interface**  
  - Extends `SortedMap` to provide navigation methods.  
  - **Implementing Class**:  
    - `TreeMap` (also implements `SortedMap`).  

- **NavigableSet Interface**  
  - Extends `SortedSet` to provide navigation methods.  
  - **Implementing Class**:  
    - `TreeSet` (also implements `SortedSet`).  

---

This structure now only includes the interfaces, sub-interfaces, and the implementing classes, excluding method and constructor details. Let me know if you'd like further modifications!
------------------------------------------------------------------------------------------------------------------
Constructor recursion refers to a scenario where a constructor calls itself, directly or indirectly, leading to repeated invocations. Here's a short explanation:

- **Constructor recursion** occurs when a constructor calls itself either directly or indirectly.
- It typically happens if the constructor is used within another constructor of the same class or through an inheritance chain.
- **Direct recursion** happens when the constructor calls itself.
- **Indirect recursion** occurs if the constructor calls another method or constructor, which eventually leads to the same constructor being called again.
- **Risk of infinite loop**: Without proper base conditions, constructor recursion can lead to infinite loops or stack overflow errors.
- **Usage**: It’s rarely used in practice but can be employed to initialize objects in specific cases, such as in default constructor delegation.

This concept is generally avoided unless there’s a strong design requirement.
        */
        
        
        
        
        


    }
}

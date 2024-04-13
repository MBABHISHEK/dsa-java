# Java Collections Overview

## ArrayList
- `add(E e)`: Adds an element to the end of the list.
- `get(int index)`: Retrieves the element at the specified index.
- `remove(int index)`: Removes the element at the specified index.
- `size()`: Returns the number of elements in the list.
- `isEmpty()`: Checks if the list is empty.
- `clear()`: Removes all elements from the list.
- Sorting:
  - `sort(Comparator<? super E> c)`: Sorts this list according to the order induced by the specified comparator.

## LinkedList
- `add(E e)`: Adds an element to the end of the list.
- `addFirst(E e)`, `addLast(E e)`: Adds an element to the beginning or end of the list.
- `get(int index)`: Retrieves the element at the specified index.
- `remove(int index)`: Removes the element at the specified index.
- `size()`: Returns the number of elements in the list.
- `isEmpty()`: Checks if the list is empty.
- `clear()`: Removes all elements from the list.
- Sorting:
  - `sort(Comparator<? super E> c)`: Sorts this list according to the order induced by the specified comparator.

## HashSet
- `add(E e)`: Adds the specified element to the set if it is not already present.
- `contains(Object o)`: Returns true if this set contains the specified element.
- `remove(Object o)`: Removes the specified element from the set if it is present.
- `size()`: Returns the number of elements in the set.
- `isEmpty()`: Checks if the set is empty.
- `clear()`: Removes all elements from the set.

## HashMap
- `put(K key, V value)`: Associates the specified value with the specified key in the map.
- `get(Object key)`: Returns the value to which the specified key is mapped, or null if this map contains no mapping for the key.
- `containsKey(Object key)`: Returns true if this map contains a mapping for the specified key.
- `containsValue(Object value)`: Returns true if this map maps one or more keys to the specified value.
- `remove(Object key)`: Removes the mapping for the specified key from the map if present.
- `size()`: Returns the number of key-value mappings in the map.
- `isEmpty()`: Checks if the map is empty.
- `clear()`: Removes all mappings from the map.
- Sorting:
  - Sorting is not directly applicable to HashMap as it's based on key-value pairs.

## TreeSet
- `add(E e)`: Adds the specified element to the set if it is not already present.
- `contains(Object o)`: Returns true if this set contains the specified element.
- `remove(Object o)`: Removes the specified element from the set if it is present.
- `size()`: Returns the number of elements in the set.
- `isEmpty()`: Checks if the set is empty.
- `clear()`: Removes all elements from the set.
- `first()`: Returns the first (lowest) element currently in the set.
- `last()`: Returns the last (highest) element currently in the set.

## TreeMap
- `put(K key, V value)`: Associates the specified value with the specified key in the map.
- `get(Object key)`: Returns the value to which the specified key is mapped, or null if this map contains no mapping for the key.
- `containsKey(Object key)`: Returns true if this map contains a mapping for the specified key.
- `containsValue(Object value)`: Returns true if this map maps one or more keys to the specified value.
- `remove(Object key)`: Removes the mapping for the specified key from the map if present.
- `size()`: Returns the number of key-value mappings in the map.
- `isEmpty()`: Checks if the map is empty.
- `clear()`: Removes all mappings from the map.
- `firstKey()`: Returns the first (lowest) key currently in the map.
- `lastKey()`: Returns the last (highest) key currently in the map.
- Sorting:
  - Sorting is not directly applicable to TreeMap as it's based on key-value pairs.

## PriorityQueue
- `add(E e)`: Inserts the specified element into this priority queue.
- `peek()`: Retrieves, but does not remove, the head of this queue, or returns null if this queue is empty.
- `poll()`: Retrieves and removes the head of this queue, or returns null if this queue is empty.
- `size()`: Returns the number of elements in the priority queue.
- `isEmpty()`: Checks if the priority queue is empty.
- `clear()`: Removes all elements from the priority queue.
- Sorting:
  - Priority queue sorts elements based on their natural ordering or the ordering specified by the provided comparator during initialization.

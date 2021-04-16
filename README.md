# Java Interview Prep
This repository is a collection of Java projects for brushing up on Data Structures and Algorithms.

## 👋 Hello 👋
If you found this work to be helpful and would like support me, please consider getting me a ☕ ko-fi :)

## We Used Generics
The custom Data Structure and Algorithm Java classes are written with Generics. 
A Java class with Generics has a parameterized type which allows that Java class to use a different data type. 

Example: The Java List class uses Generics to allow us to define a list of different Data Types. 
```Java:
List<String> listOfStrings = new ArrayList<>();
List<Integer> listOfIntegers = new ArrayList<>();
```

## Repository Overview
### Incomplete - Use the below to implement your own solutions.
#### 🎯 \[[custom-data-structure](https://github.com/yuelchen/java-interview-prep/tree/main/custom-data-structure)\]/
- Queue
- Stack 
- HashSet
- HashMap
- Singly LinkedList
- Doubly LinkedList
- Circular Singly LinkedList
- Circular Doubly LinkedList
- Directed Graph
- Undirected Graph
- Binary Search Tree
- Binary Min Heap
- Binary Max Heap

#### 🎯 \[[practice-algorithms](https://github.com/yuelchen/java-interview-prep/tree/main/practice-algorithms)\]/
- Linear Search 
- Binary Search
- Selection Sort
- Insertion Sort
- Quick Sort
- Merge Sort

### Completed - Use the below as reference and review. 
#### 🎯 \[[custom-data-structure \[complete\]](https://github.com/yuelchen/java-interview-prep/tree/main/custom-data-structure%20%5Bcomplete%5D)\]/
#### 🎯 \[[practice-algorithms \[complete\]](https://github.com/yuelchen/java-interview-prep/tree/main/practice-algorithms%20%5Bcomplete%5D)\]/

## Data Structures in Big O Notation
| Data Structure | Add/Insert | Remove/Delete | Access/Get | Search/Contains | Space Complexity |
| --- | --- | --- | --- | --- | --- |
| Array | ```O(n)``` | ```O(n)``` | ```O(1)``` | ```O(n)``` | ```O(n)``` |
| Queue | ```O(1)``` | ```O(1)``` | ```O(n)``` | ```O(n)``` | ```O(n)``` |
| Stack | ```O(1)``` | ```O(1)``` | ```O(n)``` | ```O(n)``` | ```O(n)``` |
| HashSet | ```O(1)``` | ```O(1)``` | - | ```O(1)``` | ```O(n)``` |
| HashMap | ```O(1)``` | ```O(1)``` | ```O(1)``` | ```O(1)``` | ```O(n)``` |
| Singly LinkedList | ```O(1)``` | ```O(1)``` | ```O(n)``` | ```O(n)``` | ```O(n)``` |
| Doubly LinkedList | ```O(1)``` | ```O(1)``` | ```O(n)``` | ```O(n)``` | ```O(n)``` |
| Circular Singly LinkedList | ```O(1)``` | ```O(1)``` | ```O(n)``` | ```O(n)``` | ```O(n)``` |
| Circular Doubly LinkedList | ```O(1)``` | ```O(1)``` | ```O(n)``` | ```O(n)``` | ```O(n)``` |
| Binary Search Tree | ```O(log n)``` | ```O(log n)``` | ```O(log n)``` | ```O(log n)``` | ```O(n)``` |
| Binary Min Heap | ```O(log n)``` | ```O(log n)``` | ```O(1)``` | ```O(n)``` | ```O(n)``` |
| Binary Max Heap | ```O(log n)``` | ```O(log n)``` | ```O(1)``` | ```O(n)``` | ```O(n)``` |

## Sorting Algorithm in Big O Notiation
| Sort Algorithm | Best | Average | Worst | Space Complexity |
| --- | --- | --- | --- | --- |
| Selection Sort | ```O(n^2)``` | ```O(n^2)``` | ```O(n^2)``` | ```O(1)``` |
| Insertion Sort | ```O(n)``` | ```O(n^2)``` | ```O(n^2)``` | ```O(1)``` |
| Quick Sort | ```O(log n)``` | ```O(log n)``` | ```O(n^2)``` | ```O(log n)``` |
| Merge Sort | ```O(log n)``` | ```O(log n)``` | ```O(log n)``` | ```O(n)``` |

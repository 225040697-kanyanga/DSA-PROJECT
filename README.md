# DSA521S Group Mini-Project 2026

## Project Overview

This repository contains the **DSA521S Group Mini-Project 2026**, implemented in **Java**. Submitted by: 225034581 – Uusiku Bonifatius

The project demonstrates the use and implementation of fundamental data structures, searching, sorting algorithms, and an integrated student service system.

The implementation follows the project requirement that the required data structures and sorting algorithms are implemented by the students rather than replaced by Java built-in collection classes or built-in sorting methods.

## Project Requirements Covered

### Part A — Data Structures

The project demonstrates:

- **Queue**
  - `enqueue()`
  - `dequeue()`
  - `peek()`
  - `isEmpty()`
  - `displayQueue()`
  - Demonstration of at least six student arrivals and three students being served.

- **Singly Linked List**
  - Insert at the beginning
  - Insert at the end
  - Insert at a specified position
  - Search for a student
  - Delete a student
  - Display/traverse student records
  - Each node stores student information and a `next` reference.

- **Stack / Postfix Evaluation**
  - `push()`
  - `pop()`
  - `peek()`
  - Arithmetic operators: `+`, `-`, `*`, `/`
  - Example postfix expression: `5 3 + 2 *`, which evaluates to `16`.

- **Array Statistics**
  - Total
  - Average
  - Highest value
  - Lowest value
  - Count of values greater than 10
  - The calculations are performed without using built-in `sum`, `max`, or `min` methods.

### Part B — Sorting Algorithms

The project implements the required sorting algorithms:

1. Selection Sort
2. Insertion Sort
3. Merge Sort
4. Quick Sort

The required test array is:

```text
[17, 5, 23, 8, 14, 3, 11, 20, 6, 9]
```

The sorting section includes traces/steps and comparison information.

### Part C — Algorithm Experiment

The sorting algorithms are experimentally compared using input sizes:

- 20
- 50
- 100
- 500

An additional **almost-sorted array of size 100** is also tested.

The experiment records:

- Number of comparisons
- Execution time in nanoseconds

The same base data is copied for the different algorithms so that the algorithms can be compared using the same input.

### Part D — Integrated System

The project combines the data structures and algorithms into a student service management system.

The main menu provides functionality for:

1. Add student to waiting queue
2. Serve next student
3. Display waiting students
4. Add student service record
5. Display student service records
6. Search for a student record
7. Remove a student record
8. Display daily statistics
9. Sort service times
10. Run sorting experiment
11. Exit

The singly linked list used for student service records is also reused as required by the project.

### Part E — Pseudocode

The project documentation includes pseudocode for the required algorithms and data-structure operations, including:

- Queue operations
- Linked-list operations
- Stack/postfix evaluation
- Array statistics
- Selection Sort
- Insertion Sort
- Merge Sort
- Quick Sort

## Repository Structure

Important source files include:

| File | Purpose |
|---|---|
| `Main.java` | Main integrated student service system and menu |
| `Student.java` | Student data model |
| `StudentQueue.java` | Array-based student queue |
| `Node.java` | Linked-list node |
| `StudentLinkedList.java` | Singly linked list implementation |
| `IntStack.java` | Integer stack implementation |
| `PostfixEvaluator.java` | Postfix expression evaluation |
| `DailyStatisticsArray.java` | Array statistics calculations |
| `SelectionSort.java` | Selection Sort implementation |
| `InsertionSort.java` | Insertion Sort implementation |
| `MergeSort.java` | Merge Sort implementation |
| `QuickSort.java` | Quick Sort implementation |
| `SortingExperiment.java` | Sorting performance experiments |
| `Demo.java` | Demonstration/testing code |
| `merge_sort.java` | Additional Merge Sort source |

## Technologies

- **Language:** Java
- **Development Environment:** Visual Studio Code / Java development environment
- **Version Control:** Git and GitHub

## How to Run

1. Clone the repository:

```bash
git clone https://github.com/225040697-kanyanga/DSA-PROJECT.git
```

2. Open the project folder in a Java-compatible IDE such as Visual Studio Code.

3. Compile the Java source files.

4. Run:

```text
Main.java
```

5. Use the displayed menu to test the student queue, linked list, statistics, sorting and experiment features.

## Sorting Algorithms

### Selection Sort

Selection Sort repeatedly finds the smallest remaining element and places it in its correct position.

### Insertion Sort

Insertion Sort builds the sorted portion of the array one element at a time by shifting larger elements and inserting the current value.

### Merge Sort

Merge Sort divides the array into smaller subarrays, recursively sorts them, and merges the sorted portions.

### Quick Sort

Quick Sort partitions the array around a pivot and recursively sorts the resulting subarrays.

## Data Structures Used

The project uses:

- Arrays
- Queue
- Singly linked list
- Stack

Each structure is used for a purpose appropriate to the student service system or the required independent exercise.

## Team Members

| Student Number | Name |
|---|---|
| 225031248 | Kristoph Ndilinawa |
| 225091100 | Simeon Endjala |
| 225040697 | Kanyanga Atouhiele |
| 223053376 | Junior Mupetami |
| 225034581 | Uusiku Bonifatius |

## Repository

GitHub repository:

https://github.com/225040697-kanyanga/DSA-PROJECT

## Academic Project

**Course:** DSA521S  
**Project:** Group Mini-Project 2026  
**Due Date:** 25 September 2026 at 23:59

This README provides an overview of the project, its required components, source files, algorithms, data structures, and instructions for running the Java application.

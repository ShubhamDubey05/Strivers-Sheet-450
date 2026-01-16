# 🔁 Cyclic Sort – Complete Guide (Theory + Code + Interview)

## 📌 What is Cyclic Sort?
Cyclic Sort is a **special-purpose sorting algorithm** used when array elements are in a **known continuous range**, typically `1 to N`.  
It works by placing each element **directly at its correct index**, instead of comparing all elements.

---

## 🧠 Core Idea
For elements from **1 to N**:

Correct index of element `x`:


If an element is not at its correct index, **swap it** with the element at that index.  
Each element moves to its correct position **at most once**, making it **O(n) time**.

---

## 📘 Example

### Input
[3, 5, 2, 1, 4]


### Steps
1. 3 → index 2 → swap  
2. 2 → index 1 → swap  
3. 5 → index 4 → swap  
4. 4 → index 3 → swap  
5. 1 → index 0 → correct  

### Output
[1, 2, 3, 4, 5]


---

## ⚙️ Algorithm Steps
1. Start at index `i = 0`  
2. Calculate correct index = `arr[i] - 1`  
3. If `arr[i]` ≠ `arr[correctIndex]` → swap  
4. Else → increment `i`  
5. Repeat until array is sorted  

---




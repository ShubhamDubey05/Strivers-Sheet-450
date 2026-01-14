## 🔹 What is Selection Sort?
Selection Sort is a comparison-based sorting algorithm that repeatedly selects the smallest (or largest) element from the unsorted part of the array and places it at its correct position.

---

## 🔹 How Does Selection Sort Work?
1. Divide the array into sorted and unsorted parts  
2. Find the minimum element from the unsorted part  
3. Swap it with the first unsorted element  
4. Move the boundary of the sorted part  
5. Repeat until the array is sorted  

---

## 🔹 Time Complexity
| Case | Complexity |
|------|------------|
| Best Case | O(n²) |
| Average Case | O(n²) |
| Worst Case | O(n²) |

---

## 🔹 Space Complexity
- **O(1)** (In-place sorting)

---

## 🔹 Is Selection Sort Stable?
❌ No  
Swapping may change the relative order of equal elements.

---

## 🔹 Is Selection Sort In-place?
✅ Yes  
It does not use extra memory.

---

## 🔹 Number of Comparisons
- `n(n - 1) / 2`

---

## 🔹 Number of Swaps
- **n − 1 swaps**

---

## 🔹 Advantages
- Simple and easy to understand  
- Requires minimum swaps  
- Works well for small datasets  

---

## 🔹 Disadvantages
- Inefficient for large datasets  
- Always O(n²)  
- Not stable  

---

## 🔹 Selection Sort vs Bubble Sort
| Feature | Selection Sort | Bubble Sort |
|--------|---------------|-------------|
| Stability | ❌ No | ✅ Yes |
| Swaps | Fewer | More |
| Best Case | O(n²) | O(n) |

---

## 🔹 One-Line Interview Answers
- Selection Sort is **not stable**  
- It is an **in-place** algorithm  
- Time complexity is **O(n²)**  
- Uses **minimum swaps**

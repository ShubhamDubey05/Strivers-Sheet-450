## 🔹 What is Selection Sort?
Selection Sort is a comparison-based sorting algorithm that repeatedly selects the smallest (or largest) element from the unsorted part of the array and places it at its correct position.

---

## 🔹 How Does Selection Sort Work?
      Step-1   Find the minimum or maximum element from the array.
             if maximum element than put at the last index.
             if minimum element than put at the first index.
      Step-2 Reduce the array by one from first or last.
      step-3 Reapet the proces untill array is not sorted.


      Example - 13 , 46,  24, 52 , 20, 9

         Step-1 Find the minimum element from the array   // ele = 9 index = 0.

         Step-2  Swapped the elements minimum index to 0 index  13 to 9 

                9 , 46,  24, 52 , 20, 13.
         Step-3 Reduce the array by one , check the element in only in unsorted array index-1.

         Step-4 Reapet the steps untill array is not sorted //  ele = 13 index = 1;
                 
           After swapping 9 , 13,  24, 52 , 20, 46
          


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

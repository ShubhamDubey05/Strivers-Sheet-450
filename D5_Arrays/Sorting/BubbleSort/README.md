# 📌 Bubble Sort – Interview Questions & Answers

## 1️⃣ What is Bubble Sort?
Bubble Sort is a simple sorting algorithm that repeatedly compares adjacent elements and swaps them if they are in the wrong order.

---

## 2️⃣ Why is it called Bubble Sort?
Because the largest element **“bubbles up”** to the end of the array in each pass.

---

## 3️⃣ Is Bubble Sort stable? Why?
✅ Yes  
Bubble Sort is stable because **equal elements are not swapped**, so their relative order is preserved.

---

## 4️⃣ Is Bubble Sort in-place?
✅ Yes  
Bubble Sort is an in-place algorithm because it does not require extra memory.

---

## 5️⃣ What is the time complexity of Bubble Sort?
- **Best Case:** O(n) → Already sorted array (optimized version)  
- **Average Case:** O(n²)  
- **Worst Case:** O(n²) → Reverse sorted array  

---

## 6️⃣ What is the space complexity of Bubble Sort?
- **O(1)** (constant extra space)

---

## 7️⃣ What is the best case time complexity?
- **O(n)** — when the array is already sorted (optimized Bubble Sort)

---

## 8️⃣ What is the worst case time complexity?
- **O(n²)** — when the array is sorted in reverse order

---

## 9️⃣ What is the average case time complexity?
- **O(n²)**

---

## 🔟 Why is the best case O(n)?
Because in the optimized version, **if no swap occurs in the first pass**, the algorithm stops early.

---

## 1️⃣1️⃣ How do you optimize Bubble Sort?
By using a **swapped flag** to stop the algorithm early if no swaps occur in a pass.

---

## 1️⃣2️⃣ What is the role of the swapped flag?
It checks whether the array is already sorted.

---

## 1️⃣3️⃣ How many passes are required in Bubble Sort?
- **n − 1 passes** in the worst case

---

## 1️⃣4️⃣ When does Bubble Sort perform best?
When the array is **already sorted**.

---

## 1️⃣5️⃣ Why is Bubble Sort not suitable for large datasets?
Because it has **O(n²)** time complexity, which makes it slow for large inputs.

---

## 1️⃣6️⃣ Can Bubble Sort be used in real-world applications?
Rarely. It is mainly used for **educational purposes** or very small datasets.

---

## 1️⃣7️⃣ How many comparisons are made in Bubble Sort?
In the worst case:

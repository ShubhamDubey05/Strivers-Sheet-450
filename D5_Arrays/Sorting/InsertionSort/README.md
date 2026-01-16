# Insertion Sort

## 📌 What is Insertion Sort?

Insertion Sort is a simple and intuitive sorting algorithm that works the way we sort playing cards in our hands. It builds the final sorted array one element at a time by inserting each element into its correct position in the already sorted part.

---

## 🧠 How Insertion Sort Works

1. Assume the first element is already sorted.
2. Pick the next element from the array.
3. Compare it with elements in the sorted part.
4. Shift larger elements one position to the right.
5. Insert the element at its correct position.
6. Repeat until the array is fully sorted.

---

## 🧪 Example

**Input:** `[3, 5, 4, 1, 2]`

Steps:

* `[3]` → already sorted
* Insert `5` → `[3, 5]`
* Insert `4` → `[3, 4, 5]`
* Insert `1` → `[1, 3, 4, 5]`
* Insert `2` → `[1, 2, 3, 4, 5]`

---

## 💻 Java Implementation

```java
static void insertion(int[] arr) {
    for (int i = 0; i < arr.length - 1; i++) {
        for (int j = i + 1; j > 0; j--) {
            if (arr[j] < arr[j - 1]) {
                int temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;
            } else {
                break;
            }
        }
    }
}
```

---

## ⏱️ Time Complexity

* **Best Case:** O(n) → when array is already sorted
* **Average Case:** O(n²)
* **Worst Case:** O(n²) → when array is reverse sorted

## 💾 Space Complexity

* **O(1)** (In-place algorithm)

---

## ✅ Properties of Insertion Sort

* Stable sorting algorithm
* In-place sorting
* Simple to implement
* Efficient for small datasets
* Adaptive (faster for nearly sorted arrays)

---

## ❓ Interview Questions & Answers

### 1. What is Insertion Sort?

Insertion Sort is a comparison-based sorting algorithm that inserts each element into its correct position in a sorted part of the array.

### 2. Why is it called Insertion Sort?

Because elements are inserted into their correct position just like inserting cards in a sorted hand.

### 3. Is Insertion Sort stable?

Yes, it is stable because it does not change the relative order of equal elements.

### 4. Is Insertion Sort an in-place algorithm?

Yes, it requires only constant extra space.

### 5. What is the best case time complexity?

O(n), when the array is already sorted.

### 6. What is the worst case time complexity?

O(n²), when the array is sorted in reverse order.

### 7. When should we use Insertion Sort?

* When the dataset is small
* When the array is nearly sorted
* When memory usage must be minimal

### 8. Why is Insertion Sort adaptive?

Because it performs fewer operations if the array is partially sorted.

### 9. Difference between Insertion Sort and Bubble Sort?

| Insertion Sort                  | Bubble Sort                    |
| ------------------------------- | ------------------------------ |
| Fewer swaps                     | More swaps                     |
| Faster for nearly sorted arrays | Slower                         |
| Builds sorted part              | Repeatedly bubbles max element |

### 10. Can Insertion Sort be used for linked lists?

Yes, Insertion Sort works efficiently with linked lists because shifting elements is easier.

---

## 📌 Summary

* Simple and beginner-friendly algorithm
* Best choice for small or nearly sorted arrays
* Important for interviews and understanding advanced sorting

---

✍️ **Author:** Shubham Dubey

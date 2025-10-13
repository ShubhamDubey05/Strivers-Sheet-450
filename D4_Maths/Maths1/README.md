# 📘 Number System – Complete Notes  

![Number System](https://img.shields.io/badge/Topic-Number_System-blue?style=for-the-badge)
![Language](https://img.shields.io/badge/Language-English-green?style=for-the-badge)
![Author](https://img.shields.io/badge/Created_By-Shubham_Dubey-orange?style=for-the-badge)
![Updated](https://img.shields.io/badge/Last_Updated-2025-important?style=for-the-badge)

---

## 🗂️ Table of Contents
1. [🧠 Introduction](#-introduction)
2. [🔢 Common Types of Number Systems](#-common-types-of-number-systems)
3. [⚙️ Explanation of Each Number System](#️-explanation-of-each-number-system)
4. [🔄 Conversion Between Number Systems](#-conversion-between-number-systems)
5. [🧮 Shortcut Conversion Table](#-shortcut-table-for-conversion)
6. [🧩 Complements](#-complements)
7. [⚙️ Bitwise Operators](#️-bitwise-operators-used-in-programming)
8. [🧮 Important Questions](#-important-questions)
9. [🧠 Summary – Key Formulas](#-summary--key-formulas)
10. [✨ End of Notes](#-end-of-notes)

---

## 🧠 Introduction
A **Number System** is a way of representing numbers using digits or symbols.  
Every number system is identified by its **base (or radix)**, which is the total number of unique digits used in it.

> 💡 **Tip:** The base defines how many unique digits can appear in the number system.  

---

## 🔢 Common Types of Number Systems

| Number System | Base | Digits Used | Example |
|----------------|------|-------------|----------|
| **Decimal** | 10 | 0–9 | 125 |
| **Binary** | 2 | 0,1 | 1011 |
| **Octal** | 8 | 0–7 | 725 |
| **Hexadecimal** | 16 | 0–9, A–F | 2AF |

---

## ⚙️ Explanation of Each Number System

### 🟢 Decimal Number System (Base 10)
```text
(453)_10 = 4×10² + 5×10¹ + 3×10⁰ = 453
```

### 🔵 Binary Number System (Base 2)
```text
(1011)_2 = 1×2³ + 0×2² + 1×2¹ + 1×2⁰ = (11)_10
```

### 🟣 Octal Number System (Base 8)
```text
(345)_8 = 3×8² + 4×8¹ + 5×8⁰ = (229)_10
```

### 🔶 Hexadecimal Number System (Base 16)
```text
(2AF)_16 = 2×16² + 10×16¹ + 15×16⁰ = (687)_10
```

---

## 🔄 Conversion Between Number Systems

> 💡 **Formula:** Multiply each digit by the base raised to its position (from right to left).  

### 🔹 Binary ↔ Decimal
**Binary → Decimal**
```text
(1011)_2 = 1×8 + 0×4 + 1×2 + 1×1 = 11
```

**Decimal → Binary**
```text
(11)_10 = (1011)_2
```

### 🔹 Octal ↔ Decimal
```text
(345)_8 = (229)_10
(229)_10 = (345)_8
```

### 🔹 Hexadecimal ↔ Decimal
```text
(2AF)_16 = (687)_10
(687)_10 = (2AF)_16
```

### 🔹 Binary ↔ Octal ↔ Hexadecimal

| Conversion | Rule |
|-------------|------|
| **Binary → Octal** | Group 3 bits from right → convert each group to Octal |
| **Binary → Hexadecimal** | Group 4 bits from right → convert each group to Hex |
| **Octal → Binary** | Replace each octal digit by 3-bit binary equivalent |
| **Hexadecimal → Binary** | Replace each hex digit by 4-bit binary equivalent |

**Example:**
```text
Binary: (110101)_2 → Octal: (65)_8 → Hex: (35)_16
```

---

## 🧮 Shortcut Table for Conversion

| Decimal | Binary | Octal | Hex |
|----------|--------|--------|-----|
| 0 | 0000 | 0 | 0 |
| 1 | 0001 | 1 | 1 |
| 2 | 0010 | 2 | 2 |
| 3 | 0011 | 3 | 3 |
| 4 | 0100 | 4 | 4 |
| 5 | 0101 | 5 | 5 |
| 6 | 0110 | 6 | 6 |
| 7 | 0111 | 7 | 7 |
| 8 | 1000 | 10 | 8 |
| 9 | 1001 | 11 | 9 |
| 10 | 1010 | 12 | A |
| 11 | 1011 | 13 | B |
| 12 | 1100 | 14 | C |
| 13 | 1101 | 15 | D |
| 14 | 1110 | 16 | E |
| 15 | 1111 | 17 | F |

---

## 🧩 Complements

### 1️⃣ 1’s Complement
Steps:
1. Convert to binary  
2. Flip all bits (1 → 0 and 0 → 1)

**Example:**
```text
5 → 101
1’s complement → 010
```

### 2️⃣ 2’s Complement
Steps:
1. Take **1’s complement**  
2. **Add 1** to the result  

⚠️ **Note:** 2’s complement represents the **negative equivalent** of a binary number.

---

## ⚙️ Bitwise Operators (Used in Programming)

| Operator | Symbol | Description |
|-----------|---------|-------------|
| **AND** | `&` | True only if both operands are true |
| **XOR** | `^` | True only if exactly one operand is true |
| **NOT** | `~` | Inverts all bits |
| **Left Shift** | `<<` | Multiplies the number by 2ⁿ |
| **Right Shift** | `>>` | Divides the number by 2ⁿ |

### ⚡ Important Formulas
```text
a & 1  → digits remain same
a ^ 1  → ~a
a ^ 0  → a
a ^ a  → 0
a << 1 → 2 × a
a << b → a × 2^b
a >> 1 → a / 2
a >> b → a / 2^b
```

---

## 🧮 Important Questions

1️⃣ Convert Decimal to Binary  
2️⃣ Convert Binary to Decimal  
3️⃣ Find 1’s Complement  
4️⃣ Find 2’s Complement  
5️⃣ Swap two numbers
6️⃣ Find Missing & Repeating Number  
7️⃣ Check Odd or Even  
8️⃣ Find Single Number  
9️⃣ Find iᵗʰ Bit of a Number  
🔟 Set the iᵗʰ Bit  
1️⃣1️⃣ Reset the iᵗʰ Bit  
1️⃣2️⃣ Position of Rightmost Set Bit  
1️⃣3️⃣ XOR of Numbers from 0 → a  
1️⃣4️⃣ XOR of All Numbers Between a & b  
1️⃣5️⃣ Flipping Image Problem  

---

## 🧠 Summary – Key Formulas

| Concept | Formula |
|----------|----------|
| **2’s Complement** | 1’s Complement + 1 |
| **Left Shift** | `a << b = a × 2^b` |
| **Right Shift** | `a >> b = a / 2^b` |
| **Binary to Decimal** | Multiply each bit by 2ⁿ and add |
| **Decimal to Binary** | Divide by 2, record remainders |
| **Binary to Octal** | Group 3 bits = 1 octal digit |
| **Binary to Hex** | Group 4 bits = 1 hex digit |
| **XOR Rules** | `a^1 = ~a`, `a^0 = a`, `a^a = 0` |

---

## ✨ End of Notes  
> **Author:** Shubham Dubey  
> 🎓 *B.Tech (Information Technology)* – Ambalika Institute of Management & Technology  
> 💻 *Java Developer | Web Designer | MERN Learner*  

---

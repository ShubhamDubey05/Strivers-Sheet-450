# 📘 Number System – Complete Notes

## 🧠 Introduction
A **Number System** is a method of representing numbers using digits or symbols.  
Every number system is identified by its **base (or radix)**, which is the total number of unique digits used in it.

---

## 🔢 Common Types of Number Systems

| Number System | Base | Digits Used | Example |
|----------------|------|--------------|----------|
| **Decimal** | 10 | 0–9 | 125 |
| **Binary** | 2 | 0,1 | 1011 |
| **Octal** | 8 | 0–7 | 725 |
| **Hexadecimal** | 16 | 0–9, A–F | 2AF |

---

## ⚙️ Explanation of Each Number System

### 1. Decimal Number System (Base 10)
```
(453)_10 = 4×10² + 5×10¹ + 3×10⁰ = 453
```

### 2. Binary Number System (Base 2)
```
(1011)_2 = 1×2³ + 0×2² + 1×2¹ + 1×2⁰ = (11)_10
```

### 3. Octal Number System (Base 8)
```
(345)_8 = 3×8² + 4×8¹ + 5×8⁰ = (229)_10
```

### 4. Hexadecimal Number System (Base 16)
```
(2AF)_16 = 2×16² + 10×16¹ + 15×16⁰ = (687)_10
```

---

## 🔄 Conversion Between Number Systems

### Binary ↔ Decimal
**Binary → Decimal:**  
```
(1011)_2 = 1×8 + 0×4 + 1×2 + 1×1 = 11
```
**Decimal → Binary:**  
```
(11)_10 = (1011)_2
```

### Octal ↔ Decimal
```
(345)_8 = (229)_10
(229)_10 = (345)_8
```

### Hexadecimal ↔ Decimal
```
(2AF)_16 = (687)_10
(687)_10 = (2AF)_16
```

### Binary ↔ Octal ↔ Hexadecimal
| Conversion | Rule |
|-------------|------|
| **Binary → Octal** | Group 3 bits from right → convert each group to Octal |
| **Binary → Hexadecimal** | Group 4 bits from right → convert each group to Hex |
| **Octal → Binary** | Replace each octal digit by 3-bit binary equivalent |
| **Hexadecimal → Binary** | Replace each hex digit by 4-bit binary equivalent |

**Example:**
```
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
   ### 1's complement of a number

     -- convert into Binary 
        5 -> 101
     -- flip the bits
       101 -> 010
  ### 2's complement of a number


   -- 2's complement of any number gives us a negative of that number

    - take 1's complement 
   - add 1 in the number


---

## Operators
      There are few operators to frequently used in programming.
   ### AND (&)
     - In which both operand should be true than it will give true, otherwise it will give false;
     - when you & 1 with an Number, digits remain the same.
     Example  :-


   ### OR (|)
    - if one true than , true

  ### XOR (^)

     - if and only if
     - One should be true
      
      a^1= ~a
      a^0 = a
      a^a = 0
   ### NOT

     
   ### Letf shift(<<)

    a<<1 = 2*a
    a<<b = a*2^b

  ### Right shift (>>)
     a>>1 = a/2
     a>>b = a/2^b
     

 
   



































































   ## Q1 - Convert the decimal number to Binary Number

   ## Q2 - Convert the Binary to Decimal Number

   ## Q3 - 1's Complement of a Binary number

   ## Q4 - 2's Complement of a Binary number
  
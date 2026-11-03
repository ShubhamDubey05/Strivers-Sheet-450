Pattern no - 45
- Loops(inner and outer) will run till 2*n-1
- Genrate matrix with minimum distance    
Is pattern ka main concept hai Minimum Distance from all four boundaries.
Har cell ke liye 4 distances calculate karenge:
1. Left distance = j
2. Right distance = 2*n - 2 - j
3. Top distance = i
4. Bottom distance = 2*n - 2 - i
In chaaron distances ka minimum nikalenge.
       00000
       01110
       01210
       01110
       00000
- Value = n - minimumDistance






🌈✨ Key Points for 2D Matrix Search (Staircase Binary Search)

🔹 ① The matrix is sorted row-wise and column-wise → gives natural ordering.
🔹 ② Start at the 🔝➡️ top-right corner, the perfect decision pivot.
🔹 ③ If value is ❗greater than target → go ⬅️ left (entire column is too big).
🔹 ④ If value is 💠 smaller than target → go ⬇️ down (entire row is too small).
🔹 ⑤ Each move deletes a whole row/column → ⏱️ O(m + n) time.
🔹 ⑥ No MID needed 🚫➗ because the row/column pointers already behave like a dynamic midpoint, eliminating ranges automatically.


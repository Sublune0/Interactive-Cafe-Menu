Project 1 - Café Order Program

Author
Benjamin Bever  

---

Description:
This program allows the user to order one item from a small café menu.  
If the user chooses coffee, they can select whether to add milk and sugar for an extra charge.  
The program then calculates the total price for the order and applies a 10% discount if the total is over $25.

---

Purpose:
This project was created for ICT 152 Project 1 to practice:
- Taking user input
- Using `if` and `switch` (or equivalent conditional statements)
- Performing basic arithmetic in a menu-driven program

---

How It Works:
1. Displays a menu with 5 items:
   - Coffee ($3.00)
   - Tea ($2.50)
   - Sandwich ($6.00)
   - Muffin ($3.75)
   - Juice ($2.95)
2. The user selects one item.
3. If coffee is chosen, the user can add milk and sugar for an additional $0.50.
4. The user enters the quantity they want.
5. The program calculates the total price.
6. If the total is greater than $25, a 10% discount is applied.
7. Displays the order details and final price.

---

Input:
- Menu item number (1–5)
- Quantity
- Coffee add-on option (if applicable)

Output:
- Ordered item and any add-ons
- Quantity
- Total price (with discount if applicable)

---

Notes:
- Discount applies only if the total before discount exceeds $25.
- Invalid menu selections end the program.

# 📚 Library Management System

A simple **Java-based console application** to manage library operations like adding books, registering users, issuing books, and returning books with fine calculation.

---

## 🚀 Features

* 📖 Add new books to the library
* 👤 Register new users
* 🔍 Search books by title or author
* 📕 Issue books to users
* 📅 Return books with **fine calculation**
* 🧾 Track transactions (issue & return details)

---

## 🛠️ Technologies Used

* Java
* OOP Concepts (Classes, Objects, Encapsulation)
* Collections (`ArrayList`)
* Date & Time API (`LocalDate`, `ChronoUnit`)

---

## 📂 Project Structure

```
Library-Management-System/
│── Main.java
│── Library.java
│── Book.java
│── User.java
│── Transaction.java
```

---

## 📌 Class Overview

### 1. User Class

Represents a library user with roll number and name.


---

### 2. Library Class

Handles all core operations:

* Add books & users
* Search books
* Issue books
* Return books with fine calculation


---

### 3. Main Class

Provides menu-driven interface for user interaction.


---

### 4. Transaction Class

Stores issue/return details of books.


---

## ⚙️ How It Works

1. User selects options from menu:

   ```
   1. Add Book
   2. Add User
   3. Search Book
   4. Issue Book
   5. Return Book
   6. Exit
   ```

2. Book Issue:

   * Checks availability
   * Creates transaction
   * Stores due date

3. Book Return:

   * Calculates late days
   * Fine = ₹10 per day
   * Updates return status

---

## ▶️ How to Run

### Step 1: Compile

```bash
javac *.java
```

### Step 2: Run

```bash
java Main
```

---

## 💡 Example

```
Enter choice: 4
Enter Book ID: 101
Enter User Roll No: 22CS001
Enter Due Date: 2026-04-10

Book issued successfully!
```

---

## 📈 Future Improvements

* GUI using JavaFX / Swing
* Database integration (MySQL/PostgreSQL)
* Admin login system
* Book categories & filters
* Email notifications

---

## 👨‍💻 Author

**Rayyan A**
BE CSE (AIML)
KPR Institute of Engineering and Technology

---



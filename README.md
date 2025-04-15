# NEU Library Resource Management System

## 📚 Overview

The **NEU Library Resource Management System** is a Java-based object-oriented program designed to manage various types of library resources such as books, journals, theses, capstones, newspapers, and internet-based materials.

This system allows `Student` users to borrow any library resource in a flexible, maintainable way that adheres to clean software architecture principles.

---

Originally, the `Student` class had tightly-coupled methods like:

```java
borrowBook(String title)
borrowJournal(String title)

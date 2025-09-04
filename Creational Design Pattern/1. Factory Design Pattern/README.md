# 📧 Email Notification System using Factory Method

This project demonstrates the **Factory Method Design Pattern** through an **Email Notification system**.  
It focuses on how to separate **object creation** from **business logic**, making the system extensible and maintainable.

---

## 📝 Problem
Directly creating objects (e.g., `EmailNotification`) inside business logic leads to tight coupling.  
As the system grows, adding new notification types (SMS, Push, Slack, etc.) requires modifying the same code repeatedly, violating the **Open/Closed Principle**.

---

## 🛠 Solution
Using the **Factory Method Pattern**, we delegate the creation of objects to dedicated classes.  
This keeps the business logic clean and open for extension.

---

## ⚡ Classes Used

- **Notification (Interface)** → Common contract for all notifications.  
- **EmailNotification (Concrete Product)** → Implements notification behavior for email.  
- **NotificationCreator (Abstract Creator)** → Declares the factory method.  
- **EmailNotificationCreator (Concrete Creator)** → Instantiates `EmailNotification`.  
- **FactoryMethodDemo (Client)** → Uses the creator to send notifications.  

---

## ✅ Benefits
- **Decouples** object creation from usage.  
- **Open for extension** (easily add new notification types).  
- Follows **SOLID principles** for cleaner design.  
- **Scalable and testable** architecture.  

---

## 👨‍💻 Author
Built with ❤️ by **Kuheli Bera**  
📌 Practicing **Low-Level Design (LLD)** patterns to write clean, extensible, and production-ready code.

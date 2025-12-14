# Travel Management System

A **Java Swing–based Travel Management System** that allows users to manage travel-related activities such as booking hotels and packages, managing customers, viewing destinations, handling payments, and maintaining user profiles. The application provides a user-friendly GUI with multiple modules connected using Java Swing and JDBC.

---

## Features

* User authentication (Login & Signup)
* Splash screen and loading screen
* Dashboard for navigation
* Customer management (Add, View, Update, Delete)
* Hotel booking and package booking
* View available hotels and packages
* Destination gallery
* Payment module (including Paytm simulation)
* Forgot password functionality
* Profile management

---

## Technologies Used

* **Programming Language:** Java (JDK 8+ / tested on JDK 22)
* **GUI Framework:** Java Swing & AWT
* **Database:** MySQL (via JDBC)
* **IDE:** VS Code / IntelliJ IDEA / NetBeans
* **Version Control:** Git & GitHub

---

## Project Structure

```
Travel-Management-System/
│
├── src/
│   ├── travel/management/system/
│   │   ├── AddCustomer.java
│   │   ├── BookHotel.java
│   │   ├── BookPackage.java
│   │   ├── CheckHotels.java
│   │   ├── Checkpackages.java
│   │   ├── Conn.java
│   │   ├── Dashboard.java
│   │   ├── DeleteDetails.java
│   │   ├── Destinations.java
│   │   ├── ForgetPassword.java
│   │   ├── Loading.java
│   │   ├── Login.java
│   │   ├── Payment.java
│   │   ├── Paytm.java
│   │   ├── Profile.java
│   │   ├── Signup.java
│   │   ├── Splash.java   <-- Main entry point
│   │   ├── UpdateCustomer.java
│   │   ├── ViewBookedHotel.java
│   │   ├── ViewCustomer.java
│   │   └── ViewPackage.java
│   └── icons/
│       └── (images used in GUI)
│
├── .gitignore
└── README.md
```

---

## How to Run the Project

### Prerequisites

* Java JDK installed (JDK 8 or higher)
* Git (optional, for cloning)
* MySQL (optional, for database connectivity)

### Steps

1. **Clone the repository**

   ```bash
   git clone https://github.com/theadityapatel/Travel-Management-System.git
   ```

2. **Navigate to project directory**

   ```bash
   cd Travel-Management-System
   ```

3. **Compile the project**

   ```bash
   javac src/travel/management/system/*.java
   ```

4. **Run the application**

   ```bash
   java -cp src travel.management.system.Splash
   ```

---

## Database Configuration (Optional)

* Database connection logic is present in `Conn.java`
* Update the following details according to your MySQL setup:

  ```java
  String url = "jdbc:mysql://localhost:3306/travelmanagementsystem";
  String username = "root";
  String password = "your_password";
  ```

> If MySQL is not configured, the GUI will still open, but database-related features may not work.

---

## Screenshots

*Add screenshots of the application UI here (Splash Screen, Login, Dashboard, Booking pages, etc.)*

---

## Future Enhancements

* Role-based access (Admin/User)
* Online payment gateway integration
* Better exception handling
* Migration to JavaFX
* Web or mobile version

---

## Author

**Aditya Patel**
GitHub: [https://github.com/theadityapatel](https://github.com/theadityapatel)

---

## License

This project is developed for **academic and learning purposes**. You are free to use and modify it for educational use.

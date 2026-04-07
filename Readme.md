# Calculator Application: Java Mini-Project

This repository contains a simple, robust **Java-based Calculator** designed to demonstrate professional software development workflows, including Unit Testing, Maven dependency management, and Version Control.

---

## 📋 Project Overview

The **Calculator App** provides a reliable tool for basic arithmetic operations. It serves as a practical implementation of Software Engineering principles, from Requirement Specification (SRS) to final Deployment on GitHub.

### Core Features
* **Arithmetic Operations:** Addition, Subtraction, Multiplication, and Division.
* **Error Handling:** Robust validation for division by zero.
* **Unit Testing:** Comprehensive test suite using JUnit 5.
* **Build Automation:** Managed via Maven for easy dependency resolution.

---

## 🛠️ Tech Stack

* **Language:** Java 11+
* **IDE:** IntelliJ IDEA
* **Testing Framework:** JUnit 5
* **Build Tool:** Maven
* **Version Control:** Git & GitHub

---

## 🚀 Getting Started

### Prerequisites
* Java Development Kit (JDK) 11 or higher.
* Apache Maven installed (or use the IntelliJ bundled version).

### Installation & Setup
1.  **Clone the repository:**
    ```bash
    git clone https://github.com/SamyakUmathe/java-calculator-miniproject.git
    ```
2.  **Open in IntelliJ IDEA:**
    * File > Open > Select the `pom.xml` file.
    * Select **Open as Project**.
3.  **Build the Project:**
    IntelliJ will automatically download dependencies. You can also run:
    ```bash
    mvn clean install
    ```

---

## 🧪 Testing and Debugging

### Running Tests
To verify the logic, run the JUnit tests located in `src/test/java/com/example/CalculatorTest.java`:
1.  Right-click the `CalculatorTest` class.
2.  Select **Run 'CalculatorTest'**.


### Debugging
Breakpoints are set in `Calculator.java` to allow step-by-step inspection of variables during calculation execution using the IntelliJ Debugger (F9).

---

## 📂 Project Structure

```text
miniproject/
├── src/
│   ├── main/java/com/example/      # Core Logic (Calculator.java)
│   └── test/java/com/example/      # Unit Tests (CalculatorTest.java)
├── pom.xml                         # Maven Configuration
└── README.md                       # Project Documentation
```

---

## 📊 Design & Architecture

The project follows a standard modular architecture. The data flow and control hierarchy are documented in the **SRS and Modeling Assignment** section of the project report.

* **ER Diagram:** Maps the relationship between Users, Operations, and Calculation Logs.
* **DFD Level 0:** Illustrates the high-level data flow between the user and the calculator system.


---

## 🤝 Contribution

1.  Create a new branch (`git checkout -b feature-name`).
2.  Commit your changes (`git commit -m 'Add some feature'`).
3.  Push to the branch (`git push origin feature-name`).
4.  Open a Pull Request.

---

## 📝 License
This project is for educational purposes as part of a Java Programming Practical.

**Author:** Samyak Umathe
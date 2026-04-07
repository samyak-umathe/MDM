# Java Mini-Project Report and IntelliJ IDEA Guide

## Project Overview

This is a simple Java-based **Calculator** application intended to demonstrate basic development workflows in an IDE, specifically **IntelliJ IDEA**.

The project uses:
*   **Java 11+** for basic logic (`Calculator.java`).
*   **JUnit 5** for unit testing (`CalculatorTest.java`).
*   **Maven** for dependency management (`pom.xml`).

---

## 🚀 How to use this project in IntelliJ IDEA

Here is a step-by-step guide to demonstrate project creation, code editing, debugging, testing, and execution using IntelliJ IDEA.

### 1. Project Creation / Importing
Since I've provided the source code, you can import this project directly:
1. Open **IntelliJ IDEA**.
2. Click on **Open**.
3. Navigate to `d:\java practice\java\miniproject` and select the `pom.xml` file or the `miniproject` folder.
4. If prompted, select **Open as Project**.
5. IntelliJ will automatically parse the Maven configuration and download the JUnit dependencies.

*(If you wanted to create it from scratch in IntelliJ: `File > New > Project`, choose **Maven** as the generator, and name it `miniproject`.)*

### 2. Code Editing
You can view and modify the code using IntelliJ's editor:
1. In the **Project** tool window (left pane, `Alt+1`), expand `src/main/java/com/example/`.
2. Double-click `Calculator.java` to open it in the editor.
3. IDE features like **Syntax Highlighting** and **Code Completion** will help you. Try typing `public int divide(int a, int b) { return a / b; }`—you will see how IntelliJ provides suggestions for keywords.

### 3. Execution (Running the Program)
To run the main application:
1. Open `Calculator.java`.
2. Look for the `public static void main(String[] args)` method.
3. Beside line 15, you'll see a green **"Play"** triangle icon in the left gutter.
4. Click the green triangle and select **Run 'Calculator.main()'**.
5. The output will appear in the **Run** tool window at the bottom:
   ```
   Welcome to the Simple Java Calculator!
   Adding 5 + 3 = 8
   Subtracting 5 - 3 = 2
   Multiplying 5 * 3 = 15
   ```

### 4. Testing
We have set up JUnit to automatically verify the functionality.
1. In the **Project** window, navigate to `src/test/java/com/example/`.
2. Open `CalculatorTest.java`.
3. Just like the main method, there's a green triangle icon next to the `public class CalculatorTest` declaration.
4. Click it and select **Run 'CalculatorTest'**.
5. The **Run** window will pop up showing a green checkmark indicating that all 3 tests (`testAdd`, `testSubtract`, `testMultiply`) passed successfully.

### 5. Debugging
To find and fix errors, use the Debugger:
1. Open `Calculator.java`.
2. Click in the gray space immediately to the right of the line number for `return a + b;` inside the `add` method. A red dot (Breakpoint) will appear.
3. Open `CalculatorTest.java`.
4. Right-click inside the `testAdd` method, or click the green gutter icon by `testAdd()` and select **Debug 'testAdd()'** instead of Run.
5. The IDE will halt execution at the red dot. The **Debug** tool window at the bottom will show you the exact values of `a` (which is 5) and `b` (which is 3) at runtime.
6. Click **Resume Program** (F9, green play button on the left of the debug pane) to finish execution.

---
## Conclusion
This submission demonstrates the complete software development lifecycle within IntelliJ IDEA: defining Maven build config, writing source implementation, writing unit tests to verify behavior, executing code locally, and utilizing breakpoints for debugging.

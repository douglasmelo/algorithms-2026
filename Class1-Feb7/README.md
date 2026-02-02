# Class 1: Algorithms Introduction (Feb 7)

## 1. History of Algorithms

The word "algorithm" derives from the name of the 9th-century Persian mathematician **Muḥammad ibn Mūsā al-Khwārizmī**, whose works introduced Hindu-Arabic numerals and the concepts of algebra to the Western world.

*   **Ancient Times**: Algorithms existed long before computers (e.g., Euclidean algorithm for greatest common divisor, c. 300 BC).
*   **19th Century**: **Ada Lovelace** wrote the first algorithm intended for a machine (Charles Babbage's Analytical Engine).
*   **20th Century**: **Alan Turing** formalized the concept of computation with the Turing Machine, laying the foundation for modern computer science.
*   **Modern Era**: Algorithms now govern everything from search engines (PageRank) to artificial intelligence and cryptography.

## 2. Environment Setup

### Java SDK 25 (Oracle)
1.  Visit the [Oracle Java Downloads](https://www.oracle.com/java/technologies/downloads/) page.
2.  Select **Java 25** (if available, or the latest version).
3.  Download the **Installer** for your operating system (macOS, Windows, or Linux).
4.  Run the installer and follow the on-screen instructions.
5.  Verify installation by running: `java -version`

### Apache Maven
1.  Visit the [Maven Download](https://maven.apache.org/download.cgi) page.
2.  Download the **Binary zip archive**.
3.  Extract the archive to a directory of your choice.
4.  Add the `bin` directory to your system `PATH`.
5.  Verify installation by running: `mvn -version`

## 3. Introduction to Algorithms

An **algorithm** is a step-by-step procedure or set of rules to be followed in calculations or other problem-solving operations.

### Key Characteristics:
1.  **Input**: 0 or more inputs.
2.  **Output**: At least 1 output.
3.  **Definiteness**: Each step must be clear and unambiguous.
4.  **Finiteness**: Must terminate after a finite number of steps.
5.  **Effectiveness**: Operations must be basic enough to be done exactly.

### Simple Example: Sum of Two Numbers

Here is a simple Java program illustrating an algorithm to take two numbers and output their sum.

```java
public class SimpleSum {
    public static void main(String[] args) {
        // Input: Two integers
        int number1 = 10;
        int number2 = 20;

        // Process: Add the two numbers
        int sum = number1 + number2;

        // Output: Display the result
        System.out.println("The sum is: " + sum);
    }
}
```

## 4. GitHub Guide for Beginners

**Git** is a version control system (tracks changes), while **GitHub** is a platform for hosting Git repositories.

### Basic Workflow:
1.  **Initialize**: `git init` (Starts a new repo).
2.  **Status**: `git status` (See what files changed).
3.  **Add**: `git add <filename>` or `git add .` (Stage changes).
4.  **Commit**: `git commit -m "Your message here"` (Save changes with a message).
5.  **Push**: `git push origin main` (Send changes to GitHub).

### First Time Setup:
```bash
git config --global user.name "Your Name"
git config --global user.email "your.email@example.com"
```

### Cloning this Repository
To download this repository to your local machine using SSH, run:
```bash
git clone git@github.com:douglasmelo/algorithms-2026.git
```

## 5. Antigravity IDE

**Antigravity** is a next-generation AI-powered coding assistant and IDE designed to help you build software faster and more intuitively.

*   **Agentic Capabilities**: It can plan, execute, and debug complex tasks autonomously.
*   **Context Awareness**: It understands your entire project structure, not just the current file.
*   **Conversational Interface**: Pair program in natural language.
*   **Tool Integration**: Built-in access to terminal, file system, and browser tools to act like a real developer.

---
*Created for Algorithms 2026 Course*

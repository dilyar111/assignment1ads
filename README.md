## `task1()`

This method finds the minimum value among the entered numbers.

The method reads the number of values `n` using a `Scanner` object. Then it iteratively reads `n` numbers, finds the minimum value among them, and prints it.

**Time Complexity:** O(n), where `n` is the number of entered values.

**Parameters:**
- No parameters.

**Return:**
- No return value.

---

## `task2()`

This method calculates the average of the entered numbers.

 The method reads the number of values `n` using a `Scanner` object. Then it iteratively reads `n` numbers, calculates their sum, computes the average value, and prints it. Finally, it returns the number of entered values `n`.

**Time Complexity:** O(n), where `n` is the number of entered values.

**Parameters:**
- No parameters.

**Return:**
- `int`: the number of entered values.



## `task3()`

This method checks if the entered number is prime.

 The method reads a number using a `Scanner`. Then it calls the `task3(int n)` method, passing the entered number as an argument. Depending on the result, it prints "prime" if the number is prime, and "composite" if composite.

**Time Complexity:** O(√n), where `n` is the entered number.

**Parameters:**
- No parameters.

**Return:**
- No return value.

```java
/**
## `task4()`
 * Calculates the factorial of a given integer.
 * 
 * This method recursively calculates the factorial of the input integer 'n' by
 * multiplying 'n' with the factorial of (n-1) until 'n' reaches 1.
 * 
 * Time Complexity: O(n), where n is the input integer.
 * 
 * @param n The integer for which factorial is to be calculated.
 * @return The factorial of the input integer 'n'.
 */
public static int factorial(int n) {
    if (n <= 1)
        return 1;
    return factorial(n - 1) * n;
}

/**
 */
public static void factorial() {
    int n = scan.nextInt();
    int result = factorial(n);
    System.out.println(result);
}

/**
## `task5()`
 * Calculates the Fibonacci value of a given integer.
 * 
 * This method recursively calculates the Fibonacci value of the input integer 'n'
 * using the Fibonacci sequence formula: fib(n) = fib(n-1) + fib(n-2).
 * 
 * Time Complexity: O(2^n), where n is the input integer.
 * 
 * @param n The integer for which the Fibonacci value is to be calculated.
 * @return The Fibonacci value of the input integer 'n'.
 */
public static int fibonacciValue(int n) {
    if (n <= 1) {
        return n;
    } else {
        return fibonacciValue(n - 1) + fibonacciValue(n - 2);
    }
}

/**
 * Reads an integer from the standard input, calculates its Fibonacci value, and prints the result.
 */
public static void fibonacciValue() {
    int n = scan.nextInt();
    int fibonacciNumber = fibonacciValue(n);
    System.out.println(fibonacciNumber);
}

/**
## `task6()`
 * Calculates the power of a given base to a given exponent.
 * 
 * This method recursively calculates the power of the input base 'a' to the input exponent 'n'.
 * 
 * Time Complexity: O(n), where n is the exponent.
 * 
 * @param a The base.
 * @param n The exponent.
 * @return The result of 'a' raised to the power of 'n'.
 */
public static int power(int a, int n) {
    if (n == 0) {
        return 1;
    } else if (n < 0) {
        return 1 / (a * power(a, -n));
    } else {
        return a * power(a, n - 1);
    }
}

/**
## `task7()`
 * Reads two integers from the standard input, calculates the power of the first integer to the second integer,
 * and prints the result.
 */
public static void power() {
    int a = scan.nextInt();
    int n = scan.nextInt();
    System.out.println(power(a, n));
}

/**
 * Reverses the order of elements in a given array of strings within the specified range.
 * 
 * This method recursively swaps elements of the input array 'arr' starting from index 'first' to index 'end'
 * until 'first' is greater than or equal to 'end'.
 * 
 * @param arr The array of strings to be reversed.
 * @param first The starting index of the range to be reversed.
 * @param end The ending index of the range to be reversed.
 */
public static void task7(String[] arr, int first, int end) {
    if (first >= end) {
        return;
    }
    int temp = Integer.parseInt(arr[first]);
    arr[first] = arr[end];
    arr[end] = String.valueOf(temp);

    task7(arr, first + 1, end - 1);
}

/**
## `task8()`
 * Reads the size of an array and its elements from the standard input, reverses the order of elements in the array,
 * and prints the reversed array.
 */
public static void task7() {
    System.out.println("len:");
    int size = scan.nextInt();
    String[] arr = new String[size];
    for (int i = 0; i < size; i++) {
        arr[i] = scan.next();
    }
    task7(arr, 0, arr.length - 1);
    System.out.println("Reversed:");
    for (String element : arr) {
        System.out.print(element + " ");
    }
}
```
```java
/**

 * Checks if the input string consists of only digits.
 * 
 * This method recursively checks each character of the input string 's' starting from index 0.
 * If a character is a digit, it proceeds to the next character recursively.
 * If a character is not a digit, it returns false.
 * Returns true if all characters in the string are digits or if the string is empty.
 * 
 * Time Complexity: O(n), where n is the length of the input string.
 * 
 * @param s The input string to be checked.
 * @return true if the input string consists of only digits, false otherwise.
 */
public static boolean task8(String s) {
    if (s == null || s.isEmpty()) {
        return false;
    }
    return task8(s, 0);
}

/**
 * This method recursively checks each character of the input string 's' starting from the given index.
 * If the end of the string is reached, it returns true.
 * If the current character is a digit, it proceeds to check the next character recursively.
 * If the current character is not a digit, it returns false.
 * 
 * @param s The input string to be checked.
 * @param index The index to start checking from.
 * @return true if all characters from the given index to the end of the string are digits, false otherwise.
 */
private static boolean task8(String s, int index){
    if (index == s.length()) {
        return true;
    }
    char ch = s.charAt(index);

    if (Character.isDigit(ch)) {
        return task8(s, index + 1);
    } else {
        return false;
    }
}

/**
 * Reads a string from the standard input and checks if it consists of only digits,
 * then prints "yes" if true, or "no" otherwise.
 */
public static void task8() {
    String s = scan.next();
    if (task8(s)) {
        System.out.println("yes");
    } else {
        System.out.println("no");
    }
}

/**
## `task9()`
 * Calculates the binomial coefficient C(n, k) using recursion.
 * 
 * This method calculates the binomial coefficient C(n, k) recursively using the formula:
 * C(n, k) = C(n-1, k-1) + C(n-1, k), with base cases when k is 0 or n.
 * 
 * Time Complexity: O(2^n), where n is the larger of the two inputs 'n' and 'k'.
 * 
 * @param n The total number of items.
 * @param k The number of items to choose from the total.
 * @return The binomial coefficient C(n, k).
 */
public static long task9(int n, int k) {
    if (k == 0 || k == n) {
        return 1;
    } else {
        return task9(n - 1, k - 1) + task9(n - 1, k);
    }
}

/**
 * Reads two integers from the standard input, calculates the binomial coefficient for the given inputs,
 * and prints the result.
 */
public static void task9() {
    int n = scan.nextInt();
    int k = scan.nextInt();
    long binomial = task9(n, k);
    System.out.println(binomial);
}

/**
## `task10()`
 * Calculates the greatest common divisor (GCD) of two integers using recursion.
 * 
 * This method calculates the GCD of two integers 'a' and 'b' recursively using the Euclidean algorithm.
 * 
 * Time Complexity: O(log(min(a, b))), where 'a' and 'b' are the input integers.
 * 
 * @param a The first integer.
 * @param b The second integer.
 * @return The greatest common divisor (GCD) of 'a' and 'b'.
 */
public static int task10(int a, int b) {
    if (b == 0) {
        return a;
    }
    return task10(b, a % b);
}

/**
 * Reads two integers from the standard input, calculates their greatest common divisor (GCD),
 * and prints the result.
 */
public static void task10() {
    int a = scan.nextInt();
    int b = scan.nextInt();
    int gcd = task10(a, b);
    System.out.println(gcd);
}
```
- **Time Complexity**: The time complexity of this method is O(1) as it involves a constant number of operations regardless of the input size.
- **Parameters**: None
- **Returns**: None



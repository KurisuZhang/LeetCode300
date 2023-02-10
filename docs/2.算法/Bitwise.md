# Bitwise Manipulation

[toc]

## 简介

### 概念

- **Bitwise Manipulation** is the process of modifying bits algorithmically using bitwise operations.

| NOT (`~`) | This is a unary operator. If the argument is a 1-bit, flip it to change a 1 to a 0, and vice versa. If the argument is a string of bits, all bits in the string are reversed, turning 1’s into 0’s and vice versa. |
| --------- | ------------------------------------------------------------ |
| AND (`&`) | If both the bits are 1, then 1 is returned. Otherwise, 0 is returned. |
| OR (`|`)  | If either of the bits is 1, then 1 is returned. Otherwise, 0 is returned. |
| XOR (`^`) | If both bits are equal, then 0 is returned. Otherwise, 1 is returned. |

### 适用范围

- The input data can be usefully manipulated at the level of the primitive bitwise logical operations, in order to compute some portion or all of the solution.
- The input data is unsorted, and the answer seems to require sorting, but we want to do better than �(�log⁡�)*O*(*n*log*n*).

### 复杂度



### 现实联系

- **Bit fields (flags):** They can be used to implement a way of representing things whose state is defined by a boolean expression.
- **Cryptography:** They can be used to encrypt and decrypt any sensitive data.
- **Releasing Process Lock:** Given a list of integers, they can be used to represent the order in which the lock was acquired and released in an operating system.

## 相关问题

1.  **Swap two numbers without using a temporary variable** (three xor)
2. 

## 模板

```java

```



------


# S30-Mock-Interviews

## Problem-1:
Consider an input array of finite size which can take values from [1...n]. The array can start from any number between 1 to n. However, every element in the array will be exactly one greater than its previous element (i.e. Numbers in the array will be in sequence and sorted). There may be one element that will be missing in the array. The aim is to find this missing element in the array. If nothing is missing, return -1. Make sure to handle all edge cases. Your Solution should be the most optimal one.

```
Example: 1) For the input array: [2,3,4,5,6,8]
            Return : 7
         
         2) For the input array: [3,4,5,6,7,8]
            Return : -1

```

## Problem-2:
An array is given in the question and you need to return the indices of two numbers such that they add up to a specific target. Assume that there is only one solution for each input and you cannot use the same element twice. 

```
Example:

Given nums = [2, 7, 11, 15], target = 9,

Because nums[0] + nums[1] = 2 + 7 = 9,

return [0, 1].
```


## Problem-3:
In mathematics, Pascal's triangle is a triangular array of the binomial coefficients. The rows of Pascal's triangle are conventionally enumerated starting with row n = 0 at the top (the 0th row). The entries in each row are numbered from the left beginning with k = 0 and are usually staggered relative to the numbers in the adjacent rows. The triangle may be constructed in the following manner: In row 0 (the topmost row), there is a unique nonzero entry 1. Each entry of each subsequent row is constructed by adding the number above and to the left with the number above and to the right, treating blank entries as 0. For example, the initial number in the first (or any other) row is 1 (the sum of 0 and 1), whereas the numbers 1 and 3 in the third row are added to produce the number 4 in the fourth row.

https://en.wikipedia.org/wiki/Pascal's_triangle#/media/File:PascalTriangleAnimated2.gif

Given a non-negative integer numRows, generate the first numRows of Pascal's triangle.
In Pascal's triangle, each number is the sum of the two numbers directly above it.

```
Example:

Input: 5
Output:
[
     [1],
    [1,1],
   [1,2,1],
  [1,3,3,1],
 [1,4,6,4,1]
]
```
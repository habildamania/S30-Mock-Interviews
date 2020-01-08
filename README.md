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
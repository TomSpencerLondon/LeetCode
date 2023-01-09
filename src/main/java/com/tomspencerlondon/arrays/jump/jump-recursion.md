### Jump Recursion

- I am at index: 0
  At number: 2
- I am at index: 1
  At number: 3
- I am at index: 2
  At number: 1
- I am at index: 3
  At number: 1
  I reached my destination: 4
- I am at index: 1
  At number: 3
- I am at index: 3
  At number: 1
  I reached my destination: 4
- I am at index: 1
  At number: 3
  I reached my destination: 4
- I am at index: 0
  At number: 2
- I am at index: 2
  At number: 1
- I am at index: 3
  At number: 1
  I reached my destination: 4

![image](https://user-images.githubusercontent.com/27693622/211224993-0b57d44f-f0ec-4c13-97e9-8ee4d0738537.png)
![image](https://user-images.githubusercontent.com/27693622/211225307-9591bc9e-c986-49d7-b9b2-09a5c1c9621f.png)
![image](https://user-images.githubusercontent.com/27693622/211225338-7f7e4de6-c7e1-48c1-8a0b-5faf0e1bbe4f.png)

In this code, the jump method is using recursion to navigate through an array of integers. 
The method takes in an array of integers, numbers, and an integer index, index, and it will 
print out the current index and value at that index in the array. If index is greater than 
or equal to the length of the numbers array minus 1, the method will print out a message 
indicating that it has reached its destination and return. Otherwise, the method will enter a 
loop that will iterate through the range of indices from index + 1 to index + numbers[index]. 
For each iteration, the method will call itself with the updated index and continue this process 
until it reaches its destination or until all possible indices have been visited.

For example, if the numbers array is [2, 3, 1, 1, 4] and the index is 0, the method will 
first print out **- I am at index: 0** and **At number: 2**. It will then call itself with an 
updated index of 1, which will print out **- I am at index: 1** and At number: 3. 
This will trigger another call to the method with an updated index of 2, 
which will print out **- I am at index: 2** and **At number: 1**. 
The method will then return to the previous call with index equal to 1 and 
continue to the next iteration with an updated index of 2, which will print out **- I am at index: 2** and 
**At number: 1** again.

This will trigger another call to the method with an updated index of 3, which will print out **- I am at index: 3** 
and **At number: 1**. The method will then return to the previous call with index equal to 2 and continue to the 
next iteration with an updated index of 3, which will print out **- I am at index: 3** and **At number: 1** again. 
This will trigger another call to the method with an updated index of 4, which will print out **- I am at index: 4** 
and **At number: 4**. The method will then return to the previous call with index equal to 3 and continue to the next 
iteration with an updated index of 4, which will print out **- I am at index: 4** and **At number: 4** again. 
The method will then return to the previous call with index equal to 2 and continue to the next iteration 
with an updated index of 4, which will print out **- I am at index: 4** and **At number: 4** again. The method will 
then return to the previous call with index equal to 1 and continue to the next iteration with an updated index of 4, 
which will print out **- I am at index: 4** and **At number: 4** again. The method will then return to the previous call 
with index equal to 0 and continue to the next iteration with an updated index of 4, 
which will print out **- I am at index: 4** and At number: 4 again. 
Finally, the method will return to the initial call with index equal to 0 
and enter the if statement, printing out **I reached my destination: 4** and returning.

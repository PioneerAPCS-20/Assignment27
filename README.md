# Assignment 27

For this assignment you will prompt the user for the number of sides on a die and how many times it will be rolled. Your program should roll that many times and store the number of times each value is rolled in an array.

## Specifications

You have the choice of using either one or multiple classes. However, if you use one class you still need to break up your code logically into methods.

### Sample Outputs

```
How many sides does the die have? 6
How many rolls? 1000

1: 159
2: 159
3: 171
4: 163
5: 165
6: 183
```

```
How many sides does the die have? 10
How many rolls? 50

1: 10
2: 5
3: 6
4: 5
5: 12
6: 2
7: 2
8: 7
9: 3
10: 3
```

## Part 2

For part 2 you will output a bar graph of the number of times each number was rolled.

You should have labels for both axes. The frequency on the y-axis should increment at a constant rate (+/- 1 error).

Using the escape sequence for tabs (`'\t'`) will be very useful. Also, remember that the escape sequence `'\n'` will return your output to the next line.

Example:
`System.out.print("Hello there. \nMy name is Mr. King. \nHave a nice day!");`

Output:
```
Hello there.
My name is Mr. King.
Have a nice day!
```

Example:
`System.out.print("1\t2\t3\n15\t30\t45");`

Output:
```
1   2   3
15  30  45
```

### Sample Outputs

```
How many rolls? 100
1: 23
2: 18
3: 16
4: 14
5: 12
6: 17



30  |                           
27  |                           
24  |                           
21  |   *                       
18  |   *   *                   
15  |   *   *   *           *   
12  |   *   *   *   *   *   *   
9   |   *   *   *   *   *   *   
6   |   *   *   *   *   *   *   
3   |   *   *   *   *   *   *   
    ----------------------------
        1   2   3   4   5   6   
```

```
How many sides does the die have? 10
How many rolls? 50

1: 10
2: 5
3: 6
4: 5
5: 12
6: 2
7: 2
8: 7
9: 3
10: 3



20  |                           
18  |                           
16  |                           
14  |                          
12  |                   *     
10  |   *               *      
8   |   *               *      
6   |   *       *       *           *
4   |   *   *   *   *   *           *
2   |   *   *   *   *   *   *   *   *   *   *   
    -------------------------------------------
        1   2   3   4   5   6   7   8   9   10
```

### Grading

As always, your program will be graded on its functionality according to the project specifications and proper code style.


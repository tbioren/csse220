# HWLinearLightsOut

## Overview:
- This exercise will provide more practice with event based programming and Java Swing.
- This assignment is broken into two parts; an individual and paired part (details are below).
### Documentation requirements
**For all files you modify in this project**, you must provide Javadocs.
- Use the provided *BankAccount.java* file for guidance with class-level Javadocs and method-level Javadocs.
- Use standard java comments for parts of your code whose functionality is non-obvious. 
(If a grader needs to debug your code, it's a good idea to make it as easy for them as possible.)
- Give self-documenting variable and method names.

## Part 1 - To be done individually

### Overview
This is designed to prepare you for part 2 of this assignment. You will create a program to count "balls" and "strikes" in a 
baseball game.

### Part 1 TODO
- Make the Ball and Add Strike buttons appear in the app's window as shown in the GIF below.
- Add labels above the buttons as shown in the GIF below.
- The buttons must work as follows: 
    - The *Add Ball* button, when clicked adds a 1 to the Balls count label. If the count in the Balls count label ever reaches 4, then both the Balls count and Strikes count labels must be reset to 0.
    - The *Add Strike* button, when clicked adds 1 to the Strikes count label. If the count in the Strikes count label ever reaches 3, then both the Balls count and Strikes count labels must be reset to 0.
    - The labels should be updated to reflect the new ball/strike counts every time a button is clicked.
<br/>

![ball-strike](images/ballstrike.gif) <br/>

### Rubric
This part of the assignment is worth 40.0 points. You will receive deductions for the following:
| Item                                          | Point Value   |
|-----------------------------------------------|---------------|
| No help citation                              | -1.0          |
| Insufficient documentation                    | -1.0          |
| No Javadocs                                   | -2.0          |
| Improper scaling/formatting of window         | -3.0          |
| Number of strikes or balls is incorrect       | -5.0          |
| Incorrect output upon pushing buttons         | -10.0         |
| Strike button is nonfunctional or not present | -15.0         |
| Ball button is nonfunctional or not present   | -15.0         |
| Missing count                                 | -20.0         |

## Part 2 - To be done in pairs

### Overview
The goal of this assignment is to create a program that follows the following specifications:
- The app presents the user with an array of buttons. Each button has a 50% chance of displaying either an X or an O.
- Clicking on a button changes the symbol of the clicked-on button and *both its left and right neighbors*, if those neighbors exist.
- When all the buttons display the same symbol, the player wins and the game is over. The program will notify the user by changing the title of the window to "We have a winner!"

### Part 2 TODO
1. Examine the main method in the LinearMain class in the linearLightsOut package in the LinearLightsOut project that you checked out in class. This is all the code that we supply for the project: the rest is your responsibility
1. Display a frame in a window with the title "Linear Lights Out!"
1. Create the buttons and display the correct number in the frame you created in the previous step (see nButtons). There is no need to worry about event handling yet. *For full credit, your solution must work with any value of nButtons greater than two.*
- *Stage 3:* Make sure the buttons are initialized to random symbols (Xs and Os, 50% probability each)
- *Stage 4:* Implement a working Quit button (This involves implementing an event handler for the Quit button)
- *Stage 5:* Implement a working New Game button. When the button it pressed, the game should reset the symbol 
buttons to a new set of random symbols
- *Stage 6:* Set up event handlers for the symbol buttons that correctly toggle the symbols as described above
- *Stage 7:* Check for a win and notify the player in some way through the GUI (not simply by System.out.println)
Changing the window title would suffice
<br> -- If you do that, be sure to change it back when the player clicks *New Game*.

### Collaboration Rules
- You may work with a single classmate of your choosing on this part.
- You may sit together while you work and discuss ideas and code freely, but each person must type and upload their own files to the assignment's dropbox.
- We highly recommend that you seek out a partner to collaborate on this part of the assignment.
    - Why? Because you will be working on a multi-week project with at least 1 partner toward the end of this quarter. Now is a good time to find someone you can work with
- **If you do work with a partner, each partner must identify the other in a comment at the top of your program.**


- This starter package is providing less *scaffolding* for getting you started
- But everything you need to solve the problem has either appeared in previous homework or examples, or is in the Java API
documentation for *JButton*
- Remember to ask for help if you get stuck.  

Here's a screenshot of the game in progress:
<br>
![LinearLightsOut app](images/LinearLightsOut.png)


Here's a screenshot of a game that was won with all Xs:
<br>
![game won](images/LinearLightsOutWonGame.png)


*Part 2 To Do*:


## Notes:
1. *JButton*'s *setText()* and *getText()* methods are your friends, use them
2. You do not need to use inheritance to solve this problem
3. You may, however, use inheritance in this project if you wish: extending JFrame, JButton, and/or JPanel, for example
4. Correct ALL compiler warnings - those warnings are telling you that something is incorrect about your code







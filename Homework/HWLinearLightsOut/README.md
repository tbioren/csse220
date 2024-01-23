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

![ball-strike](images/ballstrike.gif)<br/>

### Rubric
This part of the assignment is worth 40.0 points. You will receive deductions for the following:<br/>
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
| Academic dishonesty                           | -80.0         |

---

## Part 2 - Pair Part: Linear Lights Out
*Working Together*

- You may work with a single classmate of your choosing on this part
- You may sit together while you work and discuss ideas and code freely, but each person must type and upload their 
own files to the assignment's dropbox
- We highly recommend that you seek out a partner to collaborate on this part of the assignment
<br> -- Why? Because you will be working on a multi-week project with at least 1 partner toward the end of this quarter. Now is a good time to find someone you can work with
- If you do work together, each partner must identify the other in a comment at the top of your program  

*Overview*
1. Implement the app Linear Lights Out in the *linearLightsOut* package 
2. The app presents the user with an array of buttons that are randomly initialized to either Xs or Os, using a 50% probability
3. Clicking on a button changes the symbol of the clicked-on button and *both its left and right neighbors*, if those neighbors exist
<br>For example, a click on a button with the label X, changes it to an O, and changes the left and right neighbors' symbols similarly
4. Buttons on the end just change their own symbol and their one neighbor's symbol; the end buttons do not "wrap around"
5. The object of the game is to reach a state where all the buttons show the same symbol, either all Xs or all Os, it doesn't matter
6. When that happens the user *wins* and the game is over


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
- *Stage 0:* Examine the main method in the LinearMain class in the linearLightsOut package in the LinearLightsOut 
project that you checked out in class
<br> -- This is all the code that we supply for the project: the rest is your responsibility
- *Stage 1:* Display a frame with the right title
- *Stage 2:* Display the right number of buttons in the frame (see the nButtons variable in *LinearMain.main*) 
without worrying about event handling or the symbols on the buttons. 
<br> -- For full credit, your final solution must work with any *nButtons* greater than 2.
- *Stage 3:* Make sure the buttons are initialized to random symbols (Xs and Os, 50% probability each)
- *Stage 4:* Implement a working Quit button (This involves implementing an event handler for the Quit button)
- *Stage 5:* Implement a working New Game button. When the button it pressed, the game should reset the symbol 
buttons to a new set of random symbols
- *Stage 6:* Set up event handlers for the symbol buttons that correctly toggle the symbols as described above
- *Stage 7:* Check for a win and notify the player in some way through the GUI (not simply by System.out.println)
Changing the window title would suffice
<br> -- If you do that, be sure to change it back when the player clicks *New Game*.

## Notes:
1. *JButton*'s *setText()* and *getText()* methods are your friends, use them
2. You do not need to use inheritance to solve this problem
3. You may, however, use inheritance in this project if you wish: extending JFrame, JButton, and/or JPanel, for example
4. Correct ALL compiler warnings - those warnings are telling you that something is incorrect about your code







🤖 ToyRobot Simulator
A simple command-line Java program that simulates a toy robot moving on a grid. The robot can be placed at a specific location facing a direction, and then controlled using basic commands.

📦 Features
Accepts initial placement of the robot (PLACE x,y,FACING)
Supports movement and rotation commands:

- MOVE: Moves the robot one unit forward in the direction it is facing
- LEFT: Rotates the robot 90° to the left
- RIGHT: Rotates the robot 90° to the right
- REPORT: Outputs the robot's current position and facing direction

🚀 Getting Started
Prerequisites

- Java Development Kit (JDK) installed
- A terminal or command-line interface

Compilation bash
javac ToyRobot.java

Running the Program bash
java ToyRobot

🕹️ How to Use
Start by placing the robot using the PLACE command:
Code
PLACE 0,0,NORTH

Enter commands one by one:
Code
MOVE
LEFT
RIGHT
REPORT

When you enter REPORT, the program will output the robot’s current position and direction:
Code
Output: 0,1,NORTH

📘 Example Scenarios
a) Move Forward
Code
PLACE 0,0,NORTH
MOVE
REPORT
Output:
Code
Output: 0,1,NORTH

b) Rotate Left
Code
PLACE 0,0,NORTH
LEFT
REPORT
Output:
Code
Output: 0,0,WEST

c) Complex Movement
Code
PLACE 1,2,EAST
MOVE
MOVE
LEFT
MOVE
REPORT
Output:
Code
Output: 3,3,NORTH

⚠️ Notes
Only valid commands are accepted: MOVE, LEFT, RIGHT, REPORT
Invalid input will result in an error message
The robot must be placed before any other commands are executed

📄 License
This project is open-source and free to use for educational or personal purposes.

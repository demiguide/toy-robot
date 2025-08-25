public class test {

    public static void main(String[] args) {

        // test function changePoint()
        ToyRobot toy1 = new ToyRobot(0, 0, "NORTH");
        toy1.changePoint(); // move forward 1 position -> x=0,y=1,face=NORTH
        if (toy1.x == 0 && toy1.y == 1 && toy1.face.equals("NORTH"))
            System.out.println("1 correct");
        else
            System.out.println("1 false");

        toy1.face = "EAST";
        toy1.x = 0;
        toy1.y = 0;
        toy1.changePoint(); // move forward 1 position -> x=1,y=0,face=EAST
        if (toy1.x == 1 && toy1.y == 0 && toy1.face.equals("EAST"))
            System.out.println("2 correct");
        else
            System.out.println("2 false");

        toy1.face = "SOUTH";
        toy1.x = 0;
        toy1.y = 0;
        toy1.changePoint(); // move forward 1 position -> x=0,y=-1,face=SOUTH
        if (toy1.x == 0 && toy1.y == -1 && toy1.face.equals("SOUTH"))
            System.out.println("3 correct");
        else
            System.out.println("3 false");

        toy1.face = "WEST";
        toy1.x = 0;
        toy1.y = 0;
        toy1.changePoint(); // move forward 1 position -> x=-1,y=0,face=WEST
        if (toy1.x == -1 && toy1.y == 0 && toy1.face.equals("WEST"))
            System.out.println("4 correct");
        else
            System.out.println("4 false");

        // test function runCommand(String command)
        ToyRobot toy2 = new ToyRobot(0, 0, "NORTH");

        String command = "MOVE"; // call changePoint() function
        toy2.runCommand(command);
        if (toy2.y == 1)
            System.out.println("5 correct");
        else
            System.out.println("5 false");

        command = "LEFT"; // NORTH turn left -> WEST
        toy2.face = "NORTH";
        toy2.runCommand(command);
        if (toy2.face.equals("WEST"))
            System.out.println("6 correct");
        else
            System.out.println("6 false");

        command = "RIGHT"; // NORTH turn right -> EAST
        toy2.face = "NORTH";
        toy2.runCommand(command);
        if (toy2.face.equals("EAST"))
            System.out.println("7 correct");
        else
            System.out.println("7 false");

        toy2.x = 0;
        toy2.y = 0;
        toy2.face = "WEST";
        command = "MOVE"; // call changePoint() function
        toy2.runCommand(command);
        if (toy2.x == -1)
            System.out.println("8 correct");
        else
            System.out.println("8 false");

        command = "LEFT"; // WEST turn left -> SOUTH
        toy2.face = "WEST";
        toy2.runCommand(command);
        if (toy2.face.equals("SOUTH"))
            System.out.println("9 correct");
        else
            System.out.println("9 false");

        command = "RIGHT"; // WEST turn right -> NORTH
        toy2.face = "WEST";
        toy2.runCommand(command);
        if (toy2.face.equals("NORTH"))
            System.out.println("10 correct");
        else
            System.out.println("10 false");

        toy2.x = 0;
        toy2.y = 0;
        toy2.face = "SOUTH";
        command = "MOVE"; // call changePoint() function
        toy2.runCommand(command);
        if (toy2.y == -1)
            System.out.println("11 correct");
        else
            System.out.println("11 false");

        command = "LEFT"; // SOUTH turn left -> EAST
        toy2.face = "SOUTH";
        toy2.runCommand(command);
        if (toy2.face.equals("EAST"))
            System.out.println("12 correct");
        else
            System.out.println("12 false");

        command = "RIGHT"; // SOUTH turn right -> WEST
        toy2.face = "SOUTH";
        toy2.runCommand(command);
        if (toy2.face.equals("WEST"))
            System.out.println("13 correct");
        else
            System.out.println("13 false");

        toy2.x = 0;
        toy2.y = 0;
        toy2.face = "EAST";
        command = "MOVE"; // call changePoint() function
        toy2.runCommand(command);
        if (toy2.x == 1)
            System.out.println("14 correct");
        else
            System.out.println("14 false");

        command = "LEFT"; // EAST turn left -> NORTH
        toy2.face = "EAST";
        toy2.runCommand(command);
        if (toy2.face.equals("NORTH"))
            System.out.println("15 correct");
        else
            System.out.println("15 false");

        command = "RIGHT"; // EAST turn right -> SOUTH
        toy2.face = "EAST";
        toy2.runCommand(command);
        if (toy2.face.equals("SOUTH"))
            System.out.println("16 correct");
        else
            System.out.println("16 false");
    }
}

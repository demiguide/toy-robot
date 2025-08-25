import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/* 
    PLACE 0,0,NORTH  
    MOVE  
    REPORT   
    Output: 0,1,NORTH  
    b)----------------  
    PLACE 0,0,NORTH  
    LEFT  
    REPORT  
    Output: 0,0,WEST  
    c)----------------  
    PLACE 1,2,EAST  
    MOVE  
    MOVE  
    LEFT  
    MOVE  
    REPORT  
    Output: 3,3,NORTH
 */

public class ToyRobot {
    public static int x = 0;
    public static int y = 0;
    public static String face = "";
    public static List<String> commandList = Arrays.asList("MOVE", "LEFT", "RIGHT", "REPORT");
    public static List<String> facePositionList = Arrays.asList("NORTH", "EAST", "SOUTH", "WEST");

    public ToyRobot() {
    }

    public ToyRobot(int x, int y, String face) {
        this.x = x;
        this.y = y;
        this.face = face;
    }

    public static void changePoint() {
        if (face.equals("NORTH")) {
            y += 1;
        } else if (face.equals("EAST")) {
            x += 1;
        } else if (face.equals("SOUTH")) {
            y -= 1;
        } else {
            x -= 1;
        }
    }

    public static void runCommand(String command) {
        if (command.equals("MOVE")) {
            changePoint();
        } else if (command.equals("RIGHT")) {
            int newIndexFacePosition = facePositionList.indexOf(face) + 1;
            newIndexFacePosition = newIndexFacePosition == 4 ? 0 : newIndexFacePosition;
            face = facePositionList.get(newIndexFacePosition);
        } else if (command.equals("LEFT")) {
            int newIndexFacePosition = facePositionList.indexOf(face) - 1;
            newIndexFacePosition = newIndexFacePosition == -1 ? 3 : newIndexFacePosition;
            face = facePositionList.get(newIndexFacePosition);
        }
    }

    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        // input starting point example PLACE 0,0,NORTH
        System.out.print("PLACE ");
        String startingPoint = input.nextLine();

        String point[] = startingPoint.trim().replaceAll(" ", "").split(",");

        if (point.length == 3) {
            x = Integer.parseInt(point[0]);
            y = Integer.parseInt(point[1]);
            face = point[2];

            while (true) {
                String command = input.nextLine();
                if (commandList.contains(command)) {
                    if (!command.equals("REPORT")) {
                        runCommand(command);
                    } else {
                        // print output
                        System.out.println("Output: " + x + "," + y + "," + face);
                        break;
                    }
                } else {
                    System.out.println("INCORRECT COMMAND");
                    break;
                }
            }
        } else {
            System.out.println("INCORRECT STARTING POINT");
        }
    }
}
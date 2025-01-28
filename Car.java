import java.awt.*;

public class Car implements Movable {

    public int nrDoors; // Number of doors on the car
    public double enginePower; // Engine power of the car
    public double currentSpeed; // The current speed of the car
    public Color color; // Color of the car
    public String modelName;

    private double xPos;
    private double yPos;

    private String[] dirs = new String[4];

    private int dirsIndex = 0;

    public Car(int nrDoors, Color color, Double enginePower, String modelName, Double xPos, Double yPos) {
        this.nrDoors = nrDoors;
        this.color = color;
        this.enginePower = enginePower;
        this.modelName = modelName;
        this.xPos = xPos;
        this.yPos = yPos;

        stopEngine();
    }


    public int getNrDoors() {
        return nrDoors;
    }

    public double getEnginePower() {
        return enginePower;
    }

    public double getCurrentSpeed() {
        return currentSpeed;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color clr) {
        color = clr;
    }

    public void startEngine() {
        currentSpeed = 0.1;
    }

    public void stopEngine() {
        currentSpeed = 0;
    }

    public String getDirection(String[] dirs, int dirsIndex) {
        return dirs[dirsIndex];
    }


    public void move(String[] dirs, int dirsIndex) {
        String direction = getDirection(String[] dirs, int dirsIndex);



    }


    public void turnLeft(int dirsIndex) {
        dirsIndex -= 1;
    }

    public void turnRight(int dirsIndex) {
        dirsIndex += 1;
    }

}




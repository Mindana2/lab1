import java.awt.*;

public class Car implements Movable {

    public int nrDoors; // Number of doors on the car
    public double enginePower; // Engine power of the car
    public double currentSpeed; // The current speed of the car
    private Color color; // Color of the car
    private final String modelName;

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
        return this.nrDoors;
    }

    public double getEnginePower() {
        return this.enginePower;
    }

    public double getCurrentSpeed() {
        return this.currentSpeed;
    }

    public Color getColor() {
        return this.color;
    }

    public void setColor(Color clr) {
        this.color = clr;
    }

    public void startEngine() {
        this.currentSpeed = 0.1;
    }

    public void stopEngine() {
        this.currentSpeed = 0;
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




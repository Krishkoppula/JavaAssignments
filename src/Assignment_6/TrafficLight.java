package Assignment_6;

public class TrafficLight {
    // Private attributes
    private String color;
    private int duration;

    // Constructor to initialize attributes
    public TrafficLight(String initialColor, int initialDuration) {
        this.color = initialColor;
        this.duration = initialDuration;
    }

    // Getter for color
    public String getColor() {
        return color;
    }

    // Setter for color
    public void setColor(String newColor) {
        this.color = newColor;
    }

    // Getter for duration
    public int getDuration() {
        return duration;
    }

    // Setter for duration
    public void setDuration(int newDuration) {
        this.duration = newDuration;
    }

    // Method to change the color
    public void changeColor(String newColor) {
        setColor(newColor);
        System.out.println("Traffic light changed to " + newColor + " color.");
    }

    // Method to check if the light is red
    public boolean isRed() {
        return color.equalsIgnoreCase("red");
    }

    // Method to check if the light is green
    public boolean isGreen() {
        return color.equalsIgnoreCase("green");
    }

    public static void main(String[] args) {
        // Example usage
        TrafficLight trafficLight = new TrafficLight("red", 30);

        System.out.println("Current color: " + trafficLight.getColor());
        System.out.println("Is it red? " + trafficLight.isRed());
        System.out.println("Is it green? " + trafficLight.isGreen());

        trafficLight.changeColor("green");

        System.out.println("Current color: " + trafficLight.getColor());
        System.out.println("Is it red? " + trafficLight.isRed());
        System.out.println("Is it green? " + trafficLight.isGreen());
    }
}

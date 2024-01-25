package Assignment_6;

public class TrafficLight {
    private String color;
    private int duration;
    public TrafficLight(String color,int duration){
        this.color=color;
        this.duration=duration;
        System.out.println("Current Signal is:"+color);
        System.out.println("Duration:"+duration+" Seconds");
    }
    public String getColor(){
        return color;
    }
    public void setColor(){
        this.color=color;
    }
    public int getDuration(){
        return duration;
    }
    public void setDuration(){
        this.duration=duration;
    }
    public void changeColor(String newColor){
        System.out.println("Traffic Light is changing to: "+newColor);
        System.out.println("Duration "+newColor);

    }


    public static void main(String[] args){
        System.out.println("Traffic Signal");
        TrafficLight obj1= new TrafficLight("Red",20);
        obj1.changeColor("green");

    }
}

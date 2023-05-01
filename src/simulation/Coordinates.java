package simulation;

public class Coordinates {
    private int longitude;
    private int latitude;
    private int height;

    public Coordinates(int longitude, int latitude, int height){
        this.longitude = longitude%360;
        this.latitude = latitude%360;
        this.height = Math.min(height, 100);
    }
    public int getLongitude(){
        return this.longitude;
    }

    public int getLatitude(){
        return this.latitude;
    }

    public int getHeight(){
        return this.height;
    }
    
}

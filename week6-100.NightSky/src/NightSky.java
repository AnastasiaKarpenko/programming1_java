
public class NightSky {

    private double density;
    private int width;
    private int height;

    public NightSky(double density) {
        this.density = density;
        this.width = 20;
        this.height = 10;

    }

    public NightSky(int width, int height) {
        this.density = 0.1;
        this.width = width;
        this.height = height;

    }

    public NightSky(double density, int width, int height) {
        this.density = density;
        this.width = width;
        this.height = height;
    }
    
    public String printLine() {
        
    }

}

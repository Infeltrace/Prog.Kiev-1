public class Rectangle extends Figures {
    private double x;
    private double y;

    public Rectangle(){

    }

    public Rectangle(int x, int y){
        name = "Rectangle";
        this.x = x;
        this.y = y;
    }

    @Override
    public double getSquare() {
        return x * y;
    }
}
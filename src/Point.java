public class Point {
    private String label;
    private int x;
    private int y;

    public Point(String label, int x, int y){
        this.label = label;
        this.x = x;
        this.y = y;
    }

    public String getLabel() {
        return label;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public String toString(){
        return "Point " + label + " is at x = " + x + ", y = " + y;
    }
    public boolean equals(Object o){
        if (o == null || !(o instanceof Point)){
            return false;
        }
        Point p = (Point) o;
        if (p.getX() == this.x && p.getY() == y){
            return true;
        }
        return false;
    }
}

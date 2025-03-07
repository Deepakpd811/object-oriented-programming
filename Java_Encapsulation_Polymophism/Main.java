
class Point {
    private double x;
    private double y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
}

class Line {
    private Point start;
    private Point end;

    Line(Point start, Point end) {
        this.start = start;
        this.end = end;
    }

    double getLength() {
        double dx = end.getX() - start.getX();
        double dy = end.getY() - start.getY();
        return Math.sqrt(dx * dx + dy * dy);
    }

    @Override
    public boolean equals(Object obj) {
        // if (this == obj) return true; // Same object
        
        // if (obj == null || getClass() != obj.getClass()) return false; // Null or different class
       
        Line ll = (Line) obj;
        return ll.getLength() == getLength();
    }

}

public class Main {
    public static void main(String[] args) {
        Point p1 = new Point(4, 6);
        Point p2 = new Point(4, 6);
        Point p3 = new Point(5, 8);
  

        Line l1 = new Line(p1, p2);
        Line l2 = new Line(p1, p2);


        if(l1.equals(l2)){
            System.out.println("Line is equal");
        }else{
            System.out.println("Line is not equal");

        }

    }
}

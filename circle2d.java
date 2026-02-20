public class circle2d {
    private double x;
    private double y;
    private double radius;

    public circle2d(){
        x = 0;
        y = 0;
        radius = 1;
    }

    public circle2d(double x, double y, double radius){
        this.x = x;
        this.y = y;
        this.radius = radius;
    } 


    public void setCenter(double x, double y){
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }
    
    public double getY() {
        return y;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea(){
        double area;
        area = Math.PI * radius * radius;
        return area;
    }

    public double getPerimeter(){
        double perimeter;
        perimeter = Math.PI * 2 * radius;
        return perimeter;
    }

    public boolean contains(double x, double y){
        double jarak;
        jarak = Math.sqrt(Math.pow((x - this.x), 2) + Math.pow((y - this.y), 2));
        
        if (jarak < this.radius) {
            return true;
        } else {
            return false;
        }
    }

    public int contains(circle2d circle){
        double jarak;
        jarak = Math.sqrt(Math.pow((circle.getX() - this.x), 2) + Math.pow((circle.getY() - this.y), 2));
        
        if ((jarak + circle.getRadius()) < this.radius) {
            return 1;
        } else if ((jarak < this.radius) && ((jarak + circle.getRadius()) > this.radius)) { 
            return 2;
        } else {
            return 3;
        }

    }
}

public class Circle{
    private double radius;
    public Circle() {
    }

    public double getRadius() {
        return radius;
    }

    public Circle (double radius) {
        this.radius=radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }

}

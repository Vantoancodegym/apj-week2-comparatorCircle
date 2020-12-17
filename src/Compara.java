import java.util.Comparator;

public class Compara implements Comparator<Circle> {
    @Override
    public int compare(Circle o1, Circle o2) {
        if (o1.getRadius()>o2.getRadius())return 1;
        if (o1.getRadius()<o2.getRadius())return -1;
        else return -1;
    }
}
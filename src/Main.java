package Second
import java.util.Date;

public class Main
{
    public static void main(String[] args)
    {
        Circle circle = new Circle(7.5);
        System.out.println(circle.toString() + ", circle area: " + String.format("%.3f", circle.get_area()));
        circle.set_radius(123.2);
        System.out.println(circle.toString() + ", circle area: " + String.format("%.3f", circle.get_area()));
    }
}
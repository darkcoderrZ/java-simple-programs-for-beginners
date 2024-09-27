import com.codewithharry.shape.Cylinder;
import com.codewithharry.shape.Sphere;
import com.codewithharry.shape.Circle;
import com.codewithharry.shape.Rectangle;
import com.codewithharry.shape.Square;
public class usingpackage{
public static void main(String[] args){
Cylinder c = new Cylinder();
c.setradius(5);
c.setheight(10);
c.surfacearea();
c.volume();
Sphere s = new Sphere();
s.setradius(5);
s.surfacearea();
s.volume();
Circle ci = new Circle();
ci.setradius(5);
ci.surfacearea();
Rectangle r  = new Rectangle();
r.setradius(44);
r.setheight(9);
r.surfacearea();
Square sq  = new Square();
sq.setradius(9);
sq.surfacearea();
}
}
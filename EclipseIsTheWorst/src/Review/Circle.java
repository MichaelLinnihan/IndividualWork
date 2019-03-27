package Review;
public class Circle
{
//instance field(s)   
private double radius;
 
 //constructor(s)
    public Circle( )
   {
 radius = -99; 
   }

  public Circle(double xRadius)
   {
 radius = xRadius;       
    }

//Accessor Methods
   public double getRadius()
   {
        return radius;   
    }

public double circumference( ) 
   {
      return  2 * radius * Math.PI;
   }

  public double area( ) 
   {
      return Math.PI * radius * radius;
    }

//Mutator methods
   public void setRadius(double xRadius)
   {
       radius = xRadius;
   }
}


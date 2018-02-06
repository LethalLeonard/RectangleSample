public class Rectangle
{
    private double length, width;

    /**
     * Default constructor with no parameters. If this is removed it wouldn't
     * change anything because it would be the same as if Java automatically
     * generated it. Can be removed, but it is here to show what the program
     * would default to.
     */
    public Rectangle()
    {
        length = 0;
        width = 0;
    }

    /**
     * Constructor that is passed a length and a width. This information is set
     * to the object instance's variables.
     */
    public Rectangle(double len, double wid)
    {
        length = len;
        width = wid;
    }

    /**
     * If one number is passed, it is assumed that both the length
     * and the width are the same. Making the rectangle a square.
     */
    public Rectangle(double side)
    {
        length = side;
        width = side;
    }

    /**
     * If method is called, the object's instance is then updated
     * to the passed length value.
     */
    public void setLength(double len)
    {
        length = len;
    }

    /**
     * If method is called, the object's instance is then updated
     * to the passed width value.
     */
    public void setWidth(double wid)
    {
        width = wid;
    }

    /**
     * If method is called, returns the instances length to where
     * it was called.
     */
    public double getLength()
    {
        return length;
    }

    /**
     * If method is called, returns the instances width to where
     * it was called.
     */
    public double getWidth()
    {
        return width;
    }

    /**
     * If method is called, calculates the area with the length
     * and width variables within the instance and returns the
     * calculation to where the method was called.
     */
    public double getArea()
    {
        return length * width;
    }

    /**
     * If method is called, calculates the perimeter with the
     * length and width variables within the instance and
     * returns the calculation to where the method was called.
     */
    public double getPerimeter()
    {
        return( (2 * length) + (2 * width) );
    }
}

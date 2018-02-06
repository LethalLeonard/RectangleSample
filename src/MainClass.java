public class MainClass
{
    public static void main(String[] args)
    {
        //Creates instance of the first box using the
        //default constructor
        Rectangle box1 = new Rectangle();

        //Creates instance of the second box using the constructor
        //that sets the length and width separate
        Rectangle box2= new Rectangle(7,3);

        //Creates instance of the third box using the constructor
        //that sets the length and width as the same value
        Rectangle box3 = new Rectangle(9);

        //Generates the system output for the first set of boxes
        System.out.println(
                "Box 1:" +
                        "\n\tLength: " + box1.getLength() +
                        "\n\tWidth: " + box1.getWidth() +
                        "\n\tArea: " + box1.getArea() +
                        "\n\tPerimeter: " + box1.getPerimeter() + '\n' +
                "Box 2:" +
                        "\n\tLength: " + box2.getLength() +
                        "\n\tWidth: " + box2.getWidth() +
                        "\n\tArea: " + box2.getArea() +
                        "\n\tPerimeter: " + box2.getPerimeter() + '\n' +
                "Box 3:" +
                        "\n\tLength: " + box3.getLength() +
                        "\n\tWidth: " + box3.getWidth() +
                        "\n\tArea: " + box3.getArea() +
                        "\n\tPerimeter: " + box3.getPerimeter() + '\n'
            );

        //sets values to the first boxes instance
        box1.setLength(10);
        box1.setWidth(5);

        //Generates output for the boxes after changing the
        //values within box1s
        System.out.println(
                "Editing box1...\n\n" +
                "Box 1:" +
                        "\n\tLength: " + box1.getLength() +
                        "\n\tWidth: " + box1.getWidth() +
                        "\n\tArea: " + box1.getArea() +
                        "\n\tPerimeter: " + box1.getPerimeter() + '\n' +
                "Box 2:" +
                        "\n\tLength: " + box2.getLength() +
                        "\n\tWidth: " + box2.getWidth() +
                        "\n\tArea: " + box2.getArea() +
                        "\n\tPerimeter: " + box2.getPerimeter() + '\n' +
                "Box 3:" +
                        "\n\tLength: " + box3.getLength() +
                        "\n\tWidth: " + box3.getWidth() +
                        "\n\tArea: " + box3.getArea() +
                        "\n\tPerimeter: " + box3.getPerimeter()
        );
    }
}

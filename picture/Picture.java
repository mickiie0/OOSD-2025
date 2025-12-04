
/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author Michael Kölling and David J. Barnes
 * @version 1.1 (24 May 2001)
 */
public class Picture {
    private Square wall;
    private Square window;
    private Triangle roof;
    private Circle sun;

    /**
     * Constructor for objects of class Picture
     */
    public Picture() {
        // nothing to do... instance variables are automatically set to null
    }

    /**
     * Draw this picture.
     */
    public void draw() {
        Square box1 = new Square();
        Square box2 = new Square();
        Square box3 = new Square();
        box1.moveVertical(75);
        box1.moveHorizontal(75);
        box1.changeSize(40);
        box1.changeColor("black");
        box1.makeVisible();

        box2.moveVertical(116);
        box2.moveHorizontal(75);
        box2.changeSize(40);
        box2.changeColor("black");
        box2.makeVisible();
        
        box3.moveVertical(158);
        box3.moveHorizontal(75);
        box3.changeSize(40);
        box3.changeColor("black");
        box3.makeVisible();

        Circle c1 = new Circle();
        Circle c2 = new Circle();
        Circle c3 = new Circle();

        
        c1.moveVertical(70);
        c1.moveHorizontal(120);
        c1.changeSize(30);
        c1.changeColor("red");
        c1.makeVisible();
        
        c2.moveVertical(110);
        c2.moveHorizontal(120);
        c2.changeSize(30);
        c2.changeColor("yellow");
        c2.makeVisible();
        
        c3.moveVertical(153);
        c3.moveHorizontal(120);
        c3.changeSize(30);
        c3.changeColor("green");
        c3.makeVisible();
        // wall = new Square();
        // wall.moveVertical(80);
        // wall.changeSize(100);
        // wall.makeVisible();

        // window = new Square();
        // window.changeColor("black");
        // window.moveHorizontal(20);
        // window.moveVertical(100);
        // window.makeVisible();

        // roof = new Triangle();
        // roof.changeSize(50, 140);
        // roof.moveHorizontal(60);
        // roof.moveVertical(70);
        // roof.makeVisible();

        // sun = new Circle();
        // sun.changeColor("yellow");
        // sun.moveHorizontal(180);
        // sun.moveVertical(-10);
        // sun.changeSize(60);
        // sun.makeVisible();
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite() {
        if (wall != null) // only if it's painted already...
        {
            wall.changeColor("black");
            window.changeColor("white");
            roof.changeColor("black");
            sun.changeColor("black");
        }
    }

    /**
     * Change this picture to use color display
     */
    public void setColor() {
        if (wall != null) // only if it's painted already...
        {
            wall.changeColor("red");
            window.changeColor("black");
            roof.changeColor("green");
            sun.changeColor("yellow");
        }
    }

}

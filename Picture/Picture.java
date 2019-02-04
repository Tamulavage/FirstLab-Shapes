
/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Michael Kölling and David J. Barnes
 * @version 1.1  (24 May 2001)
 */
public class Picture
{

    private Square door;
    private Square house;
    private Triangle roof;
    private Circle sun;
    private Triangle tree;
    private Square wall;
    private Square window;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        // nothing to do... instance variables are automatically set to null
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        house = new Square();
        house.changeColor("black");
        house.moveHorizontal(59);
        house.moveVertical(110);
        house.changeSize(100);
        house.makeVisible();
        
        door = new Square();
        door.changeColor("red");
        door.moveHorizontal(100);
        door.moveVertical(175);
        door.changeSize(35);
        door.makeVisible();
        
        roof = new Triangle();
        roof.changeColor("blue");
        roof.changeSize(25,100);
        roof.moveHorizontal(120);
        roof.moveVertical(125);
        roof.makeVisible();
        
        tree = new Triangle();
        tree.changeColor("green");
        tree.changeSize(100,50);
        tree.moveHorizontal(220);
        tree.moveVertical(150);
        tree.makeVisible();
        
        sun = new Circle();
        sun.changeColor("yellow");
        sun.changeSize(30);
        sun.moveHorizontal(40);
        sun.moveVertical(40);
        sun.makeVisible();
        
        /*
        
        wall = new Square();
        wall.moveVertical(80);
        wall.changeSize(100);
        wall.makeVisible();
     
      

        window = new Square();
        window.changeColor("black");
        window.moveHorizontal(20);
        window.moveVertical(100);
        window.makeVisible();

        roof = new Triangle();
        roof.changeSize(50, 140);
        roof.moveHorizontal(60);
        roof.moveVertical(70);
        roof.makeVisible();

        sun = new Circle();
        sun.changeColor("black");
        sun.moveHorizontal(180);
        sun.moveVertical(-10);
        sun.changeSize(60);
        sun.makeVisible();
        */
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        if(wall != null)   // only if it's painted already...
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
    public void setColor()
    {
        if(wall != null)   // only if it's painted already...
        {
            wall.changeColor("red");
            window.changeColor("black");
            roof.changeColor("green");
            sun.changeColor("yellow");
        }
    }

}

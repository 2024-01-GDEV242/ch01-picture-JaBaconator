/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Michael Kšlling and David J. Barnes
 * @version 2016.02.29
 */
public class Picture
{
    private Square mast;
    private Square ocean;
    private Triangle flag;
    private Circle boat;
    private Person human;
    private Square halfboat;
    private boolean drawn;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        mast = new Square();
        ocean = new Square();
        boat = new Circle();
        halfboat = new Square();
        flag = new Triangle();
        human = new Person();
        drawn = false;
        
        
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        if(!drawn) {
            mast.makeVisible();
            
            ocean.makeVisible();
            
            boat.makeVisible();
            halfboat.makeVisible();
            
            flag.makeVisible();
            
            human.makeVisible();
            
            drawn = true;
        }
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        
    }
}

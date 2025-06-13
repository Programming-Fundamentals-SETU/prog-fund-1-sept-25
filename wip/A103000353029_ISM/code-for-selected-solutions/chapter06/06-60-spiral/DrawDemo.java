import java.awt.Color;
import java.util.Random;
import java.awt.Dimension;

/**
 * Class DrawDemo - provides some short demonstrations showing how to use the 
 * Pen class to create various drawings.
 *
 * @author Michael Kölling and David J. Barnes
 * @version 7.0
 */

public class DrawDemo
{
    private Canvas myCanvas;
    private Random random;

    /**
     * Prepare the drawing demo. Create a fresh canvas and make it visible.
     */
    public DrawDemo()
    {
        myCanvas = new Canvas("Drawing Demo", 500, 400);
        random = new Random();
    }

    /**
     * Draw a square on the screen.
     */
    public void drawSquare()
    {
        Pen pen = new Pen(320, 260, myCanvas);
        pen.setColor(Color.BLUE);

        square(pen);
    }

    /**
     * Draw a polygon with the given number of sides.
     * @param n The number of sides.
     */
    public void drawPolygon(int n)
    {
        Pen pen = new Pen(320, 260, myCanvas);
        pen.setColor(Color.MAGENTA);
        polygon(pen, n);
    }

    /**
     * Draw a wheel made of many squares.
     */
    public void drawWheel()
    {
        Pen pen = new Pen(250, 200, myCanvas);
        pen.setColor(Color.RED);

        for(int i=0; i<36; i++) {
            square(pen);
            pen.turn(10);
        }
    }
    
    /**
     * Draw a spiral.
     */
    public void drawSpiral()
    {
        Pen pen = new Pen(320, 260, myCanvas);
        pen.setColor(Color.BLACK);
        spiral(pen);
    }

    /**
     * Draw a square in the pen's color at the pen's location.
     */
    private void square(Pen pen)
    {
        for(int i = 0; i < 4; i++) {
            pen.move(100);
            pen.turn(90);
        }
    }

    /**
     * Draw a polygon with the given number of side
     * in the pen's color at the pen's location.
     * @param sides The number of sides.
     */
    private void polygon(Pen pen, int sides)
    {
        for(int i = 0; i < sides; i++) {
            pen.move(100);
            pen.turn(360 / sides);
        }
    }
    
    /**
     * Draw a spiral in the pen's color at the pen's location.
     */
    private void spiral(Pen pen)
    {
        // The number of arms.
        int arms = 63;
        // The current length of the arm being drawn.
        int armLength = 3;
        // How much longer to make each arm.
        int armIncrement = 2;
        
        // Start in the middle.
        pen.penUp();
        Dimension size = myCanvas.getSize();
        pen.moveTo(size.width / 2, size.height / 2);
        // Face downwards.
        pen.turnTo(90);
        pen.penDown();
        
        // Draw arms of increasing length.
        for(int arm = 0; arm < arms; arm++) {
            pen.move(armLength);
            pen.turn(90);
            armLength += armIncrement;
        }
    }

    /**
     * Draw some random squiggles on the screen, in random colors.
     */
    public void colorScribble()
    {
        Pen pen = new Pen(250, 200, myCanvas);

        for (int i=0; i<10; i++) {
            // pick a random color
            int red = random.nextInt(256);
            int green = random.nextInt(256);
            int blue = random.nextInt(256);
            pen.setColor(new Color(red, green, blue));
            
            pen.randomSquiggle();
        }
    }
    
    /**
     * Clear the screen.
     */
    public void clear()
    {
        myCanvas.erase();
    }
}

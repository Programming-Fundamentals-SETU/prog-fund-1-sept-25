import java.awt.*;
import java.awt.geom.*;

/**
 * A ball that bounces inside a box. 
 * 
 * @version 7.0
 * @author Poul Henriksen
 */
public class BoxBall
{   
    private int ballDegradation = 1;
    private Ellipse2D.Double circle;
    private Color color;
    private int diameter;
    private int xPosition;
    private int yPosition;
    private final Rectangle bounds;      
    private Canvas canvas;
    private int xSpeed;
    private int ySpeed;                // initial downward speed

    /**
     * Constructor for objects of class BoxBall
     *
     * @param xPos  the horizontal coordinate of the ball
     * @param yPos  the vertical coordinate of the ball
     * @param xSpeed  the horizontal speed of the ball
     * @param ySpeed  the vertical speed of the ball
     * 
     * @param ballDiameter  the diameter (in pixels) of the ball
     * @param ballColor  the color of the ball
     * @param bounds the rectangle the ball should bounce withing
     * @param drawingCanvas  the canvas to draw this ball on
     */
    public BoxBall(int xPos, int yPos, int xSpeed, int ySpeed, int ballDiameter, Color ballColor,
                        Rectangle boundingRectangle, Canvas drawingCanvas)
    {
        xPosition = xPos;
        yPosition = yPos;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
        color = ballColor;
        diameter = ballDiameter;
        bounds = boundingRectangle;
        canvas = drawingCanvas;
    }

    /**
     * Draw this ball at its current position onto the canvas.
     **/
    public void draw()
    {
        canvas.setForegroundColor(color);
        canvas.fillCircle(xPosition, yPosition, diameter);
    }

    /**
     * Erase this ball at its current position.
     **/
    public void erase()
    {
        canvas.eraseCircle(xPosition, yPosition, diameter);
    }    

    /**
     * Move this ball according to its position and speed and redraw.
     **/
    public void move()
    {
        // remove from canvas at the current position
        erase();
            
        // compute new position
        yPosition += ySpeed;
        xPosition += xSpeed;

        // check if it has hit the border        
        if(yPosition >= (bounds.getMaxY() - diameter) && ySpeed > 0) {
            yPosition = (int)(bounds.getMaxY() - diameter);
            ySpeed = -ySpeed + ballDegradation; 
            if(ySpeed > 0) {
                ySpeed = 0;
            }
        }
        else if(yPosition <= (bounds.getMinY()) && ySpeed < 0) {
            yPosition = (int)(bounds.getMinY()) + 1;
            ySpeed = -ySpeed - ballDegradation; 
            if(ySpeed < 0) {
                ySpeed = 0;
            }
        }
        if(xPosition >= (bounds.getMaxX() - diameter) && xSpeed > 0) {
            xPosition = (int)(bounds.getMaxX() - diameter);
            xSpeed = -xSpeed + ballDegradation; 
            if(xSpeed > 0) {
                xSpeed = 0;
            }
        }
        else if(xPosition <= (bounds.getMinX()) && xSpeed < 0) {
            xPosition = (int)(bounds.getMinX()) + 1;
            xSpeed = -xSpeed - ballDegradation;
            if(xSpeed < 0) {
                xSpeed = 0;
            }
        }
        

        // draw again at new position
        draw();
    }    

    /**
     * return the horizontal position of this ball
     */
    public int getXPosition()
    {
        return xPosition;
    }

    /**
     * return the vertical position of this ball
     */
    public int getYPosition()
    {
        return yPosition;
    }
    
    /**
     * return true if the ball is still moving
     */
    public boolean isMoving() {
        return (xSpeed != 0  || ySpeed != 0);
    }

}

import java.awt.Color;
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ticket here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
final class Ticket extends Actor
{
    Ticket(int width, int height, int value)
    {
        GreenfootImage image = new GreenfootImage(width, height);
        image.setColor(Color.YELLOW);
        image.fill();
        image.setColor(Color.BLACK);
        image.drawString("Ticket: " + value, width / 3, height / 2);
        this.setImage(image);
    }
    
}

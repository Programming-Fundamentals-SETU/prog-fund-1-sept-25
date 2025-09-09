package display;

import java.awt.Point;

import greenfoot.*;

abstract class ClockComponent {

    protected ClockComponent parent;

    ClockComponent(final ClockComponent parent)
    {
        this.parent = parent;
    }

    abstract GreenfootImage getImage();
    abstract int getHeight();
    abstract int getWidth();
    abstract Point getCenter();

    void draw(GreenfootImage image)
    {
        image.drawImage(this.getImage(),
                        this.parent.getCenter().x + this.getCenter().x - this.getWidth() / 2,
                        this.parent.getCenter().y + this.getCenter().y - this.getHeight() / 2);
    }

}

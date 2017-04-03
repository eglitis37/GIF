import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author Klavs Eglitis
 * @version 3/23/2017
 */
public class MyWorld extends World
{
    private final static int IMAGE_COUNT = 43;
    
    private static GreenfootImage[] images = new GreenfootImage[IMAGE_COUNT];
    
    private int imageNum = 0;
    
    private int increment = 1;
    
    private int actCycles = 0;
    
    private int slowness = 0;
    
    private int gifSpeedCounter = 0;
    
    /**
     * MyWorld switch pictures forward by one, making it a motion video 
     * using a loop.
     * @param There are not parameters.
     * @return An instance of MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(480, 270, 1);

        for( int i = 0; i < images.length; i++ )
        {
            images[i] = new GreenfootImage( "frame_" + i + "_delay-0.07s.gif");
        }
        
        setBackground(images[0]);
    }
    
    /**
     * Act - do whatever the Player wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        setBackground( images [actCycles % images.length]);
        
        if( gifSpeedCounter == slowness)
        {
            actCycles++;
            gifSpeedCounter = 0;
        }
        else
        {
            gifSpeedCounter ++;
        }
    }
    
    /**
     * setSlowness sets video slowness.
     * @param x is the number that represents how slow.
     * @return Nothing is returned.
     */
    public void setSlowness(int x)
    {
        slowness = x;
    }
}

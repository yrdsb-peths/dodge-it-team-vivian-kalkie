import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Banana extends Actor
{
    
    public void act()
    {
        move(-3);
        
        if(getX() <= 0) {
            resetBanana();
        }
        
        if(isTouching(Man.class))
        {
            //Add a gameover symbol
        
            getWorld().removeObject(this); 
        }
    }
    
    public void resetBanana() {
        int num = Greenfoot.getRandomNumber(2);
        if(num == 0) {
            setLocation(600, 100);
        } else {
            setLocation(600,300);
        }
    }
}

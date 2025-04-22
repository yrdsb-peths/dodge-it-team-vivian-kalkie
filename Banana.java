import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Banana extends Actor
{
    
    public void act()
    {
        move(-10);
        
        if(getX() <= 0) {
            resetBanana();
        }
<<<<<<< HEAD
        
        if(isTouching(Man.class))
        {
            //Add a gameover symbol
        
            getWorld().removeObject(this); 
=======
>>>>>>> b0fbc3f172cba974afaf6dc08753569657555af2
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

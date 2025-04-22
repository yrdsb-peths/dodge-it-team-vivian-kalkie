import greenfoot.*;  
public class Man extends Actor
{
    boolean atBottom = true;
    
    public void act()
    {
      if(Greenfoot.mouseClicked(null))
      {
          atBottom = !atBottom;
      }
      
      if(atBottom)
      {
          setLocation(100, 100);
      }
      else 
      {
          setLocation(100, 300);
      }
    }
}
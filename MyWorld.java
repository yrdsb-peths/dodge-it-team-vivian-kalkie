import greenfoot.*;

public class MyWorld extends World {
    public MyWorld() {
        super(600, 400, 1);
        
        Man man = new Man();
        addObject(man, 100, 100);
        
        Banana banana = new Banana();
        addObject(banana, 600, 100);
        
        Skull skull = new Skull();
        addObject(skull, 300, 200);
    }
}

import greenfoot.*;

public class MyWorld extends World {
    public MyWorld() {
        super(600, 400, 1);
        
        Man man = new Man();
        addObject(man, 100, 100);
        
        Banana banana = new Banana();
        addObject(banana, 600, 100);
        
        
        Wall wall = new Wall();
        addObject(wall, 300, 300);
        
        Tree tree = new Tree();
        addObject(tree, 500, 200);
    }
}


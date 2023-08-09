import java.awt.Graphics;

public class Stage {
    private Grid grid;
    private Actor[] actors;

    public Stage() {
        grid = new Grid();
        actors = new Actor[] {
            new Cat(grid.getCell(1, 1)),
            new Dog(grid.getCell(2, 2)),
            new Bird(grid.getCell(3, 3))
        };
    }

    public void paint(Graphics g) {
        grid.paint(g, null); 
        for (Actor actor : actors) {
            actor.paint(g);
        }
    }
    
}


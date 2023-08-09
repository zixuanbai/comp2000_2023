import java.awt.Color;
import java.awt.Graphics;

abstract class Actor {
    protected Cell cell;

    public Actor(Cell cell) {
        this.cell = cell;
    }

    public abstract void paint(Graphics g);
}

class Cat extends Actor {
    public Cat(Cell cell) {
        super(cell);
    }

    @Override
    public void paint(Graphics g) {
        g.setColor(Color.BLUE);
        g.fillRect(cell.getX(), cell.getY(), cell.getSize(), cell.getSize());
    }
}

class Dog extends Actor {
    public Dog(Cell cell) {
        super(cell);
    }

    @Override
    public void paint(Graphics g) {
        g.setColor(Color.YELLOW);
        g.fillOval(cell.getX(), cell.getY(), cell.getSize(), cell.getSize());
    }
}

class Bird extends Actor {
    public Bird(Cell cell) {
        super(cell);
    }

    @Override
    public void paint(Graphics g) {
        g.setColor(Color.GREEN);
        g.drawLine(cell.getX(), cell.getY(), cell.getX() + cell.getSize(), cell.getY() + cell.getSize());
        g.drawLine(cell.getX(), cell.getY() + cell.getSize(), cell.getX() + cell.getSize(), cell.getY());
    }
}





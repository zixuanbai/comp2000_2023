import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.*;

public class Main extends JFrame {
    public static void main(String[] args) {
        Main window = new Main();
    }

    private Main() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Grid grid = new Grid();
        this.setContentPane(grid);
        this.pack();
        this.setVisible(true);
    }
}

class Grid extends JPanel {
    private final int ROWS = 20;
    private final int COLS = 20;
    private Cell[][] cells;

    public Grid() {
        setPreferredSize(new Dimension(720, 720));
        cells = new Cell[ROWS][COLS];
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLS / 2; j++) {
                cells[i][j] = new Cell(j * 35, i * 35);
                cells[i][COLS - 1 - j] = new Cell((COLS - 1 - j) * 35, i * 35);
            }
        }
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLS; j++) {
                cells[i][j].draw(g);
            }
        }
    }
}

class Cell {
    private int x;
    private int y;
    private final int SIZE = 35;

    public Cell(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void draw(Graphics g) {
        g.drawRect(x, y, SIZE, SIZE);
    }
}


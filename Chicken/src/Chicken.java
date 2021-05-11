import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.awt.event.*;

public class Chicken extends Panel implements KeyListener {

    static String name;
    static Color cuu;
    static int b1 = 250, b2 = 220, b3 = 260,x = 0, y = 0, b4 = 240, b5 = 270, b6 =265;

    Chicken() {
        this.setBackground(new Color(255, 222, 173));
    }

    @Override
    public void paint(Graphics g) {

        g.setColor(cuu);
        g.fillOval(150, 50, 250, 250);//body

//        g.setColor(Color.yellow);
//          int x[]= {250,100,400};
//        int y[]= {50,250,250};       
//        g.fillPolygon(x, y, 3);
//        
        g.setColor(Color.red);
        int a[] = {250, 250, 280};
        int b[] = {20, 50, 50};
        g.fillPolygon(a, b, 3);//top

        g.setColor(new Color(65, 244, 134));
        int c[] = {280, 250, 300};
        int d[] = {10, 50, 50};
        g.fillPolygon(c, d, 3);//top

        g.setColor(new Color(66, 158, 244));
        int e[] = {250, 320, 268};
        int f[] = {50, 40, 75};
        g.fillPolygon(e, f, 3);//top

        g.setColor(Color.black);
        g.fillOval(190, 160, 50, 50);//eyes
        g.fillOval(270, 160, 50, 50);//eyes

        g.setColor(Color.white);
        g.fillOval(196, 160, 30, 30);
        g.fillOval(275, 160, 30, 30);//eyes

        g.setColor(Color.red);
        g.fillRect(180, 130, 55, 20);//eyebrows
        g.fillRect(270, 130, 55, 20);//eyebrows

        g.setColor(Color.red);
        int j[] = {260, 220, 265};
        int h[] = {b2, b1, b3};
        g.fillPolygon(j, h, 3);//beak1

        g.setColor(Color.red);
        int k[] = {265, 230, 265};
        int l[] = {b4, b5, b6};
        g.fillPolygon(k, l, 3);//beak2

        g.setColor(Color.red);
        int t[] = {200, 190, 240};
        int r[] = {270, 310, 295};
        g.fillPolygon(t, r, 3);//feet

        g.setColor(Color.red);
        int q[] = {290, 330, 350};
        int w[] = {295, 285, 320};
        g.fillPolygon(q, w, 3);//feet

        g.setColor(new Color(77, 77, 77));
        g.fillArc(200, 300, 130, 60, 180, 180);//shadow

        g.setColor(new Color(238, 65, 244));
        g.setFont(new Font("Franklin Gothic Demi",
                Font.ITALIC, 40));
        g.drawString("Hello " + name, 20, 40);

        g.drawString("I am a Cute Chicken", 20, 400);

    }

    public static void main(String[] args) {
        name = JOptionPane.showInputDialog("Enter you name: ");
        JFrame frame = new JFrame("LightningChicken");

        String choices[] = {"Yellow", "Cyan", "Orange", "Green"};
        String color = (String) JOptionPane.showInputDialog(null, "Choose a Color", "Color", JOptionPane.QUESTION_MESSAGE, null, choices, choices[0]);
        cuu = convert(color);
        Chicken panel = new Chicken();
panel.addKeyListener(panel);
        frame.setSize(550, 500);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        
        frame.add(panel);

    }

    public static Color convert(String c) {
        switch (c) {
            case "Yellow":
                return Color.yellow;
            case "Cyan":
                return Color.cyan;

            case "Orange":
                return Color.orange;
            case "Green":
                return Color.GREEN;

        }
        return Color.white;
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyChar() == 'u') {
            if (y == 0) {
                b1 = 230;
                y = 1;
            } else {
                b1 = 250;
                y = 0;
            }
        }
        repaint();
        
        if(e.getKeyChar() == 'h'){
         if (x == 0) {
                b5 = 275;
                x = 1;
            } else {
                b5 = 270;
                x = 0;
            }
        }
        repaint();
      
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

}


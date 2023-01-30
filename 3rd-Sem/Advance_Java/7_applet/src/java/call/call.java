/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package call;
import java.applet.Applet;
import java.awt.*;
/**
 *
 * @author mcacnj
 */
public class call extends Applet{
    Font bigFont;
    Color redColor;
    Color wiredColor;
    Color bgColor;
    @Override
    public void init(){
        bigFont = new Font("Arial", Font.BOLD, 16);
        redColor = Color.RED;
        wiredColor = new Color(60, 60, 122);
        bgColor = Color.yellow;
        setBackground(bgColor);
    }
    int x = 300, y = 100, r = 50;
    @Override
    public void paint(Graphics g){
        g.drawLine(300, 300, 200, 10);
        g.drawOval(x - r, y - r, 100, 100);
        g.drawRect(400, 50, 200, 100);
        g.drawString("HelloWorld!", 50, 25);
    }
}

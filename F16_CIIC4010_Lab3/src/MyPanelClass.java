
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.Polygon;

import javax.swing.JPanel;
 
public class MyPanelClass extends JPanel {
            /**
	 * 
	 */
	private static final long serialVersionUID = 7057541440811488699L;

			public void paintComponent(Graphics g) {
                        super.paintComponent(g);
 
                        //Compute interior coordinates
                        Insets myInsets = this.getInsets();
                        int x1 = myInsets.left;
                        int y1 = myInsets.top;
                        int x2 = getWidth() - myInsets.right - 1;
                        int y2 = getHeight() - myInsets.bottom - 1;
                        int width = x2 - x1;
                        int height = y2 - y1;
 
                        //Paint the background
                        g.setColor(Color.LIGHT_GRAY);
                        g.fillRect(x1, y1, width+1, height+1);
                        
                     
                 //Draw the big triangle
                        //Upper triangle 
                        Polygon p2 = new Polygon();
                        p2.addPoint(x1, y1+100);
                        p2.addPoint(x1, y1);
                        p2.addPoint(x1+150, y1+100);
                        //Bottom triangle
                        p2.addPoint(x1, y1+200);
                        p2.addPoint(x1, y1+100);
                        p2.addPoint(x1+150, y1+100);
                        g.setColor(Color.BLUE);
                        g.fillPolygon(p2);
                        
                //LINES
                      //Draw the First RED line
                        Polygon p3 = new Polygon();
                        p3.addPoint(x1, y1);
                        p3.addPoint(x1+60, y1+40);
                        p3.addPoint(x1+300, y1+40);
                        p3.addPoint(x1+300, y1);
                        p3.addPoint(x1, y1);
                        g.setColor(Color.RED);
                        g.fillPolygon(p3);
                                             
                        //Draw the First WHITE Line
                        Polygon p4 = new Polygon();
                        p4.addPoint(x1+60, y1+40);
                        p4.addPoint(x1+120, y1+80);
                        p4.addPoint(x1+300, y1+80);
                        p4.addPoint(x1+300, y1+40);
                        g.setColor(Color.WHITE);
                        g.fillPolygon(p4);
                        
                        //Draw the Second RED line
                        Polygon p5 = new Polygon();
                        p5.addPoint(x1+120, y1+80);
                        p5.addPoint(x1+150, y1+100);
                        p5.addPoint(x1+120, y1+120);
                        p5.addPoint(x1+300, y1+120);
                        p5.addPoint(x1+300, y1+80);
                        g.setColor(Color.RED);
                        g.fillPolygon(p5);
                        
                        //Draw the Second WHITE Line
                        Polygon p6 = new Polygon();
                        p6.addPoint(x1+120, y1+120);
                        p6.addPoint(x1+60, y1+160);
                        p6.addPoint(x1+300, y1+160);
                        p6.addPoint(x1+300, y1+120);
                        g.setColor(Color.WHITE);
                        g.fillPolygon(p6);
                        
                        //Draw the Third RED line
                        Polygon p7 = new Polygon();
                        p7.addPoint(x1+60, y1+160);
                        p7.addPoint(x1, y1+200);
                        p7.addPoint(x1+300, y1+200);
                        p7.addPoint(x1+300, y1+160);
                        g.setColor(Color.RED);
                        g.fillPolygon(p7);
                        
                        //Draw the Star
                        Polygon p8 = new Polygon();
                        p8.addPoint(x1 + 25 +10, y1 + 73 +15);
                        p8.addPoint(x1 + 41 +10, y1 + 73 +15);
                        p8.addPoint(x1 + 47 +10, y1 + 58 +15);
                        p8.addPoint(x1 + 53 +10, y1 + 73 +15);
                        p8.addPoint(x1 + 69 +10, y1 + 73 +15);
                        p8.addPoint(x1 + 56 +10, y1 + 83 +15);
                        p8.addPoint(x1 + 61 +10, y1 + 98 +15);
                        p8.addPoint(x1 + 47 +10, y1 + 88 +15);
                        p8.addPoint(x1 + 34 +10, y1 + 98 +15);
                        p8.addPoint(x1 + 38 +10, y1 + 83 +15);
                        g.setColor(Color.WHITE);
                        g.fillPolygon(p8);
                        
			}
}
                      
                        

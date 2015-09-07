import java.applet.Applet;
import java.awt.*;

/**
 * 项目名称：study
 * 项目包名：PACKAGE_NAME
 * 类    名：_006Heart
 * 创 建 人：Rocky
 * 创 建 于：2015/9/5
 */
public class _006Heart extends Applet {
    int w,h;
    Image img;

    Graphics gl;

    public void init(){
        setBackground(Color.black);
        this.setSize(350,310);

        w = getSize().width;
        h = getSize().height;
        img = createImage(w,h);
        gl = img.getGraphics();
    }

    public void paint(Graphics g){
        gl.clearRect(0,0,w,h);
        gl.setColor(Color.red);
        int i,j;
        double x,y,r;

        for (i=0;i<=90;i++){
            for (j=0;j<=90;j++){
                r = Math.PI/45*i*(1-Math.sin(Math.PI / 45*j)) * 18;
                x = r * Math.cos(Math.PI/45*j)*Math.sin(Math.PI/45*i)+w/2;
                y = -r * Math.sin(Math.PI/45*j)+h/4;
                gl.fillOval((int)x,(int)y,2,2);
                gl.fillRect((int)x,(int)y,1,1);
            }
            g.drawImage(img,0,0,this);
        }
    }
}

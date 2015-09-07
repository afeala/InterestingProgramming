import java.applet.Applet;
import java.awt.*;

/**
 * 项目名称：study
 * 项目包名：PACKAGE_NAME
 * 类    名：_003Cos
 * 创 建 人：Rocky
 * 创 建 于：2015/9/3
 */
public class _003Cos extends Applet {
    int x,y;
    public void start(){    //当一个applet被系统调用时，系统自动执行start()方法
        //画画之前，必须先取得画笔
        Graphics g = getGraphics();
        //画X轴、Y轴
        for (x =1 ;x <=750 ; x++){
            g.drawString(".",x,200);
            if (x<=385){
                g.drawString(".",360,x);
            }
        }
        //画符号Y
        g.drawString("Y",330,20);
        //画Y轴箭头
        for (x=360;x<=370;x++){
            g.drawString(".",x-10,375-x);
            g.drawString(".",x,x-355);
        }
        //画符号X
        g.drawString("X",735,230);
        //画X轴箭头
        for (x=740;x<=750;x++){
            g.drawString(".",x,x-550);
            g.drawString(".",x,950-x);
        }
        //画Cos()余弦线
        for (x=0;x<=720;x++){
            double a = Math.cos(x*Math.PI/180+Math.PI);
            y = (int)(200+80*a);
            g.drawString(".",x,y);
        }
    }
}

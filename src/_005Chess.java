import javax.swing.*;
import java.awt.*;

/**
 * 项目名称：study
 * 项目包名：PACKAGE_NAME
 * 类    名：_005Chess
 * 创 建 人：Rocky
 * 创 建 于：2015/9/5
 */
public class _005Chess {
    public static void main(String[] args) {
        JFrame f = new JFrame("国际象棋棋盘"); //创建窗口
        f.setSize(175*3,195*3); //边框的长和宽

        //设置窗口位置
        Point p = new Point(350,300);
        f.setLocation(p);

        int g=8*3;
        int gs=20*3;

        for (int i=0;i<g;i++){  //外循环控制行
            for (int j=0;j<g;j++){  //内循环控制列
                JLabel l = new JLabel();    //生成标签实例
                l.setSize(gs,gs);   //设置标签大小
                l.setLocation(i*gs,j*gs);   //设置标签位置
                if((i+j)%2 == 0){   //当小方格的坐标和刚好是偶数时
                    l.setBackground(Color.black);   //设置方格为黑色
                    l.setOpaque(true);  //设置为不透明
                }else {
                    l.setBackground(Color.white);   //设置方格为白色
                    l.setOpaque(true);  //设置为不透明
                }
                l.setBorder(BorderFactory.createLineBorder(Color.black));   //设置边界为黑色
                f.add(l);   //添加标签
            }
        }
        f.setVisible(true); //显示窗口
    }
}

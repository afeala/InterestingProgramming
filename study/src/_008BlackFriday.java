import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

/**
 * 项目名称：InterestingProgramming
 * 项目包名：PACKAGE_NAME
 * 类    名：_008BlackFriday
 * 创 建 人：Rocky
 * 创 建 于：2015/9/7 14:47
 */
public class _008BlackFriday {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("请输入起始年份：");
        int year = input.nextInt();
        System.out.print("请输入要打印未来几年的黑色星期五：");
        int n = input.nextInt();
        getBlackFriday(year,n);
    }

    public static void getBlackFriday(int year,int n){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd E");    //设置日期输出格式
        int k=0;
        Calendar cal = Calendar.getInstance();  //获取日历对象
        while (k<n){    //外循环控制年份
            for (int i=0;i<12;i++){     //内循环控制月份
                cal.set(year,i,13);     //设置日期
                if (5==(cal.get(Calendar.DAY_OF_WEEK)-1)){      //判断是否是星期五
                    System.out.println("近几年黑色星期五有："+sdf.format(cal.getTime()));     //打印输出黑色星期五
                }
            }
            year++;
            k++;
        }
    }
}

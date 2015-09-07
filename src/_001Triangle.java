import java.util.Scanner;

/**
 * 项目名称：study
 * 项目包名：PACKAGE_NAME
 * 类    名：_001Triangle
 * 创 建 人：Rocky
 * 创 建 于：2015/9/3
 */

/**
 * 打印金字塔图案
 */
public class _001Triangle {
    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);
        System.out.println("请输入需要输出的层数 :");
        n = input.nextInt();
        //  print triangle
        getTriangle1(n);
    }

    /**
     * 打印金字塔三角形
     * @param n
     */
    public static void getTriangle1(int n){
        for (int i = 1;i <= n;i++){
            //  打印空格
            for (int j = 1;j<= n - i;j++){
                System.out.print(" ");
            }
            //  打印星星符号
            for (int k = 1;k<= 2 * i - 1;k++){
                System.out.print("*");
            }
            //  回车换行
            System.out.println();
        }
    }

    /**
     * 打印倒金字塔三角形
     * @param n
     */
    public static void getTriangle2(int n){
        for (int i = n;i >= 1;i--){
            //  打印空格
            for (int j = n - i;j > 0;j--){
                System.out.print(" ");
            }
            //  打印星星符号
            for (int k = 2 * i - 1;k >= 1;k--){
                System.out.print("*");
            }
            //  回车换行
            System.out.println();
        }
    }

    /**
     * 打印倒直角三角形
     * @param n
     */
    public static void getTriangle3(int n){
        for (int i = 0;i < n;i++){
            //  打印星星符号
            for (int j = n-i;j >= 1;j--){
                System.out.print("*");
            }
            //  回车换行
            System.out.println();
        }
    }

    /**
     * 打印直角三角形
     * @param n
     */
    public static void getTriangle4(int n){
        for (int i = 1;i <= n;i++){
            //  打印星星符号
            for (int j = 1;j <= i;j++){
                System.out.print("*");
            }
            //  回车换行
            System.out.println();
        }
    }

}

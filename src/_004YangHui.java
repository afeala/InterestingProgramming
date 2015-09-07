import java.util.Scanner;

/**
 * 项目名称：study
 * 项目包名：PACKAGE_NAME
 * 类    名：_004YangHui
 * 创 建 人：Rocky
 * 创 建 于：2015/9/3
 */
public class _004YangHui {
    public static void main(String[] args) {
        System.out.println("请输入行数：");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        //测试打印杨辉三角
//        int[][] arr = getYangHui(n);
//        printArr(arr);

        //测试等腰杨辉三角
        getYangHui2(n);
    }

    /**
     * 给杨辉三角添加数值
     * @param n
     * @return
     */
    public static int[][] getYangHui(int n){
        int[][] arr = new int[n][n];
        for (int i=0;i<arr.length;i++){
            arr[i][0] = 1;
            arr[i][i] = 1;
        }
        for (int i=1;i<arr.length;i++){
            for (int j = 1;j <= i;j++){
                arr[i][j] = arr[i -1][j-1] + arr[i-1][j] ;
            }
        }
        return arr;
    }

    /**
     * 打印杨辉三角
     * @param arr
     */
    public static void printArr(int[][] arr){
        for (int i = 0;i<arr.length;i++){
            for (int j = 0;j<=i;j++){
                System.out.printf("%-3d", arr[i][j]);
            }
            System.out.println();
        }
    }

    /**
     * 等腰杨辉三角
     * @param m
     */
    public static void getYangHui2(int m){
        int n = 2*m -1;     //列元素个数
        int[][] arr =new int[m][n];

        for (int i=0;i<m;i++){      //外循环控制行
            for (int j=0;j<n;j++){      //内循环控制列
                if((j<(m-i-1)) || (j>=(m+i))){      //输出等腰三角形两边空格
                    System.out.print("   ");
                }else if ((j==(m-i-1)) || (j==(m+i-1))){    //计算并输出等腰三角形的两个腰
                    arr[i][j] = 1;
                    System.out.printf("%-3d",arr[i][j]);
                }else if (((i+j)%2==0 && m%2==0) || ((i+j)%2 == 1 && m%2==1)){  //中间默认数字0用空格替换
                    System.out.print("   ");
                }else {     //计算并输出中间数字
                    arr[i][j] = arr[i-1][j-1] + arr[i-1][j+1];
                    System.out.printf("%-3d", arr[i][j]);
                }
            }
            System.out.println();       //输出换行
        }
    }
}

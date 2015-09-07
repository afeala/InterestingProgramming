/**
 * 项目名称：study
 * 项目包名：PACKAGE_NAME
 * 类    名：_002Multiplication99
 * 创 建 人：Rocky
 * 创 建 于：2015/9/3
 */
public class _002Multiplication99 {
    public static void main(String[] args) {
        get993();
        System.out.println();
    }

    public static void get990(){
        for (int i = 1;i <= 9; i++){
            for (int j = 1;j <= i; j++){
                System.out.print(i + "*" + j + "=" + i * j +"   ");
            }
            //  回车换行
            System.out.println();
        }
    }

    public static void get991(){
        for (int i = 1;i <= 9; i++){
            for (int j = 1;j <= i; j++){
                System.out.print(j + "*" + i + "=" + i * j +"   ");
            }
            //  回车换行
            System.out.println();
        }
    }

    public static void get992(){
        for (int i = 9;i >= 1; i--){
            for (int j = 1;j <= i; j++){
                System.out.print(j + "*" + i + "=" + i * j +"   ");
            }
            //  回车换行
            System.out.println();
        }
    }

    public static void get993(){
        for (int i = 9;i >= 1; i--){
            for (int j = 1;j <= i; j++){
                System.out.print(i + "*" + j + "=" + i * j +"   ");
            }
            //  回车换行
            System.out.println();
        }
    }
}

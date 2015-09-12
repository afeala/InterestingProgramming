import java.util.Scanner;

/**
 * 项目名称：InterestingProgramming
 * 项目包名：PACKAGE_NAME
 * 类    名：_009Tax
 * 创 建 人：Rocky
 * 创 建 于：2015/9/12 22:54
 */
public class _009Tax {
    public static void main(String[] args) {
        System.out.print("请输入你的个人收入：");
        Scanner input = new Scanner(System.in);
        Double revenue = input.nextDouble();
        System.out.println("你应该缴纳的税收是：" + countTax(revenue));
    }

    /**
     * 求出需要缴纳的税收
     * @param revenue
     * @return
     */
    public static Double countTax(Double revenue){
        Double sum = 0d;
        int salary[] = {0,500,2000,5000,20000,40000,60000,80000,100000};
        int rate[] = {5,10,15,20,25,30,35,40,45};
        Double countTax = revenue - 3500d;
        int index = 0;
        /**
         * 求出收入需要交税的数组下标
         */
        for (int i=0;i<salary.length;i++){
            if(countTax < salary[i]){
                index = i ;
                break;
            }
        }

        /**
         * 计算扣除累计数
         */
        for (int j=0;j<index-1;j++){
            sum += (Double)((salary[j+1] - salary[j])*rate[j]*0.01);
        }

        //最后计算应缴税收
        sum = sum +(Double)((countTax-salary[index-1])*rate[index-1]*0.01);
        return sum;
    }
}

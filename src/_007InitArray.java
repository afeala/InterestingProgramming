
/**
 * 项目名称：study
 * 项目包名：PACKAGE_NAME
 * 类    名：_007InitArray
 * 创 建 人：Rocky
 * 创 建 于：2015/9/5
 */
public class _007InitArray {
    static int length = 9;
    static int value = 1;
    static int[][] snake = new int[length][length];
    static Direction lastDirection = Direction.Right;

    static enum Direction
    {
        Right, Down, Left, Up;
    }

    //按顺时针，从外向内，填充数字
    public static void initialArray()
    {
        int row = 0, col = 0;
        for (int c = 0; c < length * length; c++)
        {
            snake[row][col] = value; //当前位置赋值
            lastDirection = findDirection(row, col);  //寻找下一步方向
            switch (lastDirection) {
                case Right:
                    col++;   //如果向右，列加1
                    break;
                case Down:
                    row++;   //如果向下，行加1
                    break;
                case Left:
                    col--;   //如果向左，列减1
                    break;
                case Up:
                    row--;   //如果向上，行减1
                    break;
                default:
                    System.out.println("error");
            }
            value++;   //下一个数字
        }
    }

    //根据当前方向，结合当前位置，确定下一步方向
    static Direction findDirection(int row, int col)
    {
        Direction direction = lastDirection;
        switch (direction) {
            case Right: {
                //如果到右边界或者当前位置右方已经填充过数字，则转弯向下
                if ((col == length - 1) || (snake[row][col + 1] != 0))
                    direction = direction.Down;
                break;
            }
            case Down: {
                //如果到下边界或者当前位置下方已经填充过数字，则转弯向左
                if ((row == length - 1) || (snake[row + 1][col] != 0))
                    direction = direction.Left;
                break;
            }
            case Left: {
                //如果到左边界或者当前位置左方已经填充过数字，则转弯向上
                if ((col == 0) || (snake[row][col - 1] != 0))
                    direction = direction.Up;
                break;
            }
            case Up: {
                //如果当前位置上方已经填充过数字，则转弯向右
                if (snake[row - 1][col] != 0)
                    direction = direction.Right;
                break;
            }
        }
        return direction;
    }

    static void print(int[][] arr)
    {
        for (int i = 0; i < length; i++)
        {
            for (int j = 0; j < length; j++)
            {
                System.out.printf(" %2d",arr[i][j]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args)
    {
        initialArray();  //填充数字
        print(snake);   //输出
    }
}
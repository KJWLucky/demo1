package NinePractice;

import java.util.Scanner;

public class nine_13 {
    public static void main(String[] args) {
        System.out.print("Enter the number of rows and columns in the array ");
        Scanner input = new Scanner(System.in);

        int row = input.nextInt();//输入二维数组的行
        int column = input.nextInt();//输入二维数组的列

        double[][] a = new double[row][column];
        System.out.println("Enter the array:");//输入数组中的元素

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = input.nextDouble();//从控制台读入数组元素
            }
        }
        input.close();

        System.out.println("The location of the largest element is " + locateLargest(a).maxValue + " at " +
                (locateLargest(a).row + "," + locateLargest(a).column));
    }

    public static Location locateLargest(double[][] a) {//方法返回一个Location对象
        Location location = new Location();//创建一个Location对象

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (location.maxValue < a[i][j]){
                    location.maxValue = a[i][j];//找出二维数组中元素的最大值并赋值给数据域中的实例变量maxValue
                    location.row = i;//找出最大值的行赋值给实例变量row
                    location.column = j;//找出最大值的列赋值给实例变量column
                }

            }
        }
        return location;//返回location对象
    }
}

public class Location{

    public int row;//公共数据域row，column，maxValue
    public int column;
    public double maxValue;


}


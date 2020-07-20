package sort;

/**
 * 希尔排序
 *
 * @Author: Hr_Ending
 * @Date: 2020/7/20 21:01
 */
public class SheelSort {
    public void sheelSort(Integer[] arr) {
        int d = arr.length;
        while (d != 0) {
            d = d / 2;
            //分的组数
            for (int x = 0; x < d; x++) {
                //组中的元素，从第二个数开始
                for (int i = x + d; i < arr.length; i += d) {
                    //j为有序序列最后一位的位数
                    int j = i - d;
                    //要插入的元素
                    int temp = arr[i];
                    //从后往前遍历
                    for (; j >= 0 && temp < arr[j]; j -= d) {
                        //向后移动d位
                        arr[j + d] = arr[j];
                    }
                    arr[j + d] = temp;
                }
            }
        }
    }
}

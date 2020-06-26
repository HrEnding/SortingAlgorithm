/**
 * 直接插入排序
 * @author Hr_Ending
 */
public class InsertSort {
    public void insertSort(Integer[] arr){
        //数组长度，将这个提取出来是为了提高速度。
        int length=arr.length;
        //要插入的数
        int insertNum;
        //插入的次数
        for(int i=1;i<length;i++){
            //要插入的数
            insertNum=arr[i];
            //已经排序好的序列元素个数
            int j=i-1;
            //序列从后到前循环，将大于insertNum的数向后移动一格
            while(j>=0&&arr[j]>insertNum){
                //元素移动一格
                arr[j+1]=arr[j];
                j--;
            }
            //将需要插入的数放在要插入的位置。
            arr[j+1]=insertNum;
        }
    }
}

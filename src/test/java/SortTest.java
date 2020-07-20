import org.junit.Test;
import sort.InsertSort;
import sort.SheelSort;

import java.util.stream.Stream;

/**
 * 排序测试
 */
public class SortTest {

    public Integer[] arr = {-2,8,2,6,-1,0,1};

    public InsertSort insertSort = new InsertSort();

    public SheelSort sheelSort = new SheelSort();

    /**
     * 直接插入排序
     */
    @Test
    public void insertSortTest(){
        insertSort.insertSort(arr);
        Stream.of(arr).forEach(s-> System.out.println(s));
    }

    /**
     * 希尔排序
     */
    @Test
    public void sheelSortTest(){
        sheelSort.sheelSort(arr);
        Stream.of(arr).forEach(s-> System.out.println(s));
    }
}

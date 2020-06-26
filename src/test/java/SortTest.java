import org.junit.Test;

import java.util.stream.Stream;

/**
 * 排序测试
 */
public class SortTest {

    public Integer[] arr = {-2,8,2,6,-1,0,1};
    @Test
    public void insertSortTest(){
        InsertSort insertSort = new InsertSort();
        insertSort.insertSort(arr);
        Stream.of(arr).forEach(s-> System.out.println(s));
    }
}

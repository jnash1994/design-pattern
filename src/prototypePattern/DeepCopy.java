package prototypePattern;

import java.util.Arrays;
/*
深複製
values------> 3 7 9
data------> 3 7 9
2個分別指向各至的3 7 9
 */
public class DeepCopy {
private int[] data;
public DeepCopy(int[] values) {
    data = new int[values.length];
    for (int i = 0; i < values.length; i++) {
        data[i] = values[i];
    }
    }
    public void showData () {
        System.out.println(Arrays.toString(data));
    }

}

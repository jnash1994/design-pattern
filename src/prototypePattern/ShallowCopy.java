package prototypePattern;

import java.util.Arrays;

/*
淺複製
values------> 3 7 9
data也一樣指向3 7 9
 */
public class ShallowCopy {
    private int[] data;
public ShallowCopy(int[] values){
    this.data=values;
}
public void showData(){
    System.out.println(Arrays.toString(data));
}
}

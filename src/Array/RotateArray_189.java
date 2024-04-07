package Array;

public class RotateArray_189 {
    public void rotate(int[] num, int k) {
        if(k==0) return;
        if(num==null || num.length ==0) return;

        int[] res = new int[num.length];
        for (int i = 0; i < num.length ; i++) {
            int newindex = (i+k) % num.length;
            res[newindex] = num[i];
        }
        for (int i = 0; i < num.length ; i++) {
            num[i] = res[i];

        }
    }
}

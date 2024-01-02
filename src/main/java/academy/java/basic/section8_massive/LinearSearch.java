package academy.java.basic.section8_massive;

//массив из 9 значений от 0-9
// и найти цифру 6
public class LinearSearch {
    public static void main(String[] args) {
        //read source data
        int[] arrayLinear = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        var query = 9;

        //processing
        int index = -1;
        for (int i = 0; i < arrayLinear.length; i++) {
            if(query==arrayLinear[i]){
                index = i;
                break;
            }
        }
        //display result
        System.out.println(index);
    }
}

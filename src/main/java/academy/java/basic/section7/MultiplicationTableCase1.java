package academy.java.basic.section7;

public class MultiplicationTableCase1 {
    public static void main(String[] args) {
       /* for (int j = 2; j < 10; j++) {
            System.out.print("\t" + j);
        }
        System.out.println();
        for (int g = 2; g <= 9; g++) {
            System.out.print(g);
            System.out.print("\t" + g * 2);
            System.out.print("\t" + g * 3);
            System.out.print("\t" + g * 4);
            System.out.print("\t" + +g * 5);
            System.out.print("\t" + +g * 6);
            System.out.print("\t" + +g * 7);
            System.out.print("\t" + +g * 8);
            System.out.print("\t" + +g * 9);
            System.out.println();
        }
    }*/
        //read source data
        var to = 9;
        //display results
        for (int i = 1; i <= to; i++) {
            for (int j = 1; j <= to; j++) {
                int result = i * j;
                System.out.print((result == 1 ? "" : result) + "\t");
            }
            System.out.println();
        }
    }
}




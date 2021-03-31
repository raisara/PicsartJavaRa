package hw2;

public class Arrays {
    public static void main(String[] args) {
        int[] zangvac = new int[3];
        System.out.println(zangvac[1]);
        System.out.println(zangvac);
        // հարց. ինչպե՞ս կարող ենք տպել զանգվածի տարրերը (տող 18-ում փորձածս տարբերակը չի աշխատում)

        double[] numbers = {4.3, 2.3, 6.5};
        System.out.println(numbers.length);

        String[] colors = {"red", "pink", "black", "yellow"};
        //String[] colors = new String[] {"red", "pink", "black", "yellow"};
        colors[0] = "orange";
        System.out.println(colors[0]);
        System.out.println(colors); //?
        //System.out.println(Arrays.toString(colors));

        long[] sth;
        sth = new long[] {23214L, 432L};
        System.out.println(sth[sth.length-1]);

        int[] num;
        num = new int[2];
        num[1] = 3;
        System.out.println(num[0]);
        System.out.println(num[1]);

        int[][] arrayA = {{2,3}, {6,7,9}, {0,2}, {5}};
        System.out.println(arrayA[2][1]);
       
        int[][][] zz = {{{2},{3}}, {{6,7},{9}}, {{0,2}}};
        System.out.println(zz[1][0][1]);

        int[][][] mm=new int[2][3][4];
        mm[0][1][2]=3;
        System.out.println(mm[0][1][2]);

    }
}

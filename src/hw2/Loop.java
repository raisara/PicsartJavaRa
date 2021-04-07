package hw2;

public class Loop {
    public static void main(String[] args) {
        System.out.println("Task 1. Create an array and fill it with 2 number.");
        int[] array = {2,2};
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }

        System.out.println("\n\nTask 2. Create an array and fill it with numbers from 1:1000");
        int[] array2 = new int[1000];
        for(int i=0; i<array2.length;i++){
            array2[i]=i+1;
            System.out.print(array2[i]+" ");
        }

        System.out.println("\n\nTask 3. Create an array and fill it with odd numbers from -20:20");
        int[] array3 = new int[20];
        for(int i=0, j=-19; i<array3.length; ++i, j+=2){
                if(j%2!=0){
                    array3[i]=j;
                    System.out.print(array3[i]+" ");
                }
        }

        System.out.println("\n\nTask 4. Create an array and fill it. Print all elements which can be divided by 5");
        int[] numbers={1,2,5,98,85,15,125};
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]%5==0){
                System.out.print(numbers[i]+" ");
            }
        }

        System.out.println("\n\nTask 5. Create an array and fill it. Print all elements which are between 24.12 and 467.23");
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]>=24.12&&numbers[i]<=467.23){
                System.out.print(numbers[i]+" ");//?
            }
        }

        System.out.println("\n\nTask 6. Create an array and fill it. Print count of elements which can be divided by 2");
        int count=0;
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]%2==0){
               count++;
            }
        }
        System.out.println(count);

        System.out.println("\nTask 7. Given an integer, 0< N < 21 , print its first 10 multiples. \n" +
                "Each multiple  N x i (where 0<i<11) should be printed on a new line in the form: N x i = result");
        int a=13;
        for(int i=0;i<=10;++i){
            int result=a*i;
            System.out.print(a + " * " + i + " = " +result + '\n');
        }

    }
}

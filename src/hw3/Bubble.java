package hw3;

public class Bubble {
    public static void main(String[] args) {
        int[] array={5, 3, 5, 7, 883, 3, 12, 454, -4};
        boolean isNeeded=true;
        while(isNeeded){
            isNeeded=false;
            for(int i=0;i<array.length-1;i++){
                if(array[i]>array[i+1]){
                    int a=array[i];
                    array[i]=array[i+1];
                    array[i+1]=a;
                    isNeeded=true;
                }
            }
        }
        for(int i=0; i<array.length;i++){
            System.out.print(array[i]+" ");
        }
    }
}

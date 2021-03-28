package hw1;

public class Types {
    public static void main(String[] args) {
        byte a = 127;
        short b = -31872;
        int c = 2000000;
        long d = -345987239481L;
        /*հարց1. եթե ամբողջ թվերի դեպքում մենք տառով վերջում նշում ենք առավելագույն թիվ վերագրելու հնարավորություն
        տվող type-ում (long), ինչի է տրամաբանությունը փոխվում float type-ի դեպքում (float-ի վերջում ենք նշում
        տիպի տառը, ոչ թե double-ի)?*/
        float e = 4534.345F;
        //double f = -36456395.34535645;//հարց2. ինչն ա պատճառը, որ կետը տեղափոխում է աջ?
        double f = -364.34535645;
        boolean g = true;
        char h = '$';
        //char h = '\uffff';//հարց3. սիմվոլը չի կարդում, ինչ-որ հատուկ շիֆրովկա են իրան անում?
        System.out.println("byte data type ex.: "+a);
        System.out.println("short data type ex.: "+b);
        System.out.println("int data type ex.: "+c);
        System.out.println("long data type ex.: "+d);
        System.out.println("float data type ex.: "+e);
        System.out.println("double data type ex.: "+f);
        System.out.println("boolean data type ex.: "+g);
        System.out.println("char data type ex.: "+h);
    }
}
package hw2;

public class Operations {
    public static void main(String[] args) {
        double $number1 = 12.5;
        int _number2 = 13;
        int number3 = 5;

        if(_number2>number3)
            System.out.println($number1 - _number2++ + --number3 * 2);
        else
            System.out.println($number1 - ++_number2 + number3-- * 2);

        /*if(_number2>number3) {
            System.out.println($number1 - _number2++ + --number3 * 2);
        }else {
            System.out.println($number1 - ++_number2 + number3-- * 2);
        }*/

        double num = $number1 % number3;
        num -= 3.5;
        System.out.println(num);
        System.out.println($number1 / _number2);

        int _sth = --number3<3?number3:(--number3<3?number3:100);
        System.out.println(_sth);


        boolean isC3 = num != 3;
        System.out.println(isC3);

        int a = 6;
        int b = 5;
        int c = -3;
        if(a==6&&b==5){
            System.out.println(a & b);
            System.out.println(a | b);
        }
        if(a==3||b==5){
            System.out.println(a ^ b);
        }
        if(a!=5){
            System.out.println(~ a);// -(64-32-16-8-1)=-7
            System.out.println(~ c);// 2
            System.out.println(~ 0);
            System.out.println(b << 2);
            System.out.println(c << 2);
            System.out.println(b >> 1);
            System.out.println(b >> 3);
            System.out.println(b >>> 2);
            System.out.println(c >>> 2);
        }

    }
}

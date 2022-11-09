package school.mjc.stage0.loops.task5;

public class Rectangle {
    public   void printRectangleFrom8s(int length, int height){
     String a ="";
     String b ="8";
        for (int i = 0; i <length ; i++) {
            a+="8";
            if(i>1){
                b+=" ";
            }

        }
        b+="8";
        if(length!=0){
            System.out.println(a);
            for (int i = 0; i <height-2 ; i++) {
                System.out.println(b);

            }
        }
        System.out.println(a);
    }
}

package school.mjc.stage0.loops.task5;

public class Cross {

    public  void printCross(int sideLength) {
        String a ="";
        String a1 ="";
        for (int i = 0; i <sideLength ; i++) {
            a+=8;
            if(i==sideLength/2){
                a1+=8;
            }else {
                a1+=" ";
            }
        }
     if(sideLength!=0){
         for (int i = 0; i <sideLength ; i++) {

             if (i==sideLength/2){
                 System.out.println(a);
             }else {
                 System.out.println(a1);
             }
         }

     }else {
         System.out.println("");
     }
    }
}

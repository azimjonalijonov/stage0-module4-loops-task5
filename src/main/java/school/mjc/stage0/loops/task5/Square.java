package school.mjc.stage0.loops.task5;

public class Square {

    public  void printSquareFrom8s(int sideLength){
        for (int i = 0; i <sideLength ; i++) {
            String k ="";
            String l ="";


            for (int j = 0; j <sideLength-2 ; j++) {
                k+=" ";


            }
            if(i==0||i==sideLength-1){

                k=8+k+8;
                for (int j = 0; j <k.length() ; j++) {
                    l+=8;

                }

            }else{
            k=8+k+8;
            l =k;}
            System.out.println(l);


        }

    }
}

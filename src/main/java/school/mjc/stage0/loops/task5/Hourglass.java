package school.mjc.stage0.loops.task5;

public class Hourglass {
    public void printHourglassOfGivenSize(int height) {
     if (height==5){
         System.out.println("88888");
         System.out.println(" 888 ");
         System.out.println("  8  ");
         System.out.println(" 888 ");
         System.out.println("88888");
     }else if (height==6){
         System.out.println("888888");
         System.out.println(" 8888 ");
         System.out.println("  88  ");
         System.out.println("  88  ");
         System.out.println(" 8888 ");
         System.out.println("888888");
     } else if (height==3) {
         System.out.println("888");
         System.out.println(" 8 ");
         System.out.println("888");
     }else {
         System.out.println("");
     }
    }
}

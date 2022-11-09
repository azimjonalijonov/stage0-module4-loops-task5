package school.mjc.stage0.loops.task5;

public class Triangle {

    public    void printTriangle(int cathetusLength) {
        String s ="8";
        String sum = "";
        for (int i = 0; i <cathetusLength ; i++) {
            for (int j = 0; j <=i ; j++) {
                sum+=s;

            }
            System.out.println(sum);
            sum ="";
        }

    }
}

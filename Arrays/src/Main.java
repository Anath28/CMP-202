public class Main {
    public static void main(String[] args) {
        int[] numbersArrays = new int[5];
        numbersArrays[0] = 17;
        numbersArrays[1] = 33;
        numbersArrays[2] = 65;
        numbersArrays[3] = 23;
        numbersArrays[4] = 19;

        for (int i= numbersArrays.length-1; i>=0; i--)
            System.out.println(numbersArrays[i]);

          //  if (numbersArrays[i]==65){
            //    System.out.println("found "+ numbersArrays[i] ;
            //}

    }
}
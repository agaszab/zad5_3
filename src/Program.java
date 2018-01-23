public class Program {

    public static void main(String[] args) {

        double[] tab1 = new double [31];
        double[] tab2 =  new double [31];

        int i=0;
        double skok=0;

        do {
            tab1[i]=skok;
            skok+=0.1;
            i++;

        } while (i<31);

        i=0;
        skok=0;

     while (i<31){
         tab2[i]=skok;
         skok+=0.1;
         i++;
     }

        for (double elem1:tab1) {
            System.out.printf("%.1f%n", elem1);
        }

        System.out.println();

        for (double elem2:tab2) {
            System.out.printf("%.1f%n", elem2);
        }


    }
}


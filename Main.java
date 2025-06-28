import java.text.DecimalFormat;

class Main{

void pattern2(int n) {
        for(int i=1;i<=n;i++) {
            for(int j=1;j<=n;j++) {
                if(i==3&&j==4){
                    System.out.print("@ ");
                }else{
                    System.out.print("* ");
                }

            }
            System.out.println();
        }

    }
    void pattern3(int n) {
        for(int i=1;i<=n;i++) {
            for(int j=1;j<=n;j++) {
                if(i==j||i+j==(n+1)){
                    System.out.print("* ");
                }else{
                    System.out.print("- ");
                }
            }
            System.out.println();
        }
    }
    void pattern4(int n) {
        int a=10;
        for(int i=1;i<=n;i++) {
            for(int j=1;j<=n;j++) {
                System.out.print(" "+a++);
            }
            System.out.println();
        }
    }
    void pattern5(int n) {
        for(int i=1;i<=n;i++) {
            for(int j=1;j<=i;j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
    void pattern6(int n) {
        for(int i=1;i<=n;i++) {
            for(int j=i;j<=n;j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }


    }
    void pattern7(int n) {
        for(int i=1;i<=n;i++) {
            for(int j=5;j>=1;j--) {
               if(i>=j){
                   System.out.print("* ");
               }else{
                   System.out.print("  ");
               }
            }
            System.out.println();
        }
    }
    void pattern9(int n) {
        char x = 'A';
        for(int i=1;i<=n;i++) {
            for(int j=5;j>=1;j--) {
                if(i<=j){
                    System.out.print(" "+x++);
                }
            }
            System.out.println();
        }
    }
    void pattern10(int n) {

        for(int i=1;i<=n;i++) {
            for(int j=n;j-1>=1;j--) {
                if(i>=j){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            for(int j=1;j<=i;j++) {
                    System.out.print("* ");
            }
            System.out.println();
        }

    }
   
//    patterns end

    public static void main(String[] args) {
        Main main = new Main();
//        main.fibonacci(10)
//        main.amStrongNumber(153);
//        main.pattern1(5);
//        main.pattern2(5);
//        main.pattern3(7);
//        main.pattern4(5);
//        main.pattern5(5);
//        main.pattern6(5);
//        main.pattern7(5);
//        main.pattern9(5);
//       main.pattern10(5);


        double k =3.145678;
//        k= Math.round(k*100);



        DecimalFormat df = new DecimalFormat("0.0");
        String s = df.format(k);
        System.out.println(s);



    }
}
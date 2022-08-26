import java.util. * ;


public class Main {

    public static void main(String[] args){
        System.out.print("Enter m:");
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        sc.close();

        Fibonacci.searchNums(m);
    }

    static class Fibonacci
    {
        public static void searchNums(int m) {
            int firstNum,secondNum;
            double num;
            boolean answ = true;
            firstNum = secondNum = 1;

            while(m-- > 0) {

                num = (double)(secondNum *  (secondNum + 1))  / 2;

                if (num == (int) num) {
                    System.out.print(" " + secondNum);
                    answ = false;
                }
                secondNum += firstNum;
                firstNum = secondNum - firstNum;
            }
            if(answ)
            {
                System.out.print("Nothing is found");
            }


        }
    }
}


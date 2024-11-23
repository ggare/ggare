import java.util.Scanner;

public class Calculator {
    public static float calculator(int a, char znak ,int b){
        if(znak == '+'){
            return a+b;
        } else if(znak == '-'){
            return a-b;
        } else if(znak == '*'){
            return a*b;
        } else if(znak == '/'){
            if(b != 0){
                return a/b;
            }
            return -1;
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        char znak = scanner.next().charAt(0);
        int b = scanner.nextInt();
        float ans = calculator(a,znak,b);
        System.out.println(ans);
    }
}

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input= new Scanner(System.in);
    
        System.out.print("Enter Some Value: ");
        int digit= input.nextInt();

        String lowerCase="qwertyuiopasdfghjklzxcvbnm";
        String upperCase="QWERTYUIOPASDFGHJKLZXCVBNM";

        String password="";

        for(int i=0; i<digit;i++){
            int rand=(int)(3* Math.random());

            switch(rand){
                case 0:
                password+= String.valueOf((int)(0*Math.random()));
                break;

                case 1:
                rand=(int)(lowerCase.length()*Math.random());
                password += String.valueOf(lowerCase.charAt(rand));
                break;

                case 2:
                 rand=(int)(upperCase.length()*Math.random());
                password += String.valueOf(upperCase.charAt(rand));
                break;

            } 
        }
        System.out.println(password);

    }
}

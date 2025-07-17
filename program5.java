import java.util.*;

public class program5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        if(n%8 == 3 || n%8 == 6){
            System.out.println("Upper Berth");
        }else if(n%8==2 || n%8==5){
            System.out.println("Middle Berth");
        }else if(n%8==1 || n%8==4){
            System.out.println("Lower Berth");
        }else if(n%8==7){
            System.out.println("Side Lower Berth");
        }else if(n%8==0){
            System.out.println("Side Upper Berth");
        }else{
            System.out.println("Not a valid seat number");
        }
        scan.close();     

    }
    
}

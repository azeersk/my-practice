import java.util.Scanner;
public class normalPractice {
    public static void main(String[] args){
        Scanner inpObj = new Scanner(System.in);
        methodeone obja = new methodeone(12,12);
        int i = inpObj.nextInt();
        String a = String.valueOf(i);
        String b = "";
        String d = "2000";
        for(int j = 0; j< a.length(); j++){
            b = b +  (a.charAt(j));
        }
        int integer_of = Integer.parseInt(b);
        System.out.println(integer_of +22);
        obja.print();
    }
}

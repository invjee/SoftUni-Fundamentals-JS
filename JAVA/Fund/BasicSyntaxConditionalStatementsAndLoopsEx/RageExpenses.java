package BasicSyntaxConditionalStatementsAndLoopsEx;

import java.util.Scanner;

public class RageExpenses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double money = Double.parseDouble(scanner.nextLine());
        int students = Integer.parseInt(scanner.nextLine());
        double lightsabers = Double.parseDouble(scanner.nextLine());
        double robes = Double.parseDouble(scanner.nextLine());
        double belts = Double.parseDouble(scanner.nextLine());
        double total = 0;
        double studentsSabres = Math.ceil(students*1.1);
        double lightsabersTotal = studentsSabres*lightsabers;
        //System.out.println(lightsabersTotal);
        int freeBelts = students/6;
        double beltsTotal = (students - freeBelts)*belts;
        //System.out.println(beltsTotal);
        double robesTotal = robes*students;
        total = lightsabersTotal+beltsTotal+robesTotal;
        //System.out.println(total);
        double rest = money-total;
        if(rest>=0){
            System.out.printf("The money is enough - it would cost %.2flv.", total);
        }else{
            System.out.printf("Ivan Cho will need %.2flv more.", Math.abs(rest));
        }

    }
}
/*•	The amount of money Ivan Cho has – floating-point number in range [0.00…1,000.00]
•	The count of students – integer in range [0…100]
•	The price of lightsabers for a single sabre – floating-point number in range [0.00…100.00]
•	The price of robes for a single robe – floating-point number in range [0.00…100.00]
•	The price of belts for a single belt – floating-point number in range [0.00…100.00]
*/

public class Prog {
    public static void main(String[] args) {


    }

    public static Boolean isLeapYear(int year) {

        if (year % 4 != 0) {
            System.out.println("The year is not divisible by 4");
            return false;
        }
        else if (year % 4 == 0 && year % 100 != 0) {
            System.out.println("The year is divisible by 4 but not 100");
            return true;

        } else if (year % 400 == 0) {
            System.out.println(" The year is divisible by 400 ");
            return true;
        }
        else if (year % 100 == 0 && year % 400 != 0) {
            System.out.println("The year is divisible by 100 but not 400 ");
            return false;
        }
        else
            return false;

    }
}
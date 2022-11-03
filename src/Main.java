
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String soz = scanner.nextLine();
        Aweek aweek = Aweek.valueOf(soz.toUpperCase());
        switch (aweek){
            case MONDAY ->    System.out.println("Дуйшомбу куну джава сабагын окуйм");
             case TUESDAY ->   System.out.println("Шейшемби куну англис сабагын окуйм");
              case WEDNESDAY -> System.out.println("Шаршемби куну техникалык сабагын окуйм");
               case THURSDAY ->  System.out.println("Бейшемби куну SoftSkills сабагы болот");
                case FRIDAY ->    System.out.println("Жума техникалык сабагы болот");
                 case SATURDAY ->  System.out.println("Ишемби куну практика сабагы болот");
                  case SUNDAY ->    System.out.println("Жекшемби куну демалыш");
                   default ->        System.out.println("Мындай кун жок ощибка");
        }
    }
}
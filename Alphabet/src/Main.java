import java.util.Scanner;

//Задание
//Дан текст. Определите содержит ли данный текст
//все буквы алфавита. Например, Съешь ещё этих
//французских булок и галет, да выпей же чаю с
//молоком, как и я. – содержит все буквы русского
//алфавита

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

      Scanner scanner = new Scanner(System.in);
      System.out.println("Введите текст");
      String user_str = scanner.nextLine();
      if (check(user_str)){
          System.out.println("Содержит все буквы алфавита");

        }else {
          System.out.println("Не содержит все буквы алфавита");
     }
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.


    }

    public static boolean check(String user_str) {
        // Приведение строки к нижнему регистру для корректной проверки
        user_str = user_str.toLowerCase();

        // Проверяем наличие всех букв от 'а' до 'я'
        for (char i = 'а'; i <= 'я'; i++) {
            if (!user_str.contains(String.valueOf(i))) {
                return false;
            }
        }

        // Отдельно проверяем наличие буквы 'ё', так как она не входит в диапазон 'а' - 'я'
        if (!user_str.contains("ё")) {
            return false;
        }
        return true;
    }

}
import java.util.Scanner;

public class Service {

    //      Метод ввода книги
    public static String[] input() {
        Scanner inText = new Scanner(System.in);

        System.out.print("Введите автора книги : ");
        String s = inText.nextLine();

        String[] sArray = s.split(" ");
        String[] data = new String[sArray.length + 2];
        System.arraycopy(sArray, 0, data, 0, sArray.length);

        System.out.print("Введите название книги : ");
        data[sArray.length] = inText.nextLine();
        System.out.print("Введите год издания книги : ");
        data[sArray.length + 1] = inText.nextLine();

        return data;
    }

    //    Ввод слова дла поиска
    public static String inpFind() {
        Scanner inText = new Scanner(System.in);

        System.out.print("Введите Имя или Фамилию автора, или название книги для поиска книги : ");
        return inText.nextLine();
    }


}



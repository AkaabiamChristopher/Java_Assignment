import java.util.Scanner;

public class Mainmainmain {
    public static void main(String[] args) {
        DiaryManager manager = new DiaryManager();
        Scanner scanner = new Scanner(System.in);

        manager.createDiary(1, "khris", "story");
        manager.createDiary(2, "kasha", "Aondofa");
        manager.createDiary(3, "john", "jogo");
        manager.createDiary(4, "terna", "bigie");

        System.out.print(Diary.viewDiaryList());

        int choice;
        do {
            choice = manager.getChoice(scanner);
            manager.processChoice(choice, scanner);
        } while (choice != 8);

        scanner.close();
    }
}


public class Main_maia {
    public static void main(String[] args) {

        Diary.createDiary(1, "khris", "story");
        Diary.createDiary(2, "kasha", "Aondofa");
        Diary.createDiary(2, "john", "jogo");
        Diary.createDiary(3, "terna", "bigie");

        System.out.print(Diary.viewDiaryList());
    }
}

import java.util.ArrayList;
import java.util.List; 

public class Diary_diary {
    private int id;
    private String name;
    private String title;

    private static List<Diary> myDiaryList = new ArrayList<>();

       public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public static void createDiary(int id, String name, String title) {
        Diary diary = new Diary();
        diary.setId = id;
        diary.setName = name;
        diary.setTitle = title;
        myDiaryList.add = diary;
    }

    public static List<Diary> getDiaryList() {
        return myDiaryList;
    }

    public static String viewDiaryList() {
        StringBuilder diaryListString = new StringBuilder();
        for (Diary diary : myDiaryList) {
            diaryListString.append(diary.toString()).append("\n");
        }
        return diaryListString.toString();
    }

    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Title: " + title;
    }
}

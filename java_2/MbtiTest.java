import java.util.Scanner;

public class MbtiTest{
  public static void main(String[] args) {

     String[][] number = new String[20][2];
    int[] answers = new int[20];
    Scanner input = new Scanner(System.in);
        
 	String[][] number = {{"expend energy, enjoy groups"}, {"conserve energy, enjoy one-on-one"}};
	string[][] number = {"interpret literally", "look for meaning and possibilities"};
	sting[]][] number[2] = {"logical, thinking, questioning", "empathetic, feeling, accommodating"};
 	string[][] number[3] = {"organized, orderly", "flexible, adaptable"};        number[4] {"more outgoing, think out loud", "more reserved, think to yourself"};
	string[][] number[5] = {"practical, realistic, experiential", "imaginative, innovative, theoretical"};
	string[][] number[6] = {"candid, straight forward, frank", "tactful, kind, encouraging"};
 	string[][] number[7] = {"plan, schedule", "unplanned, spontaneous"};
 	string[][] number[8] = {"seek many tasks, public activities, interaction with others", "seek private, solitary activities with quiet to concentrate"};
 	string[][] number[9] = {"standard, usual, conventional", "different, novel, unique"};
 	string[][] number[10] = {"firm, tend to criticize, hold the line", "gentle, tend to appreciate, conciliate"};
	string[][] number[11] = {"regulated, structured", "easygoing, 'live' and 'let live'"};
        string[][] number[12] = {"external, communicative, express yourself", "internal, reticent, keep to yourself"};
        string[][] number[13] = {"focus on here-and-now", "look to the future, global perspective, 'big picture'"};
        string[][] number[14] = {"tough-minded, just", "tender-hearted, merciful"};
        string[][] number[15] = {"preparation, plan ahead", "go with the flow, adapt as you go"};
        string[][] number[16] = {"active, initiate", "reflective, deliberate"};
        string[][] number[17] = {"facts, things, 'what is'", "ideas, dreams, 'what could be,' philosophical"};
        string[][] number[18] = {"matter of fact, issue-oriented", "sensitive, people-oriented, compassionate"};
        string[][] number[19] = {"control, govern", "latitude, freedom"};
        
        System.out.println("Welcome to mbti Test");
	System.out.print("");
        System.out.println("Press 0 for option (A)\nPress 1 for option (B)");
for(int index = 0; index < 20; index++) {
   System.out.println("\nnumber " + (index + 1));
   System.out.println("A: " + number[index][0]);
   System.out.println("B: " + number[index][1]);
   System.out.print("Your answer (0/1): ");
   answers[index] = input.nextInt();
        }

  int E = 0;   
        int S = 0;  
  int T = 0;          
  int J = 0; 
  int I = 0;
  int N = 0;
  int F = 0;
  int P = 0;

 if(answers[0] == 0) E++; 
 else I++;
 if(answers[4] == 0) E++; 
 else I++;
 if(answers[8] == 0) E++; 
 else I++;
 if(answers[12] == 0) E++;
 else I++;
 if(answers[16] == 0) E++;
 else I++;        
 if(answers[1] == 0) S++;
 else N++;
 if(answers[5] == 0) S++;
 else N++;
 if(answers[9] == 0) S++; 
 else N++;
 if(answers[13] == 0) S++;
 else N++;
 if(answers[17] == 0) S++;
 else N++;     
 if(answers[2] == 0) T++;
 else F++;
 if(answers[6] == 0) T++;
 else F++;
 if(answers[10] == 0) T++;
 else F++;
 if(answers[14] == 0) T++;
 else F++;
 if(answers[18] == 0) T++;
 else F++;       
 if(answers[3] == 0) J++;
 else P++;
 if(answers[7] == 0) J++;
 else P++;
 if(answers[11] == 0) J++;
 else P++;
 if(answers[15] == 0) J++; 
 else P++;
 if(answers[19] == 0) J++; 
 else P++;
        
  String type = "";
        
        
        if(E > I)
            type += "E";
        else
            type += "I";
            
        if(S > N)
            type += "S";
        else
            type += "N";
            
        if(T > F)
            type += "T";
        else
            type += "F";
            
        if(J > P)
            type += "I";
        else
            type += "P";
           
        System.out.println("\nScores for each Number:");
        System.out.println("E: " + E + " vs I: " + I);
        System.out.println("S: " + S + " vs N: " + N);
        System.out.println("T: " + T + " vs F: " + F);
        System.out.println("I: " + I + " vs P: " + P);

	System.out.println("\nYour personality type is: " + type);


}
}
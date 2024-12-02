import java.util.Scanner;

public class MBTI {
    public static void main(String[] args) {
       String[][] number = new String[20][2];
        int[] answers = new int[20];
        Scanner input = new Scanner(System.in);
        
        number[0][0] = "expend energy, enjoy groups";
	number[0][1] = "conserve energy, enjoy one-on-one";
        number[1][0] = "interpret literally"; 
	number[1][1] = "look for meaning and possibilities";
        number[2][0] = "logical, thinking, questioning"; 
	number[2][1] = "empathetic, feeling, accommodating";
        number[3][0] = "organized, orderly";
	number[3][1] = "flexible, adaptable";
        number[4][0] = "more outgoing, think out loud";
	number[4][1] = "more reserved, think to yourself";
        number[5][0] = "practical, realistic, experiential";
	number[5][1] = "imaginative, innovative, theoretical";
        number[6][0] = "candid, straight forward, frank";
	number[6][1] = "tactful, kind, encouraging";
        number[7][0] = "plan, schedule";
	number[7][1] = "unplanned, spontaneous";
        number[8][0] = "seek many tasks, public activities, interaction with others";
	number[8][1] = "seek private, solitary activities with quiet to concentrate";
        number[9][0] = "standard, usual, conventional";
	number[9][1] = "different, novel, unique";
        number[10][0] = "firm, tend to criticize, hold the line";
	number[10][1] = "gentle, tend to appreciate, conciliate";
        number[11][0] = "regulated, structured";
	number[11][1] = "easygoing, 'live' and 'let live'";
        number[12][0] = "external, communicative, express yourself";
	number[12][1] =  "internal, reticent, keep to yourself";
        number[13][0] = "focus on here-and-now";
	number[13][1] =  "look to the future, global perspective, 'big picture'";
        number[14][0] = "tough-minded, just";
	number[14][1] = "tender-hearted, merciful";
        number[15][0] = "preparation, plan ahead";
	number[15][1] = "go with the flow, adapt as you go";
        number[16][0] = "active, initiate";
	number[16][1] = "reflective, deliberate";
        number[17][0] = "facts, things, 'what is'";
	number[17][1] = "ideas, dreams, 'what could be,' philosophical";
        number[18][0] = "matter of fact, issue-oriented";
	number[18][1] = "sensitive, people-oriented, compassionate";
        number[19][0] = "control, govern";
	number[19][1] = "latitude, freedom";
       
	 
        System.out.println("Welcome to Myers Briggs Test");
	System.out.print("What's your name: ");
	String userName = input.nextLine();
        System.out.println("press 0 for first option (A) or 1 for second option (B)");
        
                for(int i = 0; i < 20; i++) {
            System.out.println("\nnumber " + (i + 1));
            System.out.println("A: " + number[i][0] + "\tB: " + number[i][1]);
            System.out.print("Your answer (0/1): ");
            answers[i] = input.nextInt();
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
            type += "J";
        else
            type += "P"; 
        
        System.out.println("\nScores for each category:");
        System.out.println("E: " + E + " vs I: " + I);
        System.out.println("S: " + S + " vs N: " + N);
        System.out.println("T: " + T + " vs F: " + F);
        

System.out.println(userName + " your personality type is: " + type);

}

}

import java.util.Scanner;
public class Nokia1 {
   public static void main (String[] args) {
   Scanner input = new Scanner(System.in);
    
     
   System.out.println("select a menu press:\n1. phone book\n2. messages\n3. chat\n4 call register\n5. Tones\n6. Settings\n7. Clock");
    int menu = input.nextInt();

    switch(menu) {
   
   case 1:
   System.out.println("1.search\n2.service nos\n3. add name\n4.erase\n5. Edit\n6. assign tone\n7. send b'card\n8.options\n1. type of view\n2. memory status\n9.speed dials\n10. voice tags ");
   
   int phonebook = input.nextInt();
    switch(phonebook) {
    case 1:System.out.println("search");
break;
    case 2:System.out.println("service nos");
break;
    case 3:System.out.println("add name");
break;
    case 4:System.out.println("Erase");
break;
    case 5:System.out.println("edit");
break;
    case 6:System.out.println("assign tone");
break;
    case 7:System.out.println("send b'card");
break;
    case 8:System.out.println("send b'card\n1.type of view\n2. memory status");
break;
    case 9:System.out.println("speed dial");
break;
    case 10:System.out.println("voice tags");
break;
}break;
     case 2:
     System.out.println("1.write message\n2.inbox\n3.outbox\n4.picture message\n5.templates\n6.smileys\n7.message settings\n8.info service\n9.voice mailbox number\n10.service command editor");
   
   int messages = input.nextInt();
    switch(messages) {
    case 1:System.out.println("write message");
break;
    case 2:System.out.println("inbox");
break;
    case 3:System.out.println("outbox");
break;
    case 4:System.out.println("picture message");
break;
    case 5:System.out.println("templates");
break;
    case 6:System.out.println("smileys");
    break;
    case 7:System.out.println("message settings\n 1.set 1\n1.message centre number\n2.messagesent as\n3.message validity\n 2. common\n1.delivery reports\n2.reply\n3.character support");
break;
    case 8:System.out.println("info service");
break;
    case 9:System.out.println("voice mailbox number");
break;
    case 10:System.out.println("service command editor");
break;
}break;
 
     case 3:
     System.out.println("1.chat");
   
   int chat = input.nextInt();
    switch(chat) {
 case 1:System.out.println("chat");
break;
}
     case 4:
     System.out.println("1.missed call\n2.recieved call\n3.dialled numbers\n4.erase recent call lists\n5.show call duration\n6.show call cost\n7.call cost settings\n8.prepaid credit");
   
   int callregister = input.nextInt();
    switch(callregister) {
  case 1:System.out.println("missed call");
break;
    case 2:System.out.println("recieved call");
break;
    case 3:System.out.println("dialled numbers");
break;
    case 4:System.out.println("erase recent call lists");
break;
    case 5:System.out.println("show call duration\n 1. last call duration\n 2. all calls duration\n 3. received calls' duration\n 4. dialled calls' duration\n 5. clear timers");
break;
    case 6:System.out.println("show call cost\n 1. last call cost\n 2. all calls' cost\n 3. clear counters");
break;
    case 7:System.out.println("call cost settings\n 1. call cost limit\n 2. show cost in");
break;
    case 8:System.out.println("prepaid credit");
break;
}break;
     
  
}

}

}

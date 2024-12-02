public class PascalTriangle {
  public static void main(String[] args) {
   int row = 6;
    for(int count = 1;count<=row;count++){
     for(int j = count;j<=row;j++){
      System.out.print("  ");
}
     for(int j = 1;j<=count;j++){
      System.out.print("* * ");
}
    System.out.println();

}
}
}
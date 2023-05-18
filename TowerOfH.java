public class TowerOfH {
    public int moves(int n,char s, char d, char a){
        if(n==1 || n==0){
            return n;
        }
        int step1=moves(n-1, s, a, d);
        int step2=1;
        int step3=moves(n-1, a, d, s);
        return step1+step2+step3;
    }
   public static void main(String[] args) {
    TowerOfH toh=new TowerOfH();
    int numberOfDisks = 5;
    int minimumMoves = toh.moves(numberOfDisks, 's', 'd', 'a');
    System.out.println("Minimum moves required: " + minimumMoves);
   }
}

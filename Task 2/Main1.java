
 class ContestStats {
    int[] scores = {85,90,95};
    void printfirstScore(){
        System.out.println("First Score : " +scores[0]);
    }
}
public class Main1{
    public static void main(String[] args) {
        ContestStats contest = new ContestStats();
        contest.printfirstScore();
    }
    
}

package pubg;
import java.util.Scanner;

public class PubG {

        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            int i;
            int n=sc.nextInt();
            sc.nextLine().trim();
            if(n>0 && n<=100){
                for(i=0;i<n;i++){
                    Player[] playersArray=new Player[n];
                    String playerName=sc.nextLine().trim();
                    String userName=sc.nextLine().trim();
                    String level=sc.nextLine().trim();
                    int score=sc.nextInt();
                    playersArray[i]=new Player(playerName,userName,level,score);
                }
                System.out.println("PlayerName\tUserName\tLevel\tScore");
                /*
                Enhanced for-loop
                for-each loop
                */
                for(Player player : playersArray){
                    System.out.println(player);
                }
            }
        }
    }
    class Player{
        private String playerName;
        private String userName;
        private String level;
        private int score;
        public String getPlayerName(){
            return playerName;
        }
        public String getUserName(){
            return userName;
        }
        public String getLevel(){
            return level;
        }
        public int getScore(){
            return score;
        }
        public void setPlayerName(String playerName){
            this.playerName=playerName;
        }
        public void setUserName(String userName){
            this.userName=userName;
        }
        public void setLevel(String level){
            this.level=level;
        }
        public void setScore(int score){
            this.score=score;
        }
        public Player(String playerName,String userName,String level,int score){
            this.playerName = playerName;
            this.userName = userName;
            this.level = level;
            this.score = score;
        }
        @Override
        public String toString(){
            return getPlayerName()+"\t"+getUserName()+"\t"+getLevel()+"\t"+getScore();
        }
    }
}

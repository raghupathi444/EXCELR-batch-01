class bowler{
    public  String name;
    public int wickets;
    public int matches;
    public int balls_bowled;
    public int runs_conceded;

    public bowler(){
        this.name = "Unknown";
        this.wickets=0;
        this.matches=0;
        this.balls_bowled=0;
        this.runs_conceded=0;
    }
    public bowler(String name, int wickets, int matches,int balls_bowled, int runs_conceded){
        this.name = name;
        this.wickets = wickets;
        this.matches = matches;
        this.balls_bowled = balls_bowled;
        this.runs_conceded = runs_conceded;
    }

    public void Avg(){
        if(matches==0){
            if( (balls_bowled>0)||(balls_bowled>0)){
                System.out.println("Error");
            }
        } 
        if((wickets<0) || (matches<0) || (balls_bowled<0)||(runs_conceded<0)){
            System.out.println("Error");
        }  else{
            if(wickets>0){

                float avg = (float)runs_conceded/wickets;
                System.out.println("Name: "+name);
                System.out.println("bowling_avg: "+avg);
            }
            else{
                System.out.println(name+" has not taken any wickets");
            }
        }
    }

    public void showStats(){
        if(matches==0){
            if( (balls_bowled>0)||(balls_bowled>0)){
                System.out.println("Error");
            }
        }    
        if((wickets<0) || (matches<0) || (balls_bowled<0)||(runs_conceded<0)){
            System.out.println("Error");
        } else{            
            System.out.println("Name: "+name);
            System.out.println("Matches: "+matches);
            System.out.println("Wickets: "+wickets);
            System.out.println("Balls Bowled: "+balls_bowled);
            System.out.println("Runs conceded: "+runs_conceded);
        }
    }

    public void strikeRate(){
        if(matches==0){
            if( (balls_bowled>0)||(balls_bowled>0)){
                System.out.println("Error");
            }
        }
        if((wickets<0) || (matches<0) || (balls_bowled<0)||(runs_conceded<0)){
            System.out.println("Error");
        } else{
            double strike = (double)runs_conceded/balls_bowled;
            
            System.out.println("Name: "+name);
            System.out.println("Strike Rate: "+strike);
        }
    }
}
public class ps003 {
    public static void main(String[] args) {
        bowler b = new bowler("Sachin",10,5,750,463);
        b.Avg();
        System.out.println();
        b.showStats();
        System.out.println();
        b.strikeRate();

    }
}
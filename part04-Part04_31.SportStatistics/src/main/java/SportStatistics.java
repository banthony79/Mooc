
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {
    
    public static ArrayList<String> games = new ArrayList<>(); 

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("File:");
        String file = scan.nextLine(); 
        
      try  (Scanner fileScanner = new Scanner(Paths.get(file))) {
          while(fileScanner.hasNextLine()) {
             String line = fileScanner.nextLine(); 
             games.add(line); 
              
          }
          
            
        } catch (Exception e) {
            System.out.println("Error");
        }
     
      
        System.out.println("Team:");
        String teamName = scan.nextLine(); 
        System.out.println("Games: " + gamesPlayed(teamName)); 
        int winCount = 0; int loseCount = 0; int homePoints = 0; int visitorPoints = 0; 
        /*for (String game: games) {
           if (game.contains(teamName)) {
                String [] parts = game.split(","); 
                String firstTeam = parts[0];
                if (firstTeam.equals(teamName)) {
                homePoints = Integer.valueOf(parts[2]); 
                visitorPoints = Integer.valueOf(parts[3]); }
                else {
                    homePoints = Integer.valueOf(parts[3]);
                    visitorPoints = Integer.valueOf(parts[2]); 
                }
                if (win(homePoints, visitorPoints)) {
                    winCount++; 
                } else {
                    loseCount++; 
                }
            }

        
     }
        
        System.out.println("Wins: " + winCount);
        System.out.println("Losses: " + loseCount);
    */
    }
    
    
    
    
    public static int gamesPlayed(String name) {
        int count = 0; 
        for (String games: games) {
            if (games.contains(name)){
                count++; 
            }
        }
   return count;  }
    
   
    public static boolean win(int homePoints, int visitorPoints) {
        if (homePoints > visitorPoints) {
            return true; 
            
        }
   return false;  }
    
    
    
}

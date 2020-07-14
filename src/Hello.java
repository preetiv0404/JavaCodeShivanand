
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.Iterator;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
public class Hello {
  /**
   * Iterate through each line of input.
   */
  public static void main(String[] args) throws IOException {
     double startingBalance = 0.0;
    double overDraftCount=0.0;
     List<Double> balanceAndTransactionsForTheDay = new ArrayList();
     List<Double> transactionsForTheDay = new ArrayList();
    InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
    BufferedReader in = new BufferedReader(reader);
    String line; 
    while ((line = in.readLine()) != null) {
     // startingBalance = Double.parseDouble(line);
      
        balanceAndTransactionsForTheDay.add( Double.parseDouble(line));
        
      }
    startingBalance =balanceAndTransactionsForTheDay.get(0);
    transactionsForTheDay = balanceAndTransactionsForTheDay.subList(1,balanceAndTransactionsForTheDay.size());
    Collections.sort(transactionsForTheDay, Collections.reverseOrder());
    
    for(int i=0; i<transactionsForTheDay.size();i++){
      
      overDraftCount =overDraftCount + transactionsForTheDay.get(i);
      if(overDraftCount > startingBalance){
        System.out.println("Exceed transaction");
      }
    }
     System.out.println(startingBalance);
     System.out.println(balanceAndTransactionsForTheDay);
     System.out.println(transactionsForTheDay);
       System.out.println(overDraftCount);
      System.out.println(line);
    
  }
}
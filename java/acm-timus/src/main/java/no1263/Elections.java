package no1263;

import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Scanner;

/**
 * @author Bungardean Tudor-Ionut
 */
public class Elections {

    private Scanner scanner = new Scanner(System.in);
    private DecimalFormat decimalFormat = new DecimalFormat("#.##");

    public static void main(String[] args){
        new Elections().solve();
    }

    public void solve(){
        int candidates = Integer.parseInt(scanner.next());
        int electors = Integer.parseInt(scanner.next());
        int vote;
        HashMap<Integer, Integer> results = new HashMap<>();
        for (int i = 0; i<candidates; i++){
            results.put(i+1,0);
        }
        for (int i = 0; i<electors; i++){
            vote = Integer.parseInt(scanner.next());
            results.put(vote,results.get(vote)+1);
        }
        for (int i = 0; i<candidates; i++){
            String percent = decimalFormat.format(new Double(results.get(i+1))*100/new Double(electors));
            if (!percent.contains(".")){
                percent = percent.concat(".00");
            } else if (percent.split("\\.")[1].length()==1){
                percent = percent.concat("0");
            }
            System.out.println(percent + "%");
        }
    }
}

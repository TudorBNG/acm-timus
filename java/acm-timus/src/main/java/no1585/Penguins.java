package no1585;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * @author Bungardean Tudor-Ionut
 */
public class Penguins {

    private final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){
        new Penguins().solve();
    }

    private void solve(){
        String input, penguin;
        HashMap<String, Integer> penguinHashMap = new HashMap<>();
        penguinHashMap.put("Emperor",0);
        penguinHashMap.put("Little",0);
        penguinHashMap.put("Macaroni",0);
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i<n; i++){
             input = scanner.nextLine();
             penguin = Arrays.stream(input.split(" ")).collect(Collectors.toList()).get(0);
             penguinHashMap.put(penguin, penguinHashMap.get(penguin)+1);
        }

        int max = 0;
        String winner = "";
        for (String key: penguinHashMap.keySet()){
            if (penguinHashMap.get(key) > max){
                max = penguinHashMap.get(key);
                winner = key;
            }
        }
        System.out.println(winner + " Penguin");
    }
}

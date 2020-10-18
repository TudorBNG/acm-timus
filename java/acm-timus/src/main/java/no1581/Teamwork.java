package no1581;

import java.util.Scanner;

/**
 * @author Bungardean Tudor-Ionut
 */
public class Teamwork {

    private Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){
        new Teamwork().solve();
    }

    private void solve(){

        int n = Integer.parseInt(scanner.nextLine());
        int current, counter = 0, last = -1;

        for (int i = 0; i<n; i++){
            current = Integer.parseInt(scanner.next());
            if (current==last){
                counter++;
            }else if (last != -1){
                System.out.print(counter + " " + last + " ");
                last = current;
                counter = 1;
            }else{
                last = current;
                counter++;
            }
        }
        System.out.print(counter + " " + last + " ");
    }
}

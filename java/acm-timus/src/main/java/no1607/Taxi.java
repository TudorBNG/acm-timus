package no1607;

import java.util.Scanner;

/**
 * @author: Tudor Bungardean
 */

public class Taxi {

    private Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){
        new Taxi().solve();
    }

    private void solve(){
        int petrOffer = this.scanner.nextInt();
        int petrRate = this.scanner.nextInt();
        int driverOffer = this.scanner.nextInt();
        int driverRate = this.scanner.nextInt();
        int finalPrice;
        while(true){
            if (petrOffer>=driverOffer){
                finalPrice = petrOffer;
                break;
            }
            if (petrOffer+petrRate>=driverOffer){
                finalPrice = driverOffer;
                break;
            }else{
                petrOffer+=petrRate;
            }

            if (driverOffer-driverRate<=petrOffer){
                finalPrice = petrOffer;
                break;
            }else{
                driverOffer-=driverRate;
            }
        }

        System.out.println(finalPrice);

    }
}

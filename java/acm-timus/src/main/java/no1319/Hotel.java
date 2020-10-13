package no1319;

import java.io.*;

/**
 * @author Bungardean Tudor-Ionut
 */

public class Hotel {

    private StreamTokenizer input = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
    private PrintWriter output = new PrintWriter(System.out);

    public static void main(String[] args) throws IOException {
        new Hotel().run();
    }

    private void run() throws IOException {
        int data = this.getValue();

        this.solve(data);
    }

    private void solve(int data) {
        for (int i = data; data>= 0; i--){

        }
    }

    private int getValue() throws IOException {
        this.input.nextToken();
        return (int) this.input.nval;
    }
}
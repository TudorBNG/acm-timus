package no1068;

import java.io.*;

/**
 * Created by: Bungardean Tudor-Ionut
 */

public class Sum {

    public static void main(String[] args) throws IOException {
        new Sum().solveSum();
    }


    private StreamTokenizer input = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
    private PrintWriter output = new PrintWriter(System.out);


    private int getValue () throws IOException {

        this.input.nextToken();

        return (int) this.input.nval;
    }

    private void solveSum () throws IOException {

        int limit = this.getValue();
        int result =(Math.abs(limit) + 1) * Math.abs(limit) / 2;

        if (limit <= 0) {
            this.output.println(1 - result);
        } else {
            this.output.println(result);
        }

        this.output.flush();

    }

}

package no1225;

import java.io.*;
import java.util.ArrayList;

/**
 * Created by: Bungardean Tudor-Ionut
 */

public class Flags {

    private StreamTokenizer input = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
    private PrintWriter output = new PrintWriter(System.out);
    private ArrayList<Long> arrayList = new ArrayList<>();



    public static void main(String[] args) throws IOException {
        new Flags().run();
    }


    private void run() throws IOException {
        int data = this.getValue();
        this.initialize(data);
        this.solve(data);
    }

    private void initialize(int data){
        for (int i = 0; i<=data; i++){
            this.arrayList.add(new Long(-1));
        }
    }

    private Long fib(int data){
        if (data==0) {
            return new Long(data);
        }else if(data==1){
            return new Long(data+1);
        }else if (this.arrayList.get(data)!=-1) {
            return this.arrayList.get(data);
        }else {
            this.arrayList.set(data,fib(data-1)+fib(data-2));
        }
        return this.arrayList.get(data);
    }

    private void solve(int data) {
        this.output.println(this.fib(data));
        this.output.flush();
    }

    private int getValue() throws IOException {
        this.input.nextToken();
        return (int) this.input.nval;
    }

}
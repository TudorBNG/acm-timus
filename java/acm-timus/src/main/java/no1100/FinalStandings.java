package no1100;

import java.io.*;
import java.util.*;

/**
 * @author Bungardean Tudor-Ionut
 */
public class FinalStandings {
    private StreamTokenizer scanner = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
    private PrintWriter printer = new PrintWriter(System.out);
    private List<Integer[]> teamScores = new ArrayList<>();
    public static void main(String[] args) throws IOException {
        new FinalStandings().solve();
    }

    private void solve() throws IOException {
        scanner.nextToken();
        int teamsNo = (int) scanner.nval;
        for (int i = 0; i<teamsNo; i++){
            Integer[] score = new Integer[2];
            scanner.nextToken();
            score[0]=(int)scanner.nval;
            scanner.nextToken();
            score[1]=(int)scanner.nval;
            teamScores.add(score);
        }
        mergeSort(teamScores,0,teamScores.size()-1);

        for(int i = 0; i<teamScores.size(); i++){
            this.printer.println(teamScores.get(i)[0] + " " + teamScores.get(i)[1]);
        }
        this.printer.flush();
    }

    public static void mergeSort(List<Integer[]> array, int left, int right) {
        if (right <= left) return;
        int mid = (left+right)/2;
        mergeSort(array, left, mid);
        mergeSort(array, mid+1, right);
        merge(array, left, mid, right);

    }

    static void merge(List<Integer[]> array, int left, int mid, int right) {
        // calculating lengths
        int lengthLeft = mid - left + 1;
        int lengthRight = right - mid;

        // creating temporary subarrays
        List<Integer[]> leftArray = new ArrayList<>(lengthLeft);
        List<Integer[]> rightArray = new ArrayList<>(lengthRight);
        for (int i=0; i<lengthLeft; i++){
            leftArray.add(new Integer[]{0,0});
        }
        for (int i=0; i<lengthRight; i++){
            rightArray.add(new Integer[]{0,0});
        }
        // copying our sorted subarrays into temporaries
        for (int i = 0; i < lengthLeft; i++)
            leftArray.set(i,array.get(left+i));
        for (int i = 0; i < lengthRight; i++)
            rightArray.set(i, array.get(mid+i+1));

        // iterators containing current index of temp subarrays
        int leftIndex = 0;
        int rightIndex = 0;

        // copying from leftArray and rightArray back into array
        for (int i = left; i < right + 1; i++) {
            // if there are still uncopied elements in R and L, copy minimum of the two
            if (leftIndex < lengthLeft && rightIndex < lengthRight) {
                if (leftArray.get(leftIndex)[1] >= rightArray.get(rightIndex)[1]) {
                    array.set(i, leftArray.get(leftIndex));
                    leftIndex++;
                }
                else {
                    array.set(i, rightArray.get(rightIndex));
                    rightIndex++;
                }
            }
            // if all the elements have been copied from rightArray, copy the rest of leftArray
            else if (leftIndex < lengthLeft) {
                array.set(i, leftArray.get(leftIndex));
                leftIndex++;
            }
            // if all the elements have been copied from leftArray, copy the rest of rightArray
            else if (rightIndex < lengthRight) {
                array.set(i, rightArray.get(rightIndex));
                rightIndex++;
            }
        }
    }
}

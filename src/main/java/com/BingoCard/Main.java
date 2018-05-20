package com.BingoCard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.stream.IntStream;

public class Main {


    public static void main(String[] args) {

        ArrayList<Integer> column1 = new ArrayList<Integer>();
        ArrayList<Integer> column2 = new ArrayList<Integer>();
        ArrayList<Integer> column3 = new ArrayList<Integer>();
        ArrayList<Integer> column4 = new ArrayList<Integer>();
        ArrayList<Integer> column5 = new ArrayList<Integer>();

        for (int i=1; i<16; i++) { column1.add(new Integer(i));
        }
        for (int i=16; i<31; i++) { column2.add(new Integer(i));
        }
        for (int i=31; i<46; i++) { column3.add(new Integer(i));
        }
        for (int i=46; i<61; i++) { column4.add(new Integer(i));
        }
        for (int i=61; i<76; i++) { column5.add(new Integer(i));
        }

        Collections.shuffle(column1);
        Collections.shuffle(column2);
        Collections.shuffle(column3);
        Collections.shuffle(column4);
        Collections.shuffle(column5);

        int  bingoCard[][] = new int[5][5];

        for (int row = 0; row < 5; row++)
            bingoCard[row][0] = column1.get(row);

        for (int row = 0; row < 5; row++)
            bingoCard[row][1] = column2.get(row);

        for (int row = 0; row < 5; row++)
            bingoCard[row][2] = column3.get(row);

        for (int row = 0; row < 5; row++)
            bingoCard[row][3] = column4.get(row);

        for (int row = 0; row < 5; row++)
            bingoCard[row][4] = column5.get(row);

        bingoCard[2][2] = 0;

        System.out.println(Arrays.deepToString(bingoCard));
        System.out.println("BrokerGenius");

    }

}


package com.a00n.sudokugameowl.utils;

public class Helpers {

    public  static  int  getBlockNumber(int row, int column) {
        if (row <= 2 && column <= 3) {
            return 1;
        } else if (row <= 2 && column <= 6) {
            return 2;
        } else if (row <= 4 && column <= 3) {
            return 3;
        } else if (row <= 4 && column <= 6) {
            return 4;
        } else if (row <= 6 && column <= 3) {
            return 5;
        } else if ( row <= 6 && column <= 6) {
            return 6;
        }
        return -1;
    }
}

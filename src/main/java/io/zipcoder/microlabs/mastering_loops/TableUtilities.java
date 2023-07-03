package io.zipcoder.microlabs.mastering_loops;

public class TableUtilities {
    public static String getSmallMultiplicationTable() {
        String ans = "";
        for( int i = 1; i < 5; i++){
            if(i == 1){
                ans += "";
            }else {
                ans += "\n";
            }
            for (int j = 1; j< 5; j++){
            int mult = i*j;
            if (mult< 10) {
                ans += "  " + mult + " |";
            }else{
                ans += " " + mult + " |";
            }
            }
        }


        return ans;
    }

    public static String getLargeMultiplicationTable() {
        String ans = "";
        for( int i = 1; i < 10; i++){
            if(i == 1){
                ans += "";
            }else {
                ans += "\n";
            }
            for (int j = 1; j< 10; j++){
                int mult = i*j;
                if (mult< 10) {
                    ans += "  " + mult + " |";
                }else{
                    ans += " " + mult + " |";
                }
            }
        }


        return ans;
    }

    public static String getMultiplicationTable(int tableSize) {
        String ans = "";
        for( int i = 1; i <= tableSize; i++){
            if(i == 1){
                ans += "";
            }else {
                ans += "\n";
            }
            for (int j = 1; j<= tableSize; j++){
                int mult = i*j;
                if (mult< 10) {
                    ans += "  " + mult + " |";
                }else if(mult < 100){
                    ans += " " + mult + " |";
                }else {
                    ans +=   mult + " |";
                }
            }
        }


        return ans;
    }
}

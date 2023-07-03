package io.zipcoder.microlabs.mastering_loops;

public class TriangleUtilities {

    public static String getTriangle(int numberOfRows) {
        StringBuilder sb = new StringBuilder();

        int idx = 1;
        while (idx < numberOfRows) {
            String thisRow = getRow(idx);
            sb.append(thisRow).append("\n");
            idx++;
        }
        return sb.toString();
    }

    public static String getRow(int numberOfStars) {
        String s ="";
        char c = '*';
        for (int i = 0; i < numberOfStars; i++){
            s += c;
        }
        return s;
    }

    public static String getSmallTriangle() {
        return getTriangle(5);
    }

    public static String getLargeTriangle() {
       return getTriangle(10);
    }
}

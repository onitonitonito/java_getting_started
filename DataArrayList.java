public class DataArrayList {
public static void main(String[] args) {
        int[] odds = {1, 3, 5, 7, 9};
        String[] weeks = {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};

        // ALL THE SAME WAY = declaire 'new' OBJECT ARRAY
        String[] upperWeeks = new String[7];
        upperWeeks[0] = "MON";
        upperWeeks[1] = "TUE";
        upperWeeks[2] = "WED";
        upperWeeks[3] = "THU";
        upperWeeks[4] = "FRI";
        upperWeeks[5] = "SAT";
        upperWeeks[6] = "SUN";

        for (int i=0; i<upperWeeks.length; i++) {
                System.out.println(i + "." + upperWeeks[i] + " (" + weeks[i] + ")");
        }

}
}

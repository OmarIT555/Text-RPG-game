public class StringToIntArr {
    // Converts String to Int[]
    public static int[] cConvert (String product) {
        String[] StringArray = product.split(",");
        int size = StringArray.length;
        int[] compass = new int [size];
        for (int i = 0; i < size; i++) {
            compass[i] = Integer.parseInt(StringArray[i]);
        }
        return compass;
    }
}

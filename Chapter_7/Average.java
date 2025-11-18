public class Average {
    public static int countAboveAverage(int[] responseTimes) {
        int count = 0;
        int sum = 0;

        for (int i = 1; i < responseTimes.length; i++) {
            sum += responseTimes[i - 1];
            double average = (double) sum / i;
            if (responseTimes[i] > average) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int[] responseTimes = {100, 200, 150, 300};
        System.out.println(countAboveAverage(responseTimes));
    }
}

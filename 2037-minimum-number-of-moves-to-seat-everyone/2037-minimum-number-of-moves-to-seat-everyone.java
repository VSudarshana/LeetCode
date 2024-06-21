class Solution {
    public int minMovesToSeat(int[] seats, int[] students) {
        Arrays.sort(seats);
        Arrays.sort(students);
        int sub = 0, sum = 0;
        for (int i = 0; i < seats.length; i++) {
            sub = Math.abs(seats[i] - students[i]);
            sum += sub;
        }
        return sum;
    }
}
public class scoresGrades {
    public static void main(String[] args){
        int[] scores = {10, 6, 5, 7, 8};

        int sum = 0;
        for(int grade : scores){
            sum += grade;
        }

        double avg = (double) sum / scores.length;
        System.out.println("Average: " + avg);
    }
}
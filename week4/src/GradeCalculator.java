public class GradeCalculator {
    public static String getGrade(int score){
        switch (score / 10) {
            case 10: // 100
            case 9:  // 90-99
                return "A";
            case 8:  // 80-89
                return "B";
            case 7:  // 70-79
                return "C";
            case 6:  // 60-69
                return "D";
            default: // anything else <60
                return "F";
        }
    }

    public static void main(String[] args) {
        System.out.println(getGrade(85));  
        System.out.println(getGrade(92));  
        System.out.println(getGrade(58));  
    }
}
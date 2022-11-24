public class GreaterLessThan {
    public static void main(String[] args) {
        double creditsEarned = 176.5;
        double creditOfSeminar = 8;
        double creditsToGraduate = 180;

        System.out.println(creditsEarned > creditsToGraduate);

        double creditsAfterSeminar = creditsEarned + creditOfSeminar;
        System.out.println(creditsToGraduate < creditsAfterSeminar);
    }
}

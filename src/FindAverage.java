import textio.*;

public class FindAverage {

    public static void main(String[] args) {
        String dataFile = "resources/testdata.txt";

        TextIO.readFile(dataFile);
        String name = TextIO.getln();
        int firstExam = TextIO.getlnInt();
        int secondExam = TextIO.getlnInt();
        int thirdExam = TextIO.getlnInt();

        double average = (double)(firstExam + secondExam + thirdExam) / 3;
        System.out.println(name + " got an average score of " + average);
    }

}
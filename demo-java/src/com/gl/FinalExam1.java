public class FinalExam1 {
    final int MAX_SPEED = 90; // biến final

    void run() {
        MAX_SPEED = 400;
    }

    public static void main(String args[]) {
        FinalExam1 obj = new FinalExam1();
        obj.run();
    }
}
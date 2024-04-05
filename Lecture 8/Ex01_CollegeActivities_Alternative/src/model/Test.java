package model;

public class Test implements Activity {
    private int testQuestionNumber;
    private float testAverage;

    public Test(int testQuestionNumber, float testAverage) {
        this.testQuestionNumber = testQuestionNumber;
        this.testAverage = testAverage;
    }

    public int getTestQuestionNumber() {
        return testQuestionNumber;
    }

    public void setTestQuestionNumber(int testQuestionNumber) {
        this.testQuestionNumber = testQuestionNumber;
    }

    public float getTestAverage() {
        return testAverage;
    }

    public void setTestAverage(float testAverage) {
        this.testAverage = testAverage;
    }

    @Override
    public String toString() {
        return String.format(
                "Test [Questions=%d, Average=%.1f]", testQuestionNumber, testAverage);
    }

}

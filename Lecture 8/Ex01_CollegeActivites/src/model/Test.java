package model;

public class Test {
    private int testNumberQuestion;
    private float testAverage;

    public Test(int testNumberQuestion, float testAverage) {
        this.testNumberQuestion = testNumberQuestion;
        this.testAverage = testAverage;
    }

    public int getTestNumberQuestion() {
        return testNumberQuestion;
    }

    public void setTestNumberQuestion(int testNumberQuestion) {
        this.testNumberQuestion = testNumberQuestion;
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
                "Test [Questions=%d, Average=%.1f]", testNumberQuestion, testAverage);
    }

}

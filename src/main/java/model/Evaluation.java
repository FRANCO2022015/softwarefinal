package model;

public class Evaluation {
    private double score;
    private double weight;

    public Evaluation(double score, double weight) {
        this.score = score;
        this.weight = weight;
    }

    public double getScore() {
        return score;
    }

    public double getWeight() {
        return weight;
    }
}

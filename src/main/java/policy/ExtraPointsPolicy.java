package policy;

public class ExtraPointsPolicy {

    private static final double BONUS_POINTS = 1.0;

    public double applyExtraPoints(boolean teachersAgree, double grade) {
        if (teachersAgree) {
            return grade + BONUS_POINTS;
        }
        return grade;
    }
}

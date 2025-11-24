package server;

import model.Evaluation;
import model.StudentRecord;
import policy.AttendancePolicy;
import policy.ExtraPointsPolicy;

public class GradeCalculator {

    private static final int MAX_EVALUATIONS = 10;

    public double calculate(StudentRecord record) {
        if (record.getEvaluations().size() > MAX_EVALUATIONS) {
            throw new IllegalArgumentException("Exceeds the maximum number of evaluations");
        }

        double weightedSum = 0;
        for (Evaluation e : record.getEvaluations()) {
            weightedSum += e.getScore() * e.getWeight();
        }

        AttendancePolicy attendancePolicy = new AttendancePolicy();
        weightedSum = attendancePolicy.applyPenalty(record.hasReachedMinimumClasses(), weightedSum);

        ExtraPointsPolicy extraPolicy = new ExtraPointsPolicy();
        weightedSum = extraPolicy.applyExtraPoints(record.allYearsTeachersAgree(), weightedSum);

        return weightedSum;
    }
}

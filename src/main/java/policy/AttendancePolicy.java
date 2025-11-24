package policy;

public class AttendancePolicy {

    public double applyPenalty(boolean hasMinimumAttendance, double grade) {
        if (!hasMinimumAttendance) {
            return grade * 0.5; // penalización del 50%
        }
        return grade;
    }
}

package model;

import java.util.ArrayList;
import java.util.List;

public class StudentRecord {

    private List<Evaluation> evaluations = new ArrayList<>();
    private boolean hasReachedMinimumClasses;
    private boolean allYearsTeachersAgree; // puntos extra

    public List<Evaluation> getEvaluations() {
        return evaluations;
    }

    public void setHasReachedMinimumClasses(boolean value) {
        this.hasReachedMinimumClasses = value;
    }

    public boolean hasReachedMinimumClasses() {
        return hasReachedMinimumClasses;
    }

    public void setAllYearsTeachersAgree(boolean value) {
        this.allYearsTeachersAgree = value;
    }

    public boolean allYearsTeachersAgree() {
        return allYearsTeachersAgree;
    }
}

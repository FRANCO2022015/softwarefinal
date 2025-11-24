package ui;

import model.Evaluation;
import model.StudentRecord;
import server.GradeCalculator;
import java.util.Scanner;

public class ConsoleMenu {

    public void start() {
        Scanner sc = new Scanner(System.in);
        StudentRecord record = new StudentRecord();

        System.out.println("Ingrese número de evaluaciones:");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Nota:");
            double score = sc.nextDouble();
            System.out.println("Peso (0-1):");
            double weight = sc.nextDouble();
            record.getEvaluations().add(new Evaluation(score, weight));
        }

        System.out.println("¿Asistencia mínima cumplida? (true/false)");
        record.setHasReachedMinimumClasses(sc.nextBoolean());

        System.out.println("¿Docentes de acuerdo en puntos extra? (true/false)");
        record.setAllYearsTeachersAgree(sc.nextBoolean());

        GradeCalculator calculator = new GradeCalculator();
        double finalGrade = calculator.calculate(record);

        System.out.println("Nota Final: " + finalGrade);
    }
}

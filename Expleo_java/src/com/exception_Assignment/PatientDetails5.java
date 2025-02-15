package com.exception_Assignment;
import java.util.Scanner;
class CovidPositiveException extends Exception {
    public CovidPositiveException(String message) {
        super(message);
    }
}
public class PatientDetails5{
    public static void validatePatient(int oxyLevel, int hrctReport) throws CovidPositiveException {
        if (oxyLevel < 95 && hrctReport > 10) {
            throw new CovidPositiveException("Patient is Covid Positive(+) and Needs to be Hospitalized.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        try {
            System.out.print("Enter Patient Name: ");
            String patientName = sc.nextLine();

            System.out.print("Enter Patient Age: ");
            int patientAge = sc.nextInt();

            System.out.print("Enter Patient Oxygen Level (%): ");
            int patientOxyLevel = sc.nextInt();

            System.out.print("Enter Patient HRCT Report Score: ");
            int patientHRCTReport = sc.nextInt();
            validatePatient(patientOxyLevel, patientHRCTReport);
            System.out.println("Patient Information:");
            System.out.println("Name: " + patientName);
            System.out.println("Age: " + patientAge);
            System.out.println("Oxygen Level: " + patientOxyLevel + "%");
            System.out.println("HRCT Report Score: " + patientHRCTReport);
            System.out.println("Health Status: Normal ");

        } catch (CovidPositiveException e) {
            System.out.println(e.getMessage());
        } finally {
            sc.close();
        }
    }
}


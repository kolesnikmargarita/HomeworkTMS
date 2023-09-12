package Homework8.AdditionalTask;

public class Main {

    public static void main(String[] args) {
        Doctor doctor;
        Patient patient = new Patient();
        doctor = assignDoctor(patient.getTreatmentPlanCode());
        if(doctor != null) {
            doctor.treat();
        }
        patient.setTreatmentPlan((byte)1);
        doctor = assignDoctor(patient.getTreatmentPlanCode());
        if(doctor != null) {
            doctor.treat();
        }
        patient.setTreatmentPlan((byte)2);
        doctor = assignDoctor(patient.getTreatmentPlanCode());
        if(doctor != null) {
            doctor.treat();
        }
        patient.setTreatmentPlan((byte)(Math.random() * 10 + 3));
        doctor = assignDoctor(patient.getTreatmentPlanCode());
        if(doctor != null) {
            doctor.treat();
        }
    }

    private static Doctor assignDoctor(Byte treatmentPlanCode) {

        if (treatmentPlanCode == null) {
            System.out.println("План лечения не назначен!");
            return null;
        }
        if(treatmentPlanCode == 1) {
            return new Doctor() {
                @Override
                public void treat() {
                    System.out.println("Лечение у хирурга пройдено.");
                }
            };
        }
        if(treatmentPlanCode == 2) {
            return new Doctor() {
                @Override
                public void treat() {
                    System.out.println("Лечение у дантиста пройдено.");
                }
            };
        }
        return new Doctor() {
            @Override
            public void treat() {
                System.out.println("Лечение у терапевта пройдено.");
            }
        };
    }
}

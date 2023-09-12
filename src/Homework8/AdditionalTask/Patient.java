package Homework8.AdditionalTask;

public class Patient {

    private TreatmentPlan treatmentPlan;

    private static class TreatmentPlan {

        private final byte code;
        private TreatmentPlan(byte treatmentPlanCode) {
            code = treatmentPlanCode;
        }

        private byte getCode() {
            return code;
        }
    }

    public void setTreatmentPlan(byte treatmentPlanCode) {
        treatmentPlan = new TreatmentPlan(treatmentPlanCode);
    }

    public Byte getTreatmentPlanCode() {
        if(treatmentPlan != null)
            return treatmentPlan.getCode();
        return null;
    }
}
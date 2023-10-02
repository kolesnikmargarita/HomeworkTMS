package Homework13.MainTask.Task1_1;

public class HashSetDocNumber {

    StringBuilder documentNumber;

    public HashSetDocNumber(StringBuilder setString) {
        documentNumber = new StringBuilder(setString);
    }

    @Override
    public boolean equals(Object otherString) {
        return documentNumber.toString().contentEquals(((HashSetDocNumber) otherString).getDocumentNumber());
    }

    @Override
    public int hashCode() {
        int code = 0;
        for (char symbol : documentNumber.toString().toCharArray()) {
            code += symbol;
        }
        return code;
    }

    public StringBuilder getDocumentNumber() {
        return documentNumber;
    }

    public void setDescription() {
        boolean validNumber = true;
        if(documentNumber.length() != 15){
            documentNumber.append(" - Невалиден: номер документа должен иметь длину 15 символов;");
            validNumber = false;
        }
        if(!documentNumber.toString().startsWith("docnum") && !documentNumber.toString().startsWith("kontract")){
            if (validNumber){
                documentNumber.append(" - Невалиден: ");
            }
            documentNumber.append("номер документа должен начинаться с \"docnum\" или с \"kontract\"");
            validNumber =false;
        }
        if(validNumber) {
            documentNumber.append(" - Валиден");
        }
        documentNumber.append('\n');
    }
}

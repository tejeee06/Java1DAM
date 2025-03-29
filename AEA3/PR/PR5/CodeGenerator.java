package AEA3.PR.PR5;

public class CodeGenerator {
    private static final String ABC = "abcdefghijklmnopqrstuvwxyz";
    private final int codeLength;

    public CodeGenerator(int codeLength) {
        this.codeLength = codeLength;
    }

    public String generateCode() {
        StringBuilder code = new StringBuilder();

        for (int i = 0; i < codeLength; i++) {
            code.append(generateRandomChar())
        }

        return code.toString();
    }

    private char generateRandomChar() {
        long nano = System.nanoTime();
        int index = (int) (nano % ABC.length());
        return ABC.charAt(index);
    }
}

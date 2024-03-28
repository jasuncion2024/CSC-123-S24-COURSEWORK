public class DecimalToBinaryConverter {

    public static String decimalToBinary(int decimal) {
        if (decimal == 0) {
            return "0";
        }

        Stack stack = new Stack(32);

        while (decimal > 0) {
            int remainder = decimal % 2;
            stack.push(remainder);
            decimal /= 2;
        }

        StringBuilder binary = new StringBuilder();
        while (!stack.isEmpty()) {
            binary.append(stack.pop());
        }

        return binary.toString();
    }

    public static void main(String[] args) {
        int[] decimalNumbers = {0, 1, 5, 10, 25, 100, 255, -10};

        for (int decimal : decimalNumbers) {
            System.out.println("Decimal: " + decimal + " Binary: " + decimalToBinary(decimal));
        }
    }
}

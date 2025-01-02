package aug17;

public class CountToString {

    public static void main(String[] args) {
        String str = "a2b3c1d2";
        System.out.println(str);
        String result = nosToString(str);
        System.out.println(result);
    }

    public static String nosToString(String str) {
        StringBuilder output = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            {
                if (i + 1 < str.length() && Character.isDigit(str.charAt(i + 1))) {
                    int count = Character.getNumericValue(str.charAt(i + 1));

                    for (int j = 0; j < count; j++) {
                        output.append(c);
                    }
                    i++;
                }
            }

        }
        return output.toString();
    }
}



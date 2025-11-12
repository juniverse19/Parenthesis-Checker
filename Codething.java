//
//  Class author:  name of programmer
//  Date created:  date that the class was initially created.
//  General description: a brief summary of what this particular class does.
//


public class Codething {
    public static void main (String[] args) {
        System.out.println(isValid("({})[]"));

    }

    public static boolean isValid (String s) {
        String string = s;

        if (string.length() % 2 == 1) {
            return false;
        }

        while (string.length() > 0) {
            for (int i = string.length() - 2; i >= -1; i--) {
                if (i == -1) {
                    return false;
                }

                char char1 = string.charAt(i);
                char char2 = string.charAt(i + 1);


                if ("([{".indexOf(char1 + "") == ")]}".indexOf(char2 + "")) {
                    if (i + 2 >= string.length()) {
                        // error below here
                        string = string.substring(0, i);
                    } else {
                        string = string.substring(0, i) + string.substring(i+2);
                    }
                } else {
                    return false;
                }
            }
        }

        return true;
    }
}
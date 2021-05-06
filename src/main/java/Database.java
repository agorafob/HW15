public class Database {

    private static final String[][] one =
            {{" ", " ", "@", "@", " ", " "," "},
                    {" ", "@", "@", "@", " ", " "," "},
                    {"@", " ", "@", "@", " ", " "," "},
                    {" ", " ", "@", "@", " ", " "," "},
                    {"@", "@", "@", "@", "@", "@"," "}};


    private static final String[][] two =

            {{"@", "@", "@", "@", "@", "@"," "},
                    {" ", " ", " ", " ", "@", "@"," "},
                    {"@", "@", "@", "@", "@", " "," "},
                    {"@", " ", " ", " ", " ", " "," "},
                    {"@", "@", "@", "@", "@", "@"," "}};


    private static final String[][] three =

            {{"@", "@", "@", "@", "@", "@"," "},
                    {" ", " ", " ", " ", "@", "@"," "},
                    {"@", "@", "@", "@", "@", " "," "},
                    {" ", " ", " ", " ", "@", "@"," "},
                    {"@", "@", "@", "@", "@", "@"," "}};


    private static final String[][] four =

            {{"@", " ", " ", " ", " ", "@"," "},
                    {"@", " ", " ", " ", " ", "@"," "},
                    {"@", "@", "@", "@", "@", "@"," "},
                    {" ", " ", " ", " ", " ", "@"," "},
                    {" ", " ", " ", " ", " ", "@"," "}};

    private static final String[][] five =

            {{"@", "@", "@", "@", "@", "@"," "},
                    {"@", "@", " ", " ", " ", " "," "},
                    {"@", "@", "@", "@", "@", " "," "},
                    {" ", " ", " ", " ", "@", "@"," "},
                    {"@", "@", "@", "@", "@", " "," "}};



    private static final String[][] six =

            {{" ", "@", "@", "@", "@", "@"," "},
                    {"@", "@", " ", " ", " ", " "," "},
                    {"@", "@", "@", "@", "@", " "," "},
                    {"@", "@", " ", " ", "@", "@"," "},
                    {" ", "@", "@", "@", "@", " "," "}};


    private static final String[][] seven =

            {{"@", "@", "@", "@", "@", "@"," "},
                    {" ", " ", " ", "@", "@", " "," "},
                    {" ", " ", "@", "@", " ", " "," "},
                    {" ", "@", "@", " ", " ", " "," "},
                    {"@", "@", " ", " ", " ", " "," "}};


    private static final String[][] eight =

            {{" ", "@", "@", "@", "@", " "," "},
                    {"@", "@", " ", " ", "@", "@"," "},
                    {" ", "@", "@", "@", "@", " "," "},
                    {"@", "@", " ", " ", "@", "@"," "},
                    {" ", "@", "@", "@", "@", " "," "}};


    private static final String[][] nine =

            {{" ", "@", "@", "@", "@", "@"," "},
                    {"@", "@", " ", " ", "@", "@"," "},
                    {" ", "@", "@", "@", "@", "@"," "},
                    {" ", " ", " ", " ", "@", "@"," "},
                    {" ", "@", "@", "@", "@", " "," "}};


    private static final String[][] zero =
            {{" ", "@", "@", "@", "@", " "," "},
                    {"@", " ", " ", " ", " ", "@"," "},
                    {"@", " ", " ", " ", " ", "@"," "},
                    {"@", " ", " ", " ", " ", "@"," "},
                    {" ", "@", "@", "@", "@", " "," "}};


    private static String[][] getNumber(String digit) {
        String[][] result = new String[0][];
        switch (digit) {
            case "0":
                result = zero;
                break;
            case "1":
                result = one;
                break;
            case "2":
                result = two;
                break;
            case "3":
                result = three;
                break;
            case "4":
                result = four;
                break;
            case "5":
                result = five;
                break;
            case "6":
                result = six;
                break;
            case "7":
                result = seven;
                break;
            case "8":
                result = eight;
                break;
            case "9":
                result = nine;
                break;
            default:
                break;
        }
        return result;
    }

    private static void printDeepString(String[][] str) {
        for (int i = 0; i < str.length; i++) {
            for (int j = 0; j < str[i].length; j++) {
                System.out.print(str[i][j]);
            }
            System.out.println();
        }
    }

    public static void print(int numberToPrint) {
        String[] str = String.valueOf(numberToPrint).split("");
        printDeepString(getNewArray(str));

    }


    private static String[][] getNewArray(String[] str) {
        String[][] newArr = null;
        for (int i = 0; i < str.length; i++) {
            String[][] temp = getNumber(str[i]);
            if (newArr == null) {
                newArr = temp;
            } else {
                newArr = arrCopy(newArr, temp, i);
            }
        }
        return newArr;
    }

    private static String[][] arrCopy(String[][] newArr, String[][] temp, int counter) {
        String[][] nextArr = new String[newArr.length][newArr[0].length + temp[0].length];
        for (int i = 0; i < nextArr.length; i++) {
            for (int j = 0; j < nextArr[i].length; j++) {
                if (j < newArr[i].length) {
                    nextArr[i][j] = newArr[i][j];
                } else {
                    nextArr[i][j] = temp[i][j - (temp[i].length * counter)];
                }
            }
        }
        return nextArr;
    }
}









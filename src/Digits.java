import java.util.ArrayList;

public class Digits {
    /**
     * The list of digits from the number used to construct this object.
     * The digits appear in the list in the same order in which they appear in the original number.
     */
    private ArrayList<Integer> digitList;

    /**
     * Constructs a Digits object that represents num.
     * PRECONDITION: num >= 0
     */
    public Digits(int num) {
        digitList = new ArrayList<Integer>();
        String temp = "";
        temp += num;

        for (int i = 0; i < temp.length(); i++) {
            String strNum = temp.substring(i, i + 1);
            digitList.add(Integer.parseInt(strNum));
        }
    }

    // GETTER METHOD: added to enable test code (not provided in original FRQ)
    public ArrayList<Integer> getDigitList() {
        return digitList;
    }

    /**
     * Returns true if the digits in this Digits object are in strictly increasing order;
     * false otherwise.
     */
    public boolean isStrictlyIncreasing(){
        for (int i = 0; i < digitList.size() - 1; i++) {
            int next = digitList.get(i + 1);
            int curr = digitList.get(i);
            if (next <= curr) {
                return false;
            }
        }
        return true;
    }
}
package tasks_7kyu;
//
//ATM machines allow 4 or 6 digit PIN codes and PIN codes cannot contain anything but exactly 4 digits or exactly 6 digits.
//If the function is passed a valid PIN string, return true, else return false.
//Examples (Input --> Output)

public class Task11 {
    public static void main(String[] args) {
        System.out.println(validatePin("1"));
        System.out.println(validatePin("1d22"));
        System.out.println(validatePin("112233"));
        System.out.println(validatePin("1234"));

    }

    public static boolean validatePin(String pin) {
        String[] array = pin.split("");
        if(pin.length() != 4 & pin.length() != 6) return false;
        for (String s: array) {
            if(!Character.isDigit(s.charAt(0))) return false;
        }

        return true;
    }
}
// return pin.matches("[0-9]{4}|[0-9]{6}");
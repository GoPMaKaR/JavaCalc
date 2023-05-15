public enum ArabNumber {
    I("I", 1), IV("IV", 4), II("II", 2), III("III", 3), V("V", 5), VI("VI", 6), VII("VII", 7), VIII("VIII", 8), IX("IX", 9), X("X", 10);

    private int value;
    private String key;

    ArabNumber(String key, int value) {
        this.value = value;
    }

    }


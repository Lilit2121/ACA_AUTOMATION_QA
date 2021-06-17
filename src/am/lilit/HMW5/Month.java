package am.lilit.HMW5;

public enum Month {
    JAN("January"),
    FEB("February"),
    MAR("March"),
    APR("April"),
    MAY("May"),
    JUN("June"),
    JUL("July"),
    AUG("August"),
    SEP("September"),
    OCT("October"),
    NOV("November"),
    DEC("December");

    private String fullName;

    Month(String fullname) {
        this.fullName = fullname;
    }

    public String getFullName() {
        return fullName;
    }
}


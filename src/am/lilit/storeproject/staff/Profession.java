package am.lilit.storeproject.staff;

public enum Profession {

    HEAD_MANAGER(true),
    ACCOUNTANT(true),
    CASHIER(true),
    CLEANER(false),
    SECURITY(false),
    TOILER(false);

    private boolean hasFinancialAccess;

    Profession(boolean hasFinancialAccess) {
        this.hasFinancialAccess = hasFinancialAccess;
    }

    public boolean HasFinancialAccess() {
        return hasFinancialAccess;
    }

    public void setHasFinancialAccess(boolean hasFinancialAccess) {
        this.hasFinancialAccess = hasFinancialAccess;
    }
}

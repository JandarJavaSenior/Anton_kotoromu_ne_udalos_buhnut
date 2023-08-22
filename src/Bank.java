public class Bank {
    private String userName;
    private String password;
    private int totalManey;
    private int creditLimit;

    public Bank(String userName, String password, int totalManey, int creditLimit) {
        this.userName = userName;
        this.password = password;
        this.totalManey = totalManey;
        this.creditLimit = creditLimit;
    }

    public int getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(int creditLimit) {
        this.creditLimit = creditLimit;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getTotalManey() {
        return totalManey;
    }

    public void setTotalManey(int totalManey) {
        this.totalManey = totalManey;
    }
    public String makePaymentWithCredit(String inputUserName, String inputPassword, int amount) {
        if (inputUserName.equals(userName) && inputPassword.equals(password)) {
            if (amount <= totalManey + creditLimit) {
                totalManey -= amount;
                return "Успешно оплачено с использованием кредита. Остаток на счете: " + totalManey;
            } else {
                return "Недостаточно средств для оплаты и кредита." +
                        "\n" +
                        "\nАнтон_Алкаш тихо плачет и уходит грустно";
            }
        } else {
            return "Неверное имя пользователя или пароль.";
        }
    }

    @Override
    public String toString() {
        return "Bank" + '\n' +
                "UserName: " + userName + '\n' +
                "Password: " + password+ '\n' +
                "TotalManey: " + totalManey + '\n';
    }
}

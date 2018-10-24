package login_admin;

public class CheckPassword {
    private LoginAdmin loginAdmin = new LoginAdmin();

    void addAdminAndPasswordCheck() {
        addAdmin();
        boolean loginStatus = passwordCheck("",""); /// TODO: 15.10.2018 от клиента приходит логин и пароль
    }

    private boolean passwordCheck(String login, String password) {
        if (loginAdmin.getLogin().equals(login) & loginAdmin.getPassword().equals(password)) {
            return true;
        } else {
            return false;
        }
    }

    private void addAdmin() {
        loginAdmin.setLogin("root");
        loginAdmin.setPassword("root");
    }
}

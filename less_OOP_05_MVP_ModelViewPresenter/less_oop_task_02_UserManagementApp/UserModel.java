package less_OOP_05_MVP_ModelViewPresenter.less_oop_task_02_UserManagementApp;
/*
Создайте класс User для представления учетной записи пользователя. 
Этот класс будет содержать поля для имени, логина и пароля пользователя, 
а также методы доступа к этим полям. 
Модель также может содержать методы для сохранения и загрузки данных пользователя.
 */
public class UserModel {
    private String userName;
    private String userLogin;
    private String userPass;
    private int userID;

    public String getName(){
        return this.userName;
    }

    public String getLogin(){
        return this.userLogin;
    }

    public String getPass(){
        return this.userPass;
    }

    public void setName(String name) {
        this.userName = name;
    }

    public void setLogin(String login) {
        this.userLogin = login;
    }

    public void setPass(String pass) {
        this.userPass = pass;
    }

    public String getInfo() {
        return String.format("Пользователь ID: %s\nИмя: %s\nЛогин: %s\nПароль: %s\n", this.userID, this.userName, this.userLogin, this.userPass);
    }

    // @Override
    // public String toString() {
    //     return getInfo();
    // }

}

package less_OOP_05_MVP_ModelViewPresenter.less_oop_task_02_UserManagementApp;

import java.util.ArrayList;
import java.util.Scanner;

/*
Представление (View): Создайте класс UserView, который будет отвечать за отображение информации 
о пользователе и взаимодействие с пользователем. 
Этот класс будет содержать методы для отображения формы регистрации, 
формы входа, формы изменения пароля и т.д. 
Он также будет содержать методы для получения введенных пользователем данных.
 */
public class UserView {
    private Scanner scanner;

    public UserView() {
        this.scanner = new Scanner(System.in);
    }

    public Integer mainMenu() {
        // System.out.print("\033[H\033[2J");
        // System.out.flush();

        System.out.print("\nВведите:\n1-регистрация\n2-вход\n3-смена пароля:\n4-печать всей базы\n0-выход\n-->");
        return scanner.nextInt();
    }

    private String inpName(){
        System.out.print("Введите свое имя: ");
        return scanner.next();
    }

    private String inpLogin(){
        System.out.print("Введите логин: ");
        return scanner.next();
    }

    private String inpPass(){
        System.out.print("Введите пароль: ");
        return scanner.next();
    }
    
    public ArrayList<String> registationForm(){
        ArrayList <String> userRegData = new ArrayList<>();
        System.out.print("\033[H\033[2J");
        System.out.flush();

        userRegData.add(inpName());
        userRegData.add(inpLogin());
        userRegData.add(inpPass());

        return userRegData;
    }

    public ArrayList<String> accessForm(){
        ArrayList <String> userAccessData = new ArrayList<>();
        System.out.print("\033[H\033[2J");
        System.out.flush();
        userAccessData.add(null);
        userAccessData.add(inpLogin());
        userAccessData.add(inpPass());

        return userAccessData;
    }

    public String changePass(){
        // System.out.print("\033[H\033[2J");
        // System.out.flush();

        boolean flag = true;
        String userNewPass = null;
        while(flag){
            System.out.print("Введите новый пароль: ");
            userNewPass = scanner.next();
            System.out.print("Еще раз: ");
            String userNewPass2 = scanner.next();
                if (userNewPass.equals(userNewPass2)){
                    flag = false;
                }
                else {
                    System.out.println("\n!Пароли не совпадают, повторите ввод");
                }
        } 
        return userNewPass;
    }

    public void printUser(UserModel user) {
        System.out.println(user.getInfo());
    }
}

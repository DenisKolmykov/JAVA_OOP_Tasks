package less_OOP_05_MVP_ModelViewPresenter.less_oop_task_02_UserManagementApp;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;


/*
Презентер (Presenter): Создайте класс UserPresenter, 
который будет служить посредником между моделью и представлением. 
Презентер будет содержать ссылку на модель и представление, и 
будет обрабатывать пользовательские действия, такие как регистрация, вход, изменение пароля и т.д. 
Он будет вызывать соответствующие методы модели для выполнения операций и 
обновлять представление с помощью методов представления для отображения результатов.
 */
public class UserPresenter {
    private UserView userView;
    private UserModel userModel;

    public  UserPresenter (UserView view, UserModel model){
        this.userView = view;
        this.userModel = model;
    }

    public void mainMenu() throws IOException {
        boolean flag;
        ArrayList<String> userData = new ArrayList<>();
        ArrayList<UserModel> allUssers = new ArrayList<>();
        do {
            flag = true;
            Integer choice = this.userView.mainMenu();
            allUssers = readUserDataFromFile();
            switch (choice){
                case(1):
                    userData = this.userView.registationForm();
                    UserModel user1 = controlLogin(allUssers,userData);

                    if (user1 == null){
                        this.userModel.setName(userData.get(0));
                        this.userModel.setLogin(userData.get(1));
                        this.userModel.setPass(userData.get(2));

                        System.out.print("\033[H\033[2J");
                        System.out.flush();
                        System.out.println("!Регистрация прошла успешно");

                        // запись в файл
                        writeUserDataToFile(userData);
                    }
                    else{
                        System.out.println("!!!Пользователь с таким ЛОГИНОМ уже существует");
                    }
                    break;
                
                case(2):
                    userData = this.userView.accessForm();
                    UserModel user2 = controlLogin(allUssers,userData);
                    if (user2 != null && user2.getPass().equals(userData.get(2))){
                        System.out.println("\nВход выполнен успешно");
                    }
                    else{
                        System.out.println("! Пара логин-пароль не совпадают");
                    }

                    break;
                
                case(3):
                    userData = this.userView.accessForm();
                    UserModel user3 = controlLogin(allUssers,userData);

                    allUssers.remove(user3);
                    
                    if (user3 != null && user3.getPass().equals(userData.get(2))){
                        user3.setPass(this.userView.changePass());
                        allUssers.add(user3);
                        writeAllUsersToFile(allUssers);
                        System.out.println("\n!Пароль успешно изменен");
                    }
                    break;
                
                case(4):
                    System.out.print("\033[H\033[2J");
                    System.out.flush();
                    int i = 1;
                    for (UserModel u: allUssers){
                        System.out.printf("User %d\n", i);
                        System.out.println(u.getInfo());
                        System.out.println("----------------");
                        i++;
                    }
                    break;
                
                case (0):
                    System.out.println("Сеанс завершен\nДо свидания!\n");
                    flag = false;
                    break;
                
                default:
                    System.out.println("Вы ввели не корректную команду, повторите ввод\n");
            }
        } while (flag);
    }

    // запись в файл
    private void writeUserDataToFile(ArrayList<String>userData) {
        Writer writer = null;
        try {
            writer = new BufferedWriter(new OutputStreamWriter(
                    new FileOutputStream("userData.txt", true), "utf-8"));
            writer.write(userData.get(0)+","+userData.get(1)+","+userData.get(2)+"\n");
        } 
        catch (IOException ex) {
        // Report
        } 
        finally {
            try {writer.close();} catch (Exception ex) {/*ignore*/}
        }
    }

    // перезапись файла после смены данных Usera(например пароля)
    private void writeAllUsersToFile(ArrayList<UserModel>allUsersData) {
        
        Writer writer = null;

        try {
            writer = new BufferedWriter(new OutputStreamWriter(
                    new FileOutputStream("userData.txt"), "utf-8"));

            writer = new BufferedWriter(new OutputStreamWriter(
                    new FileOutputStream("userData.txt", true), "utf-8"));
            for (UserModel u : allUsersData){ 
                writer.write(u.getName()+","+u.getLogin()+","+u.getPass()+"\n");
            }
        }
        catch (IOException ex) {
        // Report
        } 
        finally {
            try {writer.close();} catch (Exception ex) {/*ignore*/}
        }
    }

    // чтение из файла
    private ArrayList<UserModel> readUserDataFromFile() throws IOException {
        ArrayList <UserModel> allUsersData = new ArrayList<>();
        Path path = Paths.get("userData.txt");
            
        BufferedReader reader = Files.newBufferedReader(path);
        String line=reader.readLine();
        
        while (line != null){
            String[] parts = line.split(",");
            userModel.setName(parts[0]);
            userModel.setLogin(parts[1]);
            userModel.setPass(parts[2]);
            allUsersData.add(userModel);
            userModel = new UserModel();
            line = reader.readLine();
        }
    // for (UserModel u: allUsersData){
    //     System.out.println(u.getInfo());
    //     //System.out.println();
    // }
    return allUsersData;
    }

    // проверка на уже имеющуюся в базе запись по ЛОГИНУ
    private UserModel controlLogin (ArrayList <UserModel> allUsers, ArrayList<String> userData){
        UserModel user = null;
        for (UserModel u : allUsers){
            if (userData.get(1).equals(u.getLogin())){
                user = u;
                break;
            } 
        }
        return user;
    }

}

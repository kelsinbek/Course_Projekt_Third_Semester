package KelsinbekZarlykov;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        startProgram();
    }

    private static void startProgram() throws IOException {


        Login login = new Login();
        String userType = login.startLogin();



        if (userType.equalsIgnoreCase(ADMINISTRATOR.getAccountType())) {
            login.setUserType(ADMINISTRATOR.getAccountType());
            Admin admin = new Admin();
            admin.startAdminAccount();

        }else if(userType.equalsIgnoreCase(DIRECTOR.getAccountType())){
            login.setUserType(DIRECTOR.getAccountType());
            System.out.println("Директор");

        }else if(userType.equalsIgnoreCase(CLIENT.getAccountType())) {
            login.setUserType(CLIENT.getAccountType());
            System.out.println("Клиент");


        } else {
            login.showMessage(TRY_AGAIN.getMessage());
        }
    }
}
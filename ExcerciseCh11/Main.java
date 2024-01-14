package gr.aueb.cf.ch11.ExcerciseCh11;

public class Main {
    public static void main(String[] args) {
        User newUser = new User(1, "Grigoris", "Liaskos");
        UserCredentials newUserCredentials = new UserCredentials(1, "GrLiask", "A1B2C3");

        System.out.println(newUser.getId() + " : " + newUser.getFirstname() + "  " + newUser.getLastname());
        System.out.println(newUserCredentials.getId() + " : " + newUserCredentials.getUsername() + " , " + newUserCredentials.getPassword());
    }
}

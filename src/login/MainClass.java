package login;

public class MainClass {
    public static void main(String[] args)
    {
         MainClass LoginForm = new MainClass();
        LoginForm people =  new LoginForm();
        people.init();
        people.display();
        people.validate();
}
}

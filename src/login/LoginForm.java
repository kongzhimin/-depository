package login;

public class LoginForm {
    private UserDAO user = new UserDAO();
    public void init()
    {
        System.out.println("初始化成功");
    }
    public void display()
    {
        System.out.println("显示成功");
    }
    public void validate()
    {String UserName ="admin";
        String UserPassword = "123";
        user.findUser(UserName,UserPassword);
        System.out.println("登陆成功");
    }
}

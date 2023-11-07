public class User {
    private String login;
    Acount acount;

    public User(String login, String password) {
        this.login = login;
        acount = new Acount(password);
    }
    class Acount{
        String password;

        public Acount(String password) {
            this.password = password;
        }

        public void displayAcount(){
            System.out.printf("Acount Login: %s \t Password: %s \n",User.this.login,password);
        }
    }
}


// Alysia Wong
// CS 3560 -- A2

package minitwitter;

public class Driver{

    public static void main(String[] args) {
        //SINGLETON PATTERN -- trigger Admin
        Admin.launch(Admin.class, args);
    }
}

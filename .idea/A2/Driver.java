// Alysia Wong
// CS 3560 -- A2

package A2;

import A2.Admin;
import javafx.application.Application;

public class Driver{

    public static void main(String[] args) {
        //SINGLETON PATTERN -- trigger Admin
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                Application.launch(Admin.class, args);
                Admin.getInstance();
            }
        });
        t1.start();
    }
}

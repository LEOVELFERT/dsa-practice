package serilizable;

import java.io.*;

public class SerlizableImpl {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        TransientDemo user=new TransientDemo("leo","leoDhurga");
        ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("user.txt"));
        oos.writeObject(user);
        oos.close();

        ObjectInputStream ois=new ObjectInputStream(new FileInputStream("user.txt"));
        TransientDemo transientDemo = (TransientDemo) ois.readObject();
        System.out.println("After serilzing the Transient object--------->"+transientDemo);
    }
}

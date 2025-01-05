import java.util.ArrayList;
import java.util.List;

public class Driver8 {
    public static void main(String[] args) {
        List <Dev> devInfo=new ArrayList<>();

        devInfo.add(new Dev(3456, "java-developer"));
        devInfo.add(new Dev(3456, "python-developer"));
        devInfo.add(new Dev(3456, "sql-developer"));
        devInfo.add(new Dev(3456, "react-developer"));

          
    }
}

class Dev{
    int id;
    String designamtion;
    public Dev(int id, String designamtion) {
        this.id = id;
        this.designamtion = designamtion;
    }

    
}

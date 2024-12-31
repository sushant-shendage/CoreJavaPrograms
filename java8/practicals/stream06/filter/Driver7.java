import java.util.ArrayList;
import java.util.List;

public class Driver7 {
    public static void main(String[] args) {
        List<DevloperDetails> devInfo = new ArrayList<>();

        devInfo.add(new DevloperDetails(67, "java-devloper", "d1"));
        devInfo.add(new DevloperDetails(78, "python-devloper", "d2"));
        devInfo.add(new DevloperDetails(90, "sql-devloper", "d3"));
        devInfo.add(new DevloperDetails(120, "java-devloper", "d4"));

        devInfo.stream().filter(n -> n.designation.equals("java-devloper")).forEach(e -> System.out.println(e));
    }
}

class DevloperDetails {
    int id;
    String designation;
    String domainName;

    public DevloperDetails(int id, String designation, String domainName) {
        this.id = id;
        this.designation = designation;
        this.domainName = domainName;
    }

    @Override
    public String toString() {
        return "DevloperDetails [id=" + id + ", designation=" + designation + ", domainName=" + domainName + "]";
    }

}
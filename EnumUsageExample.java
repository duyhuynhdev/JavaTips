import java.util.Arrays;

public enum Employee {

    CEO("ceo", 1),
    MANAGER("manager", 2),
    EMPLOYEE("employee", 3);
    
    private final String title;
    private final int role;
    
    Employee(String input_title, String input_role){
        title = input_title;
        role = input_role;
    }
    
    public static Employee getFromRole(int role){
        return Arrays.stream(values()).filter(e -> e.role == role)
          .findFirst()
          .orElse(null);
    }
    
    public static Employee getFromTitle(int title){
        return Arrays.stream(values()).filter(e -> e.title.equals(title))
          .findFirst()
          .orElse(null);
    }
    
    public String getTitle(){
        return this.title;
    }
    
    public int Role(){
        return this.role;
    }
    
}

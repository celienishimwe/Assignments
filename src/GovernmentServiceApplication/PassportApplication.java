package GovernmentServiceApplication;

public class PassportApplication {
    String FullName;
    String DateOfBirth;
    String Status;
    String UniqueId;

    public PassportApplication(String FullName,String DateOfBirth,String Status,String UniqueId){
        this.FullName = FullName;
        this.DateOfBirth = DateOfBirth;
        this.Status = Status;
        this.UniqueId = UniqueId;
    }
}

package GovernmentServiceApplication;

public class PassportApplication {
    String FullName;
    String DateOfBirth;
    String Status;
    String UniqueId;

    public void setFullName(String fullName) {
        FullName = fullName;
    }

    public void setDateOfBirth(String dateOfBirth) {
        DateOfBirth = dateOfBirth;
    }

    public void setStatus(String status) {
        Status = status;
    }

    public void setUniqueId(String uniqueId) {
        UniqueId = uniqueId;
    }

    public String getFullName() {
        return FullName;
    }

    public String getDateOfBirth() {
        return DateOfBirth;
    }

    public String getStatus() {
        return Status;
    }

    public String getUniqueId() {
        return UniqueId;
    }

    public PassportApplication(String FullName, String DateOfBirth, String Status, String UniqueId){
        this.FullName = FullName;
        this.DateOfBirth = DateOfBirth;
        this.Status = Status;
        this.UniqueId = UniqueId;
    }
}

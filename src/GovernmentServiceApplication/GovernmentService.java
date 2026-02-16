package GovernmentServiceApplication;

public abstract class GovernmentService {
    private String FullName;
    private String DateOfBirth;
    private String Gender;
    private String FatherName;
    private String PlaceOfBirth;
    private String MartialStatus;
    private String Nationality;
    private String NationalId;
    private String Country;

    public String getCountry() {
        return Country;
    }

    public void setCountry(String Country) {
        this.Country = Country;
    }

    public String getFullName() {
        return FullName;
    }

    public void setFullName(String fullName) {
        FullName = fullName;
    }

    public String getDateOfBirth() {
        return DateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        DateOfBirth = dateOfBirth;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String gender) {
        Gender = gender;
    }

    public String getFatherName() {
        return FatherName;
    }

    public void setFatherName(String fatherName) {
        FatherName = fatherName;
    }

    public String getPlaceOfBirth() {
        return PlaceOfBirth;
    }

    public void setPlaceOfBirth(String placeOfBirth) {
        PlaceOfBirth = placeOfBirth;
    }

    public String getNationality() {
        return Nationality;
    }

    public void setNationality(String nationality) {
        Nationality = nationality;
    }

    public String getMartialStatus() {
        return MartialStatus;
    }

    public void setMartialStatus(String martialStatus) {
        MartialStatus = martialStatus;
    }

    public String getNationalId() {
        return NationalId;
    }

    public void setNationalId(String nationalId) {
        NationalId = nationalId;
    }

    public abstract void BirthCertificateService(String FullName, String DateOfBirth, String Gender, String PlaceOfBirth, String FatherName);
    public abstract void ApplyingPassport(String FullName,String FatherName,String DateOfBirth,String Gender,String MartialStatus,String Nationality,String NationalId);
}

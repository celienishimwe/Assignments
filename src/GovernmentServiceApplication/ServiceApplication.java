package GovernmentServiceApplication;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ServiceApplication extends GovernmentService{
    ArrayList <Citizen> citizens = new ArrayList<>();
    ArrayList <BirthCertificateApplications> BirthLists = new ArrayList<>();
    ArrayList <PassportApplication> passportLists = new ArrayList<>();

    public void StoreCitizensInArray(){
        try(BufferedReader reader = new BufferedReader((new FileReader("citizens.txt")))){

            String line;

            while((line = reader.readLine())!= null){

                if (line.trim().isEmpty()) {
                    continue;
                }
                String[] CitizenData =line.split(",");

                String FullName = CitizenData[0].trim();
                String FatherName = CitizenData[1].trim();
                String Country = CitizenData[2].trim();

                Citizen ctzn = new Citizen(FullName,FatherName,Country);

                citizens.add(ctzn);

            }


        }catch(IOException e){
            System.out.println("failed to read  file " + e.getMessage());
        }


    }

    @Override
    public void BirthCertificateService(String FullName, String DateOfBirth, String Gender, String PlaceOfBirth, String FatherName) {
        if (FullName == null || FullName.isEmpty() || DateOfBirth == null || DateOfBirth.isEmpty() || Gender == null || Gender.isEmpty() || PlaceOfBirth == null || PlaceOfBirth.isEmpty() || FatherName == null || FatherName.isEmpty()) {
            System.out.println("Error All Fields are requite to request birth certificate");
            return;
        }

        boolean  found= false;

        for(Citizen citizen : citizens) {
            if( citizen.FullName.equals(FullName) && citizen.FatherName.equals(FatherName)){

                found = true;

                String UniqueId = String.valueOf ((int) (Math.random() * 200000));
                System.out.println("------------Request Received Successfully wait for approval---------");
                System.out.println("this is your unique id you have to use for tracking your Birth Certificate application Kept it anywhere:" + UniqueId);

                BirthCertificateApplications birthCertificateApplications = new BirthCertificateApplications(FullName,DateOfBirth,"Pending",UniqueId);
                BirthLists.add(birthCertificateApplications);

                return;
            }
        }
        System.out.println("Invalid your full name or Father name or you are not registered:");
        return;
    }

    @Override
    public void ApplyingPassport(String FullName,String FatherName, String DateOfBirth, String Gender, String MartialStatus, String Nationality, String NationalId) {
        if (FullName == null || FullName.isEmpty() || DateOfBirth == null || DateOfBirth.isEmpty() || Gender == null || Gender.isEmpty() || MartialStatus == null || MartialStatus.isEmpty() || Nationality == null || Nationality.isEmpty() || NationalId == null || NationalId.isEmpty() || FatherName == null || FatherName.isEmpty()) {
            System.out.println("Error All Fields are requite to request birth certificate");
            return;
        }

        boolean found = false;

        for (Citizen citizen : citizens) {

            if (citizen.FullName.equals(FullName) && citizen.FatherName.equals(FatherName)) {

                found = true;

                String UniqueId = String.valueOf ((int) (Math.random() * 200000));
                System.out.println("------------Request Received Successfully wait for approval---------");
                System.out.println("this is your unique id you have to use for tracking your Passport application Kept it anywhere:" + UniqueId);

                PassportApplication passportApplication = new PassportApplication(FullName,DateOfBirth,"pending",UniqueId);
                passportLists.add(passportApplication);
                return;
            }
        }
        System.out.println("Invalid your full name or Father name or you are not registered:");
        return;
    }
}

package GovernmentServiceApplication;

import java.sql.SQLOutput;
import java.util.Arrays;

public class ManagerApplications{

    private ServiceApplication SA;

    public ManagerApplications(ServiceApplication SA){
        this.SA = SA;
    }

    public  void AddNewApplicationBirthCertificate(String FullName, String DateOfBirth, String Gender, String PlaceOfBirth, String FatherName){
        SA.BirthCertificateService(FullName,DateOfBirth,Gender,PlaceOfBirth,FatherName);
        System.out.println("new application added successfully");
    }

    public  void AddNewApplicationPassport(String FullName,String FatherName, String DateOfBirth, String Gender, String MartialStatus, String Nationality, String NationalId){
        SA.ApplyingPassport(FullName,FatherName,DateOfBirth,Gender,MartialStatus,Nationality,NationalId);
        System.out.println("new application added successfully");
    }


    public void ApprovingBirthCertificateApplication( String UniqueId){

        boolean found = false;
        for(BirthCertificateApplications data : SA.BirthLists){
            if(data.UniqueId.equals(UniqueId) ){
                data.Status = "approved";
                System.out.println("Application Approved");
                return;
            }
            System.out.println("Your Application not found");
        }

    }

    public void RejectingBirthCertificateApplication(String UniqueId){

        boolean found = false;
        for(BirthCertificateApplications data :SA.BirthLists){
            if(data.UniqueId.equals(UniqueId) ){
                data.Status = "Rejected";
                System.out.println("Application rejected");
                return;
            }
            System.out.println("Your Application not found");
        }

    }

    public void ApprovingPassportApplication(String UniqueId){

        boolean found = false;
        for(PassportApplication data : SA.passportLists){
            if(data.UniqueId.equals(UniqueId) ){
                data.Status = "approved";
                System.out.println("Application Approved");
                return;
            }
            System.out.println("Your Application not found");
        }

    }

    public void RejectingPassportApplication( String UniqueId){

        boolean found = false;
        for(PassportApplication data : SA.passportLists){
            if(data.UniqueId.equals(UniqueId) ){
                data.Status = "Rejected";
                System.out.println("Application rejected");
                return;
            }
            System.out.println("Your Application not found");
        }

    }

    public void SearchingBirthCertificateApplication( String UniqueId){

        boolean found = false;
        for(BirthCertificateApplications data : SA.BirthLists){
            if(data.UniqueId.equals(UniqueId) ){
                System.out.println("Application found:" + " " + data.FullName + " " + data.DateOfBirth + " " + data.Status);
                return;
            }
            System.out.println("Your application not found");
        }

    }

    public void SearchingPassportApplication( String UniqueId){

        boolean found = false;
        for(PassportApplication data : SA.passportLists){
            if(data.UniqueId.equals(UniqueId) ){
                System.out.println("Application found:" + " " + data.FullName + " " + data.DateOfBirth + " " + data.Status);
                return;
            }
            System.out.println("Your Application not found");
        }

    }

    public void PrintBirthCertificateApplications() {
        System.out.println("........ List of all Birth Certificate Applications ........");

        for (BirthCertificateApplications show : SA.BirthLists) {
            System.out.println("Full Name: " + show.FullName);
            System.out.println("Date of Birth: " + show.DateOfBirth);
            System.out.println("Status: " + show.Status);
            System.out.println("Unique ID: " + show.UniqueId);
            System.out.println("-------------------------------------");
        }
    }

    public void PrintPassportApplications() {
        System.out.println("........ List of all Passport Applications ........");

        for (PassportApplication show : SA.passportLists) {
            System.out.println("Full Name: " + show.FullName);
            System.out.println("Date of Birth: " + show.DateOfBirth);
            System.out.println("Status: " + show.Status);
            System.out.println("Unique ID: " + show.UniqueId);
            System.out.println("-------------------------------------");
        }
    }

}

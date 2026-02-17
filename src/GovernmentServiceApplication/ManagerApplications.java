package GovernmentServiceApplication;

import java.io.*;
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

    public void UpdateBirthFile() {

        try (BufferedWriter writer =
                     new BufferedWriter(new FileWriter("BirthCertificateApplications.txt"))) {

            for (BirthCertificateApplications data : SA.BirthLists) {

                writer.write(data.UniqueId + " " + data.FullName + " " + data.DateOfBirth + " " + data.Status);

                writer.newLine();
            }

        } catch (IOException e) {
            System.out.println("Error updating file: " + e.getMessage());
        }
    }

    public void UpdatePassportFile() {

        try (BufferedWriter writer =
                     new BufferedWriter(new FileWriter("PassportApplicationFile.txt"))) {

            for (PassportApplication data : SA.passportLists) {

                writer.write(data.UniqueId + " " + data.FullName + " " + data.DateOfBirth + " " + data.Status);

                writer.newLine();
            }

        } catch (IOException e) {
            System.out.println("Error updating file: " + e.getMessage());
        }
    }




    public void ApprovingBirthCertificateApplication( String UniqueId){

        boolean found = false;
        for(BirthCertificateApplications data : SA.BirthLists){
            if(data.UniqueId.equals(UniqueId) ){
                data.Status = "approved";

                UpdateBirthFile();

                System.out.println("Application Approved");
                return;
            }
        }
        System.out.println("Your Application not found");
    }

    public void RejectingBirthCertificateApplication(String UniqueId){

        boolean found = false;
        for(BirthCertificateApplications data :SA.BirthLists){
            if(data.UniqueId.equals(UniqueId) ){
                data.Status = "Rejected";
                UpdateBirthFile();
                System.out.println("Application rejected");
                return;
            }
        }
        System.out.println("Your Application not found");

    }

    public void ApprovingPassportApplication(String UniqueId){

        boolean found = false;
        for(PassportApplication data : SA.passportLists){
            if(data.UniqueId.equals(UniqueId) ){
                data.Status = "approved";
                UpdatePassportFile();
                System.out.println("Application Approved");
                return;
            }
        }
        System.out.println("Your Application not found");

    }

    public void RejectingPassportApplication( String UniqueId){

        boolean found = false;
        for(PassportApplication data : SA.passportLists){
            if(data.UniqueId.equals(UniqueId) ){
                data.Status = "Rejected";
                UpdatePassportFile();
                System.out.println("Application rejected");
                return;
            }
        }
        System.out.println("Your Application not found");

    }

    public void SearchingBirthCertificateApplication( String UniqueId){

        boolean found = false;
        for(BirthCertificateApplications data : SA.BirthLists){
            if(data.UniqueId.equals(UniqueId) ){
                System.out.println("Application found:" + " " + data.FullName + " " + data.DateOfBirth + " " + data.Status);
                return;
            }

        }
        System.out.println("Your application not found");

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

        try (BufferedReader reader = new BufferedReader(new FileReader("BirthCertificateApplications.txt"))) {

            String line;

            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
            System.out.println("-------------------------------------");
    }

    public void PrintPassportApplications() {
        System.out.println("........ List of all Passport Applications ........");

        try (BufferedReader reader = new BufferedReader(new FileReader("PassportApplicationFile.txt"))) {

            String line;

            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
        System.out.println("-------------------------------------");
    }
    }


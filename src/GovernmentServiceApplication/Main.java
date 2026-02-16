package GovernmentServiceApplication;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ServiceApplication SA = new ServiceApplication();
        ManagerApplications MA = new ManagerApplications(SA);
        SA.StoreCitizensInArray();

        Scanner user_input = new Scanner(System.in);
        int input_value;

        do{
        System.out.println("\n----------Welcome to Government Service System--------------");
        System.out.println("1.Register as Citizen");
        System.out.println("2.Request Service");
        System.out.println("3.Approving Application");
        System.out.println("4.Rejecting Application");
        System.out.println("5.Searching Application");
        System.out.println("6.Printing BirthCertificate Applications");
        System.out.println("7.Printing Passport Applications");
        System.out.println("8.Exit");
        System.out.println();

        System.out.println("Enter number:");
        input_value = user_input.nextInt();
        user_input.nextLine();

        switch(input_value){
            case 1:
                System.out.println("Enter Your Full name:");
                String FullName  = user_input.nextLine();
                SA.setFullName(FullName);

                System.out.println("Enter Your Father Name:");
                String FatherName  = user_input.nextLine();
                SA.setFatherName(FatherName);

                System.out.println("Enter Your Country:");
                String Country  = user_input.nextLine();
                SA.setCountry(Country);

                Citizen CT = new Citizen(FullName,FatherName,Country);
                CT.RegisterCitizen(CT);
                break;


            case 2:
                System.out.println("1.Birth Certificate Application");
                System.out.println("2.Passport Application");
                System.out.println("3.Add new Application");

                System.out.println("Enter number:");
                int input_value2 = user_input.nextInt();
                user_input.nextLine();

                switch (input_value2){
                    case 1:
                        System.out.println("Enter Your Full name:");
                        String FullName1  = user_input.nextLine();
                        SA.setFullName(FullName1);

                        System.out.println("Enter Your Father Name:");
                        String FatherName1  = user_input.nextLine();
                        SA.setFatherName(FatherName1);

                        System.out.println("Enter Your Date Of Birth:");
                        String DateOfBirth = user_input.nextLine();
                        SA.setDateOfBirth(DateOfBirth);

                        System.out.println("Enter Your Gender:");
                        String Gender = user_input.nextLine();
                        SA.setGender(Gender);

                        System.out.println("Enter Your Place Of Birth:");
                        String PlaceOfBirth = user_input.nextLine();
                        SA.setPlaceOfBirth(PlaceOfBirth);

                        SA.BirthCertificateService(FullName1,DateOfBirth,Gender,PlaceOfBirth,FatherName1);
                        break;
                    case 2:

                        System.out.println("Enter Your Full name:");
                        String FullName2  = user_input.nextLine();
                        SA.setFullName(FullName2);

                        System.out.println("Enter Your Father Name:");
                        String FatherName2  = user_input.nextLine();
                        SA.setFatherName(FatherName2);

                        System.out.println("Enter Your Date Of Birth:");
                        String DateOfBirth2 = user_input.nextLine();
                        SA.setDateOfBirth(DateOfBirth2);

                        System.out.println("Enter Your Gender:");
                        String Gender2 = user_input.nextLine();
                        SA.setGender(Gender2);

                        System.out.println("Enter Your Place Of Birth:");
                        String PlaceOfBirth2 = user_input.nextLine();
                        SA.setPlaceOfBirth(PlaceOfBirth2);

                        System.out.println("Enter Your MartialStatus:");
                        String MartialStatus2 = user_input.nextLine();
                        SA.setMartialStatus(MartialStatus2 );

                        System.out.println("Enter Your Nationality:");
                        String Nationality2 = user_input.nextLine();
                        SA.setNationality(Nationality2 );

                        System.out.println("Enter Your NationalId:");
                        String NationalId2 = user_input.nextLine();
                        SA.setNationality(NationalId2);

                        SA.ApplyingPassport(FullName2,FatherName2,DateOfBirth2,Gender2,MartialStatus2,Nationality2,NationalId2);
                        break;

                    case 3:
                        System.out.println("1.Birth Certificate Application");
                        System.out.println("2.Passport Application");

                        System.out.println("Enter number:");
                        int input_value3 = user_input.nextInt();
                        user_input.nextLine();

                        switch(input_value3){

                            case 1:
                                System.out.println("Enter Your Full name:");
                                String FullName3 = user_input.nextLine();
                                SA.setFullName(FullName3);

                                System.out.println("Enter Your Father Name:");
                                String FatherName3  = user_input.nextLine();
                                SA.setFatherName(FatherName3);

                                System.out.println("Enter Your Date Of Birth:");
                                String DateOfBirth3 = user_input.nextLine();
                                SA.setDateOfBirth(DateOfBirth3);

                                System.out.println("Enter Your Gender:");
                                String Gender3 = user_input.nextLine();
                                SA.setGender(Gender3);

                                System.out.println("Enter Your Place Of Birth:");
                                String PlaceOfBirth3 = user_input.nextLine();
                                SA.setPlaceOfBirth(PlaceOfBirth3);

                                SA.BirthCertificateService(FullName3,DateOfBirth3,Gender3,PlaceOfBirth3,FatherName3);
                                break;

                            case 2:
                                System.out.println("Enter Your Full name:");
                                String FullName4  = user_input.nextLine();
                                SA.setFullName(FullName4);

                                System.out.println("Enter Your Father Name:");
                                String FatherName4  = user_input.nextLine();
                                SA.setFatherName(FatherName4);

                                System.out.println("Enter Your Date Of Birth:");
                                String DateOfBirth4 = user_input.nextLine();
                                SA.setDateOfBirth(DateOfBirth4);

                                System.out.println("Enter Your Gender:");
                                String Gender4 = user_input.nextLine();
                                SA.setGender(Gender4);

                                System.out.println("Enter Your Place Of Birth:");
                                String PlaceOfBirth4 = user_input.nextLine();
                                SA.setPlaceOfBirth(PlaceOfBirth4);

                                System.out.println("Enter Your MartialStatus:");
                                String MartialStatus4 = user_input.nextLine();
                                SA.setMartialStatus(MartialStatus4);

                                System.out.println("Enter Your Nationality:");
                                String Nationality4 = user_input.nextLine();
                                SA.setNationality(Nationality4);

                                System.out.println("Enter Your NationalId:");
                                String NationalId4 = user_input.nextLine();
                                SA.setNationality(NationalId4);

                                SA.ApplyingPassport(FullName4,FatherName4,DateOfBirth4,Gender4,MartialStatus4,Nationality4,NationalId4);
                                break;

                            default:
                                System.out.println("Invalid Input");

                        }
                        break;
                    default:
                        System.out.println("invalid input");

                }
                break;

            case 3:
                System.out.println("1.Approve BirthCertificate Application");
                System.out.println("2.Approve Passport Application");

                System.out.println("Enter number:");
                int input_value4 = user_input.nextInt();
                user_input.nextLine();

                switch(input_value4){
                    case 1:
                        System.out.println("Enter unique id:");
                        String Id= user_input.nextLine();

                        MA.ApprovingBirthCertificateApplication(Id);

                        break;

                    case 2:
                        System.out.println("Enter unique id:");
                        String Id1= user_input.nextLine();
                        MA.ApprovingPassportApplication(Id1);

                        break;
                    default:
                        System.out.println("Invalid Input");

                }
                break;

            case 4:
                System.out.println("1.Reject BirthCertificate Application");
                System.out.println("2.Reject Passport Application");

                System.out.println("Enter number:");
                int input_value5 = user_input.nextInt();
                user_input.nextLine();

                switch(input_value5){
                    case 1:
                        System.out.println("Enter unique id:");
                        String Id= user_input.nextLine();

                        MA.RejectingBirthCertificateApplication(Id);

                        break;
                    case 2:
                        System.out.println("Enter unique id:");
                        String Id1= user_input.nextLine();

                        MA.RejectingPassportApplication(Id1);

                        break;
                }
                break;
            case 5:
                System.out.println("1.Search BirthCertificate Application");
                System.out.println("2.Search Passport Application");

                System.out.println("Enter number:");
                int input_value6 = user_input.nextInt();
                user_input.nextLine();

                switch(input_value6) {
                    case 1:
                        System.out.println("Enter unique id:");
                        String Id = user_input.nextLine();

                        MA.SearchingBirthCertificateApplication(Id);

                        break;
                    case 2:
                        System.out.println("Enter unique id:");
                        String Id1 = user_input.nextLine();

                        MA.SearchingPassportApplication(Id1);

                        break;
                }

                break;

            case 6:
                MA.PrintBirthCertificateApplications();
                break;
            case 7:
                MA.PrintPassportApplications();
                break;

            default:
                System.out.println("invalid input");

        }
    }while (input_value != 8);
    }
}

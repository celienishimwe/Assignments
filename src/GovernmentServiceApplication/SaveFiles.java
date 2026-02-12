package GovernmentServiceApplication;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class SaveFiles extends ServiceApplication {

    public void saveBirthApplicationsToTextFile() {
        try (BufferedWriter writer = new BufferedWriter( new FileWriter("BirthCertificateApplications.txt"))) {
            for (BirthCertificateApplications app : BirthLists) {
                writer.write(app.FullName + "," + app.UniqueId + "," + app.DateOfBirth + "," + app.Status
                );
            }

            System.out.println("Birth applications saved");

        } catch (IOException e) {
            System.out.println("Error writing file: " + e.getMessage());
        }
    }

    public void savePassportApplicationsToTextFile() {
        try (BufferedWriter writer = new BufferedWriter( new FileWriter("PassportApplicationFile.txt"))) {
            for (PassportApplication app : passportLists) {
                writer.write(app.FullName + "," + app.UniqueId + "," + app.DateOfBirth + "," + app.Status
                );
            }

            System.out.println("Passport applications saved");

        } catch (IOException e) {
            System.out.println("Error writing file: " + e.getMessage());
        }
    }


}

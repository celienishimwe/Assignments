package GovernmentServiceApplication;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class SaveFiles {

    private ServiceApplication Service;

    public SaveFiles(ServiceApplication Service){
        this.Service = Service;
    }

    public void saveBirthApplicationsToTextFile() {
        try (BufferedWriter writer = new BufferedWriter( new FileWriter("BirthCertificateApplications.txt"))) {
            for (BirthCertificateApplications app : Service.getBirthLists()) {
                writer.write(app.getFullName() + "," + app.getUniqueId() + "," + app.getDateOfBirth() + "," + app.getStatus()
                );
            }

            System.out.println("Birth applications saved");

        } catch (IOException e) {
            System.out.println("Error writing file: " + e.getMessage());
        }
    }

    public void savePassportApplicationsToTextFile() {
        try (BufferedWriter writer = new BufferedWriter( new FileWriter("PassportApplicationFile.txt"))) {
            for (PassportApplication app : Service.getPassportLists()) {
                writer.write(app.getFullName() + "," + app.getUniqueId() + "," + app.getDateOfBirth() + "," + app.getStatus()
                );
            }

            System.out.println("Passport applications saved");

        } catch (IOException e) {
            System.out.println("Error writing file: " + e.getMessage());
        }
    }


}

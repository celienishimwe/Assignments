package GovernmentServiceApplication;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Citizen {
    String FullName;
    String Country;
    String FatherName;
    public Citizen(String FullName,String FatherName, String Country){
        this.FullName = FullName;
        this.Country = Country;
        this.FatherName = FatherName;
    }

    public void RegisterCitizen(Citizen citizen){

        if(citizen == null){
            System.out.println("citizen is empty");
            return;
        }

        try( BufferedWriter write1 = new BufferedWriter(new FileWriter("citizens.txt",true))){
            write1.write(citizen.FullName + "," + citizen.FatherName + "," + citizen.Country);
            write1.newLine();
            System.out.println("-----------citizen register successfully----------");
            write1.close();
        }catch(IOException e){
            System.out.println("failed to write on file" + e);
        }

    }
}

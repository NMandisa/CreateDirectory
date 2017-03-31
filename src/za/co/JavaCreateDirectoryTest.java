/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.co;

import java.io.File;
import java.nio.file.Files;

/**
 *
 * @author Noxolo.Mkhungo
 */
public class JavaCreateDirectoryTest {

    /**
     * @param args the command line arguments
     */
    private static final String[] imgFolder = {"1200Wx1200H", "515Wx515H", "300Wx300H", "96Wx96H", "65Wx65H", "30Wx30H"};

    public static void main(String[] args) {
            //creatingOneDirectoryWithMultipleSubFolders
         File outputDirectory = new File("/Users/noxolo.mkhungo/Documents/images");
        if (new File("/Users/noxolo.mkhungo/Documents/images").exists()) //Check if the directory already exists
        {
            System.out.println("The Directory Already Exists");
        } else {

            // attempt to create the directory here
            boolean successful = outputDirectory.mkdir();
            if (successful) // creating the directory succeeded
            {

                System.out.println("directory was created successfully");
                for (int i = 0; i < imgFolder.length; i++) {
                    File imageDimesionDirectory = new File(outputDirectory + "/" + imgFolder[i].toString());
                    imageDimesionDirectory.mkdir();
                }
            } else {
                // creating the directory failed
                System.out.println("failed trying to create the directory");
            }

        }
    }

    public static void creatingOneDirectoryWithMultipleSubFolders() {

        File outputDirectory = new File("/Users/noxolo.mkhungo/Documents/images");
        if (new File("/Users/noxolo.mkhungo/Documents/images").exists()) //Check if the directory already exists
        {
            System.out.println("The Directory Already Exists");
        } else {

            // attempt to create the directory here
            boolean successful = outputDirectory.mkdir();
            if (successful) // creating the directory succeeded
            {

                System.out.println("directory was created successfully");
                for (int i = 0; i < imgFolder.length; i++) {
                    File imageDimesionDirectory = new File(outputDirectory + "/" + imgFolder[i].toString());
                    imageDimesionDirectory.mkdir();
                }
            } else {
                // creating the directory failed
                System.out.println("failed trying to create the directory");
            }

        }

    }

}

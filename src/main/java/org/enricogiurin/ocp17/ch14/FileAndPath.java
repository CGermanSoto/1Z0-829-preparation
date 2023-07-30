package org.enricogiurin.ocp17.ch14;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileAndPath {
    public static void main(String[] args) {
        //new FileAndPath().file();
        //new FileAndPath().path();
        new FileAndPath().pathsGet();
    }
    void file() {
        File pom = new File("/Users/enrico/github/ocp17/1Z0-829-preparation/pom.xml");
        File notExisting = new File("/notExistingFolder/notAFile");
        //true
        System.out.println(pom.exists());
        //false
        System.out.println(notExisting.exists());
    }

    void path() {
        Path pom = Path.of("/Users/enrico/github/ocp17/1Z0-829-preparation/pom.xml");
        Path notExisting = Path.of("/notExistingFolder/notAFile");

        //true
        System.out.println(Files.exists(pom));
        //false
        System.out.println(Files.exists(notExisting));
    }

    void pathsGet() {
       Path path = Paths.get("/tmp");
        //true
        System.out.println(Files.exists(path));
    }

    void fileToPath() {
        File tmp = new File("/tmp");
        //file to path
        Path path = tmp.toPath();
        //path to file
        File tmp2 = path.toFile();
    }
}

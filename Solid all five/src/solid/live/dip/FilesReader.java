package solid.live.dip;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FilesReader implements Reader {

    @Override
    public String read(String fileUrl) {
        try {
            return (new BufferedReader(new FileReader(fileUrl))).readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
package solid.live.dip;

import net.iharder.Base64;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FilesWriter implements Writer{

    @Override
    public void write(String encodedText){
        BufferedWriter writer = null;
        try {
            writer = new BufferedWriter(new FileWriter("/home/manish/training/DP-ASS/Solid all five/src/solid/live/dip/afterEncryption.txt"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            writer.write(encodedText);
            writer.flush();
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return;
    }

}


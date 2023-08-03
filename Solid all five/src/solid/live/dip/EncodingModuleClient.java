package solid.live.dip;

import java.io.IOException;

/**
 * Created by IntelliJ IDEA.
 * User: goyalamit
 * Date: Jul 13, 2011
 * Time: 10:20:57 AM
 * To change this template use File | Settings | File Templates.
 */
public class EncodingModuleClient {
    public static void main(String[] args) throws IOException {
        Reader reader = new FilesReader();
        MyEncoder myEncoder = new Base64Encoder();
        Writer writer = new FilesWriter();

        EncodingModule encodingModule  = new EncodingModule();
        encodingModule.encode(reader,myEncoder,writer,"/home/manish/training/DP-ASS/Solid all five/src/solid/live/dip/beforeEncryption.txt");
    }
}

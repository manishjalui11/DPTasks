package solid.live.dip;


/**
 * Created by IntelliJ IDEA.
 * User: goyalamit
 * Date: Jul 13, 2011
 * Time: 10:05:38 AM
 * To change this template use File | Settings | File Templates.
 */
public class EncodingModule {
    public void encode(Reader readerOutput, MyEncoder myEncoder, Writer writer, String url ){
        writer.write(myEncoder.encode(readerOutput.read(url)));
    }
}


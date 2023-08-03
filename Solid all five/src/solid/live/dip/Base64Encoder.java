package solid.live.dip;

import net.iharder.Base64;

public class Base64Encoder implements MyEncoder {
    private net.iharder.Base64 Base64;

    @Override
    public String encode(String reader) {
        return (Base64.encodeBytes(reader.getBytes()));
    }
}

/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.p;

import b.t.c.b.b.p.p;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class t {
    public static final byte[] o00000 = new byte[0];
    public static final ByteBuffer new = ByteBuffer.wrap(o00000);

    public static boolean \u00d200000(byte[] byArray) {
        return p.o00000(byArray);
    }

    public static String o00000(byte[] byArray) {
        try {
            return new String(byArray, "UTF-8");
        }
        catch (UnsupportedEncodingException unsupportedEncodingException) {
            throw new RuntimeException("UTF-8 not supported?", unsupportedEncodingException);
        }
    }
}


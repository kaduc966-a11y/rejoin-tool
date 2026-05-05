/*
 * Decompiled with CFR 0.152.
 */
package b.l;

import b.o.d.fc;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CoderResult;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class z {
    public static final z \u00f400000 = new z();
    private static final int Object = 32;
    private static CharsetDecoder \u00d200000;
    private static boolean \u00d400000;
    private static final byte[] \u00f500000;
    private static final char[] \u00d600000;
    private static final ByteBuffer o00000;
    private static final CharBuffer \u00d500000;
    private static final StringBuilder void;

    private z() {
    }

    public final synchronized String o00000(InputStream inputStream, Charset charset) {
        block12: {
            block11: {
                if (\u00d200000 == null) break block11;
                CharsetDecoder charsetDecoder = \u00d200000;
                if (charsetDecoder == null) {
                    fc.return("");
                    charsetDecoder = null;
                }
                if (fc.o00000((Object)charsetDecoder.charset(), (Object)charset)) break block12;
            }
            this.o00000(charset);
        }
        int n2 = 0;
        int n3 = 0;
        while (true) {
            int n4;
            if ((n4 = inputStream.read()) == -1) {
                if (((CharSequence)void).length() == 0 && n2 == 0 && n3 == 0) {
                    return null;
                }
                n3 = this.o00000(n2, n3);
                break;
            }
            z.\u00f500000[n2++] = (byte)n4;
            if (n4 != 10 && n2 != 32 && \u00d400000) continue;
            o00000.limit(n2);
            \u00d500000.position(n3);
            n3 = this.o00000(false);
            if (n3 > 0 && \u00d600000[n3 - 1] == '\n') {
                o00000.position(0);
                break;
            }
            n2 = this.o00000();
        }
        if (n3 > 0 && \u00d600000[n3 - 1] == '\n' && --n3 > 0 && \u00d600000[n3 - 1] == '\r') {
            --n3;
        }
        if (((CharSequence)void).length() == 0) {
            return new String(\u00d600000, 0, n3);
        }
        void.append(\u00d600000, 0, n3);
        String string = void.toString();
        if (void.length() > 32) {
            this.\u00d200000();
        }
        void.setLength(0);
        return string;
    }

    private final int o00000(boolean bl) {
        while (true) {
            CoderResult coderResult;
            CharsetDecoder charsetDecoder;
            if ((charsetDecoder = \u00d200000) == null) {
                fc.return("");
                charsetDecoder = null;
            }
            if ((coderResult = charsetDecoder.decode(o00000, \u00d500000, bl)).isError()) {
                this.\u00d300000();
                coderResult.throwException();
            }
            int n2 = \u00d500000.position();
            if (!coderResult.isOverflow()) {
                return n2;
            }
            void.append(\u00d600000, 0, n2 - 1);
            \u00d500000.position(0);
            \u00d500000.limit(32);
            \u00d500000.put(\u00d600000[n2 - 1]);
        }
    }

    private final int o00000() {
        ByteBuffer byteBuffer = o00000;
        byteBuffer.compact();
        int n2 = byteBuffer.position();
        byteBuffer.position(0);
        return n2;
    }

    private final int o00000(int n2, int n3) {
        o00000.limit(n2);
        \u00d500000.position(n3);
        n2 = this.o00000(true);
        CharsetDecoder charsetDecoder = \u00d200000;
        if (charsetDecoder == null) {
            fc.return("");
            charsetDecoder = null;
        }
        charsetDecoder.reset();
        o00000.position(0);
        return n2;
    }

    private final void o00000(Charset charset) {
        \u00d200000 = charset.newDecoder();
        o00000.clear();
        \u00d500000.clear();
        o00000.put((byte)10);
        o00000.flip();
        CharsetDecoder charsetDecoder = \u00d200000;
        if (charsetDecoder == null) {
            fc.return("");
            charsetDecoder = null;
        }
        charsetDecoder.decode(o00000, \u00d500000, false);
        \u00d400000 = \u00d500000.position() == 1 && \u00d500000.get(0) == '\n';
        this.\u00d300000();
    }

    private final void \u00d300000() {
        CharsetDecoder charsetDecoder = \u00d200000;
        if (charsetDecoder == null) {
            fc.return("");
            charsetDecoder = null;
        }
        charsetDecoder.reset();
        o00000.position(0);
        void.setLength(0);
    }

    private final void \u00d200000() {
        void.setLength(32);
        void.trimToSize();
    }

    static {
        \u00f500000 = new byte[32];
        \u00d600000 = new char[32];
        o00000 = ByteBuffer.wrap(\u00f500000);
        \u00d500000 = CharBuffer.wrap(\u00d600000);
        void = new StringBuilder();
    }
}


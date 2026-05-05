/*
 * Decompiled with CFR 0.152.
 */
package b.l;

import b.e.bb;
import b.i;
import b.l.b;
import b.l.f;
import b.l.g;
import b.l.o;
import b.l.s;
import b.l.u;
import b.o.d.tc;
import b.q.fb;
import b.s.z;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.Reader;
import java.io.Writer;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CodingErrorAction;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class k
extends g {
    private static final InputStreamReader \u00d200000(File file, Charset charset) {
        return new InputStreamReader((InputStream)new FileInputStream(file), charset);
    }

    static /* synthetic */ InputStreamReader \u00d200000(File file, Charset charset, int n2, Object object) {
        if ((n2 & 1) != 0) {
            charset = fb.\u00d300000;
        }
        return new InputStreamReader((InputStream)new FileInputStream(file), charset);
    }

    private static final BufferedReader o00000(File object, Charset charset, int n2) {
        object = new InputStreamReader((InputStream)new FileInputStream((File)object), charset);
        return new BufferedReader((Reader)object, n2);
    }

    static /* synthetic */ BufferedReader \u00d200000(File file, Charset charset, int n2, int n3, Object object) {
        if ((n3 & 1) != 0) {
            charset = fb.\u00d300000;
        }
        if ((n3 & 2) != 0) {
            n2 = 8192;
        }
        Object object2 = file;
        object2 = new InputStreamReader((InputStream)new FileInputStream((File)object2), charset);
        return new BufferedReader((Reader)object2, n2);
    }

    private static final OutputStreamWriter o00000(File file, Charset charset) {
        return new OutputStreamWriter((OutputStream)new FileOutputStream(file), charset);
    }

    static /* synthetic */ OutputStreamWriter String(File file, Charset charset, int n2, Object object) {
        if ((n2 & 1) != 0) {
            charset = fb.\u00d300000;
        }
        return new OutputStreamWriter((OutputStream)new FileOutputStream(file), charset);
    }

    private static final BufferedWriter \u00d200000(File object, Charset charset, int n2) {
        object = new OutputStreamWriter((OutputStream)new FileOutputStream((File)object), charset);
        return new BufferedWriter((Writer)object, n2);
    }

    static /* synthetic */ BufferedWriter o00000(File file, Charset charset, int n2, int n3, Object object) {
        if ((n3 & 1) != 0) {
            charset = fb.\u00d300000;
        }
        if ((n3 & 2) != 0) {
            n2 = 8192;
        }
        Object object2 = file;
        object2 = new OutputStreamWriter((OutputStream)new FileOutputStream((File)object2), charset);
        return new BufferedWriter((Writer)object2, n2);
    }

    private static final PrintWriter String(File object, Charset charset) {
        object = new OutputStreamWriter((OutputStream)new FileOutputStream((File)object), charset);
        return new PrintWriter(new BufferedWriter((Writer)object, 8192));
    }

    static /* synthetic */ PrintWriter \u00d300000(File object, Charset charset, int n2, Object object2) {
        if ((n2 & 1) != 0) {
            charset = fb.\u00d300000;
        }
        object = new OutputStreamWriter((OutputStream)new FileOutputStream((File)object), charset);
        return new PrintWriter(new BufferedWriter((Writer)object, 8192));
    }

    public static final byte[] \u00d500000(File serializable) {
        Object object;
        Closeable closeable = new FileInputStream((File)serializable);
        Throwable throwable = null;
        try {
            byte[] byArray;
            int n2;
            long l2;
            object = (FileInputStream)closeable;
            int n3 = 0;
            long l3 = l2 = ((File)serializable).length();
            if (l2 > Integer.MAX_VALUE) {
                throw new OutOfMemoryError("File " + serializable + " is too big (" + l3 + " bytes) to fit in memory.");
            }
            int n4 = (int)l2;
            byte[] byArray2 = new byte[n4];
            while (n4 > 0 && (n2 = ((FileInputStream)object).read(byArray2, n3, n4)) >= 0) {
                n4 -= n2;
                n3 += n2;
            }
            if (n4 > 0) {
                byArray = Arrays.copyOf(byArray2, n3);
            } else {
                n2 = ((FileInputStream)object).read();
                if (n2 == -1) {
                    byArray = byArray2;
                } else {
                    u u2 = new u(8193);
                    u2.write(n2);
                    b.o00000((InputStream)object, u2, 0, 2, null);
                    int n5 = byArray2.length + u2.size();
                    if (n5 < 0) {
                        throw new OutOfMemoryError("File " + serializable + " is too big to fit in memory.");
                    }
                    byArray = z.o00000(u2.o00000(), Arrays.copyOf(byArray2, n5), byArray2.length, 0, u2.size());
                }
            }
            object = byArray;
        }
        catch (Throwable throwable2) {
            try {
                serializable = throwable2;
                throwable = throwable2;
                throw serializable;
            }
            catch (Throwable throwable3) {
                o.o00000(closeable, throwable);
                throw throwable3;
            }
        }
        o.o00000(closeable, null);
        return object;
    }

    public static final void o00000(File object, byte[] object2) {
        object = new FileOutputStream((File)object);
        Throwable throwable = null;
        try {
            ((FileOutputStream)object).write((byte[])object2);
        }
        catch (Throwable throwable2) {
            try {
                object2 = throwable2;
                throwable = throwable2;
                throw object2;
            }
            catch (Throwable throwable3) {
                o.o00000((Closeable)object, throwable);
                throw throwable3;
            }
        }
        o.o00000((Closeable)object, null);
        return;
    }

    public static final void \u00d200000(File object, byte[] object2) {
        object = new FileOutputStream((File)object, true);
        Throwable throwable = null;
        try {
            ((FileOutputStream)object).write((byte[])object2);
        }
        catch (Throwable throwable2) {
            try {
                object2 = throwable2;
                throwable = throwable2;
                throw object2;
            }
            catch (Throwable throwable3) {
                o.o00000((Closeable)object, throwable);
                throw throwable3;
            }
        }
        o.o00000((Closeable)object, null);
        return;
    }

    public static final String \u00d300000(File object, Charset object2) {
        String string;
        object = new InputStreamReader((InputStream)new FileInputStream((File)object), (Charset)object2);
        object2 = null;
        try {
            string = s.o00000((InputStreamReader)object);
        }
        catch (Throwable throwable) {
            try {
                Throwable throwable2 = throwable;
                object2 = throwable;
                throw throwable2;
            }
            catch (Throwable throwable3) {
                o.o00000((Closeable)object, (Throwable)object2);
                throw throwable3;
            }
        }
        o.o00000((Closeable)object, null);
        return string;
    }

    public static /* synthetic */ String \u00d500000(File file, Charset charset, int n2, Object object) {
        if ((n2 & 1) != 0) {
            charset = fb.\u00d300000;
        }
        return f.\u00d300000(file, charset);
    }

    public static final void o00000(File object, String object2, Charset charset) {
        object = new FileOutputStream((File)object);
        Throwable throwable = null;
        try {
            f.o00000((FileOutputStream)object, (String)object2, charset);
        }
        catch (Throwable throwable2) {
            try {
                object2 = throwable2;
                throwable = throwable2;
                throw object2;
            }
            catch (Throwable throwable3) {
                o.o00000((Closeable)object, throwable);
                throw throwable3;
            }
        }
        o.o00000((Closeable)object, null);
        return;
    }

    public static /* synthetic */ void o00000(File file, String string, Charset charset, int n2, Object object) {
        if ((n2 & 2) != 0) {
            charset = fb.\u00d300000;
        }
        f.o00000(file, string, charset);
    }

    public static final void \u00d200000(File object, String object2, Charset charset) {
        object = new FileOutputStream((File)object, true);
        Throwable throwable = null;
        try {
            f.o00000((FileOutputStream)object, (String)object2, charset);
        }
        catch (Throwable throwable2) {
            try {
                object2 = throwable2;
                throwable = throwable2;
                throw object2;
            }
            catch (Throwable throwable3) {
                o.o00000((Closeable)object, throwable);
                throw throwable3;
            }
        }
        o.o00000((Closeable)object, null);
        return;
    }

    public static /* synthetic */ void \u00d200000(File file, String string, Charset charset, int n2, Object object) {
        if ((n2 & 2) != 0) {
            charset = fb.\u00d300000;
        }
        f.\u00d200000(file, string, charset);
    }

    public static final void o00000(OutputStream outputStream, String string, Charset object) {
        if (string.length() < 16384) {
            outputStream.write(string.getBytes((Charset)object));
            return;
        }
        object = f.o00000((Charset)object);
        CharBuffer charBuffer = CharBuffer.allocate(8192);
        ByteBuffer byteBuffer = f.o00000(8192, (CharsetEncoder)object);
        int n2 = 0;
        int n3 = 0;
        while (n2 < string.length()) {
            int n4 = 8192 - n3;
            int n5 = string.length() - n2;
            int n6 = Math.min(n4, n5);
            n4 = n2 + n6;
            String string2 = string;
            char[] cArray = charBuffer.array();
            string2.getChars(n2, n4, cArray, n3);
            charBuffer.limit(n6 + n3);
            if (!((CharsetEncoder)object).encode(charBuffer, byteBuffer, n4 == string.length()).isUnderflow()) {
                throw new IllegalStateException("Check failed.");
            }
            outputStream.write(byteBuffer.array(), 0, byteBuffer.position());
            if (charBuffer.position() != charBuffer.limit()) {
                charBuffer.put(0, charBuffer.get());
                n3 = 1;
            } else {
                n3 = 0;
            }
            charBuffer.clear();
            byteBuffer.clear();
            n2 = n4;
        }
    }

    public static final CharsetEncoder o00000(Charset charset) {
        return charset.newEncoder().onMalformedInput(CodingErrorAction.REPLACE).onUnmappableCharacter(CodingErrorAction.REPLACE);
    }

    public static final ByteBuffer o00000(int n2, CharsetEncoder charsetEncoder) {
        int n3 = (int)Math.ceil(charsetEncoder.maxBytesPerChar());
        return ByteBuffer.allocate(n2 * n3);
    }

    public static final void o00000(File file, b.o.e.f f2) {
        f.o00000(file, 4096, f2);
    }

    public static final void o00000(File object, int n2, b.o.e.f f2) {
        Object object2 = new byte[bb.\u00d200000(n2, 512)];
        object = new FileInputStream((File)object);
        Throwable throwable = null;
        try {
            int n3;
            FileInputStream fileInputStream = (FileInputStream)object;
            while ((n3 = fileInputStream.read((byte[])object2)) > 0) {
                f2.o00000(object2, n3);
            }
        }
        catch (Throwable throwable2) {
            try {
                object2 = throwable2;
                throwable = throwable2;
                throw object2;
            }
            catch (Throwable throwable3) {
                o.o00000((Closeable)object, throwable);
                throw throwable3;
            }
        }
        o.o00000((Closeable)object, null);
        return;
    }

    public static final void o00000(File file, Charset charset, b.o.e.g g2) {
        s.o00000((Reader)new BufferedReader(new InputStreamReader((InputStream)new FileInputStream(file), charset)), g2);
    }

    public static /* synthetic */ void \u00d200000(File file, Charset charset, b.o.e.g g2, int n2, Object object) {
        if ((n2 & 1) != 0) {
            charset = fb.\u00d300000;
        }
        f.o00000(file, charset, g2);
    }

    private static final FileInputStream \u00d600000(File file) {
        return new FileInputStream(file);
    }

    private static final FileOutputStream \u00d800000(File file) {
        return new FileOutputStream(file);
    }

    public static final List \u00d500000(File file, Charset charset) {
        ArrayList arrayList = new ArrayList();
        f.o00000(file, charset, arg_0 -> k.o00000(arrayList, arg_0));
        return arrayList;
    }

    public static /* synthetic */ List o00000(File file, Charset charset, int n2, Object object) {
        if ((n2 & 1) != 0) {
            charset = fb.\u00d300000;
        }
        return f.\u00d500000(file, charset);
    }

    public static final Object \u00d200000(File object, Charset object2, b.o.e.g object3) {
        Object object4 = object;
        object4 = new InputStreamReader((InputStream)new FileInputStream((File)object4), (Charset)object2);
        object = new BufferedReader((Reader)object4, 8192);
        object2 = null;
        try {
            object4 = (BufferedReader)object;
            object4 = object3.\u00f800000(s.o00000((BufferedReader)object4));
        }
        catch (Throwable throwable) {
            try {
                object3 = throwable;
                object2 = throwable;
                throw object3;
            }
            catch (Throwable throwable2) {
                tc.Object(1);
                o.o00000((Closeable)object, (Throwable)object2);
                tc.o00000(1);
                throw throwable2;
            }
        }
        tc.Object(1);
        o.o00000((Closeable)object, null);
        tc.o00000(1);
        return object4;
    }

    public static /* synthetic */ Object o00000(File serializable, Charset object, b.o.e.g g2, int n2, Object object2) {
        if ((n2 & 1) != 0) {
            object = fb.\u00d300000;
        }
        Object object3 = serializable;
        object3 = new InputStreamReader((InputStream)new FileInputStream((File)object3), (Charset)object);
        object2 = new BufferedReader((Reader)object3, 8192);
        serializable = null;
        try {
            object3 = (BufferedReader)object2;
            object3 = g2.\u00f800000(s.o00000((BufferedReader)object3));
        }
        catch (Throwable throwable) {
            try {
                object = throwable;
                serializable = throwable;
                throw object;
            }
            catch (Throwable throwable2) {
                tc.Object(1);
                o.o00000((Closeable)object2, (Throwable)serializable);
                tc.o00000(1);
                throw throwable2;
            }
        }
        tc.Object(1);
        o.o00000((Closeable)object2, null);
        tc.o00000(1);
        return object3;
    }

    private static final i o00000(ArrayList arrayList, String string) {
        arrayList.add(string);
        return i.o00000;
    }
}


/*
 * Decompiled with CFR 0.152.
 */
package b.l.c;

import b.g.c;
import b.g.n;
import b.l.c.r;
import b.l.f;
import b.l.o;
import b.l.s;
import b.o.d.tc;
import b.o.e.g;
import b.q.fb;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
class l {
    private static final InputStreamReader new(Path path, Charset charset, OpenOption ... openOptionArray) throws IOException {
        return new InputStreamReader(Files.newInputStream(path, Arrays.copyOf(openOptionArray, openOptionArray.length)), charset);
    }

    static /* synthetic */ InputStreamReader o00000(Path path, Charset charset, OpenOption[] openOptionArray, int n2, Object object) throws IOException {
        if ((n2 & 1) != 0) {
            charset = fb.\u00d300000;
        }
        return new InputStreamReader(Files.newInputStream(path, Arrays.copyOf(openOptionArray, openOptionArray.length)), charset);
    }

    private static final BufferedReader new(Path path, Charset charset, int n2, OpenOption ... openOptionArray) throws IOException {
        return new BufferedReader(new InputStreamReader(Files.newInputStream(path, Arrays.copyOf(openOptionArray, openOptionArray.length)), charset), n2);
    }

    static /* synthetic */ BufferedReader new(Path path, Charset charset, int n2, OpenOption[] openOptionArray, int n3, Object object) throws IOException {
        if ((n3 & 1) != 0) {
            charset = fb.\u00d300000;
        }
        if ((n3 & 2) != 0) {
            n2 = 8192;
        }
        return new BufferedReader(new InputStreamReader(Files.newInputStream(path, Arrays.copyOf(openOptionArray, openOptionArray.length)), charset), n2);
    }

    private static final OutputStreamWriter o00000(Path path, Charset charset, OpenOption ... openOptionArray) throws IOException {
        return new OutputStreamWriter(Files.newOutputStream(path, Arrays.copyOf(openOptionArray, openOptionArray.length)), charset);
    }

    static /* synthetic */ OutputStreamWriter new(Path path, Charset charset, OpenOption[] openOptionArray, int n2, Object object) throws IOException {
        if ((n2 & 1) != 0) {
            charset = fb.\u00d300000;
        }
        return new OutputStreamWriter(Files.newOutputStream(path, Arrays.copyOf(openOptionArray, openOptionArray.length)), charset);
    }

    private static final BufferedWriter o00000(Path path, Charset charset, int n2, OpenOption ... openOptionArray) throws IOException {
        return new BufferedWriter(new OutputStreamWriter(Files.newOutputStream(path, Arrays.copyOf(openOptionArray, openOptionArray.length)), charset), n2);
    }

    static /* synthetic */ BufferedWriter o00000(Path path, Charset charset, int n2, OpenOption[] openOptionArray, int n3, Object object) throws IOException {
        if ((n3 & 1) != 0) {
            charset = fb.\u00d300000;
        }
        if ((n3 & 2) != 0) {
            n2 = 8192;
        }
        return new BufferedWriter(new OutputStreamWriter(Files.newOutputStream(path, Arrays.copyOf(openOptionArray, openOptionArray.length)), charset), n2);
    }

    private static final byte[] o00000(Path path) throws IOException {
        return Files.readAllBytes(path);
    }

    private static final void o00000(Path path, byte[] byArray, OpenOption ... openOptionArray) throws IOException {
        Files.write(path, byArray, Arrays.copyOf(openOptionArray, openOptionArray.length));
    }

    private static final void o00000(Path openOptionArray, byte[] byArray) throws IOException {
        OpenOption[] openOptionArray2 = openOptionArray;
        OpenOption[] openOptionArray3 = new OpenOption[1];
        openOptionArray = openOptionArray3;
        openOptionArray3[0] = StandardOpenOption.APPEND;
        Files.write((Path)openOptionArray2, byArray, openOptionArray);
    }

    public static final String new(Path object, Charset object2) throws IOException {
        Object object3 = new OpenOption[]{};
        object = new InputStreamReader(Files.newInputStream((Path)object, Arrays.copyOf(object3, ((OpenOption[])object3).length)), (Charset)object2);
        object3 = null;
        try {
            object2 = s.o00000((InputStreamReader)object);
        }
        catch (Throwable throwable) {
            try {
                object2 = throwable;
                object3 = throwable;
                throw object2;
            }
            catch (Throwable throwable2) {
                o.o00000((Closeable)object, (Throwable)object3);
                throw throwable2;
            }
        }
        o.o00000((Closeable)object, null);
        return object2;
    }

    public static /* synthetic */ String o00000(Path path, Charset charset, int n2, Object object) throws IOException {
        if ((n2 & 1) != 0) {
            charset = fb.\u00d300000;
        }
        return r.new(path, charset);
    }

    public static final void o00000(Path object, CharSequence object2, Charset object3, OpenOption ... object4) throws IOException {
        block7: {
            object = Files.newOutputStream((Path)object, Arrays.copyOf(object4, ((OpenOption[])object4).length));
            object4 = null;
            try {
                OutputStream outputStream = (OutputStream)object;
                if (object2 instanceof String) {
                    f.o00000(outputStream, (String)object2, (Charset)object3);
                    break block7;
                }
                object3 = f.o00000((Charset)object3);
                CharBuffer charBuffer = object2 instanceof CharBuffer ? ((CharBuffer)object2).asReadOnlyBuffer() : CharBuffer.wrap((CharSequence)object2);
                object2 = f.o00000(Math.min(object2.length(), 8192), (CharsetEncoder)object3);
                while (charBuffer.hasRemaining()) {
                    if (!(!((CharsetEncoder)object3).encode(charBuffer, (ByteBuffer)object2, true).isError())) {
                        throw new IllegalStateException("Check failed.");
                    }
                    outputStream.write(((ByteBuffer)object2).array(), 0, ((Buffer)object2).position());
                    ((ByteBuffer)object2).clear();
                }
            }
            catch (Throwable throwable) {
                try {
                    object2 = throwable;
                    object4 = throwable;
                    throw object2;
                }
                catch (Throwable throwable2) {
                    o.o00000((Closeable)object, (Throwable)object4);
                    throw throwable2;
                }
            }
        }
        o.o00000((Closeable)object, null);
        return;
    }

    public static /* synthetic */ void o00000(Path path, CharSequence charSequence, Charset charset, OpenOption[] openOptionArray, int n2, Object object) throws IOException {
        if ((n2 & 2) != 0) {
            charset = fb.\u00d300000;
        }
        r.o00000(path, charSequence, charset, openOptionArray);
    }

    public static final void o00000(Path openOptionArray, CharSequence charSequence, Charset charset) throws IOException {
        OpenOption[] openOptionArray2 = openOptionArray;
        OpenOption[] openOptionArray3 = new OpenOption[1];
        openOptionArray = openOptionArray3;
        openOptionArray3[0] = StandardOpenOption.APPEND;
        r.o00000((Path)openOptionArray2, charSequence, charset, openOptionArray);
    }

    public static /* synthetic */ void o00000(Path path, CharSequence charSequence, Charset charset, int n2, Object object) throws IOException {
        if ((n2 & 2) != 0) {
            charset = fb.\u00d300000;
        }
        r.o00000(path, charSequence, charset);
    }

    private static final void o00000(Path object, Charset object2, g object3) throws IOException {
        object = (BufferedReader)((Reader)Files.newBufferedReader((Path)object, (Charset)object2));
        object2 = null;
        try {
            Iterator iterator = s.o00000((BufferedReader)object).o00000();
            while (iterator.hasNext()) {
                Object e2 = iterator.next();
                object3.\u00f800000(e2);
            }
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
        return;
    }

    static /* synthetic */ void o00000(Path object, Charset object2, g object3, int n2, Object object4) throws IOException {
        if ((n2 & 1) != 0) {
            object2 = fb.\u00d300000;
        }
        object = (BufferedReader)((Reader)Files.newBufferedReader((Path)object, (Charset)object2));
        object2 = null;
        try {
            Iterator iterator = s.o00000((BufferedReader)object).o00000();
            while (iterator.hasNext()) {
                object4 = iterator.next();
                object3.\u00f800000(object4);
            }
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
        return;
    }

    private static final InputStream new(Path path, OpenOption ... openOptionArray) throws IOException {
        return Files.newInputStream(path, Arrays.copyOf(openOptionArray, openOptionArray.length));
    }

    private static final OutputStream o00000(Path path, OpenOption ... openOptionArray) throws IOException {
        return Files.newOutputStream(path, Arrays.copyOf(openOptionArray, openOptionArray.length));
    }

    private static final List o00000(Path path, Charset charset) throws IOException {
        return Files.readAllLines(path, charset);
    }

    static /* synthetic */ List new(Path path, Charset charset, int n2, Object object) throws IOException {
        if ((n2 & 1) != 0) {
            charset = fb.\u00d300000;
        }
        return Files.readAllLines(path, charset);
    }

    private static final Object new(Path object, Charset object2, g object3) throws IOException {
        Object object4;
        object = Files.newBufferedReader((Path)object, (Charset)object2);
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

    static /* synthetic */ Object new(Path object, Charset charset, g g2, int n2, Object object2) throws IOException {
        if ((n2 & 1) != 0) {
            charset = fb.\u00d300000;
        }
        Closeable closeable = Files.newBufferedReader((Path)object, charset);
        object2 = null;
        try {
            object = (BufferedReader)closeable;
            object = g2.\u00f800000(s.o00000((BufferedReader)object));
        }
        catch (Throwable throwable) {
            try {
                object = throwable;
                object2 = throwable;
                throw object;
            }
            catch (Throwable throwable2) {
                tc.Object(1);
                o.o00000(closeable, (Throwable)object2);
                tc.o00000(1);
                throw throwable2;
            }
        }
        tc.Object(1);
        o.o00000(closeable, null);
        tc.o00000(1);
        return object;
    }

    private static final Path o00000(Path path, Iterable iterable, Charset charset, OpenOption ... openOptionArray) throws IOException {
        return Files.write(path, (Iterable<? extends CharSequence>)iterable, charset, Arrays.copyOf(openOptionArray, openOptionArray.length));
    }

    static /* synthetic */ Path o00000(Path path, Iterable iterable, Charset charset, OpenOption[] openOptionArray, int n2, Object object) throws IOException {
        if ((n2 & 2) != 0) {
            charset = fb.\u00d300000;
        }
        return Files.write(path, (Iterable<? extends CharSequence>)iterable, charset, Arrays.copyOf(openOptionArray, openOptionArray.length));
    }

    private static final Path o00000(Path path, n n2, Charset charset, OpenOption ... openOptionArray) throws IOException {
        return Files.write(path, (Iterable<? extends CharSequence>)c.ifsuper(n2), charset, Arrays.copyOf(openOptionArray, openOptionArray.length));
    }

    static /* synthetic */ Path o00000(Path path, n n2, Charset charset, OpenOption[] openOptionArray, int n3, Object object) throws IOException {
        if ((n3 & 2) != 0) {
            charset = fb.\u00d300000;
        }
        return Files.write(path, (Iterable<? extends CharSequence>)c.ifsuper(n2), charset, Arrays.copyOf(openOptionArray, openOptionArray.length));
    }

    private static final Path o00000(Path openOptionArray, Iterable iterable, Charset charset) throws IOException {
        OpenOption[] openOptionArray2 = openOptionArray;
        OpenOption[] openOptionArray3 = new OpenOption[1];
        openOptionArray = openOptionArray3;
        openOptionArray3[0] = StandardOpenOption.APPEND;
        return Files.write((Path)openOptionArray2, (Iterable<? extends CharSequence>)iterable, charset, openOptionArray);
    }

    static /* synthetic */ Path o00000(Path path, Iterable iterable, Charset charset, int n2, Object openOptionArray) throws IOException {
        if ((n2 & 2) != 0) {
            charset = fb.\u00d300000;
        }
        OpenOption[] openOptionArray2 = new OpenOption[1];
        openOptionArray = openOptionArray2;
        openOptionArray2[0] = StandardOpenOption.APPEND;
        return Files.write(path, (Iterable<? extends CharSequence>)iterable, charset, openOptionArray);
    }

    private static final Path o00000(Path openOptionArray, n n2, Charset charset) throws IOException {
        OpenOption[] openOptionArray2 = openOptionArray;
        OpenOption[] openOptionArray3 = new OpenOption[1];
        openOptionArray = openOptionArray3;
        openOptionArray3[0] = StandardOpenOption.APPEND;
        return Files.write((Path)openOptionArray2, (Iterable<? extends CharSequence>)c.ifsuper(n2), charset, openOptionArray);
    }

    static /* synthetic */ Path o00000(Path path, n n2, Charset charset, int n3, Object openOptionArray) throws IOException {
        if ((n3 & 2) != 0) {
            charset = fb.\u00d300000;
        }
        OpenOption[] openOptionArray2 = new OpenOption[1];
        openOptionArray = openOptionArray2;
        openOptionArray2[0] = StandardOpenOption.APPEND;
        return Files.write(path, (Iterable<? extends CharSequence>)c.ifsuper(n2), charset, openOptionArray);
    }
}


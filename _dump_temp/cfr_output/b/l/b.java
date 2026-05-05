/*
 * Decompiled with CFR 0.152.
 */
package b.l;

import b.l.b$_b$1;
import b.q.fb;
import b.s.t;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
import java.nio.charset.Charset;

public final class b {
    public static final t o00000(BufferedInputStream bufferedInputStream) {
        return new b$_b$1(bufferedInputStream);
    }

    private static final ByteArrayInputStream o00000(String string, Charset charset) {
        return new ByteArrayInputStream(string.getBytes(charset));
    }

    static /* synthetic */ ByteArrayInputStream o00000(String string, Charset charset, int n2, Object object) {
        if ((n2 & 1) != 0) {
            charset = fb.\u00d300000;
        }
        return new ByteArrayInputStream(string.getBytes(charset));
    }

    private static final ByteArrayInputStream o00000(byte[] byArray) {
        return new ByteArrayInputStream(byArray);
    }

    private static final ByteArrayInputStream o00000(byte[] byArray, int n2, int n3) {
        return new ByteArrayInputStream(byArray, n2, n3);
    }

    private static final BufferedInputStream o00000(InputStream inputStream, int n2) {
        if (inputStream instanceof BufferedInputStream) {
            return (BufferedInputStream)inputStream;
        }
        return new BufferedInputStream(inputStream, n2);
    }

    static /* synthetic */ BufferedInputStream \u00d200000(InputStream inputStream, int n2, int n3, Object object) {
        if ((n3 & 1) != 0) {
            n2 = 8192;
        }
        if (inputStream instanceof BufferedInputStream) {
            return (BufferedInputStream)inputStream;
        }
        return new BufferedInputStream(inputStream, n2);
    }

    private static final InputStreamReader o00000(InputStream inputStream, Charset charset) {
        return new InputStreamReader(inputStream, charset);
    }

    static /* synthetic */ InputStreamReader o00000(InputStream inputStream, Charset charset, int n2, Object object) {
        if ((n2 & 1) != 0) {
            charset = fb.\u00d300000;
        }
        return new InputStreamReader(inputStream, charset);
    }

    private static final BufferedReader \u00d200000(InputStream closeable, Charset charset) {
        closeable = new InputStreamReader((InputStream)closeable, charset);
        return new BufferedReader((Reader)closeable, 8192);
    }

    static /* synthetic */ BufferedReader \u00d200000(InputStream inputStream, Charset charset, int n2, Object object) {
        if ((n2 & 1) != 0) {
            charset = fb.\u00d300000;
        }
        Reader reader = new InputStreamReader(inputStream, charset);
        return new BufferedReader(reader, 8192);
    }

    private static final BufferedOutputStream o00000(OutputStream outputStream, int n2) {
        if (outputStream instanceof BufferedOutputStream) {
            return (BufferedOutputStream)outputStream;
        }
        return new BufferedOutputStream(outputStream, n2);
    }

    static /* synthetic */ BufferedOutputStream o00000(OutputStream outputStream, int n2, int n3, Object object) {
        if ((n3 & 1) != 0) {
            n2 = 8192;
        }
        if (outputStream instanceof BufferedOutputStream) {
            return (BufferedOutputStream)outputStream;
        }
        return new BufferedOutputStream(outputStream, n2);
    }

    private static final OutputStreamWriter \u00d200000(OutputStream outputStream, Charset charset) {
        return new OutputStreamWriter(outputStream, charset);
    }

    static /* synthetic */ OutputStreamWriter \u00d200000(OutputStream outputStream, Charset charset, int n2, Object object) {
        if ((n2 & 1) != 0) {
            charset = fb.\u00d300000;
        }
        return new OutputStreamWriter(outputStream, charset);
    }

    private static final BufferedWriter o00000(OutputStream closeable, Charset charset) {
        closeable = new OutputStreamWriter((OutputStream)closeable, charset);
        return new BufferedWriter((Writer)closeable, 8192);
    }

    static /* synthetic */ BufferedWriter o00000(OutputStream outputStream, Charset charset, int n2, Object object) {
        if ((n2 & 1) != 0) {
            charset = fb.\u00d300000;
        }
        Writer writer = new OutputStreamWriter(outputStream, charset);
        return new BufferedWriter(writer, 8192);
    }

    public static final long o00000(InputStream inputStream, OutputStream outputStream, int n2) {
        long l2 = 0L;
        byte[] byArray = new byte[n2];
        int n3 = inputStream.read(byArray);
        while (n3 >= 0) {
            outputStream.write(byArray, 0, n3);
            l2 += (long)n3;
            n3 = inputStream.read(byArray);
        }
        return l2;
    }

    public static /* synthetic */ long o00000(InputStream inputStream, OutputStream outputStream, int n2, int n3, Object object) {
        if ((n3 & 2) != 0) {
            n2 = 8192;
        }
        return b.o00000(inputStream, outputStream, n2);
    }

    public static final /* synthetic */ byte[] \u00d200000(InputStream inputStream, int n2) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(Math.max(n2, inputStream.available()));
        b.o00000(inputStream, byteArrayOutputStream, 0, 2, null);
        return byteArrayOutputStream.toByteArray();
    }

    public static /* synthetic */ byte[] o00000(InputStream inputStream, int n2, int n3, Object object) {
        if ((n3 & 1) != 0) {
            n2 = 8192;
        }
        return b.\u00d200000(inputStream, n2);
    }

    public static final byte[] o00000(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(Math.max(8192, inputStream.available()));
        b.o00000(inputStream, byteArrayOutputStream, 0, 2, null);
        return byteArrayOutputStream.toByteArray();
    }
}


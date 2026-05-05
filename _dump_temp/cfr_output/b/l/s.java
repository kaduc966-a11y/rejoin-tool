/*
 * Decompiled with CFR 0.152.
 */
package b.l;

import b.g.c;
import b.g.n;
import b.i;
import b.l.b;
import b.l.o;
import b.l.q;
import b.o.d.tc;
import b.o.e.g;
import b.q.fb;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.InputStream;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class s {
    private static final BufferedReader o00000(Reader reader, int n2) {
        if (reader instanceof BufferedReader) {
            return (BufferedReader)reader;
        }
        return new BufferedReader(reader, n2);
    }

    static /* synthetic */ BufferedReader o00000(Reader reader, int n2, int n3, Object object) {
        if ((n3 & 1) != 0) {
            n2 = 8192;
        }
        if (reader instanceof BufferedReader) {
            return (BufferedReader)reader;
        }
        return new BufferedReader(reader, n2);
    }

    private static final BufferedWriter o00000(Writer writer, int n2) {
        if (writer instanceof BufferedWriter) {
            return (BufferedWriter)writer;
        }
        return new BufferedWriter(writer, n2);
    }

    static /* synthetic */ BufferedWriter o00000(Writer writer, int n2, int n3, Object object) {
        if ((n3 & 1) != 0) {
            n2 = 8192;
        }
        if (writer instanceof BufferedWriter) {
            return (BufferedWriter)writer;
        }
        return new BufferedWriter(writer, n2);
    }

    public static final void o00000(Reader closeable, g object) {
        closeable = closeable instanceof BufferedReader ? (BufferedReader)closeable : new BufferedReader((Reader)closeable, 8192);
        Throwable throwable = null;
        try {
            Iterator iterator = s.o00000((BufferedReader)closeable).o00000();
            while (iterator.hasNext()) {
                Object e2 = iterator.next();
                object.\u00f800000(e2);
            }
        }
        catch (Throwable throwable2) {
            try {
                object = throwable2;
                throwable = throwable2;
                throw object;
            }
            catch (Throwable throwable3) {
                o.o00000(closeable, throwable);
                throw throwable3;
            }
        }
        o.o00000(closeable, null);
        return;
    }

    public static final List \u00d200000(Reader reader) {
        ArrayList arrayList = new ArrayList();
        s.o00000(reader, arg_0 -> s.o00000(arrayList, arg_0));
        return arrayList;
    }

    public static final Object \u00d200000(Reader closeable, g object) {
        Object object2;
        closeable = closeable instanceof BufferedReader ? (BufferedReader)closeable : new BufferedReader((Reader)closeable, 8192);
        Throwable throwable = null;
        try {
            object2 = (BufferedReader)closeable;
            object2 = object.\u00f800000(s.o00000((BufferedReader)object2));
        }
        catch (Throwable throwable2) {
            try {
                object = throwable2;
                throwable = throwable2;
                throw object;
            }
            catch (Throwable throwable3) {
                tc.Object(1);
                o.o00000(closeable, throwable);
                tc.o00000(1);
                throw throwable3;
            }
        }
        tc.Object(1);
        o.o00000(closeable, null);
        tc.o00000(1);
        return object2;
    }

    private static final StringReader o00000(String string) {
        return new StringReader(string);
    }

    public static final n o00000(BufferedReader bufferedReader) {
        return c.String(new q(bufferedReader));
    }

    public static final String o00000(Reader reader) {
        StringWriter stringWriter = new StringWriter();
        s.o00000(reader, stringWriter, 0, 2, null);
        return stringWriter.toString();
    }

    public static final long o00000(Reader reader, Writer writer, int n2) {
        long l2 = 0L;
        char[] cArray = new char[n2];
        int n3 = reader.read(cArray);
        while (n3 >= 0) {
            writer.write(cArray, 0, n3);
            l2 += (long)n3;
            n3 = reader.read(cArray);
        }
        return l2;
    }

    public static /* synthetic */ long o00000(Reader reader, Writer writer, int n2, int n3, Object object) {
        if ((n3 & 2) != 0) {
            n2 = 8192;
        }
        return s.o00000(reader, writer, n2);
    }

    private static final String o00000(URL object, Charset charset) {
        object = s.o00000((URL)object);
        return new String((byte[])object, charset);
    }

    static /* synthetic */ String o00000(URL uRL, Charset charset, int n2, Object object) {
        if ((n2 & 1) != 0) {
            charset = fb.\u00d300000;
        }
        byte[] byArray = s.o00000(uRL);
        return new String(byArray, charset);
    }

    public static final byte[] o00000(URL object) {
        byte[] byArray;
        object = ((URL)object).openStream();
        Throwable throwable = null;
        try {
            byArray = b.o00000((InputStream)object);
        }
        catch (Throwable throwable2) {
            try {
                Throwable throwable3 = throwable2;
                throwable = throwable2;
                throw throwable3;
            }
            catch (Throwable throwable4) {
                o.o00000((Closeable)object, throwable);
                throw throwable4;
            }
        }
        o.o00000((Closeable)object, null);
        return byArray;
    }

    private static final i o00000(ArrayList arrayList, String string) {
        arrayList.add(string);
        return i.o00000;
    }
}


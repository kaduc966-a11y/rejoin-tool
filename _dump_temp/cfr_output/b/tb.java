/*
 * Decompiled with CFR 0.152.
 */
package b;

import b.m.s;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.List;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class tb {
    private static final void \u00d300000(Throwable throwable) {
        throwable.printStackTrace();
    }

    private static final void o00000(Throwable throwable, PrintWriter printWriter) {
        throwable.printStackTrace(printWriter);
    }

    private static final void o00000(Throwable throwable, PrintStream printStream) {
        throwable.printStackTrace(printStream);
    }

    public static final StackTraceElement[] return(Throwable throwable) {
        return throwable.getStackTrace();
    }

    public static /* synthetic */ void \u00d500000(Throwable throwable) {
    }

    public static final String new(Throwable throwable) {
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        throwable.printStackTrace(printWriter);
        printWriter.flush();
        return stringWriter.toString();
    }

    public static final void o00000(Throwable throwable, Throwable throwable2) {
        if (throwable != throwable2) {
            s.o00000.o00000(throwable, throwable2);
        }
    }

    public static final List o00000(Throwable throwable) {
        return s.o00000.o00000(throwable);
    }

    public static /* synthetic */ void \u00d400000(Throwable throwable) {
    }
}


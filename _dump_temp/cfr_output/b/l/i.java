/*
 * Decompiled with CFR 0.152.
 */
package b.l;

import b.l.j;
import b.o.d.w;
import java.io.File;

public final class i
extends j {
    public i(File file, File file2, String string) {
        super(file, file2, string);
    }

    public /* synthetic */ i(File file, File file2, String string, int n2, w w2) {
        if ((n2 & 2) != 0) {
            file2 = null;
        }
        if ((n2 & 4) != 0) {
            string = null;
        }
        this(file, file2, string);
    }
}


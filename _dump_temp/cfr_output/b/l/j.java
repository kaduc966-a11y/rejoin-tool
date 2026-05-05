/*
 * Decompiled with CFR 0.152.
 */
package b.l;

import b.l.x;
import b.o.d.w;
import java.io.File;
import java.io.IOException;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class j
extends IOException {
    private final File \u00d200000;
    private final File super;
    private final String \u00d300000;

    public j(File file, File file2, String string) {
        super(x.super(file, file2, string));
        this.\u00d200000 = file;
        this.super = file2;
        this.\u00d300000 = string;
    }

    public /* synthetic */ j(File file, File file2, String string, int n2, w w2) {
        if ((n2 & 2) != 0) {
            file2 = null;
        }
        if ((n2 & 4) != 0) {
            string = null;
        }
        this(file, file2, string);
    }

    public final File \u00d200000() {
        return this.\u00d200000;
    }

    public final File super() {
        return this.super;
    }

    public final String \u00d300000() {
        return this.\u00d300000;
    }
}


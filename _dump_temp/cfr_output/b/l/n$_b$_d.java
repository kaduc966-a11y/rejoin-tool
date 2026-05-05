/*
 * Decompiled with CFR 0.152.
 */
package b.l;

import b.l.i;
import b.l.n;
import b.l.n$_b;
import b.l.n$_c;
import b.o.e.f;
import b.o.e.g;
import java.io.File;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
final class n$_b$_d
extends n$_c {
    private boolean \u00f600000;
    private File[] null;
    private int \u00f500000;
    final /* synthetic */ n$_b \u00d800000;

    public n$_b$_d(n$_b n$_b, File file) {
        this.\u00d800000 = n$_b;
        super(file);
    }

    @Override
    public final File o00000() {
        block8: {
            if (!this.\u00f600000) {
                g g2 = n.\u00d500000(this.\u00d800000.\u00d8\u00d8\u00f5000);
                boolean bl = g2 != null ? !((Boolean)g2.\u00f800000(this.new())).booleanValue() : false;
                if (bl) {
                    return null;
                }
                this.\u00f600000 = true;
                return this.new();
            }
            if (this.null == null || this.\u00f500000 < this.null.length) {
                if (this.null == null) {
                    this.null = this.new().listFiles();
                    if (this.null == null) {
                        f f2 = n.o00000(this.\u00d800000.\u00d8\u00d8\u00f5000);
                        if (f2 != null) {
                            f2.o00000(this.new(), new i(this.new(), null, "Cannot list files in a directory", 2, null));
                        }
                    }
                    if (this.null == null || this.null.length == 0) {
                        g g3 = n.\u00d300000(this.\u00d800000.\u00d8\u00d8\u00f5000);
                        if (g3 != null) {
                            g3.\u00f800000(this.new());
                        }
                        return null;
                    }
                }
                int n2 = this.\u00f500000;
                this.\u00f500000 = n2 + 1;
                return this.null[n2];
            }
            g g4 = n.\u00d300000(this.\u00d800000.\u00d8\u00d8\u00f5000);
            if (g4 == null) break block8;
            g4.\u00f800000(this.new());
        }
        return null;
    }
}


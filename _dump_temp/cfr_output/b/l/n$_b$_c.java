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

final class n$_b$_c
extends n$_c {
    private boolean \u00d600000;
    private File[] String;
    private int \u00d500000;
    private boolean \u00d300000;
    final /* synthetic */ n$_b \u00d200000;

    public n$_b$_c(n$_b n$_b, File file) {
        this.\u00d200000 = n$_b;
        super(file);
    }

    @Override
    public final File o00000() {
        block6: {
            if (!this.\u00d300000 && this.String == null) {
                g g2 = n.\u00d500000(this.\u00d200000.\u00d8\u00d8\u00f5000);
                boolean bl = g2 != null ? !((Boolean)g2.\u00f800000(this.new())).booleanValue() : false;
                if (bl) {
                    return null;
                }
                this.String = this.new().listFiles();
                if (this.String == null) {
                    f f2 = n.o00000(this.\u00d200000.\u00d8\u00d8\u00f5000);
                    if (f2 != null) {
                        f2.o00000(this.new(), new i(this.new(), null, "Cannot list files in a directory", 2, null));
                    }
                    this.\u00d300000 = true;
                }
            }
            if (this.String != null && this.\u00d500000 < this.String.length) {
                int n2 = this.\u00d500000;
                this.\u00d500000 = n2 + 1;
                return this.String[n2];
            }
            if (!this.\u00d600000) {
                this.\u00d600000 = true;
                return this.new();
            }
            g g3 = n.\u00d300000(this.\u00d200000.\u00d8\u00d8\u00f5000);
            if (g3 == null) break block6;
            g3.\u00f800000(this.new());
        }
        return null;
    }
}


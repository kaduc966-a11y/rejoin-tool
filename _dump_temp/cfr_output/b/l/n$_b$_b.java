/*
 * Decompiled with CFR 0.152.
 */
package b.l;

import b.l.n$_b;
import b.l.n$_d;
import b.m;
import java.io.File;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
final class n$_b$_b
extends n$_d {
    private boolean for;
    final /* synthetic */ n._b \u00f800000;

    public n$_b$_b(n._b _b2, File file) {
        this.\u00f800000 = _b2;
        super(file);
        if (m.new) {
            boolean bl = file.isFile();
            if (m.new && !bl) {
                String string = "rootFile must be verified to be file beforehand.";
                throw new AssertionError((Object)string);
            }
        }
    }

    @Override
    public final File o00000() {
        if (this.for) {
            return null;
        }
        this.for = true;
        return this.new();
    }
}


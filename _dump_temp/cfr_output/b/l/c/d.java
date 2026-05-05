/*
 * Decompiled with CFR 0.152.
 */
package b.l.c;

import b.l.c.c;
import b.l.c.u;
import b.o.e.f;
import java.nio.file.FileVisitor;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class d
implements u {
    private f class;
    private f super;
    private f \u00d300000;
    private f \u00d400000;
    private boolean \u00d200000;

    @Override
    public final void \u00d400000(f f2) {
        this.\u00d200000();
        d d2 = this;
        d2.o00000(d2.class, "onPreVisitDirectory");
        this.class = f2;
    }

    @Override
    public final void \u00d200000(f f2) {
        this.\u00d200000();
        d d2 = this;
        d2.o00000(d2.super, "onVisitFile");
        this.super = f2;
    }

    @Override
    public final void o00000(f f2) {
        this.\u00d200000();
        d d2 = this;
        d2.o00000(d2.\u00d300000, "onVisitFileFailed");
        this.\u00d300000 = f2;
    }

    @Override
    public final void Object(f f2) {
        this.\u00d200000();
        d d2 = this;
        d2.o00000(d2.\u00d400000, "onPostVisitDirectory");
        this.\u00d400000 = f2;
    }

    public final FileVisitor o00000() {
        this.\u00d200000();
        this.\u00d200000 = true;
        return new c(this.class, this.super, this.\u00d300000, this.\u00d400000);
    }

    private final void \u00d200000() {
        if (this.\u00d200000) {
            throw new IllegalStateException("This builder was already built");
        }
    }

    private final void o00000(Object object, String string) {
        if (object != null) {
            throw new IllegalStateException(string + " was already defined");
        }
    }
}


/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.d;

import b.o.d.fc;
import b.o.d.w;
import b.t.c.b.b.d.e$_b;
import b.t.c.b.b.d.f;
import b.t.c.b.b.d.k;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class e {
    public static final e$_b \u00d800000 = new e$_b(null);
    private final String \u00d400000;
    private transient k \u00d500000;
    private transient e \u00d300000;
    private transient f o00000;
    private static final f new = f.\u00d400000("<root>");
    private static final Pattern return = Pattern.compile("\\.");

    public e(String string, k k2) {
        this.\u00d400000 = string;
        this.\u00d500000 = k2;
    }

    public e(String string) {
        this.\u00d400000 = string;
    }

    private e(String string, e e2, f f2) {
        this.\u00d400000 = string;
        this.\u00d300000 = e2;
        this.o00000 = f2;
    }

    private final void \u00f400000() {
        e e2 = this;
        int n2 = e2.super(e2.\u00d400000);
        if (n2 >= 0) {
            this.o00000 = f.\u00d200000(this.\u00d400000.substring(n2 + 1));
            this.\u00d300000 = new e(this.\u00d400000.substring(0, n2));
            return;
        }
        this.o00000 = f.\u00d200000(this.\u00d400000);
        this.\u00d300000 = k.\u00d200000.\u00d800000();
    }

    private final int super(String string) {
        boolean bl = false;
        for (int i2 = string.length() - 1; i2 >= 0; --i2) {
            char c2 = string.charAt(i2);
            if (c2 == '.' && !bl) {
                return i2;
            }
            if (c2 == '`') {
                bl = !bl;
                continue;
            }
            if (c2 != '\\') continue;
            --i2;
        }
        return -1;
    }

    public final String \u00d300000() {
        return this.\u00d400000;
    }

    public final boolean \u00d800000() {
        return this.\u00d500000 != null || b.q.f.super((CharSequence)this.\u00d300000(), '<', 0, false, 6, null) < 0;
    }

    public final k super() {
        k k2 = this.\u00d500000;
        if (k2 == null) {
            k k3;
            k k4;
            this.\u00d500000 = k4 = (k3 = new k(this));
            k2 = k3;
        }
        return k2;
    }

    public final boolean int() {
        return ((CharSequence)this.\u00d400000).length() == 0;
    }

    public final e \u00d200000() {
        Object object = this.\u00d300000;
        if (object != null) {
            return object;
        }
        if (!(!this.int())) {
            object = "root";
            throw new IllegalStateException(object.toString());
        }
        this.\u00f400000();
        return this.\u00d300000;
    }

    public final e super(f f2) {
        String string = this.int() ? f2.\u00d400000() : this.\u00d400000 + '.' + f2.\u00d400000();
        return new e(string, this, f2);
    }

    public final f class() {
        Object object = this.o00000;
        if (object != null) {
            return object;
        }
        if (!(!this.int())) {
            object = "root";
            throw new IllegalStateException(object.toString());
        }
        this.\u00f400000();
        return this.o00000;
    }

    public final f \u00d400000() {
        if (this.int()) {
            return new;
        }
        return this.class();
    }

    public final List \u00d600000() {
        return e.super(this);
    }

    public final boolean \u00d200000(f object) {
        if (this.int()) {
            return false;
        }
        int n2 = b.q.f.super((CharSequence)this.\u00d400000, '.', 0, false, 6, null);
        n2 = n2 == -1 ? this.\u00d400000.length() : n2;
        return n2 == ((String)(object = ((f)object).\u00d400000())).length() && b.q.f.super(this.\u00d400000, 0, (String)object, 0, n2, false, 16, null);
    }

    public final String toString() {
        if (this.int()) {
            return new.\u00d400000();
        }
        return this.\u00d400000;
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof e)) {
            return false;
        }
        return fc.o00000((Object)this.\u00d400000, (Object)((e)object).\u00d400000);
    }

    public final int hashCode() {
        return this.\u00d400000.hashCode();
    }

    private static final List super(e e2) {
        if (e2.int()) {
            return new ArrayList();
        }
        List list = e.super(e2.\u00d200000());
        list.add(e2.class());
        return list;
    }

    public /* synthetic */ e(String string, e e2, f f2, w w2) {
        this(string, e2, f2);
    }
}


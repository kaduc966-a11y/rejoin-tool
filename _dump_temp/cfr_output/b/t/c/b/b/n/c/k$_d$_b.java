/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.n.c;

import b.o.d.fc;
import b.t.c.b.b.d.f;
import b.t.c.b.b.n.b.o;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class k$_d$_b {
    private final String \u00d200000;
    private final f \u00d400000;
    private final String class;
    private final String \u00d300000;
    private final String super;

    public k$_d$_b(String string, f f2, String string2, String string3) {
        this.\u00d200000 = string;
        this.\u00d400000 = f2;
        this.class = string2;
        this.\u00d300000 = string3;
        this.super = o.o00000.super(this.\u00d200000, this.\u00d400000 + '(' + this.class + ')' + this.\u00d300000);
    }

    public final f super() {
        return this.\u00d400000;
    }

    public final String \u00d200000() {
        return this.super;
    }

    public final k$_d$_b super(String string, f f2, String string2, String string3) {
        return new k$_d$_b(string, f2, string2, string3);
    }

    public static /* synthetic */ k$_d$_b super(k$_d$_b k$_d$_b, String string, f f2, String string2, String string3, int n2, Object object) {
        if ((n2 & 1) != 0) {
            string = k$_d$_b.\u00d200000;
        }
        if ((n2 & 2) != 0) {
            f2 = k$_d$_b.\u00d400000;
        }
        if ((n2 & 4) != 0) {
            string2 = k$_d$_b.class;
        }
        if ((n2 & 8) != 0) {
            string3 = k$_d$_b.\u00d300000;
        }
        return k$_d$_b.super(string, f2, string2, string3);
    }

    public final String toString() {
        return "NameAndSignature(classInternalName=" + this.\u00d200000 + ", name=" + this.\u00d400000 + ", parameters=" + this.class + ", returnType=" + this.\u00d300000 + ')';
    }

    public final int hashCode() {
        return ((this.\u00d200000.hashCode() * 31 + this.\u00d400000.hashCode()) * 31 + this.class.hashCode()) * 31 + this.\u00d300000.hashCode();
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof k$_d$_b)) {
            return false;
        }
        object = (k$_d$_b)object;
        if (!fc.o00000((Object)this.\u00d200000, (Object)((k$_d$_b)object).\u00d200000)) {
            return false;
        }
        if (!fc.o00000((Object)this.\u00d400000, (Object)((k$_d$_b)object).\u00d400000)) {
            return false;
        }
        if (!fc.o00000((Object)this.class, (Object)((k$_d$_b)object).class)) {
            return false;
        }
        return fc.o00000((Object)this.\u00d300000, (Object)((k$_d$_b)object).\u00d300000);
    }
}


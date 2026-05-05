/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b;

import b.o.d.fc;
import java.util.Map;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class b {
    private final Map \u00d300000;
    private final boolean o00000;
    private final boolean \u00d200000;

    public b(Map map, boolean bl, boolean bl2) {
        this.\u00d300000 = map;
        this.o00000 = bl;
        this.\u00d200000 = bl2;
    }

    public final Map super() {
        return this.\u00d300000;
    }

    public final boolean \u00d300000() {
        return this.o00000;
    }

    public final boolean \u00d200000() {
        return this.\u00d200000;
    }

    public final String toString() {
        return "FakeOverrideMembers(members=" + this.\u00d300000 + ", containsInheritedStatics=" + this.o00000 + ", containsPackagePrivate=" + this.\u00d200000 + ')';
    }

    public final int hashCode() {
        return (((Object)this.\u00d300000).hashCode() * 31 + Boolean.hashCode(this.o00000)) * 31 + Boolean.hashCode(this.\u00d200000);
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof b)) {
            return false;
        }
        object = (b)object;
        if (!fc.o00000((Object)this.\u00d300000, (Object)((b)object).\u00d300000)) {
            return false;
        }
        if (this.o00000 != ((b)object).o00000) {
            return false;
        }
        return this.\u00d200000 == ((b)object).\u00d200000;
    }
}


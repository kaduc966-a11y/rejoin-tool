/*
 * Decompiled with CFR 0.152.
 */
import b.o.d.fc;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class f {
    final boolean \u00d200000;
    private final int \u00d200000;
    final String \u00d200000;
    final String o00000;

    public f(boolean bl, int n2, String string, String string2) {
        this.\u00d200000 = bl;
        this.\u00d200000 = n2;
        this.\u00d200000 = string;
        this.o00000 = string2;
    }

    public final String toString() {
        return "RootResult(success=" + this.\u00d200000 + ", exitCode=" + this.\u00d200000 + ", output=" + this.\u00d200000 + ", error=" + this.o00000 + ')';
    }

    public final int hashCode() {
        return ((Boolean.hashCode(this.\u00d200000) * 31 + Integer.hashCode(this.\u00d200000)) * 31 + this.\u00d200000.hashCode()) * 31 + this.o00000.hashCode();
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof f)) {
            return false;
        }
        object = (f)object;
        if (this.\u00d200000 != ((f)object).\u00d200000) {
            return false;
        }
        if (this.\u00d200000 != ((f)object).\u00d200000) {
            return false;
        }
        if (!fc.o00000((Object)this.\u00d200000, (Object)((f)object).\u00d200000)) {
            return false;
        }
        return fc.o00000((Object)this.o00000, (Object)((f)object).o00000);
    }
}


/*
 * Decompiled with CFR 0.152.
 */
import b.o.d.fc;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class d {
    final String new;
    final String o00000;
    final String \u00d300000;

    public d(String string, String string2, String string3) {
        this.new = string;
        this.o00000 = string2;
        this.\u00d300000 = string3;
    }

    public final String \u00d300000() {
        return this.new;
    }

    public final String \u00d200000() {
        return this.o00000;
    }

    public final String o00000() {
        return this.\u00d300000;
    }

    public final String toString() {
        return "ZIHXQJCD(label=" + this.new + ", packageName=" + this.o00000 + ", JSBQRKLHUTMRCYS=" + this.\u00d300000 + ')';
    }

    public final int hashCode() {
        return (this.new.hashCode() * 31 + this.o00000.hashCode()) * 31 + this.\u00d300000.hashCode();
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof d)) {
            return false;
        }
        object = (d)object;
        if (!fc.o00000((Object)this.new, (Object)((d)object).new)) {
            return false;
        }
        if (!fc.o00000((Object)this.o00000, (Object)((d)object).o00000)) {
            return false;
        }
        return fc.o00000((Object)this.\u00d300000, (Object)((d)object).\u00d300000);
    }
}


/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.f.b;

import b.o.d.fc;

public final class s {
    private final Object o00000;
    private final Object \u00d300000;
    private final Object \u00d500000;
    private final Object String;
    private final String \u00d200000;

    public s(Object object, Object object2, Object object3, Object object4, String string) {
        this.o00000 = object;
        this.\u00d300000 = object2;
        this.\u00d500000 = object3;
        this.String = object4;
        this.\u00d200000 = string;
    }

    public final String toString() {
        return "IncompatibleVersionErrorData(actualVersion=" + this.o00000 + ", compilerVersion=" + this.\u00d300000 + ", languageVersion=" + this.\u00d500000 + ", expectedVersion=" + this.String + ", filePath=" + this.\u00d200000 + ')';
    }

    public final int hashCode() {
        return ((((this.o00000 == null ? 0 : this.o00000.hashCode()) * 31 + (this.\u00d300000 == null ? 0 : this.\u00d300000.hashCode())) * 31 + (this.\u00d500000 == null ? 0 : this.\u00d500000.hashCode())) * 31 + (this.String == null ? 0 : this.String.hashCode())) * 31 + this.\u00d200000.hashCode();
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof s)) {
            return false;
        }
        object = (s)object;
        if (!fc.o00000(this.o00000, ((s)object).o00000)) {
            return false;
        }
        if (!fc.o00000(this.\u00d300000, ((s)object).\u00d300000)) {
            return false;
        }
        if (!fc.o00000(this.\u00d500000, ((s)object).\u00d500000)) {
            return false;
        }
        if (!fc.o00000(this.String, ((s)object).String)) {
            return false;
        }
        return fc.o00000((Object)this.\u00d200000, (Object)((s)object).\u00d200000);
    }
}


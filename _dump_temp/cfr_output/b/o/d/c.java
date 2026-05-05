/*
 * Decompiled with CFR 0.152.
 */
package b.o.d;

import b.o.d.fc;
import b.o.d.g;
import b.o.d.x;
import b.o.d.z;
import b.t.b;
import java.io.Serializable;

public class c
implements Serializable,
g {
    protected final Object \u00f80\u00d2000;
    private final Class returnnullsuper;
    private final String \u00f50\u00d2000;
    private final String \u00f40\u00d2000;
    private final boolean OO\u00d2000;
    private final int ifnullsuper;
    private final int \u00d80\u00d2000;

    public c(int n2, Class clazz, String string, String string2, int n3) {
        this(n2, x.\u00d40\u00d2000, clazz, string, string2, n3);
    }

    public c(int n2, Object object, Class clazz, String string, String string2, int n3) {
        this.\u00f80\u00d2000 = object;
        this.returnnullsuper = clazz;
        this.\u00f50\u00d2000 = string;
        this.\u00f40\u00d2000 = string2;
        this.OO\u00d2000 = (n3 & 1) == 1;
        this.ifnullsuper = n2;
        this.\u00d80\u00d2000 = n3 >> 1;
    }

    @Override
    public int \u00f5\u00d8O000() {
        return this.ifnullsuper;
    }

    public b ifwhile() {
        if (this.returnnullsuper == null) {
            return null;
        }
        if (this.OO\u00d2000) {
            return z.o00000(this.returnnullsuper);
        }
        return z.\u00d200000(this.returnnullsuper);
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof c)) {
            return false;
        }
        object = (c)object;
        return this.OO\u00d2000 == ((c)object).OO\u00d2000 && this.ifnullsuper == ((c)object).ifnullsuper && this.\u00d80\u00d2000 == ((c)object).\u00d80\u00d2000 && fc.o00000(this.\u00f80\u00d2000, ((c)object).\u00f80\u00d2000) && fc.o00000((Object)this.returnnullsuper, (Object)((c)object).returnnullsuper) && this.\u00f50\u00d2000.equals(((c)object).\u00f50\u00d2000) && this.\u00f40\u00d2000.equals(((c)object).\u00f40\u00d2000);
    }

    public int hashCode() {
        return ((((((this.\u00f80\u00d2000 != null ? this.\u00f80\u00d2000.hashCode() : 0) * 31 + (this.returnnullsuper != null ? this.returnnullsuper.hashCode() : 0)) * 31 + this.\u00f50\u00d2000.hashCode()) * 31 + this.\u00f40\u00d2000.hashCode()) * 31 + (this.OO\u00d2000 ? 1231 : 1237)) * 31 + this.ifnullsuper) * 31 + this.\u00d80\u00d2000;
    }

    public String toString() {
        return z.o00000(this);
    }
}


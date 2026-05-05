/*
 * Decompiled with CFR 0.152.
 */
package b.o.d;

import b.o.d.fc;
import b.o.d.g;
import b.o.d.x;
import b.o.d.z;
import b.t.db;
import b.t.k;

public class yb
extends x
implements g,
k {
    private final int oO\u00d2000;

    public yb(int n2) {
        this(n2, \u00d40\u00d2000, null, null, null, 0);
    }

    public yb(int n2, Object object) {
        this(n2, object, null, null, null, 0);
    }

    public yb(int n2, Object object, Class clazz, String string, String string2, int n3) {
        super(object, clazz, string, string2, (n3 & 1) == 1);
        this.oO\u00d2000 = n2;
    }

    @Override
    public int \u00f5\u00d8O000() {
        return this.oO\u00d2000;
    }

    protected k \u00f8\u00d8O000() {
        return (k)super.o\u00d6O000();
    }

    @Override
    protected db nulldo() {
        return z.o00000(this);
    }

    @Override
    public boolean \u00d8\u00d8O000() {
        return this.\u00f8\u00d8O000().\u00d8\u00d8O000();
    }

    @Override
    public boolean \u00f4\u00d8O000() {
        return this.\u00f8\u00d8O000().\u00f4\u00d8O000();
    }

    @Override
    public boolean \u00d5\u00d8O000() {
        return this.\u00f8\u00d8O000().\u00d5\u00d8O000();
    }

    @Override
    public boolean returnwhile() {
        return this.\u00f8\u00d8O000().returnwhile();
    }

    @Override
    public boolean \u00f4\u00d5O000() {
        return this.\u00f8\u00d8O000().\u00f4\u00d5O000();
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof yb) {
            object = (yb)object;
            return this.\u00f5\u00d5O000().equals(((x)object).\u00f5\u00d5O000()) && this.\u00d5\u00d6O000().equals(((x)object).\u00d5\u00d6O000()) && fc.o00000(this.\u00d4\u00d6O000(), ((x)object).\u00d4\u00d6O000()) && fc.o00000((Object)this.\u00d3\u00d6O000(), (Object)((x)object).\u00d3\u00d6O000());
        }
        if (object instanceof k) {
            return object.equals(this.fordo());
        }
        return false;
    }

    public int hashCode() {
        return ((this.\u00d3\u00d6O000() == null ? 0 : this.\u00d3\u00d6O000().hashCode() * 31) + this.\u00f5\u00d5O000().hashCode()) * 31 + this.\u00d5\u00d6O000().hashCode();
    }

    public String toString() {
        db db2 = this.fordo();
        if (db2 != this) {
            return db2.toString();
        }
        if ("<init>".equals(this.\u00f5\u00d5O000())) {
            return "constructor (Kotlin reflection is not available)";
        }
        return "function " + this.\u00f5\u00d5O000() + " (Kotlin reflection is not available)";
    }
}


/*
 * Decompiled with CFR 0.152.
 */
package b.o.d;

import b.o.d.d;
import b.o.d.x$_b;
import b.o.d.z;
import b.o.d.zc;
import b.o.i;
import b.t.b;
import b.t.db;
import b.t.j;
import b.t.u;
import java.io.Serializable;
import java.lang.reflect.GenericDeclaration;
import java.util.List;
import java.util.Map;

public abstract class x
implements Serializable,
d,
db {
    private transient db O0\u00d2000;
    protected final Object newnullsuper;
    private final Class privatevoidsuper;
    private final String o0\u00d2000;
    private final String \u00f8\u00f8o000;
    private final boolean \u00d30\u00d2000;
    public static final Object \u00d40\u00d2000 = x$_b.o00000();

    public x() {
        this(\u00d40\u00d2000);
    }

    protected x(Object object) {
        this(object, null, null, null, false);
    }

    protected x(Object object, Class clazz, String string, String string2, boolean bl) {
        this.newnullsuper = object;
        this.privatevoidsuper = clazz;
        this.o0\u00d2000 = string;
        this.\u00f8\u00f8o000 = string2;
        this.\u00d30\u00d2000 = bl;
    }

    protected abstract db nulldo();

    public Object \u00d4\u00d6O000() {
        return this.newnullsuper;
    }

    public db fordo() {
        db db2 = this.O0\u00d2000;
        if (db2 == null) {
            this.O0\u00d2000 = db2 = this.nulldo();
        }
        return db2;
    }

    protected db o\u00d6O000() {
        db db2 = this.fordo();
        if (db2 == this) {
            throw new i();
        }
        return db2;
    }

    public b \u00d3\u00d6O000() {
        if (this.privatevoidsuper == null) {
            return null;
        }
        if (this.\u00d30\u00d2000) {
            return z.o00000(this.privatevoidsuper);
        }
        return z.\u00d200000(this.privatevoidsuper);
    }

    @Override
    public String \u00f5\u00d5O000() {
        return this.o0\u00d2000;
    }

    public String \u00d5\u00d6O000() {
        return this.\u00f8\u00f8o000;
    }

    @Override
    public GenericDeclaration \u00d5\u00f50000() {
        return zc.o00000(this.\u00d3\u00d6O000(), this.\u00d5\u00d6O000());
    }

    @Override
    public List \u00d8\u00d5O000() {
        return this.o\u00d6O000().\u00d8\u00d5O000();
    }

    @Override
    public u \u00d5\u00d5O000() {
        return this.o\u00d6O000().\u00d5\u00d5O000();
    }

    @Override
    public List \u00d8\u00f50000() {
        return this.o\u00d6O000().\u00d8\u00f50000();
    }

    @Override
    public List O\u00d4O000() {
        return this.o\u00d6O000().O\u00d4O000();
    }

    @Override
    public Object o00000(Object ... objectArray) {
        return this.o\u00d6O000().o00000(objectArray);
    }

    @Override
    public Object o00000(Map map) {
        return this.o\u00d6O000().o00000(map);
    }

    @Override
    public j \u00f8\u00d5O000() {
        return this.o\u00d6O000().\u00f8\u00d5O000();
    }

    @Override
    public boolean O\u00d6O000() {
        return this.o\u00d6O000().O\u00d6O000();
    }

    @Override
    public boolean thisdo() {
        return this.o\u00d6O000().thisdo();
    }

    @Override
    public boolean Stringdo() {
        return this.o\u00d6O000().Stringdo();
    }

    @Override
    public boolean \u00f4\u00d5O000() {
        return this.o\u00d6O000().\u00f4\u00d5O000();
    }
}


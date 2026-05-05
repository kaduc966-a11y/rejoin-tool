/*
 * Decompiled with CFR 0.152.
 */
package b.o.d;

import b.o.d.fc;
import b.o.d.x;
import b.t.db;
import b.t.m;

public abstract class ob
extends x
implements m {
    private final boolean \u00d3O\u00d3000;

    public ob() {
        this.\u00d3O\u00d3000 = false;
    }

    public ob(Object object) {
        super(object);
        this.\u00d3O\u00d3000 = false;
    }

    public ob(Object object, Class clazz, String string, String string2, int n2) {
        super(object, clazz, string, string2, (n2 & 1) == 1);
        this.\u00d3O\u00d3000 = (n2 & 2) == 2;
    }

    protected m \u00d5\u00f8O000() {
        if (this.\u00d3O\u00d3000) {
            throw new UnsupportedOperationException("Kotlin reflection is not yet supported for synthetic Java properties. Please follow/upvote https://youtrack.jetbrains.com/issue/KT-55980");
        }
        return (m)super.o\u00d6O000();
    }

    @Override
    public db fordo() {
        if (this.\u00d3O\u00d3000) {
            return this;
        }
        return super.fordo();
    }

    @Override
    public boolean \u00d8\u00d6O000() {
        return this.\u00d5\u00f8O000().\u00d8\u00d6O000();
    }

    @Override
    public boolean \u00f5\u00d6O000() {
        return this.\u00d5\u00f8O000().\u00f5\u00d6O000();
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof ob) {
            object = (ob)object;
            return this.\u00d3\u00d6O000().equals(((x)object).\u00d3\u00d6O000()) && this.\u00f5\u00d5O000().equals(((x)object).\u00f5\u00d5O000()) && this.\u00d5\u00d6O000().equals(((x)object).\u00d5\u00d6O000()) && fc.o00000(this.\u00d4\u00d6O000(), ((x)object).\u00d4\u00d6O000());
        }
        if (object instanceof m) {
            return object.equals(((x)this).fordo());
        }
        return false;
    }

    public int hashCode() {
        return (this.\u00d3\u00d6O000().hashCode() * 31 + this.\u00f5\u00d5O000().hashCode()) * 31 + this.\u00d5\u00d6O000().hashCode();
    }

    public String toString() {
        db db2 = ((x)this).fordo();
        if (db2 != this) {
            return db2.toString();
        }
        return "property " + this.\u00f5\u00d5O000() + " (Kotlin reflection is not available)";
    }
}


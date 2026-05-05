/*
 * Decompiled with CFR 0.152.
 */
package b.s.d;

import b.o.d.c.c$_b;
import b.o.d.fc;
import b.s.d.i;
import java.util.ConcurrentModificationException;
import java.util.Map;

public final class i$_c
implements Map.Entry,
c$_b {
    private final i \u00d3o\u00f5000;
    private final int oo\u00f5000;
    private final int newprivateString;

    public i$_c(i i2, int n2) {
        this.\u00d3o\u00f5000 = i2;
        this.oo\u00f5000 = n2;
        this.newprivateString = i.\u00d400000(this.\u00d3o\u00f5000);
    }

    public final Object getKey() {
        this.\u00d4\u00f8\u00d2000();
        return i.o00000(this.\u00d3o\u00f5000)[this.oo\u00f5000];
    }

    public final Object getValue() {
        this.\u00d4\u00f8\u00d2000();
        return i.\u00d500000(this.\u00d3o\u00f5000)[this.oo\u00f5000];
    }

    public final Object setValue(Object object) {
        this.\u00d4\u00f8\u00d2000();
        this.\u00d3o\u00f5000.\u00d40\u00d3000();
        Object[] objectArray = i.new(this.\u00d3o\u00f5000);
        Object object2 = objectArray[this.oo\u00f5000];
        objectArray[this.oo\u00f5000] = object;
        return object2;
    }

    @Override
    public final boolean equals(Object object) {
        return object instanceof Map.Entry && fc.o00000(((Map.Entry)object).getKey(), this.getKey()) && fc.o00000(((Map.Entry)object).getValue(), this.getValue());
    }

    @Override
    public final int hashCode() {
        Object object = this.getKey();
        Object object2 = this.getValue();
        return (object != null ? object.hashCode() : 0) ^ (object2 != null ? object2.hashCode() : 0);
    }

    public final String toString() {
        return "" + this.getKey() + '=' + this.getValue();
    }

    private final void \u00d4\u00f8\u00d2000() {
        if (i.\u00d400000(this.\u00d3o\u00f5000) != this.newprivateString) {
            throw new ConcurrentModificationException("The backing map has been modified after this entry was obtained.");
        }
    }
}


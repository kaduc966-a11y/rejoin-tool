/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.m;

import b.o.d.fc;
import b.o.d.rb;
import b.o.d.w;
import b.s.tb;
import b.s.ub;
import b.s.z;
import b.t.c.b.b.m.c$_b;
import b.t.c.b.b.m.c$_c;
import b.t.c.b.b.m.c$_d;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public final class c
extends tb {
    public static final c$_d \u00d8\u00d3\u00f5000 = new c$_d(null);
    private Object forinterfaceString;
    private int \u00d5\u00d3\u00f5000;

    private c() {
    }

    @Override
    public final int privateinterfacesuper() {
        return this.\u00d5\u00d3\u00f5000;
    }

    public final void \u00f8\u00d60000(int n2) {
        this.\u00d5\u00d3\u00f5000 = n2;
    }

    @Override
    public final Iterator iterator() {
        if (this.size() == 0) {
            return Collections.emptySet().iterator();
        }
        if (this.size() == 1) {
            return new c$_c(this.forinterfaceString);
        }
        if (this.size() < 5) {
            return new c$_b((Object[])this.forinterfaceString);
        }
        return rb.\u00f600000(this.forinterfaceString).iterator();
    }

    @Override
    public final boolean add(Object object) {
        Object object2;
        if (this.size() == 0) {
            this.forinterfaceString = object;
        } else if (this.size() == 1) {
            if (fc.o00000(this.forinterfaceString, object)) {
                return false;
            }
            Object[] objectArray = new Object[2];
            object2 = objectArray;
            objectArray[0] = this.forinterfaceString;
            object2[1] = object;
            this.forinterfaceString = object2;
        } else if (this.size() < 5) {
            Object object3;
            c c2;
            object2 = (Object[])this.forinterfaceString;
            if (z.\u00d300000(object2, object)) {
                return false;
            }
            c c3 = this;
            if (c3.size() == 4) {
                object2 = ub.class(Arrays.copyOf(object2, ((Object[])object2).length));
                LinkedHashSet linkedHashSet = object2;
                c c4 = c3;
                linkedHashSet.add(object);
                c2 = c4;
                object3 = object2;
            } else {
                object2 = Arrays.copyOf(object2, this.size() + 1);
                Object[] objectArray = object2;
                c c5 = c3;
                objectArray[objectArray.length - 1] = object;
                c2 = c5;
                object3 = object2;
            }
            c2.forinterfaceString = object3;
        } else if (!rb.\u00f600000(this.forinterfaceString).add(object)) {
            return false;
        }
        int n2 = this.size();
        this.\u00f8\u00d60000(n2 + 1);
        return true;
    }

    @Override
    public final void clear() {
        this.forinterfaceString = null;
        this.\u00f8\u00d60000(0);
    }

    @Override
    public final boolean contains(Object object) {
        if (this.size() == 0) {
            return false;
        }
        if (this.size() == 1) {
            return fc.o00000(this.forinterfaceString, object);
        }
        if (this.size() < 5) {
            return z.\u00d300000((Object[])this.forinterfaceString, object);
        }
        return ((Set)this.forinterfaceString).contains(object);
    }

    public static final c Oo\u00d3000() {
        return \u00d8\u00d3\u00f5000.o00000();
    }

    public /* synthetic */ c(w w2) {
        this();
    }
}


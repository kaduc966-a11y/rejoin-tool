/*
 * Decompiled with CFR 0.152.
 */
package b.j;

import b.j.d;
import b.t.m;

public abstract class f
implements d {
    private Object o00000;

    public f(Object object) {
        this.o00000 = object;
    }

    protected boolean o00000(m m2, Object object, Object object2) {
        return true;
    }

    protected void \u00d200000(m m2, Object object, Object object2) {
    }

    @Override
    public Object o00000(Object object, m m2) {
        return this.o00000;
    }

    @Override
    public void o00000(Object object, m m2, Object object2) {
        object = this.o00000;
        if (!this.o00000(m2, object, object2)) {
            return;
        }
        this.o00000 = object2;
        this.\u00d200000(m2, object, object2);
    }

    public String toString() {
        return "ObservableProperty(value=" + this.o00000 + ')';
    }
}


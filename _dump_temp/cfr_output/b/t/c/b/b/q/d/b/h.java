/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.q.d.b;

import b.t.c.b.b.d.d;
import b.t.c.b.b.d.f;
import b.t.c.b.b.n.c.b.g;
import b.t.c.b.b.q.d.b.e;
import b.t.c.b.b.q.d.b.z;

public final class h
extends z
implements g {
    private final Enum \u00d800000;

    public h(f f2, Enum enum_) {
        super(f2, null);
        this.\u00d800000 = enum_;
    }

    @Override
    public final d \u00d300000() {
        Class<?> clazz = this.\u00d800000.getClass();
        return e.\u00d200000(clazz.isEnum() ? clazz : clazz.getEnclosingClass());
    }

    @Override
    public final f \u00d200000() {
        return f.\u00d300000(this.\u00d800000.name());
    }
}


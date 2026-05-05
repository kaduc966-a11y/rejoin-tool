/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.c.c.b;

import b.ce;
import b.qb;
import b.t.c.b.b.c.ab;
import b.t.c.b.b.c.b.k;
import b.t.c.b.b.c.c.b;
import b.t.c.b.b.c.c.b$_b;
import b.t.c.b.b.c.c.b$_c;
import b.t.c.b.b.c.c.b$_d;
import b.t.c.b.b.c.c.b$_e;
import b.t.c.b.b.c.c.b$_f;
import b.t.c.b.b.c.c.b$_g;
import b.t.c.b.b.c.c.b.i;
import b.t.c.b.b.c.c.f;
import b.t.c.b.b.c.p;
import b.t.c.b.b.c.t;
import b.t.c.b.b.c.y;
import b.t.c.b.b.l.b$_i;
import b.t.c.b.b.l.b$_z;
import b.t.c.b.b.l.d.c;
import b.t.c.b.b.l.d.e;

public final class j {
    public static final j o00000 = new j();

    private j() {
    }

    private final boolean \u00d300000(ce ce2) {
        return new f(ce2.void()).o00000(new f(1, 4, 0)) < 0;
    }

    public final p \u00d200000(ce ce2) {
        qb qb2 = b.t.c.b.b.l.c.b.e.\u00d300000(i.super(ce2), ce2.\u00d400000());
        b.t.c.b.b.l.c.b.j j2 = (b.t.c.b.b.l.c.b.j)qb2.\u00d400000();
        return k.o00000((b.t.c.b.b.l.b$_d)qb2.\u00d300000(), (e)j2, this.\u00d300000(ce2), null, 4, null);
    }

    public final y o00000(ce ce2) {
        qb qb2 = b.t.c.b.b.l.c.b.e.super(i.super(ce2), ce2.\u00d400000());
        b.t.c.b.b.l.c.b.j j2 = (b.t.c.b.b.l.c.b.j)qb2.\u00d400000();
        return k.o00000((b$_i)qb2.\u00d300000(), (e)j2, this.\u00d300000(ce2), null, 4, null);
    }

    public final t String(ce ce2) {
        String[] stringArray = ce2.\u00d200000();
        Object object = !(((Object[])stringArray).length == 0) ? stringArray : null;
        if (object == null || (object = b.t.c.b.b.l.c.b.e.\u00d200000((String[])object, ce2.\u00d400000())) == null) {
            return null;
        }
        stringArray = object;
        b.t.c.b.b.l.c.b.j j2 = (b.t.c.b.b.l.c.b.j)((qb)object).\u00d400000();
        return k.o00000((b$_z)stringArray.\u00d300000(), j2, this.\u00d300000(ce2));
    }

    public final b o00000(ce object, boolean bl) {
        this.\u00d200000((ce)object, bl);
        try {
            b b2;
            switch (object.Object()) {
                case 1: {
                    b2 = new b$_c((ce)object, bl);
                    break;
                }
                case 2: {
                    b2 = new b$_d((ce)object, bl);
                    break;
                }
                case 3: {
                    b2 = new b$_f((ce)object, bl);
                    break;
                }
                case 4: {
                    b2 = new b$_e((ce)object, bl);
                    break;
                }
                case 5: {
                    b2 = new b$_b((ce)object, bl);
                    break;
                }
                default: {
                    b2 = new b$_g((ce)object, bl);
                }
            }
            object = b2;
        }
        catch (Throwable throwable) {
            Throwable throwable2 = throwable;
            object = throwable;
            throw throwable instanceof IllegalArgumentException ? throwable2 : (object instanceof VirtualMachineError || object instanceof ThreadDeath ? throwable2 : (Throwable)new ab("Exception occurred when reading Kotlin metadata", throwable2));
        }
        return object;
    }

    private final void \u00d200000(ce object, boolean bl) {
        if (object.void().length == 0) {
            throw new IllegalArgumentException("Provided Metadata instance does not have metadataVersion in it and therefore is malformed and cannot be read.");
        }
        object = new c(object.void(), (object.o00000() & 8) != 0);
        this.o00000((c)object, bl);
    }

    public final void o00000(c c2, boolean bl) {
        boolean bl2 = c2.\u00d200000(1, 1, 0);
        if (!(bl ? bl2 : c2.\u00d600000())) {
            String string = !bl2 ? "while minimum supported version is 1.1.0 (Kotlin 1.0)." : "while maximum supported version is " + (c2.\u00d800000() ? c.\u00f800000 : c.\u00f500000) + ". To support newer versions, update the kotlin-metadata-jvm library.";
            throw new IllegalArgumentException("Provided Metadata instance has version " + c2 + ", " + string);
        }
    }
}


/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b;

import b.pc;
import b.xd;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class zc {
    private static final boolean super;
    private static final boolean \u00d300000;
    private static final boolean \u00d200000;

    public static final boolean \u00d300000() {
        return super;
    }

    public static final boolean o00000() {
        return \u00d300000;
    }

    public static final boolean new() {
        return \u00d200000;
    }

    static {
        Object object;
        try {
            object = xd.String(System.getProperty("kotlin.reflect.jvm.useK1Implementation"));
        }
        catch (Throwable throwable) {
            object = xd.String(pc.o00000(throwable));
        }
        object = (String)(xd.\u00d800000(object) ? null : object);
        super = object != null ? Boolean.parseBoolean((String)object) : false;
        try {
            object = xd.String(System.getProperty("kotlin.reflect.jvm.newFakeOverridesImplementation"));
        }
        catch (Throwable throwable) {
            object = xd.String(pc.o00000(throwable));
        }
        object = (String)(xd.\u00d800000(object) ? null : object);
        \u00d300000 = object != null ? Boolean.parseBoolean((String)object) : false;
        try {
            object = xd.String(System.getProperty("kotlin.reflect.jvm.loadMetadataDirectly"));
        }
        catch (Throwable throwable) {
            object = xd.String(pc.o00000(throwable));
        }
        object = (String)(xd.\u00d800000(object) ? null : object);
        \u00d200000 = object != null ? Boolean.parseBoolean((String)object) : false;
    }
}


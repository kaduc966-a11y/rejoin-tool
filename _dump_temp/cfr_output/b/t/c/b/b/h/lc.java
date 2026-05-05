/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.h;

import b.t.c.b.b.h.e.b;
import b.t.c.b.b.h.hc;
import b.t.c.b.b.h.mb;
import b.t.c.b.b.h.rc;
import b.t.c.b.b.h.w;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class lc
extends mb {
    private final w String;
    private final rc \u00d500000;

    public lc(w w2, rc rc2) {
        if (w2 == null) {
            lc.super(0);
        }
        if (rc2 == null) {
            lc.super(1);
        }
        this.String = w2;
        this.\u00d500000 = rc2;
    }

    public lc(rc rc2) {
        if (rc2 == null) {
            lc.super(2);
        }
        this(w.\u00d400000, rc2);
    }

    @Override
    public w \u00d200000() {
        w w2 = this.String;
        if (w2 == null) {
            lc.super(4);
        }
        return w2;
    }

    @Override
    public rc \u00d300000() {
        rc rc2 = this.\u00d500000;
        if (rc2 == null) {
            lc.super(5);
        }
        return rc2;
    }

    @Override
    public boolean super() {
        return false;
    }

    @Override
    public hc super(b b2) {
        if (b2 == null) {
            lc.super(6);
        }
        return new lc(this.String, b2.\u00d200000(this.\u00d500000));
    }

    private static /* synthetic */ void super(int n2) {
        RuntimeException runtimeException;
        Object[] objectArray;
        Object[] objectArray2;
        int n3;
        String string;
        switch (n2) {
            default: {
                string = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
            }
            case 4: 
            case 5: {
                string = "@NotNull method %s.%s must not return null";
            }
        }
        switch (n2) {
            default: {
                n3 = 3;
                break;
            }
            case 4: 
            case 5: {
                n3 = 2;
            }
        }
        Object[] objectArray3 = new Object[n3];
        switch (n2) {
            default: {
                objectArray2 = objectArray3;
                objectArray3[0] = "projection";
                break;
            }
            case 1: 
            case 2: 
            case 3: {
                objectArray2 = objectArray3;
                objectArray3[0] = "type";
                break;
            }
            case 4: 
            case 5: {
                objectArray2 = objectArray3;
                objectArray3[0] = "kotlin/reflect/jvm/internal/impl/types/TypeProjectionImpl";
                break;
            }
            case 6: {
                objectArray2 = objectArray3;
                objectArray3[0] = "kotlinTypeRefiner";
            }
        }
        switch (n2) {
            default: {
                objectArray = objectArray2;
                objectArray2[1] = "kotlin/reflect/jvm/internal/impl/types/TypeProjectionImpl";
                break;
            }
            case 4: {
                objectArray = objectArray2;
                objectArray2[1] = "getProjectionKind";
                break;
            }
            case 5: {
                objectArray = objectArray2;
                objectArray2[1] = "getType";
            }
        }
        switch (n2) {
            default: {
                objectArray = objectArray;
                objectArray[2] = "<init>";
                break;
            }
            case 3: {
                objectArray = objectArray;
                objectArray[2] = "replaceType";
                break;
            }
            case 4: 
            case 5: {
                break;
            }
            case 6: {
                objectArray = objectArray;
                objectArray[2] = "refine";
            }
        }
        String string2 = java.lang.String.format(string, objectArray);
        switch (n2) {
            default: {
                runtimeException = new IllegalArgumentException(string2);
                break;
            }
            case 4: 
            case 5: {
                runtimeException = new IllegalStateException(string2);
            }
        }
        throw runtimeException;
    }
}


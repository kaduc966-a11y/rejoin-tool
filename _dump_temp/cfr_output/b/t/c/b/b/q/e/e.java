/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.q.e;

import b.t.c.b.b.d.k;
import b.t.c.b.b.h.rc;
import b.t.c.b.b.k.b;
import b.t.c.b.b.q.e.l;
import b.t.c.b.b.q.e.l$_b;
import b.t.c.b.b.q.g;
import java.util.Map;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class e
implements l {
    private final rc \u00d400000;
    private final Map \u00d200000;
    private final g \u00d300000;

    public e(rc rc2, Map map, g g2) {
        if (rc2 == null) {
            e.super(0);
        }
        if (map == null) {
            e.super(1);
        }
        if (g2 == null) {
            e.super(2);
        }
        this.\u00d400000 = rc2;
        this.\u00d200000 = map;
        this.\u00d300000 = g2;
    }

    @Override
    public rc \u00d400000() {
        rc rc2 = this.\u00d400000;
        if (rc2 == null) {
            e.super(3);
        }
        return rc2;
    }

    @Override
    public k \u00d300000() {
        return l$_b.super(this);
    }

    @Override
    public Map super() {
        Map map = this.\u00d200000;
        if (map == null) {
            e.super(4);
        }
        return map;
    }

    @Override
    public g \u00d200000() {
        g g2 = this.\u00d300000;
        if (g2 == null) {
            e.super(5);
        }
        return g2;
    }

    public String toString() {
        return b.\u00f400000.super(this, null);
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
            case 3: 
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
            case 3: 
            case 4: 
            case 5: {
                n3 = 2;
            }
        }
        Object[] objectArray3 = new Object[n3];
        switch (n2) {
            default: {
                objectArray2 = objectArray3;
                objectArray3[0] = "annotationType";
                break;
            }
            case 1: {
                objectArray2 = objectArray3;
                objectArray3[0] = "valueArguments";
                break;
            }
            case 2: {
                objectArray2 = objectArray3;
                objectArray3[0] = "source";
                break;
            }
            case 3: 
            case 4: 
            case 5: {
                objectArray2 = objectArray3;
                objectArray3[0] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotationDescriptorImpl";
            }
        }
        switch (n2) {
            default: {
                objectArray = objectArray2;
                objectArray2[1] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotationDescriptorImpl";
                break;
            }
            case 3: {
                objectArray = objectArray2;
                objectArray2[1] = "getType";
                break;
            }
            case 4: {
                objectArray = objectArray2;
                objectArray2[1] = "getAllValueArguments";
                break;
            }
            case 5: {
                objectArray = objectArray2;
                objectArray2[1] = "getSource";
            }
        }
        switch (n2) {
            default: {
                objectArray = objectArray;
                objectArray[2] = "<init>";
            }
            case 3: 
            case 4: 
            case 5: 
        }
        String string2 = String.format(string, objectArray);
        switch (n2) {
            default: {
                runtimeException = new IllegalArgumentException(string2);
                break;
            }
            case 3: 
            case 4: 
            case 5: {
                runtimeException = new IllegalStateException(string2);
            }
        }
        throw runtimeException;
    }
}


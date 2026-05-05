/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.n.b.b;

import b.t.c.b.b.d.d;
import b.t.c.b.b.d.k;
import b.t.c.b.b.n.b.b.b$_b;
import b.t.c.b.b.n.b.b.b$_c;
import b.t.c.b.b.n.b.b.b$_e;
import b.t.c.b.b.n.b.b.c;
import b.t.c.b.b.n.b.b.c$_b;
import b.t.c.b.b.n.b.j$_b;
import b.t.c.b.b.n.b.j$_d;
import b.t.c.b.b.n.c.ab;
import b.t.c.b.b.q.g;
import java.security.AccessControlException;
import java.util.HashMap;
import java.util.Map;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class b
implements j$_d {
    private static boolean \u00d4O0000;
    private static final Map \u00f400000;
    private int[] \u00f800000 = null;
    private String \u00d2O0000 = null;
    private int interface = 0;
    private String \u00d800000 = null;
    private String[] int = null;
    private String[] \u00d3O0000 = null;
    private String[] OO0000 = null;
    private c$_b do = null;
    private String[] \u00f600000 = null;

    public c \u00d400000() {
        return this.super(b.t.c.b.b.l.d.c.\u00f800000);
    }

    public c super(b.t.c.b.b.l.d.c object) {
        if (this.do == null || this.\u00f800000 == null) {
            return null;
        }
        b.t.c.b.b.l.d.c c2 = new b.t.c.b.b.l.d.c(this.\u00f800000, (this.interface & 8) != 0);
        if (!c2.\u00d200000((b.t.c.b.b.l.d.c)object)) {
            this.OO0000 = this.int;
            this.int = null;
        } else if (this.\u00d300000() && this.int == null) {
            return null;
        }
        object = null;
        if (this.\u00f600000 != null) {
            object = b.t.c.b.b.l.c.b.c.\u00d300000(this.\u00f600000);
        }
        return new c(this.do, c2, this.int, this.OO0000, this.\u00d3O0000, this.\u00d2O0000, this.interface, this.\u00d800000, (byte[])object);
    }

    private boolean \u00d300000() {
        return this.do == c$_b.\u00f600000 || this.do == c$_b.\u00d600000 || this.do == c$_b.\u00d200000;
    }

    @Override
    public j$_b super(d object, g object2) {
        if (object == null) {
            b.super(0);
        }
        if (object2 == null) {
            b.super(1);
        }
        if (((k)(object2 = object.\u00f400000())).equals(ab.String)) {
            return new b$_e(this, null);
        }
        if (((k)object2).equals(ab.\u00d300000)) {
            return new b$_b(this, null);
        }
        if (\u00d4O0000) {
            return null;
        }
        if (this.do != null) {
            return null;
        }
        if ((object = (c$_b)((Object)\u00f400000.get(object))) != null) {
            this.do = object;
            return new b$_c(this, null);
        }
        return null;
    }

    @Override
    public void super() {
    }

    static /* synthetic */ c$_b super(b b2, c$_b c$_b) {
        b2.do = c$_b;
        return b2.do;
    }

    static /* synthetic */ int[] super(b b2, int[] nArray) {
        b2.\u00f800000 = nArray;
        return nArray;
    }

    static /* synthetic */ String super(b b2, String string) {
        b2.\u00d2O0000 = string;
        return b2.\u00d2O0000;
    }

    static /* synthetic */ int super(b b2, int n2) {
        b2.interface = n2;
        return b2.interface;
    }

    static /* synthetic */ String \u00d200000(b b2, String string) {
        b2.\u00d800000 = string;
        return b2.\u00d800000;
    }

    static /* synthetic */ String[] \u00d300000(b b2, String[] stringArray) {
        b2.int = stringArray;
        return stringArray;
    }

    static /* synthetic */ String[] super(b b2, String[] stringArray) {
        b2.\u00d3O0000 = stringArray;
        return stringArray;
    }

    static /* synthetic */ String[] \u00d200000(b b2, String[] stringArray) {
        b2.\u00f600000 = stringArray;
        return stringArray;
    }

    static {
        try {
            \u00d4O0000 = "true".equals(System.getProperty("kotlin.ignore.old.metadata"));
        }
        catch (AccessControlException accessControlException) {
            \u00d4O0000 = false;
        }
        \u00f400000 = new HashMap<d, c$_b>();
        \u00f400000.put(d.o00000(new k("kotlin.jvm.internal.KotlinClass")), c$_b.\u00f600000);
        \u00f400000.put(d.o00000(new k("kotlin.jvm.internal.KotlinFileFacade")), c$_b.\u00d600000);
        \u00f400000.put(d.o00000(new k("kotlin.jvm.internal.KotlinMultifileClass")), c$_b.float);
        \u00f400000.put(d.o00000(new k("kotlin.jvm.internal.KotlinMultifileClassPart")), c$_b.\u00d200000);
        \u00f400000.put(d.o00000(new k("kotlin.jvm.internal.KotlinSyntheticClass")), c$_b.\u00f400000);
    }

    private static /* synthetic */ void super(int n2) {
        Object[] objectArray;
        Object[] objectArray2 = new Object[3];
        switch (n2) {
            default: {
                objectArray = objectArray2;
                objectArray2[0] = "classId";
                break;
            }
            case 1: {
                objectArray = objectArray2;
                objectArray2[0] = "source";
            }
        }
        objectArray[1] = "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor";
        objectArray[2] = "visitAnnotation";
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objectArray));
    }
}


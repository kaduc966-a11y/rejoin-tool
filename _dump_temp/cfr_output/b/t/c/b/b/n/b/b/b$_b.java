/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.n.b.b;

import b.t.c.b.b.d.d;
import b.t.c.b.b.d.f;
import b.t.c.b.b.n.b.b.b;
import b.t.c.b.b.n.b.b.b$1;
import b.t.c.b.b.n.b.b.b$_b$1;
import b.t.c.b.b.n.b.j$_b;
import b.t.c.b.b.n.b.j$_f;
import b.t.c.b.b.o.c.o;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
class b$_b
implements j$_b {
    final /* synthetic */ b thissuper;

    private b$_b(b b2) {
        this.thissuper = b2;
    }

    @Override
    public void super(f f2, Object object) {
    }

    @Override
    public void super(f f2, o o2) {
        if (o2 == null) {
            b$_b.\u00d300000(0);
        }
    }

    @Override
    public j$_f super(f object) {
        Object object2 = object = object != null ? ((f)object).\u00d400000() : null;
        if ("b".equals(object)) {
            return this.\u00d600000();
        }
        return null;
    }

    private j$_f \u00d600000() {
        return new b$_b$1(this);
    }

    @Override
    public void super(f f2, d d2, f f3) {
        if (d2 == null) {
            b$_b.\u00d300000(1);
        }
        if (f3 == null) {
            b$_b.\u00d300000(2);
        }
    }

    @Override
    public j$_b super(f f2, d d2) {
        if (d2 == null) {
            b$_b.\u00d300000(3);
        }
        return null;
    }

    @Override
    public void super() {
    }

    /* synthetic */ b$_b(b b2, b$1 b$1) {
        this(b2);
    }

    private static /* synthetic */ void \u00d300000(int n2) {
        Object[] objectArray;
        Object[] objectArray2;
        Object[] objectArray3 = new Object[3];
        switch (n2) {
            default: {
                objectArray2 = objectArray3;
                objectArray3[0] = "classLiteralValue";
                break;
            }
            case 1: {
                objectArray2 = objectArray3;
                objectArray3[0] = "enumClassId";
                break;
            }
            case 2: {
                objectArray2 = objectArray3;
                objectArray3[0] = "enumEntryName";
                break;
            }
            case 3: {
                objectArray2 = objectArray3;
                objectArray3[0] = "classId";
            }
        }
        objectArray2[1] = "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinSerializedIrArgumentVisitor";
        switch (n2) {
            default: {
                objectArray = objectArray2;
                objectArray2[2] = "visitClassLiteral";
                break;
            }
            case 1: 
            case 2: {
                objectArray = objectArray2;
                objectArray2[2] = "visitEnum";
                break;
            }
            case 3: {
                objectArray = objectArray2;
                objectArray2[2] = "visitAnnotation";
            }
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objectArray));
    }
}


/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.n.b.b;

import b.t.c.b.b.d.d;
import b.t.c.b.b.d.f;
import b.t.c.b.b.n.b.b.b;
import b.t.c.b.b.n.b.b.b$1;
import b.t.c.b.b.n.b.b.b$_c$1;
import b.t.c.b.b.n.b.b.b$_c$2;
import b.t.c.b.b.n.b.j$_b;
import b.t.c.b.b.n.b.j$_f;
import b.t.c.b.b.o.c.o;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
class b$_c
implements j$_b {
    final /* synthetic */ b o00000;

    private b$_c(b b2) {
        this.o00000 = b2;
    }

    @Override
    public void super(f object, Object object2) {
        if (object == null) {
            return;
        }
        if ("version".equals(object = ((f)object).\u00d400000())) {
            if (object2 instanceof int[]) {
                b.super(this.o00000, (int[])object2);
                return;
            }
        } else if ("multifileClassName".equals(object)) {
            b.super(this.o00000, object2 instanceof String ? (String)object2 : null);
        }
    }

    @Override
    public void super(f f2, o o2) {
        if (o2 == null) {
            b$_c.super(0);
        }
    }

    @Override
    public j$_f super(f object) {
        Object object2 = object = object != null ? ((f)object).\u00d400000() : null;
        if ("data".equals(object) || "filePartClassNames".equals(object)) {
            return this.\u00d300000();
        }
        if ("strings".equals(object)) {
            return this.\u00d200000();
        }
        return null;
    }

    private j$_f \u00d300000() {
        return new b$_c$1(this);
    }

    private j$_f \u00d200000() {
        return new b$_c$2(this);
    }

    @Override
    public void super(f f2, d d2, f f3) {
        if (d2 == null) {
            b$_c.super(1);
        }
        if (f3 == null) {
            b$_c.super(2);
        }
    }

    @Override
    public j$_b super(f f2, d d2) {
        if (d2 == null) {
            b$_c.super(3);
        }
        return null;
    }

    @Override
    public void super() {
    }

    /* synthetic */ b$_c(b b2, b$1 b$1) {
        this(b2);
    }

    private static /* synthetic */ void super(int n2) {
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
        objectArray2[1] = "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$OldDeprecatedAnnotationArgumentVisitor";
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


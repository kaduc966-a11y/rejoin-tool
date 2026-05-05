/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.n.b.b;

import b.t.c.b.b.d.d;
import b.t.c.b.b.d.f;
import b.t.c.b.b.n.b.j$_b;
import b.t.c.b.b.n.b.j$_f;
import b.t.c.b.b.o.c.o;
import java.util.ArrayList;
import java.util.List;

abstract class b$_d
implements j$_f {
    private final List \u00d500000 = new ArrayList();

    @Override
    public void o00000(Object object) {
        if (object instanceof String) {
            this.\u00d500000.add((String)object);
        }
    }

    @Override
    public void o00000(d d2, f f2) {
        if (d2 == null) {
            b$_d.o00000(0);
        }
        if (f2 == null) {
            b$_d.o00000(1);
        }
    }

    @Override
    public void o00000(o o2) {
        if (o2 == null) {
            b$_d.o00000(2);
        }
    }

    @Override
    public j$_b o00000(d d2) {
        if (d2 == null) {
            b$_d.o00000(3);
        }
        return null;
    }

    @Override
    public void o00000() {
        b$_d b$_d = this;
        b$_d.o00000(b$_d.\u00d500000.toArray(new String[0]));
    }

    protected abstract void o00000(String[] var1);

    private static /* synthetic */ void o00000(int n2) {
        Object[] objectArray;
        Object[] objectArray2;
        Object[] objectArray3 = new Object[3];
        switch (n2) {
            default: {
                objectArray2 = objectArray3;
                objectArray3[0] = "enumClassId";
                break;
            }
            case 1: {
                objectArray2 = objectArray3;
                objectArray3[0] = "enumEntryName";
                break;
            }
            case 2: {
                objectArray2 = objectArray3;
                objectArray3[0] = "classLiteralValue";
                break;
            }
            case 3: {
                objectArray2 = objectArray3;
                objectArray3[0] = "classId";
            }
        }
        objectArray2[1] = "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$CollectStringArrayAnnotationVisitor";
        switch (n2) {
            default: {
                objectArray = objectArray2;
                objectArray2[2] = "visitEnum";
                break;
            }
            case 2: {
                objectArray = objectArray2;
                objectArray2[2] = "visitClassLiteral";
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


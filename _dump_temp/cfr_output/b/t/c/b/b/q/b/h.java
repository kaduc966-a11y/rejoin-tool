/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.q.b;

import b.t.c.b.b.h.bc;
import b.t.c.b.b.h.e.b;
import b.t.c.b.b.i.l;
import b.t.c.b.b.o.e.f;
import b.t.c.b.b.o.e.f$_b;
import b.t.c.b.b.q.ab;
import b.t.c.b.b.q.b.mb;
import b.t.c.b.b.q.b.p;
import b.t.c.b.b.q.b.z;
import b.t.c.b.b.q.ec;
import b.t.c.b.b.q.g;
import b.t.c.b.b.q.ib;
import b.t.c.b.b.q.ic;
import b.t.c.b.b.q.o;
import b.t.c.b.b.q.s;
import b.t.c.b.b.q.sb;
import b.t.c.b.b.q.wb;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class h
extends z {
    private final ec \u00d50\u00d8000;
    private final boolean \u00f50\u00d8000;
    private ab \u00f40\u00d8000;
    private s nullpublicObject;
    private bc \u00d30\u00d8000;
    private List forpublicObject;
    private final Collection \u00d40\u00d8000;
    private final l \u00d80\u00d8000;

    public h(wb wb2, ec ec2, boolean bl, boolean bl2, b.t.c.b.b.d.f f2, g g2, l l2) {
        if (wb2 == null) {
            h.ifString(0);
        }
        if (ec2 == null) {
            h.ifString(1);
        }
        if (f2 == null) {
            h.ifString(2);
        }
        if (g2 == null) {
            h.ifString(3);
        }
        if (l2 == null) {
            h.ifString(4);
        }
        super(l2, wb2, f2, g2, bl2);
        this.\u00d40\u00d8000 = new ArrayList();
        this.\u00d80\u00d8000 = l2;
        assert (ec2 != ec.\u00d200000) : "Fix isCompanionObject()";
        this.\u00d50\u00d8000 = ec2;
        this.\u00f50\u00d8000 = bl;
    }

    @Override
    public ib forintsuper() {
        return null;
    }

    @Override
    public b.t.c.b.b.q.e.o \u00d4\u00f80000() {
        b.t.c.b.b.q.e.o o2 = b.t.c.b.b.q.e.o.\u00d8o\u00f6000.o00000();
        if (o2 == null) {
            h.ifString(5);
        }
        return o2;
    }

    public void o00000(ab ab2) {
        if (ab2 == null) {
            h.ifString(6);
        }
        assert (ab2 != ab.super) : "Implement getSealedSubclasses() for this class: " + this.getClass();
        this.\u00f40\u00d8000 = ab2;
    }

    @Override
    public ab \u00f40O000() {
        ab ab2 = this.\u00f40\u00d8000;
        if (ab2 == null) {
            h.ifString(7);
        }
        return ab2;
    }

    @Override
    public ec privateintsuper() {
        ec ec2 = this.\u00d50\u00d8000;
        if (ec2 == null) {
            h.ifString(8);
        }
        return ec2;
    }

    public void \u00d400000(s s2) {
        if (s2 == null) {
            h.ifString(9);
        }
        this.nullpublicObject = s2;
    }

    @Override
    public s \u00d50O000() {
        s s2 = this.nullpublicObject;
        if (s2 == null) {
            h.ifString(10);
        }
        return s2;
    }

    @Override
    public boolean \u00f4\u00d6o000() {
        return this.\u00f50\u00d8000;
    }

    @Override
    public boolean Oo\u00d2000() {
        return false;
    }

    @Override
    public boolean oo\u00d2000() {
        return false;
    }

    @Override
    public boolean \u00f8o\u00d2000() {
        return false;
    }

    @Override
    public boolean \u00d8o\u00d2000() {
        return false;
    }

    @Override
    public boolean \u00d5o\u00d2000() {
        return false;
    }

    @Override
    public boolean \u00d80O000() {
        return false;
    }

    @Override
    public boolean thisint() {
        return false;
    }

    @Override
    public bc \u00d3OO000() {
        bc bc2 = this.\u00d30\u00d8000;
        if (bc2 == null) {
            h.ifString(11);
        }
        return bc2;
    }

    public Set \u00d3\u00d4\u00d2000() {
        Set set = Collections.emptySet();
        if (set == null) {
            h.ifString(13);
        }
        return set;
    }

    @Override
    public sb nullintsuper() {
        return null;
    }

    public void oO0000(List list) {
        if (list == null) {
            h.ifString(14);
        }
        if (this.forpublicObject != null) {
            throw new IllegalStateException("Type parameters are already set for " + this.\u00d5\u00f80000());
        }
        this.forpublicObject = new ArrayList(list);
    }

    @Override
    public List \u00d8\u00d6o000() {
        List list = this.forpublicObject;
        if (list == null) {
            h.ifString(15);
        }
        return list;
    }

    public void nullfloatsuper() {
        assert (this.\u00d30\u00d8000 == null) : this.\u00d30\u00d8000;
        h h2 = this;
        this.\u00d30\u00d8000 = new b.t.c.b.b.h.g(h2, h2.forpublicObject, this.\u00d40\u00d8000, this.\u00d80\u00d8000);
        Iterator iterator = this.\u00d3\u00d4\u00d2000().iterator();
        while (iterator.hasNext()) {
            ((mb)((ic)iterator.next())).while(this.nullint());
        }
    }

    @Override
    public f \u00f400000(b b2) {
        if (b2 == null) {
            h.ifString(16);
        }
        f$_b f$_b = f$_b.\u00f6\u00d30000;
        if (f$_b == null) {
            h.ifString(17);
        }
        return f$_b;
    }

    @Override
    public f \u00d3\u00d2\u00d2000() {
        f$_b f$_b = f$_b.\u00f6\u00d30000;
        if (f$_b == null) {
            h.ifString(18);
        }
        return f$_b;
    }

    @Override
    public o O\u00d2\u00d2000() {
        return null;
    }

    public String toString() {
        return p.o00000(this);
    }

    private static /* synthetic */ void ifString(int n2) {
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
            case 5: 
            case 7: 
            case 8: 
            case 10: 
            case 11: 
            case 13: 
            case 15: 
            case 17: 
            case 18: 
            case 19: {
                string = "@NotNull method %s.%s must not return null";
            }
        }
        switch (n2) {
            default: {
                n3 = 3;
                break;
            }
            case 5: 
            case 7: 
            case 8: 
            case 10: 
            case 11: 
            case 13: 
            case 15: 
            case 17: 
            case 18: 
            case 19: {
                n3 = 2;
            }
        }
        Object[] objectArray3 = new Object[n3];
        switch (n2) {
            default: {
                objectArray2 = objectArray3;
                objectArray3[0] = "containingDeclaration";
                break;
            }
            case 1: {
                objectArray2 = objectArray3;
                objectArray3[0] = "kind";
                break;
            }
            case 2: {
                objectArray2 = objectArray3;
                objectArray3[0] = "name";
                break;
            }
            case 3: {
                objectArray2 = objectArray3;
                objectArray3[0] = "source";
                break;
            }
            case 4: {
                objectArray2 = objectArray3;
                objectArray3[0] = "storageManager";
                break;
            }
            case 5: 
            case 7: 
            case 8: 
            case 10: 
            case 11: 
            case 13: 
            case 15: 
            case 17: 
            case 18: 
            case 19: {
                objectArray2 = objectArray3;
                objectArray3[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/MutableClassDescriptor";
                break;
            }
            case 6: {
                objectArray2 = objectArray3;
                objectArray3[0] = "modality";
                break;
            }
            case 9: {
                objectArray2 = objectArray3;
                objectArray3[0] = "visibility";
                break;
            }
            case 12: {
                objectArray2 = objectArray3;
                objectArray3[0] = "supertype";
                break;
            }
            case 14: {
                objectArray2 = objectArray3;
                objectArray3[0] = "typeParameters";
                break;
            }
            case 16: {
                objectArray2 = objectArray3;
                objectArray3[0] = "kotlinTypeRefiner";
            }
        }
        switch (n2) {
            default: {
                objectArray = objectArray2;
                objectArray2[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/MutableClassDescriptor";
                break;
            }
            case 5: {
                objectArray = objectArray2;
                objectArray2[1] = "getAnnotations";
                break;
            }
            case 7: {
                objectArray = objectArray2;
                objectArray2[1] = "getModality";
                break;
            }
            case 8: {
                objectArray = objectArray2;
                objectArray2[1] = "getKind";
                break;
            }
            case 10: {
                objectArray = objectArray2;
                objectArray2[1] = "getVisibility";
                break;
            }
            case 11: {
                objectArray = objectArray2;
                objectArray2[1] = "getTypeConstructor";
                break;
            }
            case 13: {
                objectArray = objectArray2;
                objectArray2[1] = "getConstructors";
                break;
            }
            case 15: {
                objectArray = objectArray2;
                objectArray2[1] = "getDeclaredTypeParameters";
                break;
            }
            case 17: {
                objectArray = objectArray2;
                objectArray2[1] = "getUnsubstitutedMemberScope";
                break;
            }
            case 18: {
                objectArray = objectArray2;
                objectArray2[1] = "getStaticScope";
                break;
            }
            case 19: {
                objectArray = objectArray2;
                objectArray2[1] = "getSealedSubclasses";
            }
        }
        switch (n2) {
            default: {
                objectArray = objectArray;
                objectArray[2] = "<init>";
                break;
            }
            case 5: 
            case 7: 
            case 8: 
            case 10: 
            case 11: 
            case 13: 
            case 15: 
            case 17: 
            case 18: 
            case 19: {
                break;
            }
            case 6: {
                objectArray = objectArray;
                objectArray[2] = "setModality";
                break;
            }
            case 9: {
                objectArray = objectArray;
                objectArray[2] = "setVisibility";
                break;
            }
            case 12: {
                objectArray = objectArray;
                objectArray[2] = "addSupertype";
                break;
            }
            case 14: {
                objectArray = objectArray;
                objectArray[2] = "setTypeParameterDescriptors";
                break;
            }
            case 16: {
                objectArray = objectArray;
                objectArray[2] = "getUnsubstitutedMemberScope";
            }
        }
        String string2 = String.format(string, objectArray);
        switch (n2) {
            default: {
                runtimeException = new IllegalArgumentException(string2);
                break;
            }
            case 5: 
            case 7: 
            case 8: 
            case 10: 
            case 11: 
            case 13: 
            case 15: 
            case 17: 
            case 18: 
            case 19: {
                runtimeException = new IllegalStateException(string2);
            }
        }
        throw runtimeException;
    }
}


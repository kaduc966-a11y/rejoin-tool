/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.q.b;

import b.t.c.b.b.h.bc;
import b.t.c.b.b.h.dc;
import b.t.c.b.b.h.kc;
import b.t.c.b.b.h.nc;
import b.t.c.b.b.h.oc;
import b.t.c.b.b.h.rc;
import b.t.c.b.b.h.w;
import b.t.c.b.b.i.h;
import b.t.c.b.b.o.e.e;
import b.t.c.b.b.o.e.f;
import b.t.c.b.b.o.f.b;
import b.t.c.b.b.o.n;
import b.t.c.b.b.q.ab;
import b.t.c.b.b.q.b.g$1;
import b.t.c.b.b.q.b.g$2;
import b.t.c.b.b.q.b.lb;
import b.t.c.b.b.q.ec;
import b.t.c.b.b.q.ib;
import b.t.c.b.b.q.mc;
import b.t.c.b.b.q.o;
import b.t.c.b.b.q.qc;
import b.t.c.b.b.q.s;
import b.t.c.b.b.q.sb;
import b.t.c.b.b.q.wb;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class g
extends lb {
    private final lb \u00f8\u00d8\u00d6000;
    private final kc whileforObject;
    private kc o\u00f4\u00d6000;
    private List O\u00f4\u00d6000;
    private List ifforObject;
    private bc \u00d4\u00f4\u00d6000;

    public g(lb lb2, kc kc2) {
        this.\u00f8\u00d8\u00d6000 = lb2;
        this.whileforObject = kc2;
    }

    private kc \u00d4\u00d2\u00d2000() {
        if (this.o\u00f4\u00d6000 == null) {
            if (this.whileforObject.o00000()) {
                this.o\u00f4\u00d6000 = this.whileforObject;
            } else {
                List list = this.\u00f8\u00d8\u00d6000.\u00d3OO000().\u00f5OO000();
                this.O\u00f4\u00d6000 = new ArrayList(list.size());
                g g2 = this;
                this.o\u00f4\u00d6000 = nc.o00000(list, this.whileforObject.new(), g2, g2.O\u00f4\u00d6000);
                this.ifforObject = b.s.mc.\u00d8\u00d20000(this.O\u00f4\u00d6000, new g$1(this));
            }
        }
        return this.o\u00f4\u00d6000;
    }

    @Override
    public bc \u00d3OO000() {
        Iterator iterator = this.\u00f8\u00d8\u00d6000.\u00d3OO000();
        if (this.whileforObject.o00000()) {
            bc bc2 = iterator;
            if (bc2 == null) {
                g.returnString(0);
            }
            return bc2;
        }
        if (this.\u00d4\u00f4\u00d6000 == null) {
            kc kc2 = this.\u00d4\u00d2\u00d2000();
            iterator = iterator.\u00d5OO000();
            ArrayList<rc> arrayList = new ArrayList<rc>(iterator.size());
            iterator = iterator.iterator();
            while (iterator.hasNext()) {
                rc rc2 = (rc)iterator.next();
                arrayList.add(kc2.o00000(rc2, w.\u00d400000));
            }
            g g2 = this;
            this.\u00d4\u00f4\u00d6000 = new b.t.c.b.b.h.g(g2, g2.O\u00f4\u00d6000, arrayList, h.\u00d500000);
        }
        bc bc3 = this.\u00d4\u00f4\u00d6000;
        if (bc3 == null) {
            g.returnString(1);
        }
        return bc3;
    }

    @Override
    public f o00000(b.t.c.b.b.h.h object, b.t.c.b.b.h.e.b b2) {
        if (object == null) {
            g.returnString(5);
        }
        if (b2 == null) {
            g.returnString(6);
        }
        object = this.\u00f8\u00d8\u00d6000.o00000((b.t.c.b.b.h.h)object, b2);
        if (this.whileforObject.o00000()) {
            Object object2 = object;
            if (object2 == null) {
                g.returnString(7);
            }
            return object2;
        }
        return new e((f)object, this.\u00d4\u00d2\u00d2000());
    }

    @Override
    public f o00000(b.t.c.b.b.h.h h2) {
        if (h2 == null) {
            g.returnString(10);
        }
        f f2 = this.o00000(h2, b.\u00d200000(n.\u00f800000(this)));
        if (f2 == null) {
            g.returnString(11);
        }
        return f2;
    }

    @Override
    public f o\u00d2\u00d2000() {
        g g2 = this;
        f f2 = g2.\u00f400000(b.\u00d200000(n.\u00f800000(g2.\u00f8\u00d8\u00d6000)));
        if (f2 == null) {
            g.returnString(12);
        }
        return f2;
    }

    @Override
    public f \u00f400000(b.t.c.b.b.h.e.b object) {
        if (object == null) {
            g.returnString(13);
        }
        object = this.\u00f8\u00d8\u00d6000.\u00f400000((b.t.c.b.b.h.e.b)object);
        if (this.whileforObject.o00000()) {
            Object object2 = object;
            if (object2 == null) {
                g.returnString(14);
            }
            return object2;
        }
        return new e((f)object, this.\u00d4\u00d2\u00d2000());
    }

    @Override
    public f \u00d3\u00d2\u00d2000() {
        f f2 = this.\u00f8\u00d8\u00d6000.\u00d3\u00d2\u00d2000();
        if (f2 == null) {
            g.returnString(15);
        }
        return f2;
    }

    @Override
    public b.t.c.b.b.h.ib nullint() {
        List list = b.t.c.b.b.h.o.o00000(this.\u00d3OO000().\u00f5OO000());
        b.t.c.b.b.h.ib ib2 = oc.o00000(dc.o00000.o00000(this.\u00d4\u00f80000(), null, null), this.\u00d3OO000(), list, false, this.o\u00d2\u00d2000());
        if (ib2 == null) {
            g.returnString(16);
        }
        return ib2;
    }

    @Override
    public mc \u00f5o\u00d2000() {
        throw new UnsupportedOperationException();
    }

    @Override
    public List \u00d4o\u00d2000() {
        List list = Collections.emptyList();
        if (list == null) {
            g.returnString(17);
        }
        return list;
    }

    @Override
    public Collection newifsuper() {
        Object object = this.\u00f8\u00d8\u00d6000.newifsuper();
        ArrayList<sb> arrayList = new ArrayList<sb>(object.size());
        object = object.iterator();
        while (object.hasNext()) {
            sb sb2 = (sb)object.next();
            sb2 = (sb)sb2.ifreturnsuper().o00000(sb2.Stringvoidsuper()).o00000(sb2.\u00f40O000()).o00000(sb2.\u00d50O000()).o00000(sb2.O\u00f5o000()).o00000(false).\u00d500000();
            arrayList.add(sb2.return(this.\u00d4\u00d2\u00d2000()));
        }
        return arrayList;
    }

    @Override
    public b.t.c.b.b.q.e.o \u00d4\u00f80000() {
        b.t.c.b.b.q.e.o o2 = this.\u00f8\u00d8\u00d6000.\u00d4\u00f80000();
        if (o2 == null) {
            g.returnString(19);
        }
        return o2;
    }

    @Override
    public b.t.c.b.b.d.f \u00d5\u00f80000() {
        b.t.c.b.b.d.f f2 = this.\u00f8\u00d8\u00d6000.\u00d5\u00f80000();
        if (f2 == null) {
            g.returnString(20);
        }
        return f2;
    }

    @Override
    public ib \u00f4o\u00d2000() {
        ib ib2 = this.\u00f8\u00d8\u00d6000.\u00f4o\u00d2000();
        if (ib2 == null) {
            g.returnString(21);
        }
        return ib2;
    }

    @Override
    public wb \u00d8\u00f80000() {
        wb wb2 = this.\u00f8\u00d8\u00d6000.\u00d8\u00f80000();
        if (wb2 == null) {
            g.returnString(22);
        }
        return wb2;
    }

    public ib OO0000(kc kc2) {
        if (kc2 == null) {
            g.returnString(23);
        }
        if (kc2.o00000()) {
            return this;
        }
        return new g(this, kc.o00000(kc2.new(), this.\u00d4\u00d2\u00d2000().new()));
    }

    @Override
    public ib forintsuper() {
        return this.\u00f8\u00d8\u00d6000.forintsuper();
    }

    @Override
    public ec privateintsuper() {
        ec ec2 = this.\u00f8\u00d8\u00d6000.privateintsuper();
        if (ec2 == null) {
            g.returnString(25);
        }
        return ec2;
    }

    @Override
    public ab \u00f40O000() {
        ab ab2 = this.\u00f8\u00d8\u00d6000.\u00f40O000();
        if (ab2 == null) {
            g.returnString(26);
        }
        return ab2;
    }

    @Override
    public s \u00d50O000() {
        s s2 = this.\u00f8\u00d8\u00d6000.\u00d50O000();
        if (s2 == null) {
            g.returnString(27);
        }
        return s2;
    }

    @Override
    public boolean \u00f4\u00d6o000() {
        return this.\u00f8\u00d8\u00d6000.\u00f4\u00d6o000();
    }

    @Override
    public boolean Oo\u00d2000() {
        return this.\u00f8\u00d8\u00d6000.Oo\u00d2000();
    }

    @Override
    public boolean oo\u00d2000() {
        return this.\u00f8\u00d8\u00d6000.oo\u00d2000();
    }

    @Override
    public boolean \u00f8o\u00d2000() {
        return this.\u00f8\u00d8\u00d6000.\u00f8o\u00d2000();
    }

    @Override
    public boolean \u00d8o\u00d2000() {
        return this.\u00f8\u00d8\u00d6000.\u00d8o\u00d2000();
    }

    @Override
    public boolean \u00f50O000() {
        return this.\u00f8\u00d8\u00d6000.\u00f50O000();
    }

    @Override
    public boolean \u00d5o\u00d2000() {
        return this.\u00f8\u00d8\u00d6000.\u00d5o\u00d2000();
    }

    @Override
    public boolean \u00d80O000() {
        return this.\u00f8\u00d8\u00d6000.\u00d80O000();
    }

    @Override
    public boolean thisint() {
        return this.\u00f8\u00d8\u00d6000.thisint();
    }

    @Override
    public Object o00000(qc qc2, Object object) {
        return qc2.super(this, object);
    }

    @Override
    public f \u00d3o\u00d2000() {
        f f2 = this.\u00f8\u00d8\u00d6000.\u00d3o\u00d2000();
        if (f2 == null) {
            g.returnString(28);
        }
        return f2;
    }

    @Override
    public sb nullintsuper() {
        return this.\u00f8\u00d8\u00d6000.nullintsuper();
    }

    @Override
    public b.t.c.b.b.q.g \u00f4\u00f80000() {
        b.t.c.b.b.q.g g2 = b.t.c.b.b.q.g.o00000;
        if (g2 == null) {
            g.returnString(29);
        }
        return g2;
    }

    @Override
    public List \u00d8\u00d6o000() {
        this.\u00d4\u00d2\u00d2000();
        List list = this.ifforObject;
        if (list == null) {
            g.returnString(30);
        }
        return list;
    }

    @Override
    public o O\u00d2\u00d2000() {
        o o2 = this.\u00f8\u00d8\u00d6000.O\u00d2\u00d2000();
        if (o2 == null) {
            return null;
        }
        return o2.o00000(new g$2(this));
    }

    private b.t.c.b.b.h.ib new(b.t.c.b.b.h.ib ib2) {
        if (ib2 == null || this.whileforObject.o00000()) {
            return ib2;
        }
        rc rc2 = this.\u00d4\u00d2\u00d2000().o00000(ib2, w.\u00d400000);
        assert (rc2 instanceof b.t.c.b.b.h.ib) : "Substitution for SimpleType should also be a SimpleType, but it is " + rc2 + "\nUnsubstituted: " + ib2;
        return (b.t.c.b.b.h.ib)rc2;
    }

    static /* synthetic */ b.t.c.b.b.h.ib o00000(g g2, b.t.c.b.b.h.ib ib2) {
        return g2.new(ib2);
    }

    private static /* synthetic */ void returnString(int n2) {
        RuntimeException runtimeException;
        Object[] objectArray;
        Object[] objectArray2;
        int n3;
        String string;
        switch (n2) {
            default: {
                string = "@NotNull method %s.%s must not return null";
                break;
            }
            case 2: 
            case 3: 
            case 5: 
            case 6: 
            case 8: 
            case 10: 
            case 13: 
            case 23: {
                string = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            }
        }
        switch (n2) {
            default: {
                n3 = 2;
                break;
            }
            case 2: 
            case 3: 
            case 5: 
            case 6: 
            case 8: 
            case 10: 
            case 13: 
            case 23: {
                n3 = 3;
            }
        }
        Object[] objectArray3 = new Object[n3];
        switch (n2) {
            default: {
                objectArray2 = objectArray3;
                objectArray3[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/LazySubstitutingClassDescriptor";
                break;
            }
            case 2: 
            case 8: {
                objectArray2 = objectArray3;
                objectArray3[0] = "typeArguments";
                break;
            }
            case 3: 
            case 6: 
            case 13: {
                objectArray2 = objectArray3;
                objectArray3[0] = "kotlinTypeRefiner";
                break;
            }
            case 5: 
            case 10: {
                objectArray2 = objectArray3;
                objectArray3[0] = "typeSubstitution";
                break;
            }
            case 23: {
                objectArray2 = objectArray3;
                objectArray3[0] = "substitutor";
            }
        }
        switch (n2) {
            default: {
                objectArray = objectArray2;
                objectArray2[1] = "getTypeConstructor";
                break;
            }
            case 2: 
            case 3: 
            case 5: 
            case 6: 
            case 8: 
            case 10: 
            case 13: 
            case 23: {
                objectArray = objectArray2;
                objectArray2[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/LazySubstitutingClassDescriptor";
                break;
            }
            case 4: 
            case 7: 
            case 9: 
            case 11: {
                objectArray = objectArray2;
                objectArray2[1] = "getMemberScope";
                break;
            }
            case 12: 
            case 14: {
                objectArray = objectArray2;
                objectArray2[1] = "getUnsubstitutedMemberScope";
                break;
            }
            case 15: {
                objectArray = objectArray2;
                objectArray2[1] = "getStaticScope";
                break;
            }
            case 16: {
                objectArray = objectArray2;
                objectArray2[1] = "getDefaultType";
                break;
            }
            case 17: {
                objectArray = objectArray2;
                objectArray2[1] = "getContextReceivers";
                break;
            }
            case 18: {
                objectArray = objectArray2;
                objectArray2[1] = "getConstructors";
                break;
            }
            case 19: {
                objectArray = objectArray2;
                objectArray2[1] = "getAnnotations";
                break;
            }
            case 20: {
                objectArray = objectArray2;
                objectArray2[1] = "getName";
                break;
            }
            case 21: {
                objectArray = objectArray2;
                objectArray2[1] = "getOriginal";
                break;
            }
            case 22: {
                objectArray = objectArray2;
                objectArray2[1] = "getContainingDeclaration";
                break;
            }
            case 24: {
                objectArray = objectArray2;
                objectArray2[1] = "substitute";
                break;
            }
            case 25: {
                objectArray = objectArray2;
                objectArray2[1] = "getKind";
                break;
            }
            case 26: {
                objectArray = objectArray2;
                objectArray2[1] = "getModality";
                break;
            }
            case 27: {
                objectArray = objectArray2;
                objectArray2[1] = "getVisibility";
                break;
            }
            case 28: {
                objectArray = objectArray2;
                objectArray2[1] = "getUnsubstitutedInnerClassesScope";
                break;
            }
            case 29: {
                objectArray = objectArray2;
                objectArray2[1] = "getSource";
                break;
            }
            case 30: {
                objectArray = objectArray2;
                objectArray2[1] = "getDeclaredTypeParameters";
                break;
            }
            case 31: {
                objectArray = objectArray2;
                objectArray2[1] = "getSealedSubclasses";
            }
        }
        switch (n2) {
            default: {
                break;
            }
            case 2: 
            case 3: 
            case 5: 
            case 6: 
            case 8: 
            case 10: {
                objectArray = objectArray;
                objectArray[2] = "getMemberScope";
                break;
            }
            case 13: {
                objectArray = objectArray;
                objectArray[2] = "getUnsubstitutedMemberScope";
                break;
            }
            case 23: {
                objectArray = objectArray;
                objectArray[2] = "substitute";
            }
        }
        String string2 = String.format(string, objectArray);
        switch (n2) {
            default: {
                runtimeException = new IllegalStateException(string2);
                break;
            }
            case 2: 
            case 3: 
            case 5: 
            case 6: 
            case 8: 
            case 10: 
            case 13: 
            case 23: {
                runtimeException = new IllegalArgumentException(string2);
            }
        }
        throw runtimeException;
    }
}


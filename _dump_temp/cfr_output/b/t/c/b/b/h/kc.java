/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.h;

import b.t.c.b.b.b.d$_b;
import b.t.c.b.b.h.ac;
import b.t.c.b.b.h.b;
import b.t.c.b.b.h.c.d;
import b.t.c.b.b.h.d.e;
import b.t.c.b.b.h.d.k;
import b.t.c.b.b.h.ec;
import b.t.c.b.b.h.f;
import b.t.c.b.b.h.g.c;
import b.t.c.b.b.h.h;
import b.t.c.b.b.h.hb;
import b.t.c.b.b.h.hc;
import b.t.c.b.b.h.ib;
import b.t.c.b.b.h.jb;
import b.t.c.b.b.h.jc;
import b.t.c.b.b.h.kc$1;
import b.t.c.b.b.h.kc$_b;
import b.t.c.b.b.h.kc$_c;
import b.t.c.b.b.h.lb;
import b.t.c.b.b.h.lc;
import b.t.c.b.b.h.o;
import b.t.c.b.b.h.oc;
import b.t.c.b.b.h.pb;
import b.t.c.b.b.h.q;
import b.t.c.b.b.h.qb;
import b.t.c.b.b.h.r;
import b.t.c.b.b.h.rc;
import b.t.c.b.b.h.s;
import b.t.c.b.b.h.vb;
import b.t.c.b.b.h.w;
import b.t.c.b.b.m.g;
import b.t.c.b.b.q.i;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class kc
implements d {
    public static final kc \u00d200000 = kc.o00000(h.o00000);
    private final h o00000;

    public static kc o00000(h h2) {
        if (h2 == null) {
            kc.o00000(0);
        }
        return new kc(h2);
    }

    public kc \u00d300000() {
        if (!(this.o00000 instanceof qb) || !this.o00000.\u00d500000()) {
            return this;
        }
        return new kc(new qb(((qb)this.o00000).return(), ((qb)this.o00000).\u00d800000(), false));
    }

    public static kc o00000(h h2, h h3) {
        if (h2 == null) {
            kc.o00000(3);
        }
        if (h3 == null) {
            kc.o00000(4);
        }
        return kc.o00000(vb.o00000(h2, h3));
    }

    public static kc o00000(Map map) {
        if (map == null) {
            kc.o00000(5);
        }
        return kc.o00000(lb.o00000(map));
    }

    public static kc o00000(rc rc2) {
        if (rc2 == null) {
            kc.o00000(6);
        }
        return kc.o00000(lb.o00000(rc2.thisdosuper(), rc2.\u00d4\u00d6\u00d2000()));
    }

    protected kc(h h2) {
        if (h2 == null) {
            kc.o00000(7);
        }
        this.o00000 = h2;
    }

    public boolean o00000() {
        return this.o00000.o00000();
    }

    public h new() {
        h h2 = this.o00000;
        if (h2 == null) {
            kc.o00000(8);
        }
        return h2;
    }

    public rc new(rc rc2, w w2) {
        rc rc3;
        if (rc2 == null) {
            kc.o00000(9);
        }
        if (w2 == null) {
            kc.o00000(10);
        }
        if (this.o00000()) {
            rc rc4 = rc2;
            if (rc4 == null) {
                kc.o00000(11);
            }
            return rc4;
        }
        try {
            rc3 = this.o00000(new lc(w2, rc2), null, 0).\u00d300000();
        }
        catch (kc$_c kc$_c) {
            e e2 = k.new(b.t.c.b.b.h.d.c.\u00d6o0000, kc$_c.getMessage());
            if (e2 == null) {
                kc.o00000(13);
            }
            return e2;
        }
        if (rc3 == null) {
            kc.o00000(12);
        }
        return rc3;
    }

    public rc o00000(rc object, w w2) {
        if (object == null) {
            kc.o00000(14);
        }
        if (w2 == null) {
            kc.o00000(15);
        }
        if ((object = this.o00000(new lc(w2, this.new().o00000((rc)object, w2)))) == null) {
            return null;
        }
        return object.\u00d300000();
    }

    public hc o00000(hc hc2) {
        if (hc2 == null) {
            kc.o00000(16);
        }
        hc2 = this.new(hc2);
        if (!this.o00000.new() && !this.o00000.\u00d500000()) {
            return hc2;
        }
        return c.super(hc2, this.o00000.\u00d500000());
    }

    public hc new(hc hc2) {
        if (hc2 == null) {
            kc.o00000(17);
        }
        if (this.o00000()) {
            return hc2;
        }
        try {
            return this.o00000(hc2, null, 0);
        }
        catch (kc$_c kc$_c) {
            return null;
        }
    }

    private hc o00000(hc object, i object2, int n2) throws kc$_c {
        if (object == null) {
            kc.o00000(18);
        }
        kc.o00000(n2, (hc)object, this.o00000);
        if (object.super()) {
            hc hc2 = object;
            if (hc2 == null) {
                kc.o00000(19);
            }
            return hc2;
        }
        Object object3 = object.\u00d300000();
        if (object3 instanceof pb) {
            Object object4 = ((pb)object3).ifwhilesuper();
            rc rc2 = ((pb)object3).\u00f8\u00f4\u00d2000();
            object4 = this.o00000(new lc(object.\u00d200000(), (rc)object4), (i)object2, n2 + 1);
            if (object4.super()) {
                Object object5 = object4;
                if (object5 == null) {
                    kc.o00000(20);
                }
                return object5;
            }
            rc rc3 = this.o00000(rc2, object.\u00d200000());
            object3 = jc.o00000(object4.\u00d300000().\u00d8\u00d6\u00d2000(), rc3);
            return new lc(object4.\u00d200000(), (rc)object3);
        }
        if (ac.o00000((rc)object3) || ((rc)object3).\u00d8\u00d6\u00d2000() instanceof ec) {
            hc hc3 = object;
            if (hc3 == null) {
                kc.o00000(21);
            }
            return hc3;
        }
        Object object6 = this.o00000.o00000((rc)object3);
        hc hc4 = object6 != null ? kc.o00000((rc)object3, object6, (i)object2, (hc)object) : null;
        object6 = object.\u00d200000();
        if (hc4 == null && q.\u00d400000((rc)object3) && !jb.o00000((rc)object3)) {
            f f2 = q.new((rc)object3);
            object3 = this.o00000(new lc((w)((Object)object6), f2.\u00f4\u00f4\u00d2000()), (i)object2, n2 + 1);
            object2 = this.o00000(new lc((w)((Object)object6), f2.\u00d8\u00f4\u00d2000()), (i)object2, n2 + 1);
            w w2 = object3.\u00d200000();
            assert (w2 == object2.\u00d200000() && object6 == w.\u00d400000 || object6 == w2) : "Unexpected substituted projection kind: " + (Object)((Object)w2) + "; original: " + object6;
            if (object3.\u00d300000() == f2.\u00f4\u00f4\u00d2000() && object2.\u00d300000() == f2.\u00d8\u00f4\u00d2000()) {
                Object object7 = object;
                if (object7 == null) {
                    kc.o00000(22);
                }
                return object7;
            }
            object = oc.o00000(r.super(object3.\u00d300000()), r.super(object2.\u00d300000()));
            return new lc(w2, (rc)object);
        }
        if (b.t.c.b.b.b.c.\u00f5O0000((rc)object3) || hb.super((rc)object3)) {
            hc hc5 = object;
            if (hc5 == null) {
                kc.o00000(23);
            }
            return hc5;
        }
        if (hc4 != null) {
            kc$_b kc$_b = kc.new((w)((Object)object6), hc4.\u00d200000());
            if (!b.t.c.b.b.o.d.b.e.o00000((rc)object3)) {
                switch (kc$_b) {
                    case Object: {
                        throw new kc$_c("Out-projection in in-position");
                    }
                    case o00000: {
                        return new lc(w.return, ((rc)object3).thisdosuper().forint().\u00f800000());
                    }
                }
            }
            b b2 = jb.\u00d200000((rc)object3);
            if (hc4.super()) {
                hc hc6 = hc4;
                if (hc6 == null) {
                    kc.o00000(24);
                }
                return hc6;
            }
            object2 = b2 != null ? b2.\u00d5O0000(hc4.\u00d300000()) : o.\u00d200000(hc4.\u00d300000(), ((rc)object3).\u00f5\u00d6\u00d2000());
            if (!((rc)object3).\u00d4\u00f80000().\u00d5\u00f4\u00d3000()) {
                object = kc.o00000(this.o00000.o00000(((rc)object3).\u00d4\u00f80000()));
                object2 = b.t.c.b.b.h.b.b.super((rc)object2, new b.t.c.b.b.q.e.k(new b.t.c.b.b.q.e.o[]{((rc)object2).\u00d4\u00f80000(), object}));
            }
            object = kc$_b == kc$_b.\u00d400000 ? kc.o00000((w)((Object)object6), hc4.\u00d200000()) : object6;
            return new lc((w)((Object)object), (rc)object2);
        }
        hc hc7 = this.o00000((hc)object, n2);
        if (hc7 == null) {
            kc.o00000(25);
        }
        return hc7;
    }

    private static hc o00000(rc object, hc hc2, i i2, hc hc3) {
        if (object == null) {
            kc.o00000(26);
        }
        if (hc2 == null) {
            kc.o00000(27);
        }
        if (hc3 == null) {
            kc.o00000(28);
        }
        if (!((rc)object).\u00d4\u00f80000().\u00d300000(d$_b.thissuper)) {
            hc hc4 = hc2;
            if (hc4 == null) {
                kc.o00000(29);
            }
            return hc4;
        }
        object = hc2.\u00d300000().thisdosuper();
        if (!(object instanceof b.t.c.b.b.h.e.d)) {
            hc hc5 = hc2;
            if (hc5 == null) {
                kc.o00000(30);
            }
            return hc5;
        }
        object = ((b.t.c.b.b.h.e.d)object).\u00f5\u00d2O000();
        w w2 = object.\u00d200000();
        if (kc.new(hc3.\u00d200000(), w2) == kc$_b.Object) {
            return new lc(object.\u00d300000());
        }
        if (i2 == null) {
            hc hc6 = hc2;
            if (hc6 == null) {
                kc.o00000(31);
            }
            return hc6;
        }
        if (kc.new(i2.\u00d4\u00d5o000(), w2) == kc$_b.Object) {
            return new lc(object.\u00d300000());
        }
        hc hc7 = hc2;
        if (hc7 == null) {
            kc.o00000(32);
        }
        return hc7;
    }

    private static b.t.c.b.b.q.e.o o00000(b.t.c.b.b.q.e.o o2) {
        if (o2 == null) {
            kc.o00000(33);
        }
        if (!o2.\u00d300000(d$_b.thissuper)) {
            b.t.c.b.b.q.e.o o3 = o2;
            if (o3 == null) {
                kc.o00000(34);
            }
            return o3;
        }
        return new b.t.c.b.b.q.e.b(o2, new kc$1());
    }

    private hc o00000(hc object, int n2) throws kc$_c {
        rc rc2 = object.\u00d300000();
        w w2 = object.\u00d200000();
        if (rc2.thisdosuper().\u00f4OO000() instanceof i) {
            return object;
        }
        object = null;
        ib ib2 = s.\u00d300000(rc2);
        if (ib2 != null) {
            object = this.\u00d300000().o00000(ib2, w.\u00d400000);
        }
        Object object2 = this.o00000(rc2.thisdosuper().\u00f5OO000(), rc2.\u00d4\u00d6\u00d2000(), n2);
        if ((object2 = r.super(rc2, (List)object2, this.o00000.o00000(rc2.\u00d4\u00f80000()))) instanceof ib && object instanceof ib) {
            object2 = s.o00000((ib)object2, (ib)object);
        }
        return new lc(w2, (rc)object2);
    }

    private List o00000(List list, List list2, int n2) throws kc$_c {
        ArrayList<hc> arrayList = new ArrayList<hc>(list.size());
        boolean bl = false;
        for (int i2 = 0; i2 < list.size(); ++i2) {
            i i3 = (i)list.get(i2);
            hc hc2 = (hc)list2.get(i2);
            hc hc3 = this.o00000(hc2, i3, n2 + 1);
            switch (kc.new(i3.\u00d4\u00d5o000(), hc3.\u00d200000())) {
                case \u00d400000: {
                    if (i3.\u00d4\u00d5o000() == w.\u00d400000 || hc3.super()) break;
                    hc3 = new lc(w.\u00d400000, hc3.\u00d300000());
                    break;
                }
                case Object: 
                case o00000: {
                    hc3 = o.o00000(i3);
                }
            }
            if (hc3 != hc2) {
                bl = true;
            }
            arrayList.add(hc3);
        }
        if (!bl) {
            return list2;
        }
        return arrayList;
    }

    public static w o00000(w w2, hc hc2) {
        if (w2 == null) {
            kc.o00000(35);
        }
        if (hc2 == null) {
            kc.o00000(36);
        }
        if (hc2.super()) {
            w w3 = w.return;
            if (w3 == null) {
                kc.o00000(37);
            }
            return w3;
        }
        return kc.o00000(w2, hc2.\u00d200000());
    }

    public static w o00000(w w2, w w3) {
        if (w2 == null) {
            kc.o00000(38);
        }
        if (w3 == null) {
            kc.o00000(39);
        }
        if (w2 == w.\u00d400000) {
            w w4 = w3;
            if (w4 == null) {
                kc.o00000(40);
            }
            return w4;
        }
        if (w3 == w.\u00d400000) {
            w w5 = w2;
            if (w5 == null) {
                kc.o00000(41);
            }
            return w5;
        }
        if (w2 == w3) {
            w w6 = w3;
            if (w6 == null) {
                kc.o00000(42);
            }
            return w6;
        }
        throw new AssertionError((Object)("Variance conflict: type parameter variance '" + (Object)((Object)w2) + "' and projection kind '" + (Object)((Object)w3) + "' cannot be combined"));
    }

    private static kc$_b new(w w2, w w3) {
        if (w2 == w.o00000 && w3 == w.return) {
            return kc$_b.Object;
        }
        if (w2 == w.return && w3 == w.o00000) {
            return kc$_b.o00000;
        }
        return kc$_b.\u00d400000;
    }

    private static void o00000(int n2, hc hc2, h h2) {
        if (n2 > 100) {
            throw new IllegalStateException("Recursion too deep. Most likely infinite loop while substituting " + kc.o00000(hc2) + "; substitution: " + kc.o00000((Object)h2));
        }
    }

    private static String o00000(Object object) {
        try {
            return object.toString();
        }
        catch (Throwable throwable) {
            object = throwable;
            if (g.new(throwable)) {
                throw (RuntimeException)object;
            }
            return "[Exception while computing toString(): " + object + "]";
        }
    }

    private static /* synthetic */ void o00000(int n2) {
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
            case 1: 
            case 2: 
            case 8: 
            case 11: 
            case 12: 
            case 13: 
            case 19: 
            case 20: 
            case 21: 
            case 22: 
            case 23: 
            case 24: 
            case 25: 
            case 29: 
            case 30: 
            case 31: 
            case 32: 
            case 34: 
            case 37: 
            case 40: 
            case 41: 
            case 42: {
                string = "@NotNull method %s.%s must not return null";
            }
        }
        switch (n2) {
            default: {
                n3 = 3;
                break;
            }
            case 1: 
            case 2: 
            case 8: 
            case 11: 
            case 12: 
            case 13: 
            case 19: 
            case 20: 
            case 21: 
            case 22: 
            case 23: 
            case 24: 
            case 25: 
            case 29: 
            case 30: 
            case 31: 
            case 32: 
            case 34: 
            case 37: 
            case 40: 
            case 41: 
            case 42: {
                n3 = 2;
            }
        }
        Object[] objectArray3 = new Object[n3];
        switch (n2) {
            default: {
                objectArray2 = objectArray3;
                objectArray3[0] = "substitution";
                break;
            }
            case 1: 
            case 2: 
            case 8: 
            case 11: 
            case 12: 
            case 13: 
            case 19: 
            case 20: 
            case 21: 
            case 22: 
            case 23: 
            case 24: 
            case 25: 
            case 29: 
            case 30: 
            case 31: 
            case 32: 
            case 34: 
            case 37: 
            case 40: 
            case 41: 
            case 42: {
                objectArray2 = objectArray3;
                objectArray3[0] = "kotlin/reflect/jvm/internal/impl/types/TypeSubstitutor";
                break;
            }
            case 3: {
                objectArray2 = objectArray3;
                objectArray3[0] = "first";
                break;
            }
            case 4: {
                objectArray2 = objectArray3;
                objectArray3[0] = "second";
                break;
            }
            case 5: {
                objectArray2 = objectArray3;
                objectArray3[0] = "substitutionContext";
                break;
            }
            case 6: {
                objectArray2 = objectArray3;
                objectArray3[0] = "context";
                break;
            }
            case 9: 
            case 14: {
                objectArray2 = objectArray3;
                objectArray3[0] = "type";
                break;
            }
            case 10: 
            case 15: {
                objectArray2 = objectArray3;
                objectArray3[0] = "howThisTypeIsUsed";
                break;
            }
            case 16: 
            case 17: 
            case 36: {
                objectArray2 = objectArray3;
                objectArray3[0] = "typeProjection";
                break;
            }
            case 18: 
            case 28: {
                objectArray2 = objectArray3;
                objectArray3[0] = "originalProjection";
                break;
            }
            case 26: {
                objectArray2 = objectArray3;
                objectArray3[0] = "originalType";
                break;
            }
            case 27: {
                objectArray2 = objectArray3;
                objectArray3[0] = "substituted";
                break;
            }
            case 33: {
                objectArray2 = objectArray3;
                objectArray3[0] = "annotations";
                break;
            }
            case 35: 
            case 38: {
                objectArray2 = objectArray3;
                objectArray3[0] = "typeParameterVariance";
                break;
            }
            case 39: {
                objectArray2 = objectArray3;
                objectArray3[0] = "projectionKind";
            }
        }
        switch (n2) {
            default: {
                objectArray = objectArray2;
                objectArray2[1] = "kotlin/reflect/jvm/internal/impl/types/TypeSubstitutor";
                break;
            }
            case 1: {
                objectArray = objectArray2;
                objectArray2[1] = "replaceWithNonApproximatingSubstitution";
                break;
            }
            case 2: {
                objectArray = objectArray2;
                objectArray2[1] = "replaceWithContravariantApproximatingSubstitution";
                break;
            }
            case 8: {
                objectArray = objectArray2;
                objectArray2[1] = "getSubstitution";
                break;
            }
            case 11: 
            case 12: 
            case 13: {
                objectArray = objectArray2;
                objectArray2[1] = "safeSubstitute";
                break;
            }
            case 19: 
            case 20: 
            case 21: 
            case 22: 
            case 23: 
            case 24: 
            case 25: {
                objectArray = objectArray2;
                objectArray2[1] = "unsafeSubstitute";
                break;
            }
            case 29: 
            case 30: 
            case 31: 
            case 32: {
                objectArray = objectArray2;
                objectArray2[1] = "projectedTypeForConflictedTypeWithUnsafeVariance";
                break;
            }
            case 34: {
                objectArray = objectArray2;
                objectArray2[1] = "filterOutUnsafeVariance";
                break;
            }
            case 37: 
            case 40: 
            case 41: 
            case 42: {
                objectArray = objectArray2;
                objectArray2[1] = "combine";
            }
        }
        switch (n2) {
            default: {
                objectArray = objectArray;
                objectArray[2] = "create";
                break;
            }
            case 1: 
            case 2: 
            case 8: 
            case 11: 
            case 12: 
            case 13: 
            case 19: 
            case 20: 
            case 21: 
            case 22: 
            case 23: 
            case 24: 
            case 25: 
            case 29: 
            case 30: 
            case 31: 
            case 32: 
            case 34: 
            case 37: 
            case 40: 
            case 41: 
            case 42: {
                break;
            }
            case 3: 
            case 4: {
                objectArray = objectArray;
                objectArray[2] = "createChainedSubstitutor";
                break;
            }
            case 7: {
                objectArray = objectArray;
                objectArray[2] = "<init>";
                break;
            }
            case 9: 
            case 10: {
                objectArray = objectArray;
                objectArray[2] = "safeSubstitute";
                break;
            }
            case 14: 
            case 15: 
            case 16: {
                objectArray = objectArray;
                objectArray[2] = "substitute";
                break;
            }
            case 17: {
                objectArray = objectArray;
                objectArray[2] = "substituteWithoutApproximation";
                break;
            }
            case 18: {
                objectArray = objectArray;
                objectArray[2] = "unsafeSubstitute";
                break;
            }
            case 26: 
            case 27: 
            case 28: {
                objectArray = objectArray;
                objectArray[2] = "projectedTypeForConflictedTypeWithUnsafeVariance";
                break;
            }
            case 33: {
                objectArray = objectArray;
                objectArray[2] = "filterOutUnsafeVariance";
                break;
            }
            case 35: 
            case 36: 
            case 38: 
            case 39: {
                objectArray = objectArray;
                objectArray[2] = "combine";
            }
        }
        String string2 = String.format(string, objectArray);
        switch (n2) {
            default: {
                runtimeException = new IllegalArgumentException(string2);
                break;
            }
            case 1: 
            case 2: 
            case 8: 
            case 11: 
            case 12: 
            case 13: 
            case 19: 
            case 20: 
            case 21: 
            case 22: 
            case 23: 
            case 24: 
            case 25: 
            case 29: 
            case 30: 
            case 31: 
            case 32: 
            case 34: 
            case 37: 
            case 40: 
            case 41: 
            case 42: {
                runtimeException = new IllegalStateException(string2);
            }
        }
        throw runtimeException;
    }
}


/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.q.b;

import b.t.c.b.b.d.f;
import b.t.c.b.b.h.h;
import b.t.c.b.b.h.rc;
import b.t.c.b.b.q.ab;
import b.t.c.b.b.q.b.x;
import b.t.c.b.b.q.cb;
import b.t.c.b.b.q.e;
import b.t.c.b.b.q.hc;
import b.t.c.b.b.q.hc$_b;
import b.t.c.b.b.q.mc;
import b.t.c.b.b.q.pb;
import b.t.c.b.b.q.s;
import b.t.c.b.b.q.wb;
import java.util.List;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class x$_b {
    private wb \u00d400000;
    private ab OO0000;
    private s new;
    private pb \u00d500000;
    private boolean if;
    private hc$_b return;
    private h oO0000;
    private boolean \u00d800000;
    private mc \u00f800000;
    private List \u00d300000;
    private f o00000;
    private rc \u00f500000;
    final /* synthetic */ x \u00f400000;

    public x$_b(x x2) {
        this.\u00f400000 = x2;
        this.\u00d400000 = this.\u00f400000.\u00d8\u00f80000();
        this.OO0000 = this.\u00f400000.\u00f40O000();
        this.new = this.\u00f400000.\u00d50O000();
        this.\u00d500000 = null;
        this.if = false;
        this.return = this.\u00f400000.O\u00f5o000();
        this.oO0000 = h.o00000;
        this.\u00d800000 = true;
        this.\u00f800000 = x.o00000(this.\u00f400000);
        this.\u00d300000 = null;
        this.o00000 = this.\u00f400000.\u00d5\u00f80000();
        this.\u00f500000 = this.\u00f400000.forclasssuper();
    }

    public x$_b o00000(wb wb2) {
        if (wb2 == null) {
            x$_b.o00000(0);
        }
        this.\u00d400000 = wb2;
        return this;
    }

    public x$_b o00000(hc hc2) {
        this.\u00d500000 = (pb)hc2;
        return this;
    }

    public x$_b o00000(ab ab2) {
        if (ab2 == null) {
            x$_b.o00000(6);
        }
        this.OO0000 = ab2;
        return this;
    }

    public x$_b o00000(s s2) {
        if (s2 == null) {
            x$_b.o00000(8);
        }
        this.new = s2;
        return this;
    }

    public x$_b o00000(hc$_b hc$_b) {
        if (hc$_b == null) {
            x$_b.o00000(10);
        }
        this.return = hc$_b;
        return this;
    }

    public x$_b o00000(h h2) {
        if (h2 == null) {
            x$_b.o00000(15);
        }
        this.oO0000 = h2;
        return this;
    }

    public x$_b o00000(boolean bl) {
        this.\u00d800000 = bl;
        return this;
    }

    public pb o00000() {
        return this.\u00f400000.o00000(this);
    }

    cb Object() {
        if (this.\u00d500000 == null) {
            return null;
        }
        return this.\u00d500000.o0\u00d2000();
    }

    e \u00d200000() {
        if (this.\u00d500000 == null) {
            return null;
        }
        return this.\u00d500000.\u00f5\u00f8o000();
    }

    static /* synthetic */ wb \u00d500000(x$_b x$_b) {
        return x$_b.\u00d400000;
    }

    static /* synthetic */ ab \u00d600000(x$_b x$_b) {
        return x$_b.OO0000;
    }

    static /* synthetic */ s \u00f400000(x$_b x$_b) {
        return x$_b.new;
    }

    static /* synthetic */ pb \u00f600000(x$_b x$_b) {
        return x$_b.\u00d500000;
    }

    static /* synthetic */ hc$_b OO0000(x$_b x$_b) {
        return x$_b.return;
    }

    static /* synthetic */ f \u00f500000(x$_b x$_b) {
        return x$_b.o00000;
    }

    static /* synthetic */ boolean Object(x$_b x$_b) {
        return x$_b.if;
    }

    static /* synthetic */ List \u00d200000(x$_b x$_b) {
        return x$_b.\u00d300000;
    }

    static /* synthetic */ h \u00d400000(x$_b x$_b) {
        return x$_b.oO0000;
    }

    static /* synthetic */ rc o00000(x$_b x$_b) {
        return x$_b.\u00f500000;
    }

    static /* synthetic */ mc void(x$_b x$_b) {
        return x$_b.\u00f800000;
    }

    static /* synthetic */ boolean float(x$_b x$_b) {
        return x$_b.\u00d800000;
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
            case 3: 
            case 5: 
            case 7: 
            case 9: 
            case 11: 
            case 13: 
            case 14: 
            case 16: 
            case 17: 
            case 19: {
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
            case 3: 
            case 5: 
            case 7: 
            case 9: 
            case 11: 
            case 13: 
            case 14: 
            case 16: 
            case 17: 
            case 19: {
                n3 = 2;
            }
        }
        Object[] objectArray3 = new Object[n3];
        switch (n2) {
            default: {
                objectArray2 = objectArray3;
                objectArray3[0] = "owner";
                break;
            }
            case 1: 
            case 2: 
            case 3: 
            case 5: 
            case 7: 
            case 9: 
            case 11: 
            case 13: 
            case 14: 
            case 16: 
            case 17: 
            case 19: {
                objectArray2 = objectArray3;
                objectArray3[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyDescriptorImpl$CopyConfiguration";
                break;
            }
            case 4: {
                objectArray2 = objectArray3;
                objectArray3[0] = "type";
                break;
            }
            case 6: {
                objectArray2 = objectArray3;
                objectArray3[0] = "modality";
                break;
            }
            case 8: {
                objectArray2 = objectArray3;
                objectArray3[0] = "visibility";
                break;
            }
            case 10: {
                objectArray2 = objectArray3;
                objectArray3[0] = "kind";
                break;
            }
            case 12: {
                objectArray2 = objectArray3;
                objectArray3[0] = "typeParameters";
                break;
            }
            case 15: {
                objectArray2 = objectArray3;
                objectArray3[0] = "substitution";
                break;
            }
            case 18: {
                objectArray2 = objectArray3;
                objectArray3[0] = "name";
            }
        }
        switch (n2) {
            default: {
                objectArray = objectArray2;
                objectArray2[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyDescriptorImpl$CopyConfiguration";
                break;
            }
            case 1: {
                objectArray = objectArray2;
                objectArray2[1] = "setOwner";
                break;
            }
            case 2: {
                objectArray = objectArray2;
                objectArray2[1] = "setOriginal";
                break;
            }
            case 3: {
                objectArray = objectArray2;
                objectArray2[1] = "setPreserveSourceElement";
                break;
            }
            case 5: {
                objectArray = objectArray2;
                objectArray2[1] = "setReturnType";
                break;
            }
            case 7: {
                objectArray = objectArray2;
                objectArray2[1] = "setModality";
                break;
            }
            case 9: {
                objectArray = objectArray2;
                objectArray2[1] = "setVisibility";
                break;
            }
            case 11: {
                objectArray = objectArray2;
                objectArray2[1] = "setKind";
                break;
            }
            case 13: {
                objectArray = objectArray2;
                objectArray2[1] = "setTypeParameters";
                break;
            }
            case 14: {
                objectArray = objectArray2;
                objectArray2[1] = "setDispatchReceiverParameter";
                break;
            }
            case 16: {
                objectArray = objectArray2;
                objectArray2[1] = "setSubstitution";
                break;
            }
            case 17: {
                objectArray = objectArray2;
                objectArray2[1] = "setCopyOverrides";
                break;
            }
            case 19: {
                objectArray = objectArray2;
                objectArray2[1] = "setName";
            }
        }
        switch (n2) {
            default: {
                objectArray = objectArray;
                objectArray[2] = "setOwner";
                break;
            }
            case 1: 
            case 2: 
            case 3: 
            case 5: 
            case 7: 
            case 9: 
            case 11: 
            case 13: 
            case 14: 
            case 16: 
            case 17: 
            case 19: {
                break;
            }
            case 4: {
                objectArray = objectArray;
                objectArray[2] = "setReturnType";
                break;
            }
            case 6: {
                objectArray = objectArray;
                objectArray[2] = "setModality";
                break;
            }
            case 8: {
                objectArray = objectArray;
                objectArray[2] = "setVisibility";
                break;
            }
            case 10: {
                objectArray = objectArray;
                objectArray[2] = "setKind";
                break;
            }
            case 12: {
                objectArray = objectArray;
                objectArray[2] = "setTypeParameters";
                break;
            }
            case 15: {
                objectArray = objectArray;
                objectArray[2] = "setSubstitution";
                break;
            }
            case 18: {
                objectArray = objectArray;
                objectArray[2] = "setName";
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
            case 3: 
            case 5: 
            case 7: 
            case 9: 
            case 11: 
            case 13: 
            case 14: 
            case 16: 
            case 17: 
            case 19: {
                runtimeException = new IllegalStateException(string2);
            }
        }
        throw runtimeException;
    }
}


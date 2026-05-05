/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.n.b.b;

import b.t.c.b.b.n.b.b.b;
import b.t.c.b.b.n.b.b.b$_b;
import b.t.c.b.b.n.b.b.b$_d;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
class b$_b$1
extends b$_d {
    final /* synthetic */ b$_b if;

    b$_b$1(b$_b _b2) {
        this.if = _b2;
    }

    @Override
    protected void o00000(String[] stringArray) {
        if (stringArray == null) {
            b$_b$1.return(0);
        }
        b.\u00d200000(this.if.thissuper, stringArray);
    }

    private static /* synthetic */ void return(int n2) {
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "result", "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinSerializedIrArgumentVisitor$1", "visitEnd"));
    }
}


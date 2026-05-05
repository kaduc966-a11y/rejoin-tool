/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.c;

import b.o.d.fc;
import b.t.c.b.b.c.x;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class x$_l
extends x {
    private final String \u00d800000;
    private final int return;
    private final String \u00d500000;

    public x$_l(String charSequence, int n2) {
        super(null);
        int n3;
        this.\u00d800000 = charSequence;
        this.return = n2;
        if (!(this.return > 0)) {
            String string = "ArrayKClassValue must have at least one dimension. For regular X::class argument, use KClassValue.";
            throw new IllegalArgumentException(string.toString());
        }
        charSequence = new StringBuilder();
        StringBuilder stringBuilder = charSequence;
        x$_l x$_l = this;
        stringBuilder.append("ArrayKClassValue(");
        int n4 = this.return;
        for (n3 = 0; n3 < n4; ++n3) {
            stringBuilder.append("kotlin/Array<");
        }
        stringBuilder.append(this.\u00d800000);
        n4 = this.return;
        for (n3 = 0; n3 < n4; ++n3) {
            stringBuilder.append(">");
        }
        stringBuilder.append(")");
        x$_l.\u00d500000 = ((StringBuilder)charSequence).toString();
    }

    public final String \u00d600000() {
        return this.\u00d800000;
    }

    public final int \u00d500000() {
        return this.return;
    }

    @Override
    public final String toString() {
        return this.\u00d500000;
    }

    public final int hashCode() {
        return this.\u00d800000.hashCode() * 31 + Integer.hashCode(this.return);
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof x$_l)) {
            return false;
        }
        object = (x$_l)object;
        if (!fc.o00000((Object)this.\u00d800000, (Object)((x$_l)object).\u00d800000)) {
            return false;
        }
        return this.return == ((x$_l)object).return;
    }
}


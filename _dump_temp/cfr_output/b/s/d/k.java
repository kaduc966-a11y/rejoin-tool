/*
 * Decompiled with CFR 0.152.
 */
package b.s.d;

import b.s.d.k$_b;
import b.s.mc;
import b.s.ub;
import java.io.Externalizable;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Collection;
import java.util.List;
import java.util.Set;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class k
implements Externalizable {
    public static final k$_b \u00d600000 = new k$_b(null);
    private Collection String;
    private final int \u00d200000;
    private static final long \u00d500000 = 0L;
    public static final int \u00d300000 = 0;
    public static final int o00000 = 1;

    public k(Collection collection, int n2) {
        this.String = collection;
        this.\u00d200000 = n2;
    }

    public k() {
        this(mc.\u00d500000(), 0);
    }

    @Override
    public final void writeExternal(ObjectOutput objectOutput) {
        objectOutput.writeByte(this.\u00d200000);
        objectOutput.writeInt(this.String.size());
        for (Object e2 : this.String) {
            objectOutput.writeObject(e2);
        }
    }

    @Override
    public final void readExternal(ObjectInput objectInput) {
        Collection collection;
        int n2 = objectInput.readByte();
        int n3 = n2 & 1;
        if ((n2 & 0xFFFFFFFE) != 0) {
            throw new InvalidObjectException("Unsupported flags value: " + n2 + '.');
        }
        n2 = objectInput.readInt();
        if (n2 < 0) {
            throw new InvalidObjectException("Illegal size value: " + n2 + '.');
        }
        k k2 = this;
        switch (n3) {
            case 0: {
                List list;
                List list2 = list = mc.o00000(n2);
                k k3 = k2;
                for (int i2 = 0; i2 < n2; ++i2) {
                    list2.add(objectInput.readObject());
                }
                k k4 = k3;
                collection = mc.o00000(list);
                break;
            }
            case 1: {
                Set set;
                Set set2 = set = ub.super(n2);
                k k5 = k2;
                for (int i3 = 0; i3 < n2; ++i3) {
                    set2.add(objectInput.readObject());
                }
                k k4 = k5;
                collection = ub.super(set);
                break;
            }
            default: {
                throw new InvalidObjectException("Unsupported collection type tag: " + n3 + '.');
            }
        }
        k4.String = collection;
    }

    private final Object super() {
        return this.String;
    }
}


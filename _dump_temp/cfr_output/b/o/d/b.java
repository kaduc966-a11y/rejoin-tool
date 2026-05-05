/*
 * Decompiled with CFR 0.152.
 */
package b.o.d;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class b {
    private final ArrayList o00000;

    public b(int n2) {
        this.o00000 = new ArrayList(n2);
    }

    public void \u00d200000(Object object) {
        if (object == null) {
            return;
        }
        if (object instanceof Object[]) {
            if (((Object[])(object = (Object[])object)).length > 0) {
                this.o00000.ensureCapacity(this.o00000.size() + ((Object)object).length);
                Collections.addAll(this.o00000, object);
            }
            return;
        }
        if (object instanceof Collection) {
            this.o00000.addAll((Collection)object);
            return;
        }
        if (object instanceof Iterable) {
            for (Object e2 : (Iterable)object) {
                this.o00000.add(e2);
            }
            return;
        }
        if (object instanceof Iterator) {
            object = (Iterator)object;
            while (object.hasNext()) {
                this.o00000.add(object.next());
            }
            return;
        }
        throw new UnsupportedOperationException("Don't know how to spread " + object.getClass());
    }

    public int super() {
        return this.o00000.size();
    }

    public void super(Object object) {
        this.o00000.add(object);
    }

    public Object[] super(Object[] objectArray) {
        return this.o00000.toArray(objectArray);
    }
}


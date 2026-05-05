/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.i;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
class m {
    private final Object \u00d200000;
    private final Thread o00000;

    m(Object object) {
        this.\u00d200000 = object;
        this.o00000 = Thread.currentThread();
    }

    public boolean new() {
        return this.o00000 == Thread.currentThread();
    }

    public Object o00000() {
        if (!this.new()) {
            throw new IllegalStateException("No value in this thread (hasValue should be checked before)");
        }
        return this.\u00d200000;
    }
}


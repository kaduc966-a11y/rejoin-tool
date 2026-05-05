/*
 * Decompiled with CFR 0.152.
 */
package b.l;

import b.l.n;
import b.l.n$_b$_b;
import b.l.n$_b$_c;
import b.l.n$_b$_d;
import b.l.n$_b$_e;
import b.l.n$_c;
import b.l.n$_d;
import b.o.d.fc;
import b.qd;
import b.s.k;
import java.io.File;
import java.util.ArrayDeque;

final class n$_b
extends k {
    private final ArrayDeque \u00f4\u00d8\u00f5000 = new ArrayDeque();
    final /* synthetic */ n \u00d8\u00d8\u00f5000;

    public n$_b(n n2) {
        this.\u00d8\u00d8\u00f5000 = n2;
        if (n.\u00d200000(this.\u00d8\u00d8\u00f5000).isDirectory()) {
            n$_b n$_b = this;
            this.\u00f4\u00d8\u00f5000.push(n$_b.o00000(n.\u00d200000(n$_b.\u00d8\u00d8\u00f5000)));
            return;
        }
        if (n.\u00d200000(this.\u00d8\u00d8\u00f5000).isFile()) {
            n$_b n$_b = this;
            this.\u00f4\u00d8\u00f5000.push(new n$_b$_b(n$_b, n.\u00d200000(n$_b.\u00d8\u00d8\u00f5000)));
            return;
        }
        this.\u00f4\u00d3\u00d3000();
    }

    @Override
    public final void \u00f5\u00d3\u00d3000() {
        File file = this.\u00f8\u00d3\u00d3000();
        if (file != null) {
            this.\u00f5o0000(file);
            return;
        }
        this.\u00f4\u00d3\u00d3000();
    }

    private final n$_c o00000(File file) {
        switch (n$_b$_e.o00000[n.\u00d600000(this.\u00d8\u00d8\u00f5000).ordinal()]) {
            case 1: {
                return new n$_b$_d(this, file);
            }
            case 2: {
                return new n$_b$_c(this, file);
            }
        }
        throw new qd();
    }

    private final File \u00f8\u00d3\u00d3000() {
        n$_b n$_b = this;
        while ((n$_d)n$_b.\u00f4\u00d8\u00f5000.peek() != null) {
            n$_d n$_d;
            File file = n$_d.o00000();
            if (file == null) {
                n$_b.\u00f4\u00d8\u00f5000.pop();
                continue;
            }
            if (fc.o00000((Object)file, (Object)n$_d.new()) || !file.isDirectory() || n$_b.\u00f4\u00d8\u00f5000.size() >= n.String(this.\u00d8\u00d8\u00f5000)) {
                return file;
            }
            n$_b.\u00f4\u00d8\u00f5000.push(n$_b.o00000(file));
        }
        return null;
    }
}


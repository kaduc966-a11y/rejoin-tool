/*
 * Decompiled with CFR 0.152.
 */
package b.p.b;

import b.g.n;
import b.p.b.b$_b$_b$_b$1;
import b.p.b.b$_b$_b$_b$2;
import b.p.b.b$_b$_b$_b$3;
import b.p.b.b$_b$_b$_b$4;
import b.s.z;
import java.util.List;
import java.util.Spliterator;
import java.util.Spliterators;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public final class b {
    public static final n \u00d200000(Stream stream) {
        return new b$_b$_b$_b$1(stream);
    }

    public static final n \u00d200000(IntStream intStream) {
        return new b$_b$_b$_b$2(intStream);
    }

    public static final n o00000(LongStream longStream) {
        return new b$_b$_b$_b$3(longStream);
    }

    public static final n \u00d200000(DoubleStream doubleStream) {
        return new b$_b$_b$_b$4(doubleStream);
    }

    public static final Stream \u00d200000(n n2) {
        return StreamSupport.stream(() -> b.o00000(n2), 16, false);
    }

    public static final List o00000(Stream stream) {
        return stream.collect(Collectors.toList());
    }

    public static final List o00000(IntStream intStream) {
        return z.\u00d600000(intStream.toArray());
    }

    public static final List \u00d200000(LongStream longStream) {
        return z.\u00d200000(longStream.toArray());
    }

    public static final List o00000(DoubleStream doubleStream) {
        return z.o00000(doubleStream.toArray());
    }

    private static final Spliterator o00000(n n2) {
        return Spliterators.spliteratorUnknownSize(n2.o00000(), 16);
    }
}


// Generated by jextract

package top.dreamlike.nativeLib.liburing;

import top.dreamlike.common.CType;

import java.lang.foreign.GroupLayout;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.invoke.VarHandle;

public class io_uring_sq {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        CType.C_POINTER$LAYOUT.withName("khead"),
        CType.C_POINTER$LAYOUT.withName("ktail"),
        CType.C_POINTER$LAYOUT.withName("kring_mask"),
        CType.C_POINTER$LAYOUT.withName("kring_entries"),
        CType.C_POINTER$LAYOUT.withName("kflags"),
        CType.C_POINTER$LAYOUT.withName("kdropped"),
        CType.C_POINTER$LAYOUT.withName("array"),
        CType.C_POINTER$LAYOUT.withName("sqes"),
        CType.C_INT$LAYOUT.withName("sqe_head"),
        CType.C_INT$LAYOUT.withName("sqe_tail"),
        CType.C_LONG_LONG$LAYOUT.withName("ring_sz"),
            CType.C_POINTER$LAYOUT.withName("ring_ptr"),
            MemoryLayout.sequenceLayout(4, CType.C_INT$LAYOUT).withName("pad")
    ).withName("io_uring_sq");

    public static MemoryLayout $LAYOUT() {
        return io_uring_sq.$struct$LAYOUT;
    }

    static final VarHandle khead$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("khead"));

    public static VarHandle khead$VH() {
        return io_uring_sq.khead$VH;
    }

    public static MemorySegment khead$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment) io_uring_sq.khead$VH.get(seg);
    }

    public static void khead$set(MemorySegment seg, MemorySegment x) {
        io_uring_sq.khead$VH.set(seg, x);
    }

    public static MemorySegment khead$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment) io_uring_sq.khead$VH.get(seg.asSlice(index * sizeof()));
    }

    public static void khead$set(MemorySegment seg, long index, MemorySegment x) {
        io_uring_sq.khead$VH.set(seg.asSlice(index * sizeof()), x);
    }

    static final VarHandle ktail$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ktail"));

    public static VarHandle ktail$VH() {
        return io_uring_sq.ktail$VH;
    }

    public static MemorySegment ktail$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment) io_uring_sq.ktail$VH.get(seg);
    }

    public static void ktail$set(MemorySegment seg, MemorySegment x) {
        io_uring_sq.ktail$VH.set(seg, x);
    }

    public static MemorySegment ktail$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment) io_uring_sq.ktail$VH.get(seg.asSlice(index * sizeof()));
    }

    public static void ktail$set(MemorySegment seg, long index, MemorySegment x) {
        io_uring_sq.ktail$VH.set(seg.asSlice(index * sizeof()), x);
    }

    static final VarHandle kring_mask$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("kring_mask"));

    public static VarHandle kring_mask$VH() {
        return io_uring_sq.kring_mask$VH;
    }

    public static MemorySegment kring_mask$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment) io_uring_sq.kring_mask$VH.get(seg);
    }

    public static void kring_mask$set(MemorySegment seg, MemorySegment x) {
        io_uring_sq.kring_mask$VH.set(seg, x);
    }

    public static MemorySegment kring_mask$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment) io_uring_sq.kring_mask$VH.get(seg.asSlice(index * sizeof()));
    }

    public static void kring_mask$set(MemorySegment seg, long index, MemorySegment x) {
        io_uring_sq.kring_mask$VH.set(seg.asSlice(index * sizeof()), x);
    }

    static final VarHandle kring_entries$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("kring_entries"));

    public static VarHandle kring_entries$VH() {
        return io_uring_sq.kring_entries$VH;
    }

    public static MemorySegment kring_entries$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment) io_uring_sq.kring_entries$VH.get(seg);
    }

    public static void kring_entries$set(MemorySegment seg, MemorySegment x) {
        io_uring_sq.kring_entries$VH.set(seg, x);
    }

    public static MemorySegment kring_entries$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment) io_uring_sq.kring_entries$VH.get(seg.asSlice(index * sizeof()));
    }

    public static void kring_entries$set(MemorySegment seg, long index, MemorySegment x) {
        io_uring_sq.kring_entries$VH.set(seg.asSlice(index * sizeof()), x);
    }

    static final VarHandle kflags$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("kflags"));

    public static VarHandle kflags$VH() {
        return io_uring_sq.kflags$VH;
    }

    public static MemorySegment kflags$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment) io_uring_sq.kflags$VH.get(seg);
    }

    public static void kflags$set(MemorySegment seg, MemorySegment x) {
        io_uring_sq.kflags$VH.set(seg, x);
    }

    public static MemorySegment kflags$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment) io_uring_sq.kflags$VH.get(seg.asSlice(index * sizeof()));
    }

    public static void kflags$set(MemorySegment seg, long index, MemorySegment x) {
        io_uring_sq.kflags$VH.set(seg.asSlice(index * sizeof()), x);
    }

    static final VarHandle kdropped$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("kdropped"));

    public static VarHandle kdropped$VH() {
        return io_uring_sq.kdropped$VH;
    }

    public static MemorySegment kdropped$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment) io_uring_sq.kdropped$VH.get(seg);
    }

    public static void kdropped$set(MemorySegment seg, MemorySegment x) {
        io_uring_sq.kdropped$VH.set(seg, x);
    }

    public static MemorySegment kdropped$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment) io_uring_sq.kdropped$VH.get(seg.asSlice(index * sizeof()));
    }

    public static void kdropped$set(MemorySegment seg, long index, MemorySegment x) {
        io_uring_sq.kdropped$VH.set(seg.asSlice(index * sizeof()), x);
    }

    static final VarHandle array$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("array"));

    public static VarHandle array$VH() {
        return io_uring_sq.array$VH;
    }

    public static MemorySegment array$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment) io_uring_sq.array$VH.get(seg);
    }

    public static void array$set(MemorySegment seg, MemorySegment x) {
        io_uring_sq.array$VH.set(seg, x);
    }

    public static MemorySegment array$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment) io_uring_sq.array$VH.get(seg.asSlice(index * sizeof()));
    }

    public static void array$set(MemorySegment seg, long index, MemorySegment x) {
        io_uring_sq.array$VH.set(seg.asSlice(index * sizeof()), x);
    }

    static final VarHandle sqes$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("sqes"));

    public static VarHandle sqes$VH() {
        return io_uring_sq.sqes$VH;
    }

    public static MemorySegment sqes$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment) io_uring_sq.sqes$VH.get(seg);
    }

    public static void sqes$set(MemorySegment seg, MemorySegment x) {
        io_uring_sq.sqes$VH.set(seg, x);
    }

    public static MemorySegment sqes$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment) io_uring_sq.sqes$VH.get(seg.asSlice(index * sizeof()));
    }

    public static void sqes$set(MemorySegment seg, long index, MemorySegment x) {
        io_uring_sq.sqes$VH.set(seg.asSlice(index * sizeof()), x);
    }

    static final VarHandle sqe_head$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("sqe_head"));

    public static VarHandle sqe_head$VH() {
        return io_uring_sq.sqe_head$VH;
    }

    public static int sqe_head$get(MemorySegment seg) {
        return (int) io_uring_sq.sqe_head$VH.get(seg);
    }
    public static void sqe_head$set( MemorySegment seg, int x) {
        io_uring_sq.sqe_head$VH.set(seg, x);
    }
    public static int sqe_head$get(MemorySegment seg, long index) {
        return (int)io_uring_sq.sqe_head$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void sqe_head$set(MemorySegment seg, long index, int x) {
        io_uring_sq.sqe_head$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle sqe_tail$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("sqe_tail"));
    public static VarHandle sqe_tail$VH() {
        return io_uring_sq.sqe_tail$VH;
    }
    public static int sqe_tail$get(MemorySegment seg) {
        return (int)io_uring_sq.sqe_tail$VH.get(seg);
    }
    public static void sqe_tail$set( MemorySegment seg, int x) {
        io_uring_sq.sqe_tail$VH.set(seg, x);
    }
    public static int sqe_tail$get(MemorySegment seg, long index) {
        return (int)io_uring_sq.sqe_tail$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void sqe_tail$set(MemorySegment seg, long index, int x) {
        io_uring_sq.sqe_tail$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ring_sz$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ring_sz"));
    public static VarHandle ring_sz$VH() {
        return io_uring_sq.ring_sz$VH;
    }
    public static long ring_sz$get(MemorySegment seg) {
        return (long)io_uring_sq.ring_sz$VH.get(seg);
    }
    public static void ring_sz$set( MemorySegment seg, long x) {
        io_uring_sq.ring_sz$VH.set(seg, x);
    }

    public static long ring_sz$get(MemorySegment seg, long index) {
        return (long) io_uring_sq.ring_sz$VH.get(seg.asSlice(index * sizeof()));
    }

    public static void ring_sz$set(MemorySegment seg, long index, long x) {
        io_uring_sq.ring_sz$VH.set(seg.asSlice(index * sizeof()), x);
    }

    static final VarHandle ring_ptr$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ring_ptr"));

    public static VarHandle ring_ptr$VH() {
        return io_uring_sq.ring_ptr$VH;
    }

    public static MemorySegment ring_ptr$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment) io_uring_sq.ring_ptr$VH.get(seg);
    }

    public static void ring_ptr$set(MemorySegment seg, MemorySegment x) {
        io_uring_sq.ring_ptr$VH.set(seg, x);
    }

    public static MemorySegment ring_ptr$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment) io_uring_sq.ring_ptr$VH.get(seg.asSlice(index * sizeof()));
    }

    public static void ring_ptr$set(MemorySegment seg, long index, MemorySegment x) {
        io_uring_sq.ring_ptr$VH.set(seg.asSlice(index * sizeof()), x);
    }

    public static MemorySegment pad$slice(MemorySegment seg) {
        return seg.asSlice(88, 16);
    }

    public static long sizeof() {
        return $LAYOUT().byteSize();
    }

    public static MemorySegment allocate(SegmentAllocator allocator) {
        return allocator.allocate($LAYOUT());
    }

    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
}



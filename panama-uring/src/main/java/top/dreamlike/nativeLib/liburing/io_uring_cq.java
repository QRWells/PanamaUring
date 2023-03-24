// Generated by jextract

package top.dreamlike.nativeLib.liburing;

import java.lang.foreign.*;
import java.lang.invoke.VarHandle;

public class io_uring_cq {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("khead"),
        Constants$root.C_POINTER$LAYOUT.withName("ktail"),
        Constants$root.C_POINTER$LAYOUT.withName("kring_mask"),
        Constants$root.C_POINTER$LAYOUT.withName("kring_entries"),
        Constants$root.C_POINTER$LAYOUT.withName("kflags"),
        Constants$root.C_POINTER$LAYOUT.withName("koverflow"),
        Constants$root.C_POINTER$LAYOUT.withName("cqes"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("ring_sz"),
            Constants$root.C_POINTER$LAYOUT.withName("ring_ptr"),
            MemoryLayout.sequenceLayout(4, Constants$root.C_INT$LAYOUT).withName("pad")
    ).withName("io_uring_cq");

    public static MemoryLayout $LAYOUT() {
        return io_uring_cq.$struct$LAYOUT;
    }

    static final VarHandle khead$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("khead"));

    public static VarHandle khead$VH() {
        return io_uring_cq.khead$VH;
    }

    public static MemorySegment khead$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment) io_uring_cq.khead$VH.get(seg);
    }

    public static void khead$set(MemorySegment seg, MemorySegment x) {
        io_uring_cq.khead$VH.set(seg, x);
    }

    public static MemorySegment khead$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment) io_uring_cq.khead$VH.get(seg.asSlice(index * sizeof()));
    }

    public static void khead$set(MemorySegment seg, long index, MemorySegment x) {
        io_uring_cq.khead$VH.set(seg.asSlice(index * sizeof()), x);
    }

    static final VarHandle ktail$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ktail"));

    public static VarHandle ktail$VH() {
        return io_uring_cq.ktail$VH;
    }

    public static MemorySegment ktail$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment) io_uring_cq.ktail$VH.get(seg);
    }

    public static void ktail$set(MemorySegment seg, MemorySegment x) {
        io_uring_cq.ktail$VH.set(seg, x);
    }

    public static MemorySegment ktail$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment) io_uring_cq.ktail$VH.get(seg.asSlice(index * sizeof()));
    }

    public static void ktail$set(MemorySegment seg, long index, MemorySegment x) {
        io_uring_cq.ktail$VH.set(seg.asSlice(index * sizeof()), x);
    }

    static final VarHandle kring_mask$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("kring_mask"));

    public static VarHandle kring_mask$VH() {
        return io_uring_cq.kring_mask$VH;
    }

    public static MemorySegment kring_mask$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment) io_uring_cq.kring_mask$VH.get(seg);
    }

    public static void kring_mask$set(MemorySegment seg, MemorySegment x) {
        io_uring_cq.kring_mask$VH.set(seg, x);
    }

    public static MemorySegment kring_mask$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment) io_uring_cq.kring_mask$VH.get(seg.asSlice(index * sizeof()));
    }

    public static void kring_mask$set(MemorySegment seg, long index, MemorySegment x) {
        io_uring_cq.kring_mask$VH.set(seg.asSlice(index * sizeof()), x);
    }

    static final VarHandle kring_entries$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("kring_entries"));

    public static VarHandle kring_entries$VH() {
        return io_uring_cq.kring_entries$VH;
    }

    public static MemorySegment kring_entries$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment) io_uring_cq.kring_entries$VH.get(seg);
    }

    public static void kring_entries$set(MemorySegment seg, MemorySegment x) {
        io_uring_cq.kring_entries$VH.set(seg, x);
    }

    public static MemorySegment kring_entries$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment) io_uring_cq.kring_entries$VH.get(seg.asSlice(index * sizeof()));
    }

    public static void kring_entries$set(MemorySegment seg, long index, MemorySegment x) {
        io_uring_cq.kring_entries$VH.set(seg.asSlice(index * sizeof()), x);
    }

    static final VarHandle kflags$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("kflags"));

    public static VarHandle kflags$VH() {
        return io_uring_cq.kflags$VH;
    }

    public static MemorySegment kflags$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment) io_uring_cq.kflags$VH.get(seg);
    }

    public static void kflags$set(MemorySegment seg, MemorySegment x) {
        io_uring_cq.kflags$VH.set(seg, x);
    }

    public static MemorySegment kflags$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment) io_uring_cq.kflags$VH.get(seg.asSlice(index * sizeof()));
    }

    public static void kflags$set(MemorySegment seg, long index, MemorySegment x) {
        io_uring_cq.kflags$VH.set(seg.asSlice(index * sizeof()), x);
    }

    static final VarHandle koverflow$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("koverflow"));

    public static VarHandle koverflow$VH() {
        return io_uring_cq.koverflow$VH;
    }

    public static MemorySegment koverflow$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment) io_uring_cq.koverflow$VH.get(seg);
    }

    public static void koverflow$set(MemorySegment seg, MemorySegment x) {
        io_uring_cq.koverflow$VH.set(seg, x);
    }

    public static MemorySegment koverflow$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment) io_uring_cq.koverflow$VH.get(seg.asSlice(index * sizeof()));
    }

    public static void koverflow$set(MemorySegment seg, long index, MemorySegment x) {
        io_uring_cq.koverflow$VH.set(seg.asSlice(index * sizeof()), x);
    }

    static final VarHandle cqes$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cqes"));

    public static VarHandle cqes$VH() {
        return io_uring_cq.cqes$VH;
    }

    public static MemorySegment cqes$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment) io_uring_cq.cqes$VH.get(seg);
    }

    public static void cqes$set(MemorySegment seg, MemorySegment x) {
        io_uring_cq.cqes$VH.set(seg, x);
    }

    public static MemorySegment cqes$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment) io_uring_cq.cqes$VH.get(seg.asSlice(index * sizeof()));
    }

    public static void cqes$set(MemorySegment seg, long index, MemorySegment x) {
        io_uring_cq.cqes$VH.set(seg.asSlice(index * sizeof()), x);
    }

    static final VarHandle ring_sz$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ring_sz"));

    public static VarHandle ring_sz$VH() {
        return io_uring_cq.ring_sz$VH;
    }

    public static long ring_sz$get(MemorySegment seg) {
        return (long) io_uring_cq.ring_sz$VH.get(seg);
    }
    public static void ring_sz$set( MemorySegment seg, long x) {
        io_uring_cq.ring_sz$VH.set(seg, x);
    }

    public static long ring_sz$get(MemorySegment seg, long index) {
        return (long) io_uring_cq.ring_sz$VH.get(seg.asSlice(index * sizeof()));
    }

    public static void ring_sz$set(MemorySegment seg, long index, long x) {
        io_uring_cq.ring_sz$VH.set(seg.asSlice(index * sizeof()), x);
    }

    static final VarHandle ring_ptr$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ring_ptr"));

    public static VarHandle ring_ptr$VH() {
        return io_uring_cq.ring_ptr$VH;
    }

    public static MemorySegment ring_ptr$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment) io_uring_cq.ring_ptr$VH.get(seg);
    }

    public static void ring_ptr$set(MemorySegment seg, MemorySegment x) {
        io_uring_cq.ring_ptr$VH.set(seg, x);
    }

    public static MemorySegment ring_ptr$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment) io_uring_cq.ring_ptr$VH.get(seg.asSlice(index * sizeof()));
    }

    public static void ring_ptr$set(MemorySegment seg, long index, MemorySegment x) {
        io_uring_cq.ring_ptr$VH.set(seg.asSlice(index * sizeof()), x);
    }

    public static MemorySegment pad$slice(MemorySegment seg) {
        return seg.asSlice(72, 16);
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

    public static MemorySegment ofAddress(MemorySegment addr, Arena session) {
        return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session);
    }
}



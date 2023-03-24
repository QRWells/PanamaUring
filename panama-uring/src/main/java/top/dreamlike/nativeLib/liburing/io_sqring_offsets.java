// Generated by jextract

package top.dreamlike.nativeLib.liburing;

import java.lang.foreign.*;
import java.lang.invoke.VarHandle;

public class io_sqring_offsets {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_INT$LAYOUT.withName("head"),
        Constants$root.C_INT$LAYOUT.withName("tail"),
        Constants$root.C_INT$LAYOUT.withName("ring_mask"),
        Constants$root.C_INT$LAYOUT.withName("ring_entries"),
        Constants$root.C_INT$LAYOUT.withName("flags"),
        Constants$root.C_INT$LAYOUT.withName("dropped"),
        Constants$root.C_INT$LAYOUT.withName("array"),
        Constants$root.C_INT$LAYOUT.withName("resv1"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("resv2")
    ).withName("io_sqring_offsets");
    public static MemoryLayout $LAYOUT() {
        return io_sqring_offsets.$struct$LAYOUT;
    }
    static final VarHandle head$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("head"));
    public static VarHandle head$VH() {
        return io_sqring_offsets.head$VH;
    }
    public static int head$get(MemorySegment seg) {
        return (int)io_sqring_offsets.head$VH.get(seg);
    }
    public static void head$set( MemorySegment seg, int x) {
        io_sqring_offsets.head$VH.set(seg, x);
    }
    public static int head$get(MemorySegment seg, long index) {
        return (int)io_sqring_offsets.head$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void head$set(MemorySegment seg, long index, int x) {
        io_sqring_offsets.head$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle tail$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("tail"));
    public static VarHandle tail$VH() {
        return io_sqring_offsets.tail$VH;
    }
    public static int tail$get(MemorySegment seg) {
        return (int)io_sqring_offsets.tail$VH.get(seg);
    }
    public static void tail$set( MemorySegment seg, int x) {
        io_sqring_offsets.tail$VH.set(seg, x);
    }
    public static int tail$get(MemorySegment seg, long index) {
        return (int)io_sqring_offsets.tail$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void tail$set(MemorySegment seg, long index, int x) {
        io_sqring_offsets.tail$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ring_mask$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ring_mask"));
    public static VarHandle ring_mask$VH() {
        return io_sqring_offsets.ring_mask$VH;
    }
    public static int ring_mask$get(MemorySegment seg) {
        return (int)io_sqring_offsets.ring_mask$VH.get(seg);
    }
    public static void ring_mask$set( MemorySegment seg, int x) {
        io_sqring_offsets.ring_mask$VH.set(seg, x);
    }
    public static int ring_mask$get(MemorySegment seg, long index) {
        return (int)io_sqring_offsets.ring_mask$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ring_mask$set(MemorySegment seg, long index, int x) {
        io_sqring_offsets.ring_mask$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ring_entries$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ring_entries"));
    public static VarHandle ring_entries$VH() {
        return io_sqring_offsets.ring_entries$VH;
    }
    public static int ring_entries$get(MemorySegment seg) {
        return (int)io_sqring_offsets.ring_entries$VH.get(seg);
    }
    public static void ring_entries$set( MemorySegment seg, int x) {
        io_sqring_offsets.ring_entries$VH.set(seg, x);
    }
    public static int ring_entries$get(MemorySegment seg, long index) {
        return (int)io_sqring_offsets.ring_entries$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ring_entries$set(MemorySegment seg, long index, int x) {
        io_sqring_offsets.ring_entries$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle flags$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("flags"));
    public static VarHandle flags$VH() {
        return io_sqring_offsets.flags$VH;
    }
    public static int flags$get(MemorySegment seg) {
        return (int)io_sqring_offsets.flags$VH.get(seg);
    }
    public static void flags$set( MemorySegment seg, int x) {
        io_sqring_offsets.flags$VH.set(seg, x);
    }
    public static int flags$get(MemorySegment seg, long index) {
        return (int)io_sqring_offsets.flags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void flags$set(MemorySegment seg, long index, int x) {
        io_sqring_offsets.flags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dropped$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dropped"));
    public static VarHandle dropped$VH() {
        return io_sqring_offsets.dropped$VH;
    }
    public static int dropped$get(MemorySegment seg) {
        return (int)io_sqring_offsets.dropped$VH.get(seg);
    }
    public static void dropped$set( MemorySegment seg, int x) {
        io_sqring_offsets.dropped$VH.set(seg, x);
    }
    public static int dropped$get(MemorySegment seg, long index) {
        return (int)io_sqring_offsets.dropped$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dropped$set(MemorySegment seg, long index, int x) {
        io_sqring_offsets.dropped$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle array$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("array"));
    public static VarHandle array$VH() {
        return io_sqring_offsets.array$VH;
    }
    public static int array$get(MemorySegment seg) {
        return (int)io_sqring_offsets.array$VH.get(seg);
    }
    public static void array$set( MemorySegment seg, int x) {
        io_sqring_offsets.array$VH.set(seg, x);
    }
    public static int array$get(MemorySegment seg, long index) {
        return (int)io_sqring_offsets.array$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void array$set(MemorySegment seg, long index, int x) {
        io_sqring_offsets.array$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle resv1$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("resv1"));
    public static VarHandle resv1$VH() {
        return io_sqring_offsets.resv1$VH;
    }
    public static int resv1$get(MemorySegment seg) {
        return (int)io_sqring_offsets.resv1$VH.get(seg);
    }
    public static void resv1$set( MemorySegment seg, int x) {
        io_sqring_offsets.resv1$VH.set(seg, x);
    }
    public static int resv1$get(MemorySegment seg, long index) {
        return (int)io_sqring_offsets.resv1$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void resv1$set(MemorySegment seg, long index, int x) {
        io_sqring_offsets.resv1$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle resv2$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("resv2"));
    public static VarHandle resv2$VH() {
        return io_sqring_offsets.resv2$VH;
    }
    public static long resv2$get(MemorySegment seg) {
        return (long)io_sqring_offsets.resv2$VH.get(seg);
    }
    public static void resv2$set( MemorySegment seg, long x) {
        io_sqring_offsets.resv2$VH.set(seg, x);
    }
    public static long resv2$get(MemorySegment seg, long index) {
        return (long)io_sqring_offsets.resv2$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void resv2$set(MemorySegment seg, long index, long x) {
        io_sqring_offsets.resv2$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }

    public static MemorySegment ofAddress(MemorySegment addr, Arena session) {
        return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session);
    }
}



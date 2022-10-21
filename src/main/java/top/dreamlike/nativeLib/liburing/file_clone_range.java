// Generated by jextract

package top.dreamlike.nativeLib.liburing;

import java.lang.invoke.VarHandle;
import java.lang.foreign.*;

public class file_clone_range {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG_LONG$LAYOUT.withName("src_fd"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("src_offset"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("src_length"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("dest_offset")
    ).withName("file_clone_range");
    public static MemoryLayout $LAYOUT() {
        return file_clone_range.$struct$LAYOUT;
    }
    static final VarHandle src_fd$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("src_fd"));
    public static VarHandle src_fd$VH() {
        return file_clone_range.src_fd$VH;
    }
    public static long src_fd$get(MemorySegment seg) {
        return (long)file_clone_range.src_fd$VH.get(seg);
    }
    public static void src_fd$set( MemorySegment seg, long x) {
        file_clone_range.src_fd$VH.set(seg, x);
    }
    public static long src_fd$get(MemorySegment seg, long index) {
        return (long)file_clone_range.src_fd$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void src_fd$set(MemorySegment seg, long index, long x) {
        file_clone_range.src_fd$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle src_offset$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("src_offset"));
    public static VarHandle src_offset$VH() {
        return file_clone_range.src_offset$VH;
    }
    public static long src_offset$get(MemorySegment seg) {
        return (long)file_clone_range.src_offset$VH.get(seg);
    }
    public static void src_offset$set( MemorySegment seg, long x) {
        file_clone_range.src_offset$VH.set(seg, x);
    }
    public static long src_offset$get(MemorySegment seg, long index) {
        return (long)file_clone_range.src_offset$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void src_offset$set(MemorySegment seg, long index, long x) {
        file_clone_range.src_offset$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle src_length$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("src_length"));
    public static VarHandle src_length$VH() {
        return file_clone_range.src_length$VH;
    }
    public static long src_length$get(MemorySegment seg) {
        return (long)file_clone_range.src_length$VH.get(seg);
    }
    public static void src_length$set( MemorySegment seg, long x) {
        file_clone_range.src_length$VH.set(seg, x);
    }
    public static long src_length$get(MemorySegment seg, long index) {
        return (long)file_clone_range.src_length$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void src_length$set(MemorySegment seg, long index, long x) {
        file_clone_range.src_length$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dest_offset$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dest_offset"));
    public static VarHandle dest_offset$VH() {
        return file_clone_range.dest_offset$VH;
    }
    public static long dest_offset$get(MemorySegment seg) {
        return (long)file_clone_range.dest_offset$VH.get(seg);
    }
    public static void dest_offset$set( MemorySegment seg, long x) {
        file_clone_range.dest_offset$VH.set(seg, x);
    }
    public static long dest_offset$get(MemorySegment seg, long index) {
        return (long)file_clone_range.dest_offset$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dest_offset$set(MemorySegment seg, long index, long x) {
        file_clone_range.dest_offset$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


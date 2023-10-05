// Generated by jextract

package top.dreamlike.nativeLib.inet;

import top.dreamlike.common.CType;

import java.lang.foreign.GroupLayout;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.invoke.VarHandle;
public class cmsghdr {

    static final GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
            CType.C_LONG_LONG$LAYOUT.withName("cmsg_len"),
            CType.C_INT$LAYOUT.withName("cmsg_level"),
            CType.C_INT$LAYOUT.withName("cmsg_type"),
            MemoryLayout.sequenceLayout(0, CType.C_CHAR$LAYOUT).withName("__cmsg_data")
    ).withName("cmsghdr");

    public static MemoryLayout $LAYOUT() {
        return cmsghdr.$struct$LAYOUT;
    }

    static final VarHandle cmsg_len$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cmsg_len"));

    public static VarHandle cmsg_len$VH() {
        return cmsghdr.cmsg_len$VH;
    }

    public static long cmsg_len$get(MemorySegment seg) {
        return (long)cmsghdr.cmsg_len$VH.get(seg);
    }
    public static void cmsg_len$set( MemorySegment seg, long x) {
        cmsghdr.cmsg_len$VH.set(seg, x);
    }
    public static long cmsg_len$get(MemorySegment seg, long index) {
        return (long)cmsghdr.cmsg_len$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cmsg_len$set(MemorySegment seg, long index, long x) {
        cmsghdr.cmsg_len$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle cmsg_level$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cmsg_level"));
    public static VarHandle cmsg_level$VH() {
        return cmsghdr.cmsg_level$VH;
    }
    public static int cmsg_level$get(MemorySegment seg) {
        return (int)cmsghdr.cmsg_level$VH.get(seg);
    }
    public static void cmsg_level$set( MemorySegment seg, int x) {
        cmsghdr.cmsg_level$VH.set(seg, x);
    }
    public static int cmsg_level$get(MemorySegment seg, long index) {
        return (int)cmsghdr.cmsg_level$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cmsg_level$set(MemorySegment seg, long index, int x) {
        cmsghdr.cmsg_level$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle cmsg_type$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cmsg_type"));
    public static VarHandle cmsg_type$VH() {
        return cmsghdr.cmsg_type$VH;
    }
    public static int cmsg_type$get(MemorySegment seg) {
        return (int)cmsghdr.cmsg_type$VH.get(seg);
    }
    public static void cmsg_type$set( MemorySegment seg, int x) {
        cmsghdr.cmsg_type$VH.set(seg, x);
    }
    public static int cmsg_type$get(MemorySegment seg, long index) {
        return (int)cmsghdr.cmsg_type$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cmsg_type$set(MemorySegment seg, long index, int x) {
        cmsghdr.cmsg_type$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }


}



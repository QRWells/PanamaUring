// Generated by jextract

package top.dreamlike.nativeLib.inet;

import java.lang.foreign.*;
import java.lang.invoke.VarHandle;

public class ip_msfilter {

    static final GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
            MemoryLayout.structLayout(
                    Constants$root.C_INT$LAYOUT.withName("s_addr")
            ).withName("imsf_multiaddr"),
            MemoryLayout.structLayout(
                    Constants$root.C_INT$LAYOUT.withName("s_addr")
            ).withName("imsf_interface"),
            Constants$root.C_INT$LAYOUT.withName("imsf_fmode"),
            Constants$root.C_INT$LAYOUT.withName("imsf_numsrc"),
            MemoryLayout.sequenceLayout(1, MemoryLayout.structLayout(
                    Constants$root.C_INT$LAYOUT.withName("s_addr")
            ).withName("in_addr")).withName("imsf_slist")
    ).withName("ip_msfilter");

    public static MemoryLayout $LAYOUT() {
        return ip_msfilter.$struct$LAYOUT;
    }

    public static MemorySegment imsf_multiaddr$slice(MemorySegment seg) {
        return seg.asSlice(0, 4);
    }
    public static MemorySegment imsf_interface$slice(MemorySegment seg) {
        return seg.asSlice(4, 4);
    }
    static final VarHandle imsf_fmode$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("imsf_fmode"));
    public static VarHandle imsf_fmode$VH() {
        return ip_msfilter.imsf_fmode$VH;
    }
    public static int imsf_fmode$get(MemorySegment seg) {
        return (int)ip_msfilter.imsf_fmode$VH.get(seg);
    }
    public static void imsf_fmode$set( MemorySegment seg, int x) {
        ip_msfilter.imsf_fmode$VH.set(seg, x);
    }
    public static int imsf_fmode$get(MemorySegment seg, long index) {
        return (int)ip_msfilter.imsf_fmode$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void imsf_fmode$set(MemorySegment seg, long index, int x) {
        ip_msfilter.imsf_fmode$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle imsf_numsrc$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("imsf_numsrc"));
    public static VarHandle imsf_numsrc$VH() {
        return ip_msfilter.imsf_numsrc$VH;
    }
    public static int imsf_numsrc$get(MemorySegment seg) {
        return (int)ip_msfilter.imsf_numsrc$VH.get(seg);
    }
    public static void imsf_numsrc$set( MemorySegment seg, int x) {
        ip_msfilter.imsf_numsrc$VH.set(seg, x);
    }
    public static int imsf_numsrc$get(MemorySegment seg, long index) {
        return (int)ip_msfilter.imsf_numsrc$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void imsf_numsrc$set(MemorySegment seg, long index, int x) {
        ip_msfilter.imsf_numsrc$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment imsf_slist$slice(MemorySegment seg) {
        return seg.asSlice(16, 4);
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



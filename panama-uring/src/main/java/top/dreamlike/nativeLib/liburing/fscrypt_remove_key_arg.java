// Generated by jextract

package top.dreamlike.nativeLib.liburing;

import java.lang.foreign.*;
import java.lang.invoke.VarHandle;

public class fscrypt_remove_key_arg {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            Constants$root.C_INT$LAYOUT.withName("type"),
            Constants$root.C_INT$LAYOUT.withName("__reserved"),
            MemoryLayout.unionLayout(
                MemoryLayout.sequenceLayout(32, Constants$root.C_CHAR$LAYOUT).withName("__reserved"),
                MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("descriptor"),
                MemoryLayout.sequenceLayout(16, Constants$root.C_CHAR$LAYOUT).withName("identifier")
            ).withName("u")
        ).withName("key_spec"),
        Constants$root.C_INT$LAYOUT.withName("removal_status_flags"),
        MemoryLayout.sequenceLayout(5, Constants$root.C_INT$LAYOUT).withName("__reserved")
    ).withName("fscrypt_remove_key_arg");
    public static MemoryLayout $LAYOUT() {
        return fscrypt_remove_key_arg.$struct$LAYOUT;
    }
    public static MemorySegment key_spec$slice(MemorySegment seg) {
        return seg.asSlice(0, 40);
    }
    static final VarHandle removal_status_flags$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("removal_status_flags"));
    public static VarHandle removal_status_flags$VH() {
        return fscrypt_remove_key_arg.removal_status_flags$VH;
    }
    public static int removal_status_flags$get(MemorySegment seg) {
        return (int)fscrypt_remove_key_arg.removal_status_flags$VH.get(seg);
    }
    public static void removal_status_flags$set( MemorySegment seg, int x) {
        fscrypt_remove_key_arg.removal_status_flags$VH.set(seg, x);
    }
    public static int removal_status_flags$get(MemorySegment seg, long index) {
        return (int)fscrypt_remove_key_arg.removal_status_flags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void removal_status_flags$set(MemorySegment seg, long index, int x) {
        fscrypt_remove_key_arg.removal_status_flags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment __reserved$slice(MemorySegment seg) {
        return seg.asSlice(44, 20);
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



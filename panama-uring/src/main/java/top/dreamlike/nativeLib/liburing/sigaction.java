// Generated by jextract

package top.dreamlike.nativeLib.liburing;

import java.lang.foreign.*;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;

public class sigaction {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.unionLayout(
            Constants$root.C_POINTER$LAYOUT.withName("sa_handler"),
            Constants$root.C_POINTER$LAYOUT.withName("sa_sigaction")
        ).withName("__sigaction_handler"),
        MemoryLayout.structLayout(
            MemoryLayout.sequenceLayout(16, Constants$root.C_LONG_LONG$LAYOUT).withName("__val")
        ).withName("sa_mask"),
        Constants$root.C_INT$LAYOUT.withName("sa_flags"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("sa_restorer")
    ).withName("sigaction");
    public static MemoryLayout $LAYOUT() {
        return sigaction.$struct$LAYOUT;
    }
    public static MemorySegment sa_restorer$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment) sigaction.sa_restorer$VH.get(seg);
    }

    public static MemorySegment __sigaction_handler$slice(MemorySegment seg) {
        return seg.asSlice(0, 8);
    }
    public static MemorySegment sa_mask$slice(MemorySegment seg) {
        return seg.asSlice(8, 128);
    }
    static final VarHandle sa_flags$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("sa_flags"));
    public static VarHandle sa_flags$VH() {
        return sigaction.sa_flags$VH;
    }
    public static int sa_flags$get(MemorySegment seg) {
        return (int)sigaction.sa_flags$VH.get(seg);
    }
    public static void sa_flags$set( MemorySegment seg, int x) {
        sigaction.sa_flags$VH.set(seg, x);
    }
    public static int sa_flags$get(MemorySegment seg, long index) {
        return (int)sigaction.sa_flags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void sa_flags$set(MemorySegment seg, long index, int x) {
        sigaction.sa_flags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final FunctionDescriptor sa_restorer$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle sa_restorer$MH = RuntimeHelper.downcallHandle(
        sigaction.sa_restorer$FUNC
    );

    public static void sa_restorer$set(MemorySegment seg, MemorySegment x) {
        sigaction.sa_restorer$VH.set(seg, x);
    }

    static final VarHandle sa_restorer$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("sa_restorer"));

    public static VarHandle sa_restorer$VH() {
        return sigaction.sa_restorer$VH;
    }

    public static MemorySegment sa_restorer$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment) sigaction.sa_restorer$VH.get(seg.asSlice(index * sizeof()));
    }

    public static void sa_restorer$set(MemorySegment seg, long index, MemorySegment x) {
        sigaction.sa_restorer$VH.set(seg.asSlice(index * sizeof()), x);
    }

    public static sa_restorer sa_restorer(MemorySegment segment, Arena session) {
        return sa_restorer.ofAddress(sa_restorer$get(segment), session);
    }

    public static long sizeof() {
        return $LAYOUT().byteSize();
    }

    public static MemorySegment allocate(SegmentAllocator allocator) {
        return allocator.allocate($LAYOUT());
    }

    public static MemorySegment ofAddress(MemorySegment addr, Arena session) {
        return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session);
    }

    public interface sa_restorer {

        void apply();

        static MemorySegment allocate(sa_restorer fi, Arena session) {
            return RuntimeHelper.upcallStub(sa_restorer.class, fi, sigaction.sa_restorer$FUNC, session);
        }

        static sa_restorer ofAddress(MemorySegment addr, Arena session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, session.scope());
            return () -> {
                try {
                    sigaction.sa_restorer$MH.invokeExact((MemorySegment) symbol);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }

    public static class __sigaction_handler {

        static final  GroupLayout __sigaction_handler$union$LAYOUT = MemoryLayout.unionLayout(
                Constants$root.C_POINTER$LAYOUT.withName("sa_handler"),
                Constants$root.C_POINTER$LAYOUT.withName("sa_sigaction")
        );

        public static MemoryLayout $LAYOUT() {
            return __sigaction_handler.__sigaction_handler$union$LAYOUT;
        }

        static final VarHandle sa_handler$VH = __sigaction_handler$union$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("sa_handler"));

        public static VarHandle sa_handler$VH() {
            return __sigaction_handler.sa_handler$VH;
        }
        static final FunctionDescriptor sa_sigaction$FUNC = FunctionDescriptor.ofVoid(
                Constants$root.C_INT$LAYOUT,
                Constants$root.C_POINTER$LAYOUT,
            Constants$root.C_POINTER$LAYOUT
        );

        public static MemorySegment sa_handler$get(MemorySegment seg) {
            return (java.lang.foreign.MemorySegment) __sigaction_handler.sa_handler$VH.get(seg);
        }

        public static void sa_handler$set(MemorySegment seg, MemorySegment x) {
            __sigaction_handler.sa_handler$VH.set(seg, x);
        }

        public static MemorySegment sa_handler$get(MemorySegment seg, long index) {
            return (java.lang.foreign.MemorySegment) __sigaction_handler.sa_handler$VH.get(seg.asSlice(index * sizeof()));
        }

        public static void sa_handler$set(MemorySegment seg, long index, MemorySegment x) {
            __sigaction_handler.sa_handler$VH.set(seg.asSlice(index * sizeof()), x);
        }

        public static __sighandler_t sa_handler(MemorySegment segment, Arena session) {
            return __sighandler_t.ofAddress(sa_handler$get(segment), session);
        }
        static final MethodHandle sa_sigaction$MH = RuntimeHelper.downcallHandle(
            __sigaction_handler.sa_sigaction$FUNC
        );

        public static MemorySegment sa_sigaction$get(MemorySegment seg) {
            return (java.lang.foreign.MemorySegment) __sigaction_handler.sa_sigaction$VH.get(seg);
        }

        static final VarHandle sa_sigaction$VH = __sigaction_handler$union$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("sa_sigaction"));

        public static VarHandle sa_sigaction$VH() {
            return __sigaction_handler.sa_sigaction$VH;
        }

        public static void sa_sigaction$set(MemorySegment seg, MemorySegment x) {
            __sigaction_handler.sa_sigaction$VH.set(seg, x);
        }

        public static MemorySegment sa_sigaction$get(MemorySegment seg, long index) {
            return (java.lang.foreign.MemorySegment) __sigaction_handler.sa_sigaction$VH.get(seg.asSlice(index * sizeof()));
        }

        public static void sa_sigaction$set(MemorySegment seg, long index, MemorySegment x) {
            __sigaction_handler.sa_sigaction$VH.set(seg.asSlice(index * sizeof()), x);
        }

        public static sa_sigaction sa_sigaction(MemorySegment segment, Arena session) {
            return sa_sigaction.ofAddress(sa_sigaction$get(segment), session);
        }

        public static long sizeof() {
            return $LAYOUT().byteSize();
        }

        public static MemorySegment allocate(SegmentAllocator allocator) {
            return allocator.allocate($LAYOUT());
        }

        public static MemorySegment ofAddress(MemorySegment addr, Arena session) {
            return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session);
        }

        public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
            return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
        }

        public interface sa_sigaction {

            static MemorySegment allocate(sa_sigaction fi, Arena session) {
                return RuntimeHelper.upcallStub(sa_sigaction.class, fi, __sigaction_handler.sa_sigaction$FUNC, session);
            }

            static sa_sigaction ofAddress(MemorySegment addr, Arena session) {
                MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, session.scope());
                return (int __x0, java.lang.foreign.MemorySegment __x1, java.lang.foreign.MemorySegment __x2) -> {
                    try {
                        __sigaction_handler.sa_sigaction$MH.invokeExact((MemorySegment) symbol, __x0, (java.lang.foreign.MemorySegment) __x1, (java.lang.foreign.MemorySegment) __x2);
                    } catch (Throwable ex$) {
                        throw new AssertionError("should not reach here", ex$);
                    }
                };
            }

            void apply(int _x0, java.lang.foreign.MemorySegment _x1, java.lang.foreign.MemorySegment _x2);
        }
    }
}



// Generated by jextract

package top.dreamlike.nativeLib.liburing;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;

public interface __kernel_sighandler_t {

    void apply(int _x0);

    static MemorySegment allocate(__kernel_sighandler_t fi, Arena session) {
        return RuntimeHelper.upcallStub(__kernel_sighandler_t.class, fi, constants$18.__kernel_sighandler_t$FUNC, session);
    }

    static __kernel_sighandler_t ofAddress(MemorySegment addr, Arena session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, session.scope());
        return (int __x0) -> {
            try {
                constants$18.__kernel_sighandler_t$MH.invokeExact((MemorySegment) symbol, __x0);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}



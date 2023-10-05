// Generated by jextract

package top.dreamlike.nativeLib.errno;

import top.dreamlike.helper.RuntimeHelper;

import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;
public class errno_h  {

    /* package-private */ errno_h() {}

    public final static int ENOENT = 2;
    public final static int EINVAL = 22;
    public final static int EALREADY = 114;

    public static int EPERM() {
        return (int) 1L;
    }

    public static int ENOENT() {
        return (int) 2L;
    }

    public static int ESRCH() {
        return (int) 3L;
    }
    public static int ENXIO() {
        return (int)6L;
    }
    public static int E2BIG() {
        return (int)7L;
    }
    public static int ENOEXEC() {
        return (int)8L;
    }
    public static int EBADF() {
        return (int)9L;
    }
    public static int ECHILD() {
        return (int)10L;
    }
    public static int EAGAIN() {
        return (int)11L;
    }
    public static int ENOMEM() {
        return (int)12L;
    }
    public static int EACCES() {
        return (int)13L;
    }
    public static int EFAULT() {
        return (int)14L;
    }
    public static int ENOTBLK() {
        return (int)15L;
    }
    public static int EBUSY() {
        return (int)16L;
    }

    public static int EEXIST() {
        return (int) 17L;
    }

    public static int EXDEV() {
        return (int) 18L;
    }

    public static int ENODEV() {
        return (int) 19L;
    }

    public static int EINTR() {
        return (int) 4L;
    }

    public static int EIO() {
        return (int) 5L;
    }

    public static int ENOTDIR() {
        return (int) 20L;
    }

    public static int EISDIR() {
        return (int) 21L;
    }

    public static int EINVAL() {
        return (int) 22L;
    }

    public static int ENFILE() {
        return (int) 23L;
    }

    public static int EMFILE() {
        return (int) 24L;
    }
    public static int ETXTBSY() {
        return (int)26L;
    }
    public static int EFBIG() {
        return (int)27L;
    }
    public static int ENOSPC() {
        return (int)28L;
    }
    public static int ESPIPE() {
        return (int)29L;
    }
    public static int EROFS() {
        return (int)30L;
    }
    public static int EMLINK() {
        return (int)31L;
    }
    public static int EPIPE() {
        return (int)32L;
    }
    public static int EDOM() {
        return (int)33L;
    }
    public static int ERANGE() {
        return (int)34L;
    }
    public static int EDEADLK() {
        return (int)35L;
    }
    public static int ENAMETOOLONG() {
        return (int)36L;
    }
    public static int ENOLCK() {
        return (int)37L;
    }
    public static int ENOSYS() {
        return (int)38L;
    }
    public static int ENOTEMPTY() {
        return (int)39L;
    }
    public static int ELOOP() {
        return (int)40L;
    }
    public static int ENOMSG() {
        return (int)42L;
    }
    public static int EIDRM() {
        return (int)43L;
    }
    public static int ECHRNG() {
        return (int)44L;
    }
    public static int EL2NSYNC() {
        return (int)45L;
    }
    public static int EL3HLT() {
        return (int)46L;
    }
    public static int EL3RST() {
        return (int)47L;
    }
    public static int ELNRNG() {
        return (int)48L;
    }
    public static int EUNATCH() {
        return (int)49L;
    }
    public static int ENOCSI() {
        return (int)50L;
    }
    public static int EL2HLT() {
        return (int)51L;
    }
    public static int EBADE() {
        return (int)52L;
    }
    public static int EBADR() {
        return (int)53L;
    }
    public static int EXFULL() {
        return (int)54L;
    }
    public static int ENOANO() {
        return (int)55L;
    }
    public static int EBADRQC() {
        return (int)56L;
    }
    public static int EBADSLT() {
        return (int)57L;
    }
    public static int EBFONT() {
        return (int)59L;
    }
    public static int ENOSTR() {
        return (int)60L;
    }
    public static int ENODATA() {
        return (int)61L;
    }
    public static int ETIME() {
        return (int)62L;
    }
    public static int ENOSR() {
        return (int)63L;
    }
    public static int ENONET() {
        return (int)64L;
    }
    public static int ENOPKG() {
        return (int)65L;
    }
    public static int EREMOTE() {
        return (int)66L;
    }
    public static int ENOLINK() {
        return (int)67L;
    }
    public static int EADV() {
        return (int)68L;
    }
    public static int ESRMNT() {
        return (int)69L;
    }
    public static int ECOMM() {
        return (int)70L;
    }
    public static int EPROTO() {
        return (int)71L;
    }
    public static int EMULTIHOP() {
        return (int)72L;
    }
    public static int EDOTDOT() {
        return (int)73L;
    }
    public static int EBADMSG() {
        return (int)74L;
    }
    public static int EOVERFLOW() {
        return (int)75L;
    }
    public static int ENOTUNIQ() {
        return (int)76L;
    }
    public static int EBADFD() {
        return (int)77L;
    }
    public static int EREMCHG() {
        return (int)78L;
    }
    public static int ELIBACC() {
        return (int)79L;
    }
    public static int ELIBBAD() {
        return (int)80L;
    }
    public static int ELIBSCN() {
        return (int)81L;
    }
    public static int ELIBMAX() {
        return (int)82L;
    }
    public static int ELIBEXEC() {
        return (int)83L;
    }
    public static int EILSEQ() {
        return (int)84L;
    }
    public static int ERESTART() {
        return (int)85L;
    }
    public static int ESTRPIPE() {
        return (int)86L;
    }
    public static int EUSERS() {
        return (int)87L;
    }
    public static int ENOTSOCK() {
        return (int)88L;
    }
    public static int EDESTADDRREQ() {
        return (int)89L;
    }
    public static int EMSGSIZE() {
        return (int)90L;
    }
    public static int EPROTOTYPE() {
        return (int)91L;
    }
    public static int ENOPROTOOPT() {
        return (int)92L;
    }
    public static int EPROTONOSUPPORT() {
        return (int)93L;
    }
    public static int ESOCKTNOSUPPORT() {
        return (int)94L;
    }
    public static int EOPNOTSUPP() {
        return (int)95L;
    }
    public static int EPFNOSUPPORT() {
        return (int)96L;
    }
    public static int EAFNOSUPPORT() {
        return (int)97L;
    }
    public static int EADDRINUSE() {
        return (int)98L;
    }
    public static int EADDRNOTAVAIL() {
        return (int)99L;
    }
    public static int ENETDOWN() {
        return (int)100L;
    }
    public static int ENETUNREACH() {
        return (int)101L;
    }
    public static int ENETRESET() {
        return (int)102L;
    }
    public static int ECONNABORTED() {
        return (int)103L;
    }
    public static int ECONNRESET() {
        return (int)104L;
    }
    public static int ENOBUFS() {
        return (int)105L;
    }
    public static int EISCONN() {
        return (int)106L;
    }
    public static int ENOTCONN() {
        return (int)107L;
    }
    public static int ESHUTDOWN() {
        return (int)108L;
    }

    public static int ETOOMANYREFS() {
        return (int) 109L;
    }

    public static int ETIMEDOUT() {
        return (int) 110L;
    }

    public static int ECONNREFUSED() {
        return (int) 111L;
    }

    public static int ENOTTY() {
        return (int) 25L;
    }

    public static int EHOSTDOWN() {
        return (int) 112L;
    }

    public static int EHOSTUNREACH() {
        return (int) 113L;
    }

    public static int EALREADY() {
        return (int) 114L;
    }

    public static int EINPROGRESS() {
        return (int) 115L;
    }

    public static int ESTALE() {
        return (int) 116L;
    }

    public static int EUCLEAN() {
        return (int) 117L;
    }
    public static int ENOTNAM() {
        return (int)118L;
    }
    public static int ENAVAIL() {
        return (int)119L;
    }
    public static int EISNAM() {
        return (int)120L;
    }
    public static int EREMOTEIO() {
        return (int)121L;
    }
    public static int EDQUOT() {
        return (int)122L;
    }
    public static int ENOMEDIUM() {
        return (int)123L;
    }
    public static int EMEDIUMTYPE() {
        return (int)124L;
    }
    public static int ECANCELED() {
        return (int)125L;
    }
    public static int ENOKEY() {
        return (int)126L;
    }
    public static int EKEYEXPIRED() {
        return (int)127L;
    }
    public static int EKEYREVOKED() {
        return (int)128L;
    }
    public static int EKEYREJECTED() {
        return (int)129L;
    }
    public static int EOWNERDEAD() {
        return (int)130L;
    }
    public static int ENOTRECOVERABLE() {
        return (int)131L;
    }
    public static int ERFKILL() {
        return (int)132L;
    }
    public static int EHWPOISON() {
        return (int)133L;
    }

    private static MethodHandle errnoLocation$MH() {
        return RuntimeHelper.requireNonNull(constants$0.__errno_location$MH, "__errno_location");
    }

    public static MemorySegment errno_location() {
        var mh$ = errnoLocation$MH();
        try {
            return (java.lang.foreign.MemorySegment) mh$.invokeExact();
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static int EWOULDBLOCK() {
        return (int)11L;
    }
    public static int EDEADLOCK() {
        return (int)35L;
    }
    public static int ENOTSUP() {
        return (int)95L;
    }
}



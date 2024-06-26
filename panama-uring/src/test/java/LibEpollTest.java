import org.junit.Assert;
import org.junit.Test;
import top.dreamlike.panama.uring.helper.EpollEvent;
import top.dreamlike.panama.uring.nativelib.helper.NativeHelper;
import top.dreamlike.panama.uring.nativelib.libs.LibEpoll;
import top.dreamlike.panama.uring.sync.fd.EpollFd;
import top.dreamlike.panama.uring.sync.fd.EventFd;

import java.util.concurrent.TimeUnit;

public class LibEpollTest {

    @Test
    public void testEpoll() {
        EpollFd epollFd = new EpollFd();
        EventFd eventFd = new EventFd();

        EpollEvent event = new EpollEvent(LibEpoll.EPOLLIN, 214);
        int ctlRes = epollFd.epollCtl(eventFd, LibEpoll.EPOLL_CTL_ADD, event);
        Assert.assertEquals(NativeHelper.currentErrorStr(), 0, ctlRes);
        eventFd.eventfdWrite(1);
        var events = epollFd.epollWait(2, 1, TimeUnit.SECONDS);
        Assert.assertEquals(1, events.size());
        EpollEvent epollEvent = events.get(0);
        Assert.assertEquals(214, epollEvent.data());
        Assert.assertEquals(LibEpoll.EPOLLIN, epollEvent.events());
        epollFd.close();
    }

}

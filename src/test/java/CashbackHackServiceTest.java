import org.testng.annotations.Test;
import ru.netology.service.CashbackHackService;
import org.testng.Assert;

public class CashbackHackServiceTest {

    @Test
    CashbackHackService service = new CashbackHackService();
    int amount = 1000;
    int actual = service.remain(amount);
    int expected = 1000;

    Assert.assertEquals(actual, expected);
}

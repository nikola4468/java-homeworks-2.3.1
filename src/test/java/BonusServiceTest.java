import static org.junit.jupiter.api.Assertions.*;

class BonusServiceTest {

  @org.junit.jupiter.api.Test
  void shouldCalculateForRegisteredAndUnderLimit() {
    BonusService service = new BonusService();

    // подготавливаем данные:
    long amount = 1000_60;
    boolean registered = true;
    long expected = 30;

    // вызываем целевой метод:
    long actual = service.calculate(amount, registered);

    // производим проверку (сравниваем ожидаемый и фактический):
    assertEquals(expected, actual);
  }

  @org.junit.jupiter.api.Test
  void shouldCalculateForRegisteredAndOverLimit() {
    BonusService service = new BonusService();

    // подготавливаем данные:
    long amount = 1_000_000_60;
    boolean registered = true;
    long expected = 500;

    // вызываем целевой метод:
    long actual = service.calculate(amount, registered);

    // производим проверку (сравниваем ожидаемый и фактический):
    assertEquals(expected, actual);
  }

  @org.junit.jupiter.api.Test
  void shouldCalculateForNoRegisteredAndUnderLimit() {
    BonusService service = new BonusService();

    // подготавливаем данные:
    long amount = 1000_60;
    boolean registered = false;
    long expected = 10;

    // вызываем целевой метод:
    long actual = service.calculate(amount, registered);

    // производим проверку (сравниваем ожидаемый и фактический):
    assertEquals(expected, actual);
  }

  @org.junit.jupiter.api.Test
  void shouldCalculateForNoRegisteredAndOverLimit() {
    BonusService service = new BonusService();

    // подготавливаем данные:
    long amount = 1_000_000_60;
    boolean registered = false;
    long expected = 500;

    // вызываем целевой метод:
    long actual = service.calculate(amount, registered);

    // производим проверку (сравниваем ожидаемый и фактический):
    assertEquals(expected, actual);
  }

  @org.junit.jupiter.api.Test
  void shouldCalculateForRegisteredAndZero() {
    BonusService service = new BonusService();

    // подготавливаем данные:
    long amount = 0;
    boolean registered = true;
    long expected = 0;

    // вызываем целевой метод:
    long actual = service.calculate(amount, registered);

    // производим проверку (сравниваем ожидаемый и фактический):
    assertEquals(expected, actual);
  }

  @org.junit.jupiter.api.Test
  void shouldCalculateForNoRegisteredAndZero() {
    BonusService service = new BonusService();

    // подготавливаем данные:
    long amount = 0;
    boolean registered = false;
    long expected = 0;

    // вызываем целевой метод:
    long actual = service.calculate(amount, registered);

    // производим проверку (сравниваем ожидаемый и фактический):
    assertEquals(expected, actual);
  }
  @org.junit.jupiter.api.Test
  void shouldCalculateForRegisteredAndMinusLimit() {
    BonusService service = new BonusService();

    // подготавливаем данные:
    long amount = -10000_00;
    boolean registered = true;
    long expected = 0;

    // вызываем целевой метод:
    long actual = service.calculate(amount, registered);

    // производим проверку (сравниваем ожидаемый и фактический):
    assertEquals(expected, actual);
  }

  @org.junit.jupiter.api.Test
  void shouldCalculateForNoRegisteredAndMinusLimit() {
    BonusService service = new BonusService();

    // подготавливаем данные:
    long amount = -10000_00;
    boolean registered = false;
    long expected = 0;

    // вызываем целевой метод:
    long actual = service.calculate(amount, registered);

    // производим проверку (сравниваем ожидаемый и фактический):
    assertEquals(expected, actual);
  }
}


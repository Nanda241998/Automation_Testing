package listenars_pom;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(Pom1.class)
public class Executableclass {
  @Test
  public void f() {
  }
}

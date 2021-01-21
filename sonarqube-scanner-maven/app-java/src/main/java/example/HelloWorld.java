package example;

public class HelloWorld {

  public void coveredByUnitTest() {
    System.out.println("coveredByUnitTest1");
    System.out.println("coveredByUnitTest2");
  }

  public void coveredByIntegrationTest() {
    System.out.println("coveredByIntegrationTest1");
    System.out.println("coveredByIntegrationTest2");
    System.out.println("coveredByIntegrationTest3");
  }

  public void notCovered() {
    System.out.println("notCovered");
  }
  
  public void mockBugs(){
    if(1==1){
      System.out.println("mock bugs");
    }
  }

  public void mockOWASP(){
    String password="123";
    System.out.println("mock OWASP");
  }

}

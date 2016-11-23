public class TestClockDisplay
{
 
    public TestClockDisplay()
    {
    }
 
    public void test()
    {
      
        ClockDisplay clock = new ClockDisplay();
       
        clock.setTime(12,12);
        System.out.println(clock.getTime());
        
        clock.setTime(05,10);
        System.out.println(clock.getTime());
        
        
        
     
    }
}

package junittesting;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class JUnitTesting {

    public static void main(String[] args) {
        Date d1 = new Date(2009, 12, 25);
        Date d2 = new Date(2010, 12, 25);

        int daysBetween = d1.daysTo(d2);
        System.out.println("The number of days between is " + daysBetween);

        Result result = JUnitCore.runClasses(JUnit.class);
        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }
    }

}

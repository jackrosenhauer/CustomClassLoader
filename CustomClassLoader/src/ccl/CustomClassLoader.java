package ccl;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.net.URLClassLoader;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

/**
 * Created by jack on 2/18/14.
 */
public class CustomClassLoader extends URLClassLoader{

    public CustomClassLoader(URL[] urls) {
        super(urls);
    }

    public static void main(String[] args) throws MalformedURLException {
        URL dir = new URL("file://" + "/home/jack/JUnitTests/out/production/JUnitTests/");
        CustomClassLoader cl = new CustomClassLoader(new URL[] {dir});
        URLClassLoader ucl = new URLClassLoader(new URL[] {dir});
        try {
            Class t = cl.findClass("package1.TestJunit");
            runner(t);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        try {
            Class e = Class.forName("package1.TestJunit", true, cl);
            runner(e);
        } catch (ClassNotFoundException e1) {
            e1.printStackTrace();
        }
    }

    public static void runner(Class junit) {
        Result result = JUnitCore.runClasses(junit);
        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }
        System.out.println(result.wasSuccessful());
    }
}

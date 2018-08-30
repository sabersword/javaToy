package org.ypq.jmx;

import javax.management.MBeanServer;
import javax.management.ObjectInstance;
import javax.management.ObjectName;
import javax.management.remote.JMXConnectorServer;
import javax.management.remote.JMXConnectorServerFactory;
import javax.management.remote.JMXServiceURL;
import java.lang.management.ManagementFactory;
import java.math.BigDecimal;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class JmxTest {

    public static void main(String[] args) throws Exception {
        MBeanServer mbs = ManagementFactory.getPlatformMBeanServer();

        Person person = new Person("ypq", 23,  new Asset(new BigDecimal(100.01)));
        // 试了下, name 和 type没啥区别
        ObjectName personName  = new ObjectName("jmxBean:name=" + person.getClass().getSimpleName());
        //ObjectName helloName1  = new ObjectName("com.wenbronk.le.jmxBean:type=" + person.getClass().getSimpleName());

//            Testtt testtt = new Testtt();
//            ObjectName testtName = new ObjectName("com.wenbronk.le.jmxBean:type=" + testtt.getClass().getSimpleName());
//            //ObjectName testtName1 = new ObjectName("com.wenbronk.le.jmxBean:name=" + testtt.getClass().getSimpleName());

        System.out.println(person.getClass().getSimpleName());
        ObjectInstance instance = mbs.registerMBean(person, personName);
        //ObjectInstance instance3 = mbs.registerMBean(person, helloName1);
//        ObjectInstance instance2 = mbs.registerMBean(testtt, testtName);
        //ObjectInstance instance4 = mbs.registerMBean(testtt, testtName1);

        try {
            // 注册一个端口并绑定
            Registry registry = LocateRegistry.createRegistry(9999);
            JMXServiceURL jmxServiceURL = new JMXServiceURL("service:jmx:rmi:///jndi/rmi://localhost:9999/jmxrmi");
            //service:jmx:rmi:///jndi/rmi://localhost:9999/jmxrmi
            JMXConnectorServer jmxConnectorServer = JMXConnectorServerFactory.newJMXConnectorServer(jmxServiceURL, null, mbs);

            jmxConnectorServer.start();

        }catch (Exception e) {
            e.printStackTrace();
        }
    }

}

package com.springer.aop;

import org.springframework.aop.framework.ProxyFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainAopXml {
    private Human human;
    private HumanProxy humanProxy;
    private ProxyFactory proxyFactory;

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("application-context.xml");
        Class<MainAopXml> aClass = MainAopXml.class;
        MainAopXml main = context.getBean("main", aClass);
        main.start();
    }

    public void setHuman(Human human) {
        this.human = human;
    }

    public void setHumanProxy(HumanProxy humanProxy) {
        this.humanProxy = humanProxy;
    }

    public void setProxyFactory(ProxyFactory proxyFactory) {
        this.proxyFactory = proxyFactory;
    }

    private void start() {
        proxyFactory.addAdvice(humanProxy);
        proxyFactory.setTarget(human);

        Human proxy = (Human) proxyFactory.getProxy();
        proxy.say();
    }
}

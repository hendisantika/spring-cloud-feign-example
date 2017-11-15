package com.hendisantika.springcloudfeignexample;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-cloud-feign-example
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 15/11/17
 * Time: 08.07
 * To change this template use File | Settings | File Templates.
 */
public class Contributor {
    private String login;

    private int contributions;

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getContributions() {
        return contributions;
    }

    public void setContributions(int contributions) {
        this.contributions = contributions;
    }
}

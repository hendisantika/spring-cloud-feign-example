package com.hendisantika.springcloudfeignexample;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

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


@FeignClient("https://api.github.com")
public interface GitHubClient {
    //e.g. http://localhost:10080/andrefaria/spring-cloud-feign-example

    @RequestMapping(method = RequestMethod.GET, value = "/repos/{owner}/{repo}/contributors")
    List<Contributor> contributors(@RequestParam("owner") String owner, @RequestParam("repo") String repo);
}

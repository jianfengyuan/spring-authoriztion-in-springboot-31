package demo.config;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "demo", url = "http://127.0.0.1:8090",configuration = FeignClientConfig.class )
public interface DemoClient {
    @RequestMapping(value = "/articles", method = RequestMethod.GET)
    String[] getArticles();
}

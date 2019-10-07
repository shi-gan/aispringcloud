package com.northwind.controller;
        import com.northwind.entity.Student;
        import com.northwind.feign.FeignProviderClient;
        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.web.bind.annotation.GetMapping;
        import org.springframework.web.bind.annotation.RequestMapping;
        import org.springframework.web.bind.annotation.RestController;

        import java.util.Collection;

@RestController
@RequestMapping("/feign")
public class FeignController {

    @Autowired
    private FeignProviderClient feignProviderClient;

    @GetMapping("/findAll")
    public Collection<Student> findAll(){
        return feignProviderClient.findAll();//接口中的方法
    }

    @GetMapping("/index")
    public String index(){
        return feignProviderClient.index();
    }
}
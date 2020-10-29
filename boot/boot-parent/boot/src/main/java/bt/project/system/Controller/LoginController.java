package bt.project.system.Controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import bt.project.common.api.Result;
import bt.project.common.entity.SysLogin;

@RestController
@RequestMapping("/system")
public class LoginController {
	
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public Result<SysLogin> login (@RequestBody SysLogin sysLogin, HttpServletRequest request){
        Result<SysLogin> result = new Result<>();
        try {
            String username = sysLogin.getUsername();
            String password = sysLogin.getPassword();
            


        }catch (Exception e){
            e.printStackTrace();
        }
        result.setMessage("123");
        return result;
    }


}
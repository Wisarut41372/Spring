package nvc.it.demo;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class ControllerTest1 {
    
    @RequestMapping(value = "/" ,method=RequestMethod.GET)
    @ResponseBody
    public String index(){
        return "<center> <h1>Home page </h1> <hr><h3> ชื่อ-สกุล : วิศรุต  กลิ่นจันทร์ <br> อายุ : 19 </h3><br><br><a href='/name'> Go to name page</a></center>";
    }
   
    @RequestMapping("/name")
    @ResponseBody
    public String name(){
        return "<center><h1>My Profile </h1> <hr>  Wisarut Klinjan <br><a href='/aboutme'> Go to aboutme page</a></center> ";
    }
    
    @RequestMapping("/aboutme")
    @ResponseBody
    public String aboutme(){
        return "<center><h1>About Me</h1> <hr> ชื่อ-สกุล : วิศรุต  กลิ่นจันทร์ <br> อายุ : 19 <br><a href='/contact'> Go to contact page</a></center> ";
    }
    @RequestMapping("/contact")
    @ResponseBody
    public String contact(){
        return "<center><h1>Contact </h1> <hr>  ที่อยู่ : 99/156 หมู๋.3 ต.ธรรมศาลา อ.เมือง จ.นครปฐม <br> เบอร์โทรศัพท์ : 0922430225 </cener> <br><a href='/'> Go to Home page</a>";
    }
    
}

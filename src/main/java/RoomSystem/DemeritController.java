package RoomSystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@RestController
public class DemeritController {

    @Autowired
    DemeritRepository demeritRepository;

    @RequestMapping(method= RequestMethod.POST, path="/demerits/save")
    public void demerit(@RequestBody Demerit demerit){
        demeritRepository.save(demerit);
    }
}

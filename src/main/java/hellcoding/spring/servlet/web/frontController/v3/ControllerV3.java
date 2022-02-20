package hellcoding.spring.servlet.web.frontController.v3;

import hellcoding.spring.servlet.web.frontController.ModelView;

import java.util.Map;

public interface ControllerV3 {

    ModelView process(Map<String, String> paramMap);
}

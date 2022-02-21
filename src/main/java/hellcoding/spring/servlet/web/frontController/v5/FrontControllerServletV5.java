package hellcoding.spring.servlet.web.frontController.v5;

import hellcoding.spring.servlet.web.frontController.v3.controller.MemberFormControllerV3;
import hellcoding.spring.servlet.web.frontController.v3.controller.MemberListControllerV3;
import hellcoding.spring.servlet.web.frontController.v3.controller.MemberSaveControllerV3;
import hellcoding.spring.servlet.web.frontController.v5.adapter.ControllerV3HandlerAdapter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@WebServlet(name = "frontControllerServletV5", urlPatterns = "/front-controller/v5/*")
public class FrontControllerServletV5 extends HttpServlet {

    private final Map<String, Object> handlerMappingMap = new HashMap<>();
    private final List<MyHandlerAdapter> handlerAdapters = new ArrayList<>();

    public FrontControllerServletV5() {
        initHandlerMappingMap();
        initHandlerAdapters();
    }

    private void initHandlerMappingMap() {
        handlerMappingMap.put("/front-controller/v3/members/new-form", new MemberFormControllerV3());
        handlerMappingMap.put("/front-controller/v3/members/save", new MemberSaveControllerV3());
        handlerMappingMap.put("/front-controller/v3/members", new MemberListControllerV3());
    }

    private void initHandlerAdapters() {
        handlerAdapters.add(new ControllerV3HandlerAdapter());
    }
}

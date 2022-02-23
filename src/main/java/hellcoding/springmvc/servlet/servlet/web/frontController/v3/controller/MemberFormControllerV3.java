package hellcoding.springmvc.servlet.servlet.web.frontController.v3.controller;

import hellcoding.springmvc.servlet.servlet.web.frontController.ModelView;
import hellcoding.springmvc.servlet.servlet.web.frontController.v3.ControllerV3;

import java.util.Map;

public class MemberFormControllerV3 implements ControllerV3 {

    @Override
    public ModelView process(Map<String, String> paramMap) {
        return new ModelView("new-form");
    }

}

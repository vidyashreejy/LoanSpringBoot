package com.kuwy.rest.controller;
import com.kuwy.beans.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class RegisterController {

@RequestMapping(method = RequestMethod.POST, value="/register/loan")
@ResponseBody
RegistrationReply registerStudent(@RequestBody Registration loanreg) {

RegistrationReply loanregreply = new RegistrationReply();
loanregreply.setVehicle(loanreg.getVehicle());
loanregreply.setVehicle_type(loanreg.getVehicle_type());
loanregreply.setLoan_type(loanreg.getLoan_type());
loanregreply.setBrand(loanreg.getBrand());
loanregreply.setLocation(loanreg.getLocation());
loanregreply.setCondition(loanreg.getCondition());
loanregreply.setRegistrationNumber("12345678");
loanregreply.setRegistrationStatus("Successful");
return loanregreply;

}
}

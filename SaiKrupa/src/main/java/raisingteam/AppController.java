package raisingteam;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.nio.file.Paths;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;




@Controller
public class AppController {

    private  String status = "Fail";
    @Autowired
    private Environment env;
    
   // private String directory="C://Users//sbm//Desktop//SAIKRUPA-ME//SaiKrupa";
    
    @RequestMapping("/")
    public String index() {
      return "index.html";
    }
    
    
    /*@RequestMapping(value = "/uploadFile", method = RequestMethod.POST)
    @ResponseBody
    public ResponseEntity<?> uploadFile(
        @RequestParam("uploadfile") MultipartFile uploadfile) {
      
      try {
        // Get the filename and build the local file path
        String filename = uploadfile.getOriginalFilename();
        String directory = env.getProperty("profile.pic.path");
        String filepath = Paths.get(directory, filename).toString();
        
        // Save the file locally
        BufferedOutputStream stream =
            new BufferedOutputStream(new FileOutputStream(new File(filepath)));
        stream.write(uploadfile.getBytes());
        stream.close();
      }
      catch (Exception e) {
        System.out.println(e.getMessage());
        return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
      }
      
      return new ResponseEntity<>(HttpStatus.OK);
    }
    
    
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    @ResponseBody
    public Response login(Login login) {
     Response response=null;
      try {
        // Get the filename and build the local file path
      if(login.getId().equals("SHANT") && login.getPassword().equals("SHANT")){
    	  response=new Response();
    	  response.setStatus("SUCCESS");
    	  return response;
      }
      }
      catch (Exception e) {
    	  System.out.println(e.getMessage());
      }
      
      return response;
    }
    
    @RequestMapping(value = "/signup", method = RequestMethod.POST)
    @ResponseBody
    public Response login(SignUp signup) {
     Response response=null;
      try {
        // Get the filename and build the local file path
      if(true){
    	  response=new Response();
    	  response.setStatus("SUCCESS");
    	  return response;
      }
      }
      catch (Exception e) {
    	  System.out.println(e.getMessage());
      }
      
      return response;
    }*/
    
    

}
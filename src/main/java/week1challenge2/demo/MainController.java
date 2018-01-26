package week1challenge2.demo;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @RequestMapping("/getMagicNumber")

    public String magicPattern(@RequestParam("myNumber") int myNumber)
    {

        int StartingNumber=myNumber;
        String number_list=" ";
        do
            {
                if(myNumber%2==0)
                {
                    number_list=number_list+Integer.toString(myNumber)+"  ";
                    myNumber/=2;
                }

                else
                {
                    number_list=number_list+Integer.toString(myNumber)+"  ";
                    myNumber=myNumber*3+1;

                }
            }
        while(myNumber>1);


        return "Starting number: "+StartingNumber+"</br>"+number_list+" "+Integer.toString(1);
    }


}

package java_prep;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.Base_PO;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;


@Test
public class java_examples extends Base_PO {
//    public static void main(String[] arg) throws InterruptedException {
//        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/test/java/driver/drivers/chromedriver");
//
////Creating an object of ChromeDriver
//        WebDriver driver = new ChromeDriver();
//        driver.manage().window().maximize();
//
////Deleting all the cookies
//        driver.manage().deleteAllCookies();
//
////Specifiying pageLoadTimeout and Implicit wait
//        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//
////launching the specified URL
//        driver.get("https://www.gadgetinsurance.com/");
//
//
//        driver.findElement(By.xpath("//button[contains(text(), 'Accept All Cookies')]"));
//
//
////Locating the elements using name locator for the text box
//        //   driver.findElement(By.name("q")).sendKeys("YouTube");
//
////name locator for google search button
//        //      WebElement searchIcon = driver.findElement(By.name("btnK"));
//        //     searchIcon.click();
//    }
//
//
//}


    //#1: How to reverse a string

    public void reverseString(){
        String str= "PhyscoSV";
        StringBuffer sb= new StringBuffer(str);
        String result= sb.reverse().toString();
        System.out.println(result);

       //#2: not using StringBuffer
        //System.out.println(str.length());
        //char[] reverse= str.toCharArray();
        //Map<Character, Integer> map= new HashMap<Character, Integer>();
        String result2="";
        for (int i=str.length()-1; i>=0;i--){
             result2= result2+str.charAt(i);

        }
        System.out.println(result2);
    }

    //How to use subString method () in java:
    public static void extractStringPart(){
        String website="www.google.com";
        String firstFour= website.substring(0,4);
        System.out.println(firstFour);

        String lastFour=website.substring(website.length()-4,website.length());
        //String lastFour=website.substring(10,14);
        System.out.println(lastFour);

        String restString=website.substring(4,website.length()-4);
    System.out.println(restString);

    //check if string is palindrome:
    String palindrome="madam";
    StringBuffer palin=new StringBuffer(palindrome);
    String output=palin.reverse().toString();
    if (!palindrome.equals(output)){
        System.out.println("False");
    }
    else
    {
        System.out.println("True");


    }
}
@Test
public static void reverseSentence(){
        String sentence= "i am learning Java";
        String[] arr=sentence.split(" ");
        String result="";
        for (int i=arr.length-1;i>=0;i--){
            result=result+ arr[i]+ " ";

        }
    System.out.println("Reverse Sentence:"+ result);
    }
    @Test
    //reverse every word in a sentence
    public static void reverseWordSentence(){
        String sentence1="i am learning Java";
        String[]arr=sentence1.split(" ");
        String result2="";
        for(int i=0;i<arr.length;i++){
        if(arr[i].equals("i")){
        result2=result2+sentence1.charAt(i);
        System.out.println(result2);

        }

        }


        }
}
